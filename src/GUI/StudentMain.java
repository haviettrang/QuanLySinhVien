package GUI;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;


public class StudentMain extends javax.swing.JFrame {

    public StudentMain() {
        initComponents();
        addPanel();
        this.invalidate();
        this.validate();
        repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pTieuDe = new javax.swing.JPanel();
        pLogo = new javax.swing.JPanel(){
            ImageIcon icon = new ImageIcon("src/Icon/logoBK_1.png");

            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        pDHBK = new javax.swing.JPanel(){
            ImageIcon icon = new ImageIcon("src/Icon/BK_2.jpg");

            public void paintComponent(Graphics g){
                Dimension d = getSize();
                g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
                setOpaque(false);
                super.paintComponent(g);
            }
        };
        pMain = new javax.swing.JPanel();
        mMenu = new javax.swing.JMenuBar();
        mTrangChu = new javax.swing.JMenu();
        mInforUser = new javax.swing.JMenu();
        mDoiMatKhau = new javax.swing.JMenuItem();
        mThongTinCaNhan = new javax.swing.JMenuItem();
        javax.swing.JMenu mSearch = new javax.swing.JMenu();
        mTimKiemMonHoc = new javax.swing.JMenuItem();
        mTimKiemSV = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(null);

        pTieuDe.setPreferredSize(new java.awt.Dimension(1366, 142));

        pLogo.setBackground(new java.awt.Color(255, 102, 102));
        pLogo.setLayout(null);

        pDHBK.setBackground(new java.awt.Color(255, 255, 255));
        pDHBK.setPreferredSize(new java.awt.Dimension(1300, 0));

        javax.swing.GroupLayout pDHBKLayout = new javax.swing.GroupLayout(pDHBK);
        pDHBK.setLayout(pDHBKLayout);
        pDHBKLayout.setHorizontalGroup(
            pDHBKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1256, Short.MAX_VALUE)
        );
        pDHBKLayout.setVerticalGroup(
            pDHBKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 131, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pTieuDeLayout = new javax.swing.GroupLayout(pTieuDe);
        pTieuDe.setLayout(pTieuDeLayout);
        pTieuDeLayout.setHorizontalGroup(
            pTieuDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTieuDeLayout.createSequentialGroup()
                .addComponent(pLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pDHBK, javax.swing.GroupLayout.PREFERRED_SIZE, 1256, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pTieuDeLayout.setVerticalGroup(
            pTieuDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pTieuDeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pTieuDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pLogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pDHBK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(pTieuDe);
        pTieuDe.setBounds(0, 0, 1366, 130);

        pMain.setBackground(new java.awt.Color(255, 255, 255));
        pMain.setPreferredSize(new java.awt.Dimension(1366, 610));
        pMain.setLayout(null);
        getContentPane().add(pMain);
        pMain.setBounds(0, 130, 1366, 620);

        mTrangChu.setText("Trang chủ");
        mMenu.add(mTrangChu);

        mInforUser.setText("Thông tin người dùng");

        mDoiMatKhau.setText("Đổi mật khẩu");
        mDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mDoiMatKhauActionPerformed(evt);
            }
        });
        mInforUser.add(mDoiMatKhau);

        mThongTinCaNhan.setText("Thông tin cá nhân");
        mInforUser.add(mThongTinCaNhan);

        mMenu.add(mInforUser);

        mSearch.setText("Tra cứu");

        mTimKiemMonHoc.setText("Môn học");
        mSearch.add(mTimKiemMonHoc);

        mTimKiemSV.setText("Sinh viên");
        mTimKiemSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mTimKiemSVActionPerformed(evt);
            }
        });
        mSearch.add(mTimKiemSV);

        mMenu.add(mSearch);

        jMenu1.setText("Đăng ký học tập");
        mMenu.add(jMenu1);

        setJMenuBar(mMenu);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mTimKiemSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mTimKiemSVActionPerformed
        // TODO add your handling code here:
        pMain.remove(pQL);
        pMain.add(pSearchStudent);
        pSearchStudent.setBounds(0, 0,  pMain.getWidth(),pMain.getHeight());
        this.invalidate();
        this.validate();
        repaint();
    }//GEN-LAST:event_mTimKiemSVActionPerformed

    private void mDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mDoiMatKhauActionPerformed
        // TODO add your handling code here:
       frmChangePassWord jChangePassword = new frmChangePassWord();
        jChangePassword.setVisible(true);
    }//GEN-LAST:event_mDoiMatKhauActionPerformed

    
    frmQuanLy pQL = new frmQuanLy();
    frmSearchStudent pSearchStudent = new frmSearchStudent();
    private void addPanel(){
        pMain.add(pQL);
        pQL.setBounds(0, 0,  pMain.getWidth(),pMain.getHeight());
        this.invalidate();
        this.validate();
        repaint();
    }
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
            java.util.logging.Logger.getLogger(StudentMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem mDoiMatKhau;
    private javax.swing.JMenu mInforUser;
    private javax.swing.JMenuBar mMenu;
    private javax.swing.JMenuItem mThongTinCaNhan;
    private javax.swing.JMenuItem mTimKiemMonHoc;
    private javax.swing.JMenuItem mTimKiemSV;
    private javax.swing.JMenu mTrangChu;
    private javax.swing.JPanel pDHBK;
    private javax.swing.JPanel pLogo;
    private javax.swing.JPanel pMain;
    private javax.swing.JPanel pTieuDe;
    // End of variables declaration//GEN-END:variables
}
