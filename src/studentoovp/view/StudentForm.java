package studentoovp.view;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author ain saipi
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import studentoovp.controller.StudentController;
import studentoovp.model.Student;
import javax.swing.table.DefaultTableModel;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JPanel;

  

    public class StudentForm extends javax.swing.JFrame {

        private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(StudentForm.class.getName());

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnDashboard = new javax.swing.JButton();
        btnStudents = new javax.swing.JButton();
        btnMajor = new javax.swing.JButton();
        btnReports = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        BtnEnrollment = new javax.swing.JButton();
        BtnSubject = new javax.swing.JButton();
        Left = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtStudentId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtGPA = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cmbMajor = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        BtnDelete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        cmbFilterMajor = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        tblStudents = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(900, 400));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 900));
        jPanel1.setLayout(null);

        Right.setBackground(new java.awt.Color(15, 23, 42));
        Right.setMinimumSize(new java.awt.Dimension(150, 800));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("COMPUTER SCIENCE");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("President University");

        btnDashboard.setBackground(new java.awt.Color(15, 23, 42));
        btnDashboard.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnDashboard.setForeground(new java.awt.Color(255, 255, 255));
        btnDashboard.setText("- Home");
        btnDashboard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDashboard.addActionListener(this::btnDashboardActionPerformed);

        btnStudents.setBackground(new java.awt.Color(15, 23, 42));
        btnStudents.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnStudents.setForeground(new java.awt.Color(255, 255, 255));
        btnStudents.setText("- Students");
        btnStudents.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        btnMajor.setBackground(new java.awt.Color(15, 23, 42));
        btnMajor.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnMajor.setForeground(new java.awt.Color(255, 255, 255));
        btnMajor.setText("- Major");
        btnMajor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMajor.addActionListener(this::btnMajorActionPerformed);

        btnReports.setBackground(new java.awt.Color(15, 23, 42));
        btnReports.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnReports.setForeground(new java.awt.Color(255, 255, 255));
        btnReports.setText("- Reports");
        btnReports.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnReports.addActionListener(this::btnReportsActionPerformed);

        BtnEnrollment.setBackground(new java.awt.Color(15, 23, 42));
        BtnEnrollment.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        BtnEnrollment.setForeground(new java.awt.Color(255, 255, 255));
        BtnEnrollment.setText("- Enrollment");
        BtnEnrollment.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnEnrollment.addActionListener(this::BtnEnrollmentActionPerformed);

        BtnSubject.setBackground(new java.awt.Color(15, 23, 42));
        BtnSubject.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        BtnSubject.setForeground(new java.awt.Color(255, 255, 255));
        BtnSubject.setText("- Subjects");
        BtnSubject.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnSubject.addActionListener(this::BtnSubjectActionPerformed);

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(20, Short.MAX_VALUE))
            .addComponent(btnDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnStudents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMajor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnReports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(BtnEnrollment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(BtnSubject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnStudents)
                .addGap(18, 18, 18)
                .addComponent(btnMajor)
                .addGap(18, 18, 18)
                .addComponent(BtnSubject)
                .addGap(18, 18, 18)
                .addComponent(BtnEnrollment)
                .addGap(18, 18, 18)
                .addComponent(btnReports)
                .addGap(590, 590, 590))
        );

        jPanel1.add(Right);
        Right.setBounds(0, 0, 150, 900);

        Left.setPreferredSize(new java.awt.Dimension(583, 1100));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(30, 41, 59));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("INPUT STUDENT");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("STUDENT ID");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("GPA");

        txtGPA.addActionListener(this::txtGPAActionPerformed);

        txtEmail.addActionListener(this::txtEmailActionPerformed);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("FULL NAME");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("EMAIL");

        cmbMajor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Information Systems", "Information Technology" }));
        cmbMajor.addActionListener(this::cmbMajorActionPerformed);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("MAJOR");

        txtDate.addActionListener(this::txtDateActionPerformed);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("ENROLLMENT DATE");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setText("PHONE");

        btnSave.setBackground(new java.awt.Color(30, 41, 59));
        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("SUBMIT");
        btnSave.addActionListener(this::btnSaveActionPerformed);

        btnClear.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnClear.setText("CLEAR");
        btnClear.addActionListener(this::btnClearActionPerformed);

        BtnDelete.setBackground(new java.awt.Color(153, 0, 0));
        BtnDelete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtnDelete.setForeground(new java.awt.Color(255, 255, 255));
        BtnDelete.setText("DELETE");
        BtnDelete.addActionListener(this::BtnDeleteActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnClear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnDelete)
                .addGap(18, 18, 18))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addComponent(txtStudentId, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                    .addComponent(txtPhone))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(0, 199, Short.MAX_VALUE))
                                    .addComponent(txtEmail)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 250, Short.MAX_VALUE)
                                .addComponent(jLabel11)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel10)
                                .addComponent(cmbMajor, 0, 211, Short.MAX_VALUE)
                                .addComponent(txtGPA)))
                        .addGap(18, 18, 18))))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStudentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbMajor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnClear)
                    .addComponent(BtnDelete))
                .addGap(0, 51, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Student Management");

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("You can Add, Search, and Delate ");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(15, 23, 42));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("FIND A STUDENT");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(588, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtSearch.setForeground(new java.awt.Color(153, 153, 153));
        txtSearch.setText("Search by Name or ID...");
        txtSearch.setToolTipText("");

        cmbFilterMajor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Information Systems  Information Technology" }));
        cmbFilterMajor.addActionListener(this::cmbFilterMajorActionPerformed);

        btnSearch.setBackground(new java.awt.Color(30, 41, 59));
        btnSearch.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(this::btnSearchActionPerformed);

        btnReset.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnReset.setText("RESET");
        btnReset.addActionListener(this::btnResetActionPerformed);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Major", "GPA", "Enrolled", "Email", "Phone", "Action"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setShowHorizontalLines(true);
        tblStudents.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSearch)
                    .addComponent(cmbFilterMajor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnSearch)
                        .addGap(18, 18, 18)
                        .addComponent(btnReset)
                        .addGap(0, 512, Short.MAX_VALUE))
                    .addComponent(tblStudents))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbFilterMajor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(btnReset))
                .addGap(18, 18, 18)
                .addComponent(tblStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LeftLayout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(LeftLayout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(302, Short.MAX_VALUE))
        );

        jPanel1.add(Left);
        Left.setBounds(150, 0, 740, 1100);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // ── Tambahkan variable di atas constructor ──
    private StudentController controller = new StudentController();
    private boolean isEditMode = false;
    private String editingId = "";

