/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Model.Model_NhanVien;
import repositories.Repositories_NhanVien;

public class View_NhanVien extends javax.swing.JFrame {
    private Repositories_NhanVien rp = new Repositories_NhanVien();
    private DefaultTableModel mol = new DefaultTableModel();
    private int i = -1;
    public View_NhanVien() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.fillTable(rp.getAll_NV());
    }
    private void fillTable(ArrayList<Model_NhanVien>list){
        mol = (DefaultTableModel) tbl_bang.getModel();
        mol.setRowCount(0);
        for (Model_NhanVien x : list) {
            mol.addRow(x.toDataRow_NV());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_bang = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_maNV = new javax.swing.JTextField();
        txt_tenNV = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_ngaySinh = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        rdo_nam = new javax.swing.JRadioButton();
        rdo_nu = new javax.swing.JRadioButton();
        txt_sdt = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_diaChi = new javax.swing.JTextField();
        txt_chucVu = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_them = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        txt_timkiem = new javax.swing.JTextField();
        btn_timKiem = new javax.swing.JButton();
        btn_thoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Quản Lý Nhân Viên Khách Sạn");

        tbl_bang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Nhân Viên", "Tên NV", "Ngày Sinh", "Giới Tính", "Số Điện Thoại", "Email", "Địa Chỉ", "Chức Vụ"
            }
        ));
        tbl_bang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_bangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_bang);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setForeground(new java.awt.Color(0, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Số Điện Thoại:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Mã Nhân Viên:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Tên Nhân Viên:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Ngày Sinh:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Giới Tính:");

        buttonGroup1.add(rdo_nam);
        rdo_nam.setSelected(true);
        rdo_nam.setText("Nam");

        buttonGroup1.add(rdo_nu);
        rdo_nu.setText("Nữ");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Email:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Địa Chỉ:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Chức Vụ:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_maNV, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(rdo_nam, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rdo_nu, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txt_tenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 190, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_chucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_email, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                .addComponent(txt_diaChi))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txt_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_maNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_tenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txt_ngaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_diaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rdo_nam)
                        .addComponent(rdo_nu))
