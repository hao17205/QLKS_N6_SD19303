/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duan1;

/**
 *
 * @author PC
 */
public class Model_KhachHang {
    private String maKhachHang;
    private String hoTen;
    private String ngaySinh;
    private String Cccd;
    private String Sdt;
    private String Email;
    private int gioiTinh;
    private String diaChi;

    public Model_KhachHang() {
    }

    public Model_KhachHang(String maKhachHang, String hoTen, String ngaySinh, String Cccd, String Sdt, String Email, int gioiTinh, String diaChi) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.Cccd = Cccd;
        this.Sdt = Sdt;
        this.Email = Email;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getCccd() {
        return Cccd;
    }

    public void setCccd(String Cccd) {
        this.Cccd = Cccd;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    
    public Object[] toDataRow(){
        return new Object[]{this.maKhachHang, this.hoTen, this.ngaySinh, this.Cccd,this.Sdt, this.Email, this.gioiTinh==1?"Nam":"Nữ", this.diaChi};
    }
}