public StudentForm() {
    initComponents();
    
    txtDate.setVisible(false);
    jLabel11.setVisible(false);

    setupTableActionColumn();  
    setupComboBox();
    txtStudentId.setText(controller.generateId());
    txtStudentId.setEditable(false);
    refreshTable();   
    
    makeScrollable();

     // untuk radius setiap panel  
        makeRounded(jPanel2, 30);
        makeRounded(jPanel5, 30);
        makeRounded(jPanel3, 30);
        
        // Batasi input GPA saat mengetik
txtGPA.addKeyListener(new java.awt.event.KeyAdapter() {
    @Override
    public void keyTyped(java.awt.event.KeyEvent e) {
        char c = e.getKeyChar();
        String current = txtGPA.getText();

        // Hanya izinkan angka dan titik
        if (!Character.isDigit(c) && c != '.') {
            e.consume();
            return;
        }
        // Titik hanya boleh satu kali
        if (c == '.' && current.contains(".")) {
            e.consume();
            return;
        }
        // Max 4 karakter: X.XX
        if (current.length() >= 4) {
            e.consume();
            return;
        }
    }
});
        
}
  // proses untuk radius  
  private void makeRounded(JPanel panel, int radius) {
        panel.setOpaque(false);

        panel.setUI(new javax.swing.plaf.PanelUI() {
            @Override
            public void update(Graphics g, JComponent c) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                                    RenderingHints.VALUE_ANTIALIAS_ON);

                g2.setColor(panel.getBackground());
                g2.fillRoundRect(0, 0, panel.getWidth(), panel.getHeight(), radius, radius);
            }
        });
  }
  