<<<<<<< HEAD
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11)
                        .addComponent(txt_chucVu, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
=======
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(2, 2, 2))
                    .addComponent(txt_chucVu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
>>>>>>> 1f23023e3495100df71b2f1c838ebe6d9ca3a991
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 255, 255));

        btn_them.setBackground(new java.awt.Color(255, 0, 0));
        btn_them.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_them.setForeground(new java.awt.Color(242, 242, 242));
        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        btn_sua.setBackground(new java.awt.Color(51, 255, 51));
        btn_sua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_sua.setForeground(new java.awt.Color(242, 242, 242));
        btn_sua.setText("Sửa");
        btn_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suaActionPerformed(evt);
            }
        });

        btn_xoa.setBackground(new java.awt.Color(0, 0, 255));
        btn_xoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_xoa.setForeground(new java.awt.Color(242, 242, 242));
        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        txt_timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_timkiemActionPerformed(evt);
            }
        });

        btn_timKiem.setBackground(new java.awt.Color(255, 0, 255));
        btn_timKiem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_timKiem.setForeground(new java.awt.Color(242, 242, 242));
        btn_timKiem.setText("Tìm Kiếm");
        btn_timKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btn_them)
                .addGap(18, 18, 18)
                .addComponent(btn_sua)
                .addGap(18, 18, 18)
                .addComponent(btn_xoa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_timKiem)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_them)
                    .addComponent(btn_sua)
                    .addComponent(btn_xoa)
                    .addComponent(txt_timkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_timKiem))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_thoat.setBackground(new java.awt.Color(255, 0, 255));
        btn_thoat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_thoat.setForeground(new java.awt.Color(242, 242, 242));
        btn_thoat.setText("Cancel");
        btn_thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btn_thoat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(296, 296, 296))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_thoat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_bangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_bangMouseClicked
        i = tbl_bang.getSelectedRow();
        this.showData(i);
    }//GEN-LAST:event_tbl_bangMouseClicked

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        if (this.readForm() != null) {
            if (rp.them_NV(this.readForm()) > 0) {
                JOptionPane.showMessageDialog(this, "thêm thành công");
                this.fillTable(rp.getAll_NV());
            } else {
                JOptionPane.showMessageDialog(this, "Thêm thất bại");
            }
        }
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suaActionPerformed
        i = tbl_bang.getSelectedRow();
        if( i == -1){
            JOptionPane.showMessageDialog(this, "Bạn Chưa Chọn Dòng Để Sửa");
        }
        else{
            String maNV =tbl_bang.getValueAt(i, 0).toString();
            if(this.readForm() != null){
                if(rp.sua_NV(maNV, this.readForm())>0){
                    JOptionPane.showMessageDialog(this, "Sửa Thành Công");
                    this.fillTable(rp.getAll_NV());
                }
                else{
                    JOptionPane.showMessageDialog(this, "Sửa Thất Bại");
                }
            }
        }
    }//GEN-LAST:event_btn_suaActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        i = tbl_bang.getSelectedRow();
        if( i == -1){
            JOptionPane.showMessageDialog(this, "Bạn Chưa Chọn Dòng Để Xóa");
        }
        else{
              String maNV =tbl_bang.getValueAt(i, 0).toString();
              if(this.readForm() != null){
                  if(rp.xoa_NV(maNV)>0){
                      JOptionPane.showMessageDialog(this, "Xóa Thành Công");
                      this.fillTable(rp.getAll_NV());
                  }
                  else{
                      JOptionPane.showMessageDialog(this, "Xóa Thất Bại");
                  }
                }
        }
    }//GEN-LAST:event_btn_xoaActionPerformed

    private void btn_timKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timKiemActionPerformed
         String maNV = txt_timkiem.getText().trim();
        if(maNV.isEmpty()){
            JOptionPane.showMessageDialog(this, "Bạn Chưa Nhập Mã Nhân Viên");
        }
        else{
            ArrayList<Model_NhanVien> NhanVien = rp.timKiem(maNV);
            if(NhanVien.isEmpty()){
                JOptionPane.showMessageDialog(this, "Không Có Dữ Liệu");
            }else{
                JOptionPane.showMessageDialog(this, "Đã Tìm Thấy Dữ Liệu");
                this.fillTable(NhanVien);
            }   
                }
                
                
    }//GEN-LAST:event_btn_timKiemActionPerformed

    private void txt_timkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_timkiemActionPerformed
      
    }//GEN-LAST:event_txt_timkiemActionPerformed

    private void btn_thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thoatActionPerformed
        View_TrangChu tt = new View_TrangChu();
        tt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_thoatActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_NhanVien().setVisible(true);
            }
        });
    }
    private void showData(int i){
        txt_maNV.setText(tbl_bang.getValueAt(i, 0).toString());
        txt_tenNV.setText(tbl_bang.getValueAt(i, 1).toString());
        txt_ngaySinh.setText(tbl_bang.getValueAt(i, 2).toString());
        if(tbl_bang.getValueAt(i, 3).toString().equalsIgnoreCase("Nam")) rdo_nam.setSelected(true);
        else rdo_nu.setSelected(true);
        txt_sdt.setText(tbl_bang.getValueAt(i, 4).toString());
        txt_email.setText((tbl_bang.getValueAt(i, 5).toString()));
        txt_diaChi.setText(tbl_bang.getValueAt(i, 6).toString());
        txt_chucVu.setText(tbl_bang.getValueAt(i, 7).toString());
    }
    
    Model_NhanVien readForm(){
        String maNV;
        String tenNV;
        String ngaySinh;
        int gioiTinh;
        String sdt;
        String email;
        String diaChi;
        String chucVu;
        
        maNV = txt_maNV.getText().trim();
        if(maNV.isEmpty()){
            JOptionPane.showMessageDialog(this, "Bạn Chưa Nhập Mã NV");
            return null;
        }

        tenNV = txt_tenNV.getText().trim();
        if(tenNV.isEmpty()){
            JOptionPane.showMessageDialog(this, "Bạn Chưa Nhập Tên NV");
            return null;
        }
        ngaySinh = txt_ngaySinh.getText().trim();
        if(ngaySinh.isEmpty()){
            JOptionPane.showMessageDialog(this, "Bạn Chưa Nhập Ngày Sinh");
            return null;
        }
        if(rdo_nam.isSelected()) gioiTinh = 1;
        else gioiTinh = 0;
        sdt = txt_sdt.getText().trim();
        if(sdt.isEmpty()){
            JOptionPane.showMessageDialog(this, "Bạn Chưa Nhập Số Điện Thoại");
            return null;
        }
        email = txt_email.getText().trim();
        if(email.isEmpty()){
            JOptionPane.showMessageDialog(this, "Bạn Chưa Nhập Email");
            return null;
        }
        diaChi = txt_diaChi.getText().trim();
        if(diaChi.isEmpty()){
            JOptionPane.showMessageDialog(this, "Bạn Chưa Nhập Địa Chỉ");
            return null;
        }
        chucVu = txt_chucVu.getText().trim();
        if(chucVu.isEmpty()){
            JOptionPane.showMessageDialog(this, "Bạn Chưa Nhập Chức Vụ");
            return null;
        }
        
        return new Model_NhanVien(maNV, tenNV, ngaySinh, gioiTinh, sdt, email, diaChi, chucVu);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JButton btn_thoat;
    private javax.swing.JButton btn_timKiem;
    private javax.swing.JButton btn_xoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdo_nam;
    private javax.swing.JRadioButton rdo_nu;
    private javax.swing.JTable tbl_bang;
    private javax.swing.JTextField txt_chucVu;
    private javax.swing.JTextField txt_diaChi;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_maNV;
    private javax.swing.JTextField txt_ngaySinh;
    private javax.swing.JTextField txt_sdt;
    private javax.swing.JTextField txt_tenNV;
    private javax.swing.JTextField txt_timkiem;
    // End of variables declaration//GEN-END:variables
}
