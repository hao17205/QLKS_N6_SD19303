/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Model.Model_LG;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import repositories.Repositories_LG;

/**
 *
 * @author Chi Dat
 */
public class View_Login extends javax.swing.JFrame {

//    private repositories.Repositories_LG rp_LG = new Repositories_LG();
 //   private DefaultTableModel mol = new DefaultTableModel();
   // private int i;

    /**
     * Creates new form View_Login
     */
    public View_Login() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_TaiKhoan = new javax.swing.JTextField();
        txt_MatKhau = new javax.swing.JPasswordField();
        btn_Login = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btn_Reset = new javax.swing.JButton();
        btn_Thoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/5.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel3.setText("QUẢN LÝ HỆ THỐNG");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/key.png"))); // NOI18N
        jLabel4.setText("TÀI KHOẢN :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/lock.png"))); // NOI18N
        jLabel5.setText("MẬT KHẨU:");

        txt_MatKhau.setText("jPasswordField1");

        btn_Login.setBackground(new java.awt.Color(255, 204, 153));
        btn_Login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Login.setText("ĐĂNG NHẬP");
        btn_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LoginActionPerformed(evt);
            }
        });

        btn_Reset.setBackground(new java.awt.Color(255, 255, 204));
        btn_Reset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Reset.setText("RESET");
        btn_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ResetActionPerformed(evt);
            }
        });

        btn_Thoat.setBackground(new java.awt.Color(204, 255, 204));
        btn_Thoat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_Thoat.setForeground(new java.awt.Color(255, 51, 51));
        btn_Thoat.setText("EXITS");
        btn_Thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(154, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(138, 138, 138))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_TaiKhoan)
                    .addComponent(txt_MatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(btn_Login)
                .addGap(39, 39, 39)
                .addComponent(btn_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_TaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_MatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Login)
                    .addComponent(btn_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Thoat))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(139, 139, 139)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LoginActionPerformed
        /*String tenDangNhap = txt_TaiKhoan.getText().trim();
        String matKhau = new String(txt_MatKhau.getPassword()).trim();

        // Kiểm tra dữ liệu nhập vào
        if (tenDangNhap.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập tên đăng nhập!");
            txt_TaiKhoan.requestFocus();
            return;
        }

        if (matKhau.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập mật khẩu!");
            txt_MatKhau.requestFocus();
            return;
        }

        // Xác thực thông tin đăng nhập
        if (rp_LG.checkTrung_taiKhoan(tenDangNhap, matKhau)) {
            // Đăng nhập thành công
            JOptionPane.showMessageDialog(this, "Đăng nhập thành công!");
            View_TrangChu home = new View_TrangChu(); // Thay thế bằng cửa sổ chính của bạn
            home.setVisible(true);
            this.dispose(); // Đóng cửa sổ đăng nhập
        } else {
            // Đăng nhập thất bại
            JOptionPane.showMessageDialog(this, "Tên đăng nhập hoặc mật khẩu không đúng!");
        }
*/
    }//GEN-LAST:event_btn_LoginActionPerformed

    private void btn_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ResetActionPerformed
      /*  // TODO add your handling code here:
        txt_TaiKhoan.setText("");
        txt_MatKhau.setText("");
        */
    }//GEN-LAST:event_btn_ResetActionPerformed

    private void btn_ThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThoatActionPerformed
        // TODO add your handling code here:
       // System.exit(0);
    }//GEN-LAST:event_btn_ThoatActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new View_Login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Login;
    private javax.swing.JButton btn_Reset;
    private javax.swing.JButton btn_Thoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPasswordField txt_MatKhau;
    private javax.swing.JTextField txt_TaiKhoan;
    // End of variables declaration//GEN-END:variables

   /* private Model_LG readForm() {

        String tenDangNhap;
        String matKhau;

        tenDangNhap = txt_TaiKhoan.getText().trim();
        if (tenDangNhap.isEmpty()) {
            JOptionPane.showMessageDialog(this, "bạn chưa nhập ten");
            txt_TaiKhoan.requestFocus();
            return null;

        }
        matKhau = new String(txt_MatKhau.getPassword()).trim();
        if (matKhau.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập mật khẩu!");
            txt_MatKhau.requestFocus();
            return null;
        }
        return new Model_LG(tenDangNhap, matKhau);
    }
*/
}
