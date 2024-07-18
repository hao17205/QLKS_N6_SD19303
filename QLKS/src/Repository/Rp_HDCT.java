/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import dbconnect.DBconnect;
import Model.Model_TT;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Rp_HDCT {

    private Connection con = null;
    private PreparedStatement pr = null;
    private ResultSet rs = null;
    private String sql = null;

    public ArrayList<Model_TT> getAll_HDCT() {
        sql = "SELECT MA_HDCT, MAKM, MAHD, MA_DDV, MA_P, CheckIn, CheckOut, GiaBanDau, GiaSauKhuyenMai, TongGiaDichVu, TongTienPhong, NgayThanhToan FROM HOADONCHITIET";
        ArrayList<Model_TT> listHoaDonChiTiet = new ArrayList<>();
        try {
            con = DBconnect.getConnection();
            pr = con.prepareStatement(sql);
            rs = pr.executeQuery();
            while (rs.next()) {
                String maHDCT = rs.getString("MA_HDCT");
                String maKM = rs.getString("MAKM");
                String maHD_HDCT = rs.getString("MAHD");
                String maDDV = rs.getString("MA_DDV");
                String maP = rs.getString("MA_P");
                Date checkIn = rs.getDate("CheckIn");
                Date checkOut = rs.getDate("CheckOut");
                double giaBanDau = rs.getDouble("GiaBanDau");
                double giaSauKhuyenMai = rs.getDouble("GiaSauKhuyenMai");
                double tongGiaDichVu = rs.getDouble("TongGiaDichVu");
                double tongTienPhong = rs.getDouble("TongTienPhong");
                String ngayThanhToan_HDCT = rs.getString("NgayThanhToan");

                Model_TT tt = new Model_TT(maP, maKM, maP, maP, maP, 0, maP, checkOut, checkOut, giaBanDau, giaBanDau, tongTienPhong, maHDCT, maKM, maHD_HDCT, maDDV, maP, checkIn, checkOut, giaBanDau, giaSauKhuyenMai, tongGiaDichVu, tongTienPhong, checkOut);
                listHoaDonChiTiet.add(tt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listHoaDonChiTiet;
    }

    public ArrayList<Model_TT> timkiem_MHDCT(String maHDCTcantim) {
        sql = "SELECT MA_HDCT, MAKM, MAHD, MA_DDV, MA_P, CheckIn, CheckOut, GiaBanDau, GiaSauKhuyenMai, TongGiaDichVu, TongTienPhong, NgayThanhToan FROM HOADONCHITIET\n"
                + "where MA_HDCT like ?";
        ArrayList<Model_TT> listHoaDonChiTiet = new ArrayList<>();
        try {
            con = DBconnect.getConnection();
            pr = con.prepareStatement(sql);
            pr.setObject(1, '%' + maHDCTcantim + '%');
            rs = pr.executeQuery();
            while (rs.next()) {
                String maHDCT = rs.getString("MA_HDCT");
                String maKM = rs.getString("MAKM");
                String maHD_HDCT = rs.getString("MAHD");
                String maDDV = rs.getString("MA_DDV");
                String maP = rs.getString("MA_P");
                Date checkIn = rs.getDate("CheckIn");
                Date checkOut = rs.getDate("CheckOut");
                double giaBanDau = rs.getDouble("GiaBanDau");
                double giaSauKhuyenMai = rs.getDouble("GiaSauKhuyenMai");
                double tongGiaDichVu = rs.getDouble("TongGiaDichVu");
                double tongTienPhong = rs.getDouble("TongTienPhong");
                String ngayThanhToan_HDCT = rs.getString("NgayThanhToan");

                Model_TT tt = new Model_TT(maP, maKM, maP, maP, maP, 0, maP, checkOut, checkOut, giaBanDau, giaBanDau, tongTienPhong, maHDCT, maKM, maHD_HDCT, maDDV, maP, checkIn, checkOut, giaBanDau, giaSauKhuyenMai, tongGiaDichVu, tongTienPhong, checkOut);
                listHoaDonChiTiet.add(tt);
            }
            return listHoaDonChiTiet;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int xoa(String maHDCT) {
        sql = "DELETE FROM HOADONCHITIET Where MA_HDCT = ?";
        try {
            con = DBconnect.getConnection();
            pr = con.prepareStatement(sql);
            pr.setObject(1, maHDCT);
            return pr.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    public int suaHoaDonChiTiet(String maHDCT, Model_TT hoaDonChiTiet) {
    sql = "Update HoaDonChiTiet set MAKM = ?, MAHD = ?, MA_DDV = ?, MA_P = ?, CheckIn = ?, CheckOut = ?, GiaBanDau = ?, GiaSauKhuyenMai = ?, TongGiaDichVu = ?, TongTienPhong = ?, NgayThanhToan = ? Where MA_HDCT = ?";
    try {
        con = DBconnect.getConnection();
        pr = con.prepareStatement(sql);
        pr.setObject(1, hoaDonChiTiet.getMaKM());
        pr.setObject(2, hoaDonChiTiet.getMaHD());
        pr.setObject(3, hoaDonChiTiet.getMaDDV());
        pr.setObject(4, hoaDonChiTiet.getMaP());
        pr.setObject(5, hoaDonChiTiet.getCheckIn());
        pr.setObject(6, hoaDonChiTiet.getCheckOut());
        pr.setObject(7, hoaDonChiTiet.getGiaBanDau());
        pr.setObject(8, hoaDonChiTiet.getGiaSauKhuyenMai());
        pr.setObject(9, hoaDonChiTiet.getTongGiaDichVu());
        pr.setObject(10, hoaDonChiTiet.getTongTienPhong());
        pr.setObject(11, hoaDonChiTiet.getNgayThanhToan());
        pr.setObject(12, maHDCT);
        return pr.executeUpdate();
    } catch (Exception e) {
        e.printStackTrace();
        return 0;
    }
}
}
