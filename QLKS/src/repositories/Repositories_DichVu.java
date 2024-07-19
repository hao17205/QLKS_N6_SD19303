/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import java.sql.*;
import java.util.ArrayList;
import model.Model_DichVu;

/**
 *
 * @author rinbo
 */
public class Repositories_DichVu {

    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    private String sql = null;

    public ArrayList<model.Model_DichVu> getAll_DV() {
        ArrayList<model.Model_DichVu> list_DV = new ArrayList<>();
        sql = "SELECT MADV, TenDichVu, Gia, LoaiDichVu, MoTa FROM DICHVU";

        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String maDV = rs.getString(1);
                String tenDV = rs.getString(2);
                double gia = rs.getDouble(3);
                String loaiDV = rs.getString(4);
                String moTa = rs.getString(5);
                
                model.Model_DichVu m = new Model_DichVu(maDV, tenDV, gia, loaiDV, moTa);
                list_DV.add(m);
            }
            return list_DV;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
