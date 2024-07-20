/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;

import Model.Model_NhanVien;

import java.sql.*;
import java.util.ArrayList;
public class Reporitosies_NhanVien {
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    String sql = null;
    
    
    public ArrayList<Model_NhanVien> getAll_NV(){
        ArrayList<Model_NhanVien> list_NV = new ArrayList<>();
        sql = "select MANV,MATK,TenNV,NgaySinh,GioiTinh,SoDienThoai,Email,DiaChi,Luong,ThoiGianLamViec,ChucVu from NHANVIEN";
        
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()) {                
                 String maNV;
                 String maTK;
                 String tenNV;
                 String ngaySinh;
                 int gioiTinh;
                 String sdt;
                 String email;
                 String diaChi;
                 String chucVu;
                 
                 maNV = rs.getString(1);
                 maTK = rs.getString(2);
                 tenNV = rs.getString(3);
                 ngaySinh = rs.getString(4);
                 gioiTinh = rs.getInt(5);
                 sdt = rs.getString(6);
                 email = rs.getString(7);
                 diaChi = rs.getString(8);
                 chucVu = rs.getString(11);
                
                Model_NhanVien NV = new Model_NhanVien(maNV, maTK, tenNV, ngaySinh, gioiTinh, sdt, email, diaChi, chucVu);
                 list_NV.add(NV);
            }
            return list_NV;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        
    }
    
//Code nút thêm
    public int them(Model_NhanVien t){
        sql ="insert into NHANVIEN(MANV,MATK,TenNV,NgaySinh,GioiTinh,SoDienThoai,Email,DiaChi,Luong,ThoiGianLamViec,ChucVu)values(?,?,?,?,?,?,?,?,?,?,?)";
        
        try {
                con = dbconnect.DBconnect.getConnection();
                ps = con.prepareStatement(sql);
                
                ps.setObject(1, t.getMaNV());
                ps.setObject(2, t.getMaTK());
                ps.setObject(3, t.getTenNV());
                ps.setObject(4, t.getNgaySinh());
                ps.setObject(5, t.getGioiTinh());
                ps.setObject(6, t.getSdt());
                ps.setObject(7, t.getEmail());
                ps.setObject(8, t.getDiaChi());
                ps.setObject(9, t.getChucVu());
                
                return ps.executeUpdate();
                
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
}
