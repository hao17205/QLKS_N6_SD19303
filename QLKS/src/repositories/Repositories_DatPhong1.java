/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;
import java.sql.*;
import java.util.ArrayList;
import Model.Model_DatPhong;
/**
 *
 * @author Chi Dat
 */
public class Repositories_DatPhong1 {
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;
    
    public ArrayList<Model_DatPhong> getAll_DP1(){
        ArrayList<Model_DatPhong> list_KH1 = new ArrayList<>();
        sql = "select MAKH,TenKhachHang,NgaySinh,CCCD,SoDienThoai,Email,GioiTinh,DiaChi from KHACHHANG";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                String maKH;
                String tenKH;
                Date ngaySinh;
                String soCCCD;
                String soDienThoai;
                String email;
                int gioiTinh;
                String diaChi;
                
                maKH = rs.getString(1);
                tenKH = rs.getString(2);
                ngaySinh = rs.getDate(3);
                soCCCD = rs.getString(4);
                soDienThoai = rs.getString(5);
                email = rs.getString(6);
                gioiTinh = rs.getInt(7);
                diaChi = rs.getString(8);
                Model_DatPhong kh = new Model_DatPhong(maKH, tenKH, ngaySinh, soCCCD, soDienThoai, email, gioiTinh, diaChi);
                list_KH1.add(kh);
            }return list_KH1;
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        
    }
    public int add_KH(Model_DatPhong KH){
        sql = "insert into KHACHHANG(MAKH,TenKhachHang,NgaySinh,CCCD,SoDienThoai,Email,GioiTinh,DiaChi) "
                + "values(?,?,?,?,?,?,?,?)";
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, KH.getMaKH());
            ps.setObject(2, KH.getTenKH());
            ps.setObject(3, KH.getNgaySinh());
            ps.setObject(4, KH.getSoCCCD());
            ps.setObject(5, KH.getSoDienThoai());
            ps.setObject(6, KH.geteMail());
            ps.setObject(7, KH.getGioiTinh());
            ps.setObject(8, KH.getDiaChi());
            
            return ps.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    public Model_DatPhong checktrung_Dp(String ma_KHmoi){
        sql = "select MAKH,TenKhachHang,NgaySinh,CCCD,SoDienThoai,Email,GioiTinh,DiaChi "
                + "from KHACHHANG where MAKH = ?";
        Model_DatPhong dp = null;
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, ma_KHmoi);
            rs = ps.executeQuery();
            while(rs.next()){
                String maKH;
                String tenKH;
                Date ngaySinh;
                String soCCCD;
                String soDienThoai;
                String email;
                int gioiTinh;
                String diaChi;
                
                maKH = rs.getString(1);
                tenKH = rs.getString(2);
                ngaySinh = rs.getDate(3);
                soCCCD = rs.getString(4);
                soDienThoai = rs.getString(5);
                email = rs.getString(6);
                gioiTinh = rs.getInt(7);
                diaChi = rs.getString(8);
                dp = new Model_DatPhong(maKH, tenKH, ngaySinh, soCCCD, soDienThoai, email, gioiTinh, diaChi);
                
            }return dp;
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        
    }
    
    
}
