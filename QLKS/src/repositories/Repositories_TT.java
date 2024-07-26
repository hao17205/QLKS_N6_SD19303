/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import Model.Model_TT;
import dbconnect.DBconnect;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class Repositories_TT {

    private Connection con = null;
    private PreparedStatement pr = null;
    private ResultSet rs = null;
    private String sql = null;

    public ArrayList<Model_TT> getBasicInfo_HD() {
        String sql = "SELECT MAHD, MAKH, MaNV, SoDienThoai, DiaChi, NgayXuatDon, TienCoc FROM HOADON WHERE TrangThai IS NULL;";
        ArrayList<Model_TT> listHoaDon = new ArrayList<>();
        try {
            con = DBconnect.getConnection();
            pr = con.prepareStatement(sql);
            rs = pr.executeQuery();
            while (rs.next()) {
                String maHD = rs.getString("MAHD");
                String maKH = rs.getString("MAKH");
                String maNV = rs.getString("MaNV");
                String soDienThoai = rs.getString("SoDienThoai");
                String diaChi = rs.getString("DiaChi");
                Date ngayXuatDon = rs.getDate("NgayXuatDon");
                double tienCoc = rs.getDouble("TienCoc");

                Model_TT tt = new Model_TT(maHD, maNV, maKH, soDienThoai, diaChi, 0, tienCoc, 0, tienCoc, tienCoc, diaChi, ngayXuatDon, ngayXuatDon, tienCoc, tienCoc, tienCoc, tienCoc, maHD, maHD, maNV, ngayXuatDon, ngayXuatDon, tienCoc);
                listHoaDon.add(tt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listHoaDon;
    }

    public ArrayList<Model_TT> getTongTienDV_HD() {
        String sql = "SELECT ddv.TongTien * COUNT(hdct.MA_HDCT) AS TongTienDV "
                + "FROM HOADON hd "
                + "JOIN HOADONCHITIET hdct ON hd.MAHD = hdct.MAHD "
                + "JOIN DatDichVu ddv ON hd.MAHD = ddv.MaHD "
                + "WHERE hd.TrangThai IS NULL "
                + "GROUP BY ddv.TongTien;";
        ArrayList<Model_TT> listHoaDon = new ArrayList<>();
        try {
            con = DBconnect.getConnection();
            pr = con.prepareStatement(sql);
            rs = pr.executeQuery();
            while (rs.next()) {
                double tongTienDV = rs.getDouble("TongTienDV");

                Model_TT tt = new Model_TT("", "", "", "", "", 0, tongTienDV, 0, tongTienDV, tongTienDV, "", null, null, tongTienDV, tongTienDV, tongTienDV, tongTienDV, "", "", "", null, null, tongTienDV);
                listHoaDon.add(tt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listHoaDon;
    }

    public ArrayList<Model_TT> getTongTienPhong_HD() {
        String sql = "SELECT COUNT(hdct.MA_HDCT) AS SoLuongChiTiet, SUM(hdct.TienPhong) AS TongTienPhong "
                + "FROM HOADON hd "
                + "JOIN HOADONCHITIET hdct ON hd.MAHD = hdct.MaHD "
                + "WHERE hd.TrangThai IS NULL;";
        ArrayList<Model_TT> listHoaDon = new ArrayList<>();
        try {
            con = DBconnect.getConnection();
            pr = con.prepareStatement(sql);
            rs = pr.executeQuery();
            while (rs.next()) {
                int soLuongChiTiet = rs.getInt("SoLuongChiTiet");
                double tongTienPhong = rs.getDouble("TongTienPhong");

                Model_TT tt = new Model_TT("", "", "", "", "", soLuongChiTiet, tongTienPhong, 0, tongTienPhong, tongTienPhong, "", null, null, tongTienPhong, tongTienPhong, tongTienPhong, tongTienPhong, "", "", "", null, null, tongTienPhong);
                listHoaDon.add(tt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listHoaDon;
    }

}