private void makeScrollable() {
    // Hapus Left dari jPanel1
    jPanel1.remove(Left);
    
    // Bungkus Left dalam ScrollPane
    javax.swing.JScrollPane scrollPane = new javax.swing.JScrollPane(Left);
    scrollPane.setVerticalScrollBarPolicy(
        javax.swing.JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
    scrollPane.setHorizontalScrollBarPolicy(
        javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    scrollPane.getVerticalScrollBar().setUnitIncrement(16);
    scrollPane.setBorder(null);
    
    // Tambah scrollPane ke jPanel1
    jPanel1.add(scrollPane);
    
    // Set ukuran window dulu
    setSize(950, 650);
    setLocationRelativeTo(null); // tengah layar
    
    // Hitung ukuran setelah window siap
    javax.swing.SwingUtilities.invokeLater(() -> {
        int w = getContentPane().getWidth();
        int h = getContentPane().getHeight();
        int sidebar = 150;
        
        Right.setBounds(0, 0, sidebar, h);
        scrollPane.setBounds(sidebar, 0, w - sidebar, h);
        
        // Left panel lebarnya mengikuti scrollPane
        Left.setPreferredSize(
            new java.awt.Dimension(w - sidebar - 20, 1100));
        
        jPanel1.setPreferredSize(
            new java.awt.Dimension(w, 1100));
        
        jPanel1.revalidate();
        jPanel1.repaint();
    });
    
    // Update saat window diubah ukurannya
    addComponentListener(new java.awt.event.ComponentAdapter() {
        @Override
        public void componentResized(java.awt.event.ComponentEvent e) {
            int w = getContentPane().getWidth();
            int h = getContentPane().getHeight();
            int sidebar = 150;
            
            Right.setBounds(0, 0, sidebar, h);
            scrollPane.setBounds(sidebar, 0, w - sidebar, h);
            Left.setPreferredSize(
                new java.awt.Dimension(w - sidebar - 20, 1100));
            jPanel1.setPreferredSize(
                new java.awt.Dimension(w, 1100));
            
            jPanel1.revalidate();
            jPanel1.repaint();
        }
    });
}


// ─untuk mengatur kolom Action (index 5) menjadi tombol crud
private void setupTableActionColumn() {
    jTable1.setRowHeight(38);
    
    // Mmebuat kolom Email dan Phone tidak terlihat di tabel
    jTable1.getColumnModel().getColumn(5).setMinWidth(0);
    jTable1.getColumnModel().getColumn(5).setMaxWidth(0);
    jTable1.getColumnModel().getColumn(5).setWidth(0);
    
    jTable1.getColumnModel().getColumn(6).setMinWidth(0);
    jTable1.getColumnModel().getColumn(6).setMaxWidth(0);
    jTable1.getColumnModel().getColumn(6).setWidth(0);
    
    // Kolom Action sekarang di index 7
    jTable1.getColumnModel().getColumn(7).setCellRenderer(new ButtonRenderer());
    jTable1.getColumnModel().getColumn(7).setCellEditor(new ButtonEditor(new JCheckBox()));
    
    // Event klik baris: klik di sel selain kolom Action (index 7)
    jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent e) {
            int row = jTable1.rowAtPoint(e.getPoint());
            int col = jTable1.columnAtPoint(e.getPoint());
            if (row >= 0 && col != 7) {
                editStudentFromTable(row);
            }
        }
    });
}
private void refreshTable() {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);
    // pakai method loadToTable yang sudah ada di controller
    controller.loadToTable(model);
}
// SEARCH student
private void searchToTable(String keyword, String majorId) {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);
    controller.searchToTable(model, keyword, majorId);
}

// ── EDIT DATA dari baris yang dipilih (isi form) ──
private void editStudentFromTable(int row) {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    isEditMode = true;
    editingId = model.getValueAt(row, 0).toString();

    txtStudentId.setText(editingId);
    txtName.setText(model.getValueAt(row, 1).toString());

    // Perbaikan: mapping code ke index combobox
    String majorCode = model.getValueAt(row, 2).toString(); // "IS" atau "IT"
    if (majorCode.equals("IS")) {
        cmbMajor.setSelectedIndex(0); // "Information Systems (IS)"
    } else {
        cmbMajor.setSelectedIndex(1); // "Information Technology (IT)"
    }

    double gpaVal = Double.parseDouble(model.getValueAt(row, 3).toString());
    txtGPA.setText(String.format("%.2f", gpaVal));

    txtDate.setText(model.getValueAt(row, 4).toString());
    txtEmail.setText(model.getValueAt(row, 5).toString());
    txtPhone.setText(model.getValueAt(row, 6).toString());

    btnSave.setText("UPDATE");
}

