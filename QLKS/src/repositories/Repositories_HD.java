/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import dbconnect.DBconnect;
import Model.Model_TT;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Repositories_HD {

    private Connection con = null;
    private PreparedStatement pr = null;
    private ResultSet rs = null;
    private String sql = null;

    public ArrayList<Model_TT> getAll_HD() {
        sql = "SELECT MAHD, MANV, MAKH, SoDienThoai, DiaChi, SoPhongDat, TrangThai, NgayXuatDon, NgayThanhToan, Thue, TienCoc, TongTien FROM HOADON";
        ArrayList<Model_TT> listHoaDon = new ArrayList<>();
        try {
            con = DBconnect.getConnection();
            pr = con.prepareStatement(sql);
            rs = pr.executeQuery();
            while (rs.next()) {
                String maHD = rs.getString("MAHD");
                String maNV = rs.getString("MANV");
                String maKH = rs.getString("MAKH");
                String soDienThoai = rs.getString("SoDienThoai");
                String diaChi = rs.getString("DiaChi");
                int soPhongDat = rs.getInt("SoPhongDat");
                String trangThai = rs.getString("TrangThai");
                Date ngayXuatDon = rs.getDate("NgayXuatDon");
                Date ngayThanhToan = rs.getDate("NgayThanhToan");
                double thue = rs.getDouble("Thue");
                double tienCoc = rs.getDouble("TienCoc");
                double tongTien = rs.getDouble("TongTien");

                Model_TT tt = new Model_TT(maHD, maKH, maNV, soDienThoai, diaChi, soPhongDat, trangThai, ngayXuatDon, ngayThanhToan, thue, tienCoc, tongTien, maHD, maKH, maHD, maNV, maKH, ngayXuatDon, ngayXuatDon, tienCoc, tienCoc, tongTien, tongTien, ngayThanhToan);
                listHoaDon.add(tt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listHoaDon;
    }

    public ArrayList<Model_TT> timkiem_MHD(String sdt) {
        sql = "SELECT MAHD, MANV, MAKH, SoDienThoai, DiaChi, SoPhongDat, TrangThai, NgayXuatDon, NgayThanhToan, Thue, TienCoc, TongTien FROM HOADON\n"
                + "where SoDienThoai like ?";
        ArrayList<Model_TT> listHoaDon = new ArrayList<>();
        try {
            con = DBconnect.getConnection();
            pr = con.prepareStatement(sql);
            pr.setObject(1, '%' + sdt + '%');
            rs = pr.executeQuery();
            while (rs.next()) {
                String maHD = rs.getString("MAHD");
                String maNV = rs.getString("MANV");
                String maKH = rs.getString("MAKH");
                String soDienThoai = rs.getString("SoDienThoai");
                String diaChi = rs.getString("DiaChi");
                int soPhongDat = rs.getInt("SoPhongDat");
                String trangThai = rs.getString("TrangThai");
                Date ngayXuatDon = rs.getDate("NgayXuatDon");
                Date ngayThanhToan = rs.getDate("NgayThanhToan");
                double thue = rs.getDouble("Thue");
                double tienCoc = rs.getDouble("TienCoc");
                double tongTien = rs.getDouble("TongTien");

                Model_TT tt = new Model_TT(maHD, maKH, maNV, soDienThoai, diaChi, soPhongDat, trangThai, ngayXuatDon, ngayThanhToan, thue, tienCoc, tongTien, maHD, maKH, maHD, maNV, maKH, ngayXuatDon, ngayXuatDon, tienCoc, tienCoc, tongTien, tongTien, ngayThanhToan);
                listHoaDon.add(tt);
            }
            return listHoaDon;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int xoaHD(String maHD) {
        String xoaHDChiTiet = "DELETE FROM HOADONCHITIET WHERE MAHD = ?";
        String xoaHD = "DELETE FROM HOADON WHERE MAHD = ?";
        Connection con = null;
        PreparedStatement pr1 = null;
        PreparedStatement pr2 = null;

        try {
            con = DBconnect.getConnection();
            con.setAutoCommit(false);

            pr1 = con.prepareStatement(xoaHDChiTiet);
            pr1.setObject(1, maHD);
            pr1.executeUpdate();

            pr2 = con.prepareStatement(xoaHD);
            pr2.setObject(1, maHD);
            int result = pr2.executeUpdate();

            con.commit();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            try {
                if (con != null) {
                    con.rollback();
                }
            } catch (SQLException rollbackEx) {
                rollbackEx.printStackTrace();
            }
            return 0;
        } finally {
            try {
                if (pr1 != null) {
                    pr1.close();
                }
                if (pr2 != null) {
                    pr2.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException closeEx) {
                closeEx.printStackTrace();
            }
        }
    }

    public int suaHoaDon(String maHD, String soDienThoai, String diaChi) {
        String sql = "UPDATE HoaDon SET SoDienThoai = ?, DiaChi = ? WHERE MAHD = ?";
        try {
            Connection con = DBconnect.getConnection();
            PreparedStatement pr = con.prepareStatement(sql);
            pr.setObject(1, soDienThoai);
            pr.setObject(2, diaChi);
            pr.setObject(3, maHD);
            return pr.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
