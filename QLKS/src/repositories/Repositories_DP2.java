/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repositories;
import java.sql.*;
import Model.Model_DP2;
import java.util.ArrayList;


/**
 *
 * @author Chi Dat
 */
public class Repositories_DP2 {
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;
    
    public ArrayList<Model_DP2> getAll_DP2(){
        sql = "select hd.MAHD,MA_P,MAKH,MANV,MAKM,SoDienThoai,DiaChi,SoPhongDat,TrangThai,CheckIn,CheckOut,hd.TienCoc\n" +
"from HOADON hd join HOADONCHITIET hdct on hd.MAHD = hdct.MAHD";
        ArrayList<Model_DP2> list_DP2 = new ArrayList<>();
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                String maHD = rs.getString(1);
                String ma_P = rs.getString(2);
                String maKh = rs.getString(3);
                String maNV = rs.getString(4);
                String maKm = rs.getString(5);
                String sdt = rs.getString(6);
                String diaChi = rs.getString(7);
                int soPhongDat = rs.getInt(8);
                String trangThai = rs.getString(9);
                Date checkIn = rs.getDate(10);
                Date checkOut = rs.getDate(11);
                double tienCoc = rs.getDouble(12);
                Model_DP2 dp2 = new Model_DP2(maHD, ma_P, maKh, maNV, maKm, sdt, diaChi, soPhongDat, trangThai, checkIn, checkOut, tienCoc);
                list_DP2.add(dp2);
            }return list_DP2;
            
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    //
    public int save_DP2(Model_DP2 dp2){
    String sql1 = "INSERT INTO HOADON(MAHD, MAKH, MANV, SoDienThoai, DiaChi, SoPhongDat, TrangThai, TienCoc) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
    String sql2 = "INSERT INTO HOADONCHITIET(MAHD, MA_P, MAKM, CheckIn, CheckOut) VALUES(?, ?, ?, ?, ?)";
    
    try {
        con = dbconnect.DBconnect.getConnection();
        con.setAutoCommit(false); // Bắt đầu một transaction
        
        
       
        
        // Thực hiện lệnh chèn vào bảng HOADON
        ps = con.prepareStatement(sql1);
        ps.setString(1, dp2.getMaHD());
        ps.setString(2, dp2.getMaKH());
        ps.setString(3, dp2.getMaNV());
        ps.setString(4, dp2.getSoDienThoai());
        ps.setString(5, dp2.getDiaChi());
        ps.setInt(6, dp2.getSoPhongDat());
        ps.setString(7, dp2.getTrangThai());
        ps.setDouble(8, dp2.getTienCoc());
        ps.executeUpdate();
        
        // Thực hiện lệnh chèn vào bảng HOADONCHITIET
        ps = con.prepareStatement(sql2);
        ps.setString(1, dp2.getMaHD());
        ps.setString(2, dp2.getMaPhong());
        ps.setString(3, dp2.getMaKM());
        ps.setDate(4, new java.sql.Date(dp2.getCheckIn().getTime()));
        ps.setDate(5, new java.sql.Date(dp2.getCheckOut().getTime()));
        ps.executeUpdate();
        
        con.commit(); // Xác nhận transaction
        return 1;
    } catch (Exception e) {
        try {
            con.rollback(); // Hủy transaction nếu có lỗi
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        e.printStackTrace();
        return 0;
    } finally {
        try {
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

// đóng
    // hàm check ma KH
//    private boolean isKhachHangExists(String maKH) {
//    String sql = "SELECT COUNT(*) FROM KHACHHANG WHERE MAKH = ?";
//    try (Connection con = dbconnect.DBconnect.getConnection(); // Tạo kết nối mới ở đây
//         PreparedStatement ps = con.prepareStatement(sql)) {
//        ps.setString(1, maKH);
//        try (ResultSet rs = ps.executeQuery()) {
//            if (rs.next()) {
//                return rs.getInt(1) > 0;
//            }
//        }
//    } catch (SQLException e) {
//        e.printStackTrace();
//    }
//    return false;
//}
    //
    public Model_DP2 checkTrung_Dp2(String maHD_moi){
        sql = "select hd.MAHD,MA_P,MAKH,MANV,MAKM,SoDienThoai,DiaChi,SoPhongDat,TrangThai,CheckIn,CheckOut,hd.TienCoc\n" +
"from HOADON hd join HOADONCHITIET hdct on hd.MAHD = hdct.MAHD\n" +
"where hd.MAHD = ?";
        Model_DP2 dp2 = null;
        try {
            con = dbconnect.DBconnect.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, maHD_moi);
            rs = ps.executeQuery();
            while(rs.next()){
                String maHD = rs.getString(1);
                String ma_P = rs.getString(2);
                String maKh = rs.getString(3);
                String maNV = rs.getString(4);
                String maKm = rs.getString(5);
                String sdt = rs.getString(6);
                String diaChi = rs.getString(7);
                int soPhongDat = rs.getInt(8);
                String trangThai = rs.getString(9);
                Date checkIn = rs.getDate(10);
                Date checkOut = rs.getDate(11);
                double tienCoc = rs.getDouble(12);
                dp2 = new Model_DP2(maHD, maNV, maKh, maNV, maKm, trangThai, diaChi, soPhongDat, trangThai, checkIn, checkOut, tienCoc);
                
            }return dp2;
                
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        
    }
    
    
    
                
}
    































    