// ── DELETE DATA ──
private void deleteStudent(String studentId) {
      int confirm = javax.swing.JOptionPane.showConfirmDialog(
        this,
        "Yakin ingin menghapus student ID: " + studentId + "?\nData yang dihapus tidak bisa dikembalikan.",
        "Konfirmasi Hapus",
        javax.swing.JOptionPane.YES_NO_OPTION,
        javax.swing.JOptionPane.WARNING_MESSAGE
    );
    if (confirm == javax.swing.JOptionPane.YES_OPTION) {
        if (controller.deleteStudent(studentId)) {
            javax.swing.JOptionPane.showMessageDialog(
                this, "Student " + studentId + " Successfully deleted!");
            refreshTable();
            clearForm();
        } else {
            javax.swing.JOptionPane.showMessageDialog(
                this, "Failed to delete data! Please check the database connection.");
        }
    }
}



// ── Setup ComboBox major ──
    private void setupComboBox() {
        cmbMajor.removeAllItems();
        cmbMajor.addItem("Information Systems (IS)");
        cmbMajor.addItem("Information Technology (IT)");

        cmbFilterMajor.removeAllItems();
        cmbFilterMajor.addItem("All Major");
        cmbFilterMajor.addItem("Information Systems (IS)");
        cmbFilterMajor.addItem("Information Technology (IT)");
    }

// ── Clear semua field ──
    private void clearForm() {
        isEditMode = false;
        editingId = "";
        txtStudentId.setText(controller.generateId());
        txtName.setText("");
        txtGPA.setText("");
        txtDate.setText("");
        txtEmail.setText("");
        txtPhone.setText("");
        cmbMajor.setSelectedIndex(0);
        btnSave.setText("SUBMIT");
    }


    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void cmbMajorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMajorActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_cmbMajorActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void txtGPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGPAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGPAActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:

    String name = txtName.getText().trim();
    String gpaStr = txtGPA.getText().trim();
    String email = txtEmail.getText().trim();
    String phone = txtPhone.getText().trim();
    String majorId = controller.getMajorIdByIndex(cmbMajor.getSelectedIndex());

    // Validasi wajib isi
    if (name.isEmpty() || gpaStr.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this,
            "Name and GPA are required!",
            "Empty Input", javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Validasi format GPA: harus X.XX, tidak boleh melebihi 4.00
    double gpa;
    try {
        gpa = Double.parseDouble(gpaStr);

        if (!gpaStr.matches("^[0-3]\\.[0-9]{2}$|^4\\.00$")) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Please enter the GPA in the correct format:\nValid examples:3.00 / 3.45 / 4.00\nThe GPA must contain two digits after the decimal point and be between 0.00 and 4.00.",
                "Invalid GPA Format", javax.swing.JOptionPane.WARNING_MESSAGE);
            txtGPA.requestFocus();
            return;
        }

        if (gpa < 0.00 || gpa > 4.00) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "The GPA must be between 0.00 and 4.00",
                "Invalid GPA Value", javax.swing.JOptionPane.WARNING_MESSAGE);
            txtGPA.requestFocus();
            return;
        }

    } catch (NumberFormatException e) {
        javax.swing.JOptionPane.showMessageDialog(this,
            "The GPA must be a numeric value!\nExample: 3.00 / 3.45 / 4.00",
            "Input Tidak Valid", javax.swing.JOptionPane.WARNING_MESSAGE);
        txtGPA.requestFocus();
        return;
    }
    
    // Validasi format Email
