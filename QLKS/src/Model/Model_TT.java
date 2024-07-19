/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author ADMIN
 */
public class Model_TT {

    //HD
    private String maHD;
    private String maKH;
    private String maNV;
    private String soDienThoai;
    private String diaChi;
    private int soPhongDat;
    private String trangThai;
    private Date ngayXuatDon;
    private Date ngayThanhToan;
    private double thue;
    private double tienCoc;
    private double tongTien;

    //HDCT
    private String maHDCT;
    private String maKM;
    private String maHD_HDCT;
    private String maDDV;
    private String maP;
    private Date checkIn;
    private Date checkOut;
    private double giaBanDau;
    private double giaSauKhuyenMai;
    private double tongGiaDichVu;
    private double tongTienPhong;
    private Date ngayThanhToan_HDCT;

    public Model_TT() {
    }

    public Model_TT(String maHD, String maKH, String maNV, String soDienThoai, String diaChi, int soPhongDat, String trangThai, Date ngayXuatDon, Date ngayThanhToan, double thue, double tienCoc, double tongTien, String maHDCT, String maKM, String maHD_HDCT, String maDDV, String maP, Date checkIn, Date checkOut, double giaBanDau, double giaSauKhuyenMai, double tongGiaDichVu, double tongTienPhong, Date ngayThanhToan_HDCT) {
        this.maHD = maHD;
        this.maKH = maKH;
        this.maNV = maNV;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
        this.soPhongDat = soPhongDat;
        this.trangThai = trangThai;
        this.ngayXuatDon = ngayXuatDon;
        this.ngayThanhToan = ngayThanhToan;
        this.thue = thue;
        this.tienCoc = tienCoc;
        this.tongTien = tongTien;
        this.maHDCT = maHDCT;
        this.maKM = maKM;
        this.maHD_HDCT = maHD_HDCT;
        this.maDDV = maDDV;
        this.maP = maP;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.giaBanDau = giaBanDau;
        this.giaSauKhuyenMai = giaSauKhuyenMai;
        this.tongGiaDichVu = tongGiaDichVu;
        this.tongTienPhong = tongTienPhong;
        this.ngayThanhToan_HDCT = ngayThanhToan_HDCT;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
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

    public Date getNgayXuatDon() {
        return ngayXuatDon;
    }

    public void setNgayXuatDon(Date ngayXuatDon) {
        this.ngayXuatDon = ngayXuatDon;
    }

    public Date getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(Date ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public double getThue() {
        return thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }

    public double getTienCoc() {
        return tienCoc;
    }

    public void setTienCoc(double tienCoc) {
        this.tienCoc = tienCoc;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public String getMaHDCT() {
        return maHDCT;
    }

    public void setMaHDCT(String maHDCT) {
        this.maHDCT = maHDCT;
    }

    public String getMaKM() {
        return maKM;
    }

    public void setMaKM(String maKM) {
        this.maKM = maKM;
    }

    public String getMaHD_HDCT() {
        return maHD_HDCT;
    }

    public void setMaHD_HDCT(String maHD_HDCT) {
        this.maHD_HDCT = maHD_HDCT;
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

    public double getGiaBanDau() {
        return giaBanDau;
    }

    public void setGiaBanDau(double giaBanDau) {
        this.giaBanDau = giaBanDau;
    }

    public double getGiaSauKhuyenMai() {
        return giaSauKhuyenMai;
    }

    public void setGiaSauKhuyenMai(double giaSauKhuyenMai) {
        this.giaSauKhuyenMai = giaSauKhuyenMai;
    }

    public double getTongGiaDichVu() {
        return tongGiaDichVu;
    }

    public void setTongGiaDichVu(double tongGiaDichVu) {
        this.tongGiaDichVu = tongGiaDichVu;
    }

    public double getTongTienPhong() {
        return tongTienPhong;
    }

    public void setTongTienPhong(double tongTienPhong) {
        this.tongTienPhong = tongTienPhong;
    }

    public Date getNgayThanhToan_HDCT() {
        return ngayThanhToan_HDCT;
    }

    public void setNgayThanhToan_HDCT(Date ngayThanhToan_HDCT) {
        this.ngayThanhToan_HDCT = ngayThanhToan_HDCT;
    }

    public Object[] toDataRow_HD() {
        return new Object[]{
            this.maHD, this.maKH, this.maNV, this.soDienThoai, this.diaChi, this.soPhongDat,
            this.trangThai, this.ngayXuatDon, this.ngayThanhToan, this.thue, this.tienCoc,
            this.tongTien
        };
    }

    public Object[] toDataRow_HDCT() {
        return new Object[]{
            this.maHDCT, this.maKM, this.maHD_HDCT, this.maDDV, this.maP, this.checkIn,
            this.checkOut, this.giaBanDau, this.giaSauKhuyenMai, this.tongGiaDichVu,
            this.tongTienPhong, this.ngayThanhToan_HDCT
        };
    }
}
