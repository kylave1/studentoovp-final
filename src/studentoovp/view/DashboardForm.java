package studentoovp.view;

import javax.swing.ImageIcon;
import java.awt.Image;

public class DashboardForm extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger =
        java.util.logging.Logger.getLogger(DashboardForm.class.getName());

public DashboardForm() {
          initComponents();
    setSize(1150, 620);
    setLocationRelativeTo(null);

    // ✅ Ganti Right → Left untuk load gambar
    javax.swing.SwingUtilities.invokeLater(() -> {
        int imgW = Left.getWidth();
        int imgH = Left.getHeight();
        if (imgW <= 0) imgW = 790;
        if (imgH <= 0) imgH = 590;

        Left.setLayout(null);

        jLabelWelcome = new javax.swing.JLabel();
        jLabelWelcome.setBounds(0, 0, imgW, imgH);

        java.net.URL imgURL = getClass().getResource("/gambar/welcome.jpg");
        if (imgURL != null) {
            ImageIcon rawIcon = new ImageIcon(imgURL);
            Image scaled = rawIcon.getImage().getScaledInstance(
                imgW, imgH, Image.SCALE_SMOOTH);
            jLabelWelcome.setIcon(new ImageIcon(scaled));
        }

        Left.add(jLabelWelcome);
        Left.revalidate();
        Left.repaint();
    });

    // ✅ Ganti Right → Left pada ComponentListener juga
    addComponentListener(new java.awt.event.ComponentAdapter() {
        @Override
        public void componentResized(java.awt.event.ComponentEvent e) {
            if (jLabelWelcome == null) return;
            int imgW = Left.getWidth();
            int imgH = Left.getHeight();
            if (imgW <= 0 || imgH <= 0) return;

            jLabelWelcome.setBounds(0, 0, imgW, imgH);

            java.net.URL imgURL = getClass().getResource("/gambar/welcome.jpeg");
            if (imgURL != null) {
                ImageIcon rawIcon = new ImageIcon(imgURL);
                Image scaled = rawIcon.getImage().getScaledInstance(
                    imgW, imgH, Image.SCALE_SMOOTH);    
                jLabelWelcome.setIcon(new ImageIcon(scaled));
            }
            Left.revalidate();
            Left.repaint();
        }
    });
    }

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        studentController1 = new studentoovp.controller.StudentController();
        jPanel1 = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnStudents = new javax.swing.JButton();
        btnReports = new javax.swing.JButton();
        btnMajor = new javax.swing.JButton();
        btnDashboard = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Left = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 400));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(650, 400));
        jPanel1.setLayout(null);

        Right.setBackground(new java.awt.Color(15, 23, 42));
        Right.setMinimumSize(new java.awt.Dimension(150, 400));
        Right.setPreferredSize(new java.awt.Dimension(150, 400));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("COMPUTER SCIENCE");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("President University");

        btnStudents.setBackground(new java.awt.Color(15, 23, 42));
        btnStudents.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnStudents.setForeground(new java.awt.Color(255, 255, 255));
        btnStudents.setText("- Students");
        btnStudents.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnStudents.addActionListener(this::btnStudentsActionPerformed);

        btnReports.setBackground(new java.awt.Color(15, 23, 42));
        btnReports.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnReports.setForeground(new java.awt.Color(255, 255, 255));
        btnReports.setText("- Reports ");
        btnReports.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnReports.addActionListener(this::btnReportsActionPerformed);

        btnMajor.setBackground(new java.awt.Color(15, 23, 42));
        btnMajor.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnMajor.setForeground(new java.awt.Color(255, 255, 255));
        btnMajor.setText("- Major");
        btnMajor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMajor.addActionListener(this::btnMajorActionPerformed);

        btnDashboard.setBackground(new java.awt.Color(15, 23, 42));
        btnDashboard.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnDashboard.setForeground(new java.awt.Color(255, 255, 255));
        btnDashboard.setText("- Home");
        btnDashboard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDashboard.addActionListener(this::btnDashboardActionPerformed);

        jButton2.setBackground(new java.awt.Color(15, 23, 42));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("- Enrollment");
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jButton1.setBackground(new java.awt.Color(15, 23, 42));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("- Subject");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(this::jButton1ActionPerformed);

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(RightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(RightLayout.createSequentialGroup()
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnReports, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(btnStudents, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDashboard, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnMajor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDashboard)
                .addGap(18, 18, 18)
                .addComponent(btnStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMajor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(btnReports)
                .addContainerGap(407, Short.MAX_VALUE))
        );

        jPanel1.add(Right);
        Right.setBounds(0, 0, 150, 720);

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        jPanel1.add(Left);
        Left.setBounds(150, 0, 990, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1139, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentsActionPerformed
        // TODO add your handling code here:
        new StudentForm().setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btnStudentsActionPerformed

    private void btnReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReportsActionPerformed

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed

        // TODO add your handling code here:
        new DashboardForm().setVisible(true);
    this.dispose();
        
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void btnMajorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMajorActionPerformed
        // TODO add your handling code here:
        new MajorForm().setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btnMajorActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new SubjectForm().setVisible(true);
    this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new DashboardForm().setVisible(true));
    }

    // Variables declaration - do not modify
private javax.swing.JLabel jLabelWelcome;  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Right;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnMajor;
    private javax.swing.JButton btnReports;
    private javax.swing.JButton btnStudents;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private studentoovp.controller.StudentController studentController1;
    // End of variables declaration//GEN-END:variables
}
