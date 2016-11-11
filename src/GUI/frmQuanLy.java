package GUI;

/**
 *
 * @author HongAnhDo
 */
public class frmQuanLy extends javax.swing.JPanel {

    public frmQuanLy() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pLeft = new javax.swing.JPanel();
        btnSinhVien = new javax.swing.JButton();
        btnGiaoVien = new javax.swing.JButton();
        btnMonHoc = new javax.swing.JButton();
        btnLopHoc = new javax.swing.JButton();
        pCenter = new javax.swing.JPanel();
        pChucNang = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnNew = new javax.swing.JButton();
        pThongTin = new javax.swing.JPanel();
        jLSinhVien = new javax.swing.JLabel();
        jLMSSV = new javax.swing.JLabel();
        txtMSSV = new javax.swing.JTextField();
        jLMSSV1 = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        jLMSSV2 = new javax.swing.JLabel();
        txtLop = new javax.swing.JTextField();
        jLMSSV3 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        jLMSSV4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLMSSV5 = new javax.swing.JLabel();
        jLMSSV6 = new javax.swing.JLabel();
        rbtnSVTinChi = new javax.swing.JRadioButton();
        rbtnSVNienChe = new javax.swing.JRadioButton();
        jLMSSV7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLKhoa = new javax.swing.JLabel();
        txtKhoa = new javax.swing.JTextField();
        pRight = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLThongTinChiTiet = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 255));
        setMinimumSize(new java.awt.Dimension(1366, 620));
        setPreferredSize(new java.awt.Dimension(1366, 620));
        setLayout(null);

        pLeft.setBackground(new java.awt.Color(0, 0, 255));
        pLeft.setMinimumSize(new java.awt.Dimension(202, 549));

        btnSinhVien.setText("Sinh Viên");

        btnGiaoVien.setText("Giáo viên");

        btnMonHoc.setText("Môn học");

        btnLopHoc.setText("Lớp học");

        javax.swing.GroupLayout pLeftLayout = new javax.swing.GroupLayout(pLeft);
        pLeft.setLayout(pLeftLayout);
        pLeftLayout.setHorizontalGroup(
            pLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMonHoc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLopHoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGiaoVien, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(btnSinhVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pLeftLayout.setVerticalGroup(
            pLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(btnGiaoVien, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(btnLopHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        pLeftLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnGiaoVien, btnLopHoc, btnMonHoc, btnSinhVien});

        add(pLeft);
        pLeft.setBounds(0, 0, 210, 580);

        pCenter.setBackground(new java.awt.Color(255, 204, 204));
        pCenter.setLayout(null);

        btnThem.setText("Thêm");

        btnSua.setText("Sửa");

        btnXoa.setText("Xóa");

        javax.swing.GroupLayout pChucNangLayout = new javax.swing.GroupLayout(pChucNang);
        pChucNang.setLayout(pChucNangLayout);
        pChucNangLayout.setHorizontalGroup(
            pChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pChucNangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pChucNangLayout.setVerticalGroup(
            pChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pChucNangLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pChucNangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pCenter.add(pChucNang);
        pChucNang.setBounds(10, 10, 250, 40);

        btnNew.setText("New");
        pCenter.add(btnNew);
        btnNew.setBounds(190, 60, 70, 23);

        pThongTin.setBackground(new java.awt.Color(255, 255, 204));
        pThongTin.setPreferredSize(new java.awt.Dimension(100, 688));

        jLSinhVien.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLSinhVien.setText("SINH VIÊN");

        jLMSSV.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLMSSV.setText("Mã SV");

        txtMSSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMSSVActionPerformed(evt);
            }
        });

        jLMSSV1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLMSSV1.setText("Họ tên");

        jLMSSV2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLMSSV2.setText("Ngày sinh");

        jLMSSV3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLMSSV3.setText("Lớp");

        jLMSSV4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLMSSV4.setText("Địa chỉ");

        jLMSSV5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLMSSV5.setText("Email");

        jLMSSV6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLMSSV6.setText("Loại SV");

        buttonGroup1.add(rbtnSVTinChi);
        rbtnSVTinChi.setText("SV Tín chỉ");

        buttonGroup1.add(rbtnSVNienChe);
        rbtnSVNienChe.setText("SV Niên chế");

        jLMSSV7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLMSSV7.setText("Giới tính");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));

        jButton1.setText("SAVE");

        jLKhoa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLKhoa.setText("Khoa");

        javax.swing.GroupLayout pThongTinLayout = new javax.swing.GroupLayout(pThongTin);
        pThongTin.setLayout(pThongTinLayout);
        pThongTinLayout.setHorizontalGroup(
            pThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pThongTinLayout.createSequentialGroup()
                .addGroup(pThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pThongTinLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pThongTinLayout.createSequentialGroup()
                                .addComponent(jLMSSV1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pThongTinLayout.createSequentialGroup()
                                .addComponent(jLMSSV2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pThongTinLayout.createSequentialGroup()
                                .addComponent(jLMSSV7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pThongTinLayout.createSequentialGroup()
                                .addComponent(jLMSSV3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLop))
                            .addGroup(pThongTinLayout.createSequentialGroup()
                                .addComponent(jLMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLSinhVien)
                                    .addComponent(txtMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pThongTinLayout.createSequentialGroup()
                                .addComponent(jLKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtKhoa))))
                    .addGroup(pThongTinLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pThongTinLayout.createSequentialGroup()
                                    .addComponent(jLMSSV4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pThongTinLayout.createSequentialGroup()
                                    .addGroup(pThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLMSSV6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLMSSV5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(pThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(pThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(rbtnSVTinChi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(rbtnSVNienChe, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pThongTinLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtDiaChi, txtLop});

        pThongTinLayout.setVerticalGroup(
            pThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pThongTinLayout.createSequentialGroup()
                .addComponent(jLSinhVien, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(pThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pThongTinLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtMSSV, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(pThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLMSSV1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pThongTinLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(pThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLMSSV2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pThongTinLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(pThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLMSSV7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(pThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLMSSV3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pThongTinLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtLop, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(pThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pThongTinLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(pThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLMSSV4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pThongTinLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(pThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLMSSV5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pThongTinLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pThongTinLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLMSSV6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnSVTinChi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbtnSVNienChe, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pCenter.add(pThongTin);
        pThongTin.setBounds(10, 87, 250, 450);

        add(pCenter);
        pCenter.setBounds(220, 0, 270, 580);

        pRight.setBackground(new java.awt.Color(255, 255, 255));
        pRight.setPreferredSize(new java.awt.Dimension(886, 0));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLThongTinChiTiet.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLThongTinChiTiet.setText("THÔNG TIN CHI TIẾT");

        javax.swing.GroupLayout pRightLayout = new javax.swing.GroupLayout(pRight);
        pRight.setLayout(pRightLayout);
        pRightLayout.setHorizontalGroup(
            pRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pRightLayout.createSequentialGroup()
                .addGroup(pRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pRightLayout.createSequentialGroup()
                        .addGap(351, 351, 351)
                        .addComponent(jLThongTinChiTiet))
                    .addGroup(pRightLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        pRightLayout.setVerticalGroup(
            pRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pRightLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLThongTinChiTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );

        add(pRight);
        pRight.setBounds(490, 0, 880, 580);
    }// </editor-fold>//GEN-END:initComponents

    private void txtMSSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMSSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMSSVActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGiaoVien;
    private javax.swing.JButton btnLopHoc;
    private javax.swing.JButton btnMonHoc;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSinhVien;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLKhoa;
    private javax.swing.JLabel jLMSSV;
    private javax.swing.JLabel jLMSSV1;
    private javax.swing.JLabel jLMSSV2;
    private javax.swing.JLabel jLMSSV3;
    private javax.swing.JLabel jLMSSV4;
    private javax.swing.JLabel jLMSSV5;
    private javax.swing.JLabel jLMSSV6;
    private javax.swing.JLabel jLMSSV7;
    private javax.swing.JLabel jLSinhVien;
    private javax.swing.JLabel jLThongTinChiTiet;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel pCenter;
    private javax.swing.JPanel pChucNang;
    private javax.swing.JPanel pLeft;
    private javax.swing.JPanel pRight;
    private javax.swing.JPanel pThongTin;
    private javax.swing.JRadioButton rbtnSVNienChe;
    private javax.swing.JRadioButton rbtnSVTinChi;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtKhoa;
    private javax.swing.JTextField txtLop;
    private javax.swing.JTextField txtMSSV;
    private javax.swing.JTextField txtNgaySinh;
    // End of variables declaration//GEN-END:variables
}
