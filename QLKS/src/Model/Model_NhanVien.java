/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author acer
 */
public class Model_NhanVien {
    private String maNV;
    private String maTK;
    private String tenNV;
    private String ngaySinh;
    private int gioiTinh;
    private String sdt;
    private String email;
    private String diaChi;
    private String chucVu;

    public Model_NhanVien() {
    }

    public Model_NhanVien(String maNV, String maTK, String tenNV, String ngaySinh, int gioiTinh, String sdt, String email, String diaChi, String chucVu) {
        this.maNV = maNV;
        this.maTK = maTK;
        this.tenNV = tenNV;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.sdt = sdt;
        this.email = email;
        this.diaChi = diaChi;
        this.chucVu = chucVu;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMaTK() {
        return maTK;
    }

    public void setMaTK(String maTK) {
        this.maTK = maTK;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }
    
    public Object[] toDataRow(){
        return new Object[]{
            this.getMaNV(),this.getMaTK(),this.getTenNV(),this.getNgaySinh(),this.getGioiTinh()== 1? "Nam":"Nữ",this.getSdt(),this.getEmail(),
            this.getDiaChi(),this.getChucVu()
        };
                }
}