if (!email.isEmpty()) {
    String emailRegex = "^[a-zA-Z0-9._%+\\-]+@[a-zA-Z0-9.\\-]+\\.[a-zA-Z]{2,}$";
    if (!email.matches(emailRegex)) {
        javax.swing.JOptionPane.showMessageDialog(this,
            "Invalid email format!\nValid examples:\n  student@example.com\n  john.doe@president.ac.id",
            "Invalid Email", javax.swing.JOptionPane.WARNING_MESSAGE);
        txtEmail.requestFocus();
        return;
    }
}

// Validasi format Nomor Telepon
if (!phone.isEmpty()) {
    // Hapus spasi/strip untuk pengecekan panjang
    String cleanPhone = phone.replaceAll("[\\s\\-]", "");
    // Format yang diterima: 08xxxxxxxxx atau +62xxxxxxxxx (10–13 digit)
    String phoneRegex = "^(\\+62|08)[0-9]{8,11}$";
    if (!cleanPhone.matches(phoneRegex)) {
        javax.swing.JOptionPane.showMessageDialog(this,
            "Invalid phone number format!\nValid examples:\n  08123456789\n  +6281234567890\nPhone must start with 08 or +62 and contain 10–13 digits.",
            "Invalid Phone Number", javax.swing.JOptionPane.WARNING_MESSAGE);
        txtPhone.requestFocus();
        return;
    }
}
    
    // Validasi duplikasi nama
String excludeId = isEditMode ? editingId : "";
if (controller.isNameDuplicate(name, excludeId)) {
    javax.swing.JOptionPane.showMessageDialog(this,
        "A student with this name : \"" + name + "\" already exists\n" +
        "Please use a different name.",
        "Duplicate Student Name", javax.swing.JOptionPane.WARNING_MESSAGE);
    txtName.requestFocus();
    return;
}

    // Mode TAMBAH BARU
    if (!isEditMode) {
        String date = new java.text.SimpleDateFormat("yyyy-MM-dd")
                          .format(new java.util.Date());
        Student s = new Student(txtStudentId.getText(), name, gpa,
                                date, majorId, email, phone);
        if (controller.addStudent(s)) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Student Added Successfully!");
            clearForm();
            refreshTable();
        } else {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Failed to add data!");
        }

    // Mode UPDATE
    } else {
        String existingDate = txtDate.getText().trim();
        if (existingDate.isEmpty()) {
            existingDate = new java.text.SimpleDateFormat("yyyy-MM-dd")
                               .format(new java.util.Date());
        }
        Student s = new Student(editingId, name, gpa,
                                existingDate, majorId, email, phone);
        if (controller.updateStudent(s)) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Data updated successfully!");
            clearForm();
            refreshTable();
        } else {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Failed to update data!");
        }
    }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed

        // ── tombol clear
    clearForm();

    }//GEN-LAST:event_btnClearActionPerformed

    private void cmbFilterMajorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFilterMajorActionPerformed
        // TODO add your handling code here:
    String keyword = txtSearch.getText().trim();
    
    // Jangan filter jika text masih placeholder
    if (keyword.equals("Search by Name or ID...")) {
        keyword = "";
    }

    int filterIdx = cmbFilterMajor.getSelectedIndex();
    String majorId = "ALL";
    if (filterIdx == 1) majorId = "MAJ-001"; // Information Systems (IS)
    if (filterIdx == 2) majorId = "MAJ-002"; // Information Technology (IT)

    searchToTable(keyword, majorId);
    }//GEN-LAST:event_cmbFilterMajorActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
       String keyword = txtSearch.getText().trim();
    int filterIdx = cmbFilterMajor.getSelectedIndex();
    String majorId = "ALL";
    if (filterIdx == 1) majorId = "MAJ-001";
    if (filterIdx == 2) majorId = "MAJ-002";
    if (keyword.equals("Search by Name or ID...")) keyword = "";

    
    searchToTable(keyword, majorId);
    
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
    txtSearch.setText("");
    cmbFilterMajor.setSelectedIndex(0);
    refreshTable();

    }//GEN-LAST:event_btnResetActionPerformed

    private void btnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDashboardActionPerformed
        // TODO add your handling code here:
        new DashboardForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDashboardActionPerformed

    private void BtnEnrollmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEnrollmentActionPerformed
        // TODO add your handling code here:
        new EnrollmentFrom().setVisible(true);
        this.dispose();
  
    }//GEN-LAST:event_BtnEnrollmentActionPerformed

    private void BtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteActionPerformed
        // TODO add your handling code here:
        
         if (!isEditMode) {
        javax.swing.JOptionPane.showMessageDialog(this, 
            "Please select a student first (click Edit in the table)!");
        return;
    }

    // pakai ID yang sedang diedit
    deleteStudent(editingId);
    }//GEN-LAST:event_BtnDeleteActionPerformed

    private void btnMajorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMajorActionPerformed
        // TODO add your handling code here:
        new MajorForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMajorActionPerformed

    private void BtnSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSubjectActionPerformed
        // TODO add your handling code here:
        new SubjectForm().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_BtnSubjectActionPerformed

    private void btnReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportsActionPerformed
        // TODO add your handling code here:
          new ReportsForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReportsActionPerformed

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
     
        
        
        java.awt.EventQueue.invokeLater(() -> new StudentForm().setVisible(true));
    }
    // ── INNER CLASS untuk tombol di tabel ──
