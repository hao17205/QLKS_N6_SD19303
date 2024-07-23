/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author Chi Dat
 */
public class Model_DP2 {
    private String maHD;
    private String maPhong;
    private String maKH;
    private String maNV;
    private String maKM;
    private String soDienThoai;
    private String diaChi;
    private int soPhongDat;
    private String trangThai;
    private Date checkIn;
    private Date checkOut;
    private double tienCoc;

    public Model_DP2() {
    }

    public Model_DP2(String maHD, String maPhong, String maKH, String maNV, String maKM, String soDienThoai, String diaChi, int soPhongDat, String trangThai, Date checkIn, Date checkOut, double tienCoc) {
        this.maHD = maHD;
        this.maPhong = maPhong;
        this.maKH = maKH;
        this.maNV = maNV;
        this.maKM = maKM;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
        this.soPhongDat = soPhongDat;
        this.trangThai = trangThai;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.tienCoc = tienCoc;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaKM() {
        return maKM;
    }

    public void setMaKM(String maKM) {
        this.maKM = maKM;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSoPhongDat() {
        return soPhongDat;
    }

    public void setSoPhongDat(int soPhongDat) {
        this.soPhongDat = soPhongDat;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public double getTienCoc() {
        return tienCoc;
    }

    public void setTienCoc(double tienCoc) {
        this.tienCoc = tienCoc;
    }
    
    public Object[] toDataRows_DP2(){
    return new Object[]{
        this.getMaHD(),
        this.getMaPhong(),
        this.getMaKH(),
        this.getMaNV(),
        this.getMaKM(),
        this.getSoDienThoai(),
        this.getDiaChi(),
        this.getSoPhongDat(),
        this.getTrangThai(),
        this.getCheckIn(),
        this.getCheckOut(),
        this.getTienCoc()
    };
}
    
}
