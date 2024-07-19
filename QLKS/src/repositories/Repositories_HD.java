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

    public ArrayList<Model_TT> timkiem_MHD(String maHDcantim) {
        sql = "SELECT MAHD, MANV, MAKH, SoDienThoai, DiaChi, SoPhongDat, TrangThai, NgayXuatDon, NgayThanhToan, Thue, TienCoc, TongTien FROM HOADON\n"
                + "where MAHD like ?";
        ArrayList<Model_TT> listHoaDon = new ArrayList<>();
        try {
            con = DBconnect.getConnection();
            pr = con.prepareStatement(sql);
            pr.setObject(1, '%' + maHDcantim + '%');
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
        sql = "DELETE FROM HOADON Where MAHD = ?";
        try {
            con = DBconnect.getConnection();
            pr = con.prepareStatement(sql);
            pr.setObject(1, maHD);
            return pr.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int suaHoaDon(String maHD, Model_TT hoaDon) {
        sql = "Update HoaDon set MAKH = ?, MANV = ?, SoDienThoai = ?, DiaChi = ?, SoPhongDat = ?, TrangThai = ?, NgayXuatDon = ?, NgayThanhToan = ?, Thue = ?, TienCoc = ?, TongTien = ? Where MAHD = ?";
        try {
            con = DBconnect.getConnection();
            pr = con.prepareStatement(sql);
            pr.setObject(1, hoaDon.getMaKH());
            pr.setObject(2, hoaDon.getMaNV());
            pr.setObject(3, hoaDon.getSoDienThoai());
            pr.setObject(4, hoaDon.getDiaChi());
            pr.setObject(5, hoaDon.getSoPhongDat());
            pr.setObject(6, hoaDon.getTrangThai());
            pr.setObject(7, hoaDon.getNgayXuatDon());
            pr.setObject(8, hoaDon.getNgayThanhToan());
            pr.setObject(9, hoaDon.getThue());
            pr.setObject(10, hoaDon.getTienCoc());
            pr.setObject(11, hoaDon.getTongTien());
            pr.setObject(12, maHD);
            return pr.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
