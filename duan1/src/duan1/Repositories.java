/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author PC
 */
public class Repositories {
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;
    
    public ArrayList<Model_KhachHang> getAll(){
        ArrayList<Model_KhachHang> list_KhachHang = new ArrayList<>();
        
        sql = "Select MAKH, TenKhachHang, NgaySinh, CCCD, SoDienThoai, Email, GioiTinh, DiaChi from KHACHHANG";
        try {
            con = DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                String maKhachHang;
                String hoTen;
                String ngaySinh;
                String Cccd;
                String Sdt;
                String Email;
                int gioiTinh;
                String diaChi;
                
                maKhachHang = rs.getString(1);
                hoTen = rs.getString(2);
                ngaySinh = rs.getString(3);
                Cccd = rs.getString(4);
                Sdt = rs.getString(5);
                Email = rs.getString(6);
                gioiTinh = rs.getInt(7);
                diaChi = rs.getString(8);
                
                Model_KhachHang m = new Model_KhachHang(maKhachHang, hoTen, ngaySinh, Cccd, Sdt, Email, gioiTinh, diaChi);
            }
            return list_KhachHang;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