class ButtonRenderer extends javax.swing.JPanel implements javax.swing.table.TableCellRenderer {
    private javax.swing.JButton btnEdit, btnDelete;
    public ButtonRenderer() {
        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 5));
        btnEdit = new javax.swing.JButton("Edit");
        btnDelete = new javax.swing.JButton("Hapus");
        btnEdit.setBackground(new java.awt.Color(30, 41, 59));
        btnEdit.setForeground(java.awt.Color.WHITE);
        btnDelete.setBackground(new java.awt.Color(153, 0, 0));
        btnDelete.setForeground(java.awt.Color.WHITE);
        add(btnEdit);
        add(btnDelete);
    }
    public java.awt.Component getTableCellRendererComponent(javax.swing.JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
        if (isSelected) {
            setBackground(table.getSelectionBackground());
        } else {
            setBackground(table.getBackground());
        }
        return this;
    }
}
class ButtonEditor extends javax.swing.DefaultCellEditor {
    private javax.swing.JPanel panel;
    private javax.swing.JButton btnEdit, btnDelete;
    private int currentRow;
    public ButtonEditor(javax.swing.JCheckBox checkBox) {
        super(checkBox);
        panel = new javax.swing.JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 5));
        btnEdit = new javax.swing.JButton("Edit");
        btnDelete = new javax.swing.JButton("Hapus");
        btnEdit.setBackground(new java.awt.Color(30, 41, 59));
        btnEdit.setForeground(java.awt.Color.WHITE);
        btnDelete.setBackground(new java.awt.Color(153, 0, 0));
        btnDelete.setForeground(java.awt.Color.WHITE);
        panel.add(btnEdit);
        panel.add(btnDelete);
        
        btnEdit.addActionListener(e -> {
            fireEditingStopped();
            String id = ((DefaultTableModel) jTable1.getModel()).getValueAt(currentRow, 0).toString();
            editStudentById(id);
        });
        btnDelete.addActionListener(e -> {
            fireEditingStopped();
            String id = ((DefaultTableModel) jTable1.getModel()).getValueAt(currentRow, 0).toString();
            deleteStudent(id);
        });
    }
    public java.awt.Component getTableCellEditorComponent(javax.swing.JTable table, Object value,
            boolean isSelected, int row, int column) {
        currentRow = row;
        return panel;
    }
    public Object getCellEditorValue() {
        return "Action";
    }
}

private void editStudentById(String id) {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    for (int i = 0; i < model.getRowCount(); i++) {
        if (model.getValueAt(i, 0).toString().equals(id)) {
            editStudentFromTable(i);
            break;
        }
    }
}


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton BtnEnrollment;
    private javax.swing.JButton BtnSubject;
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Right;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDashboard;
    private javax.swing.JButton btnMajor;
    private javax.swing.JButton btnReports;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnStudents;
    private javax.swing.JComboBox<String> cmbFilterMajor;
    private javax.swing.JComboBox<String> cmbMajor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JScrollPane tblStudents;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGPA;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtStudentId;
    // End of variables declaration//GEN-END:variables
}
