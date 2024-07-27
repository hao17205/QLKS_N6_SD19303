/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author rinbo
 */
public class Model_DichVu {
    private String maDV;
    private String tenDV;
    private double gia;
    private String loaiDV;
    private String moTa;
    public Model_DichVu() {
    }

    public Model_DichVu(String maDV, String tenDV, double gia, String loaiDV, String moTa) {
        this.maDV = maDV;
        this.tenDV = tenDV;
        this.gia = gia;
        this.loaiDV = loaiDV;
        this.moTa = moTa;
    }

    public String getMaDV() {
        return maDV;
    }

    public void setMaDV(String maDV) {
        this.maDV = maDV;
    }

    public String getTenDV() {
        return tenDV;
    }

    public void setTenDV(String tenDV) {
        this.tenDV = tenDV;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getLoaiDV() {
        return loaiDV;
    }

    public void setLoaiDV(String loaiDV) {
        this.loaiDV = loaiDV;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    
    
    public Object[] toDaTaRow_DV(){
        return new Object[]{ this.maDV, this.tenDV, this.gia, this.loaiDV, this.moTa
            
        };
    }
    // MoDel Đặt Dịch Vụ
    private String maDDV;
    private String maP;
    private int soLuong;
    private Date ngayDat;
    private double tongTien;
    private String maHD;

    public Model_DichVu(String maDDV, String maP,String maDV, String tenDV, int soLuong, double gia, Date ngayDat, double tongTien, String maHD) {
        this.maDDV = maDDV;
        this.maP = maP;
        this.maDV = maDV;
        this.tenDV = tenDV;  
        this.soLuong = soLuong;
        this.gia = gia;
        this.ngayDat = ngayDat;
        this.tongTien = tongTien;
        this.maHD = maHD;
    }

    public String getMaDDV() {
        return maDDV;
    }

    public void setMaDDV(String maDDV) {
        this.maDDV = maDDV;
    }

    public String getMaP() {
        return maP;
    }

    public void setMaP(String maP) {
        this.maP = maP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Date getNgayDat() {
        return ngayDat;
    }

    public void setNgayDat(Date ngayDat) {
        this.ngayDat = ngayDat;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }
    
    public Object[] toDaTaRow_DDV(){
        return new Object[]{this.maDDV, this.maP, this.maDV, this.tenDV, this.soLuong, this.gia, this.ngayDat, this.tongTien, this.maHD};
    }
   // lập model bảng check thông tin
   
    private String tenKH;
    private String SĐT;

    public Model_DichVu(String maHD, String maP, String tenKH, String SĐT) {
        this.maHD = maHD;
        this.maP = maP;
        this.tenKH = tenKH;
        this.SĐT = SĐT;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getSĐT() {
        return SĐT;
    }

    public void setSĐT(String SĐT) {
        this.SĐT = SĐT;
    }
    public Object[] toDaTaRow_CTT(){
        return new Object[]{this.maHD, this.maP, this.tenKH, this.SĐT};
}
    
}
