/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import java.sql.*;
import java.util.ArrayList;
import model.Model_KM;

/**
 *
 * @author rinbo
 */
public class Repositories_KM {

    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;

    public ArrayList<model.Model_KM> getAll_KM() {
        ArrayList<model.Model_KM> list_KM = new ArrayList<>();
        sql = "SELECT MAKM, TenKhuyenMai, PhanTramGiamGia, NgayBatDau, NgayKetThuc, Mota FROM KHUYENMAI";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String maKM = rs.getString(1);
                String tenKM = rs.getString(2);
                double pTGG = rs.getDouble(3);
                Date ngayBD = rs.getDate(4);
                Date ngayKT = rs.getDate(5);
                String moTa = rs.getString(6);
               Model_KM m = new Model_KM(maKM, tenKM, pTGG, ngayBD, ngayKT, moTa);
                list_KM.add(m);
            }
            return list_KM;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
