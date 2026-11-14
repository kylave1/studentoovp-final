/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package studentoovp.view;

import studentoovp.controller.SubjectController;
import studentoovp.model.Subject;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JComponent;
import javax.swing.JPanel;

/**
 *
 * @author ain saipi
 */
public class SubjectForm extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(SubjectForm.class.getName());

    private SubjectController controller = new SubjectController();
    private String currentMajorFilter = "IS"; // default filter
   
    private String selectedSubjectId   = "";
    private String selectedSubjectName = "";
    private boolean isEditMode         = false;
    
    
    public SubjectForm() {
        initComponents();
        
            makeRounded(jPanel2, 30);
            makeRounded(jPanel3, 30);
            makeRounded(jPanel5, 30);
            makeRounded(jPanel6, 30);
            makeRounded(jPanel7, 30);
            makeRounded(jPanel8, 30);
            makeRounded(jPanel9, 30);
            makeRounded(jPanel11, 30);
            
            setupComboBox();
            autoGenerateId();
            loadSubjectList(currentMajorFilter);
            

            setLocationRelativeTo(null);
            makeScrollable();
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
    setSize(950, 600);
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

private void setupComboBox() {
    CBMajor.setModel(new DefaultComboBoxModel<>(new String[]{"IS", "IT"}));
    CBClass.setModel(new DefaultComboBoxModel<>(new String[]{"1", "2", "3"}));
    CBMajor.addActionListener(e -> autoGenerateId());
}

// generate Subject ID
private void autoGenerateId() {
    String major = (String) CBMajor.getSelectedItem();
    String newId = controller.generateSubjectId(major);
    FieldSubjctID.setText(newId);
}




    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        BtnDashboard = new javax.swing.JButton();
        BtnStudent = new javax.swing.JButton();
        BtnMajor = new javax.swing.JButton();
        BtnSubjcts = new javax.swing.JButton();
        BtnEnrollment = new javax.swing.JButton();
        BtnReport = new javax.swing.JButton();
        Left = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        FieldSubjctID = new javax.swing.JTextField();
        BtnSaveSubject = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CBMajor = new javax.swing.JComboBox<>();
        CBClass = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        BtnClearSubject = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        BtnIT = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        BtnIS = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        Class1 = new javax.swing.JLabel();
        BtnEdit1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        Class2 = new javax.swing.JLabel();
        BtnEdit2 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jProgressBar3 = new javax.swing.JProgressBar();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        Class3 = new javax.swing.JLabel();
        Btnedit3 = new javax.swing.JButton();
        BtnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 300));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(null);

        Right.setBackground(new java.awt.Color(15, 23, 42));
        Right.setPreferredSize(new java.awt.Dimension(150, 100));

        jLabel1.setText("jLabel1");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("President University");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("COMPUTER SCIENCE");

        BtnDashboard.setBackground(new java.awt.Color(15, 23, 42));
        BtnDashboard.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        BtnDashboard.setForeground(new java.awt.Color(255, 255, 255));
        BtnDashboard.setText("- Home");
        BtnDashboard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnDashboard.addActionListener(this::BtnDashboardActionPerformed);

        BtnStudent.setBackground(new java.awt.Color(15, 23, 42));
        BtnStudent.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        BtnStudent.setForeground(new java.awt.Color(255, 255, 255));
        BtnStudent.setText("- Student");
        BtnStudent.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnStudent.addActionListener(this::BtnStudentActionPerformed);

        BtnMajor.setBackground(new java.awt.Color(15, 23, 42));
        BtnMajor.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        BtnMajor.setForeground(new java.awt.Color(255, 255, 255));
        BtnMajor.setText("- Major");
        BtnMajor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnMajor.addActionListener(this::BtnMajorActionPerformed);

        BtnSubjcts.setBackground(new java.awt.Color(15, 23, 42));
        BtnSubjcts.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        BtnSubjcts.setForeground(new java.awt.Color(255, 255, 255));
        BtnSubjcts.setText("- Subjects");
        BtnSubjcts.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnSubjcts.addActionListener(this::BtnSubjctsActionPerformed);

        BtnEnrollment.setBackground(new java.awt.Color(15, 23, 42));
        BtnEnrollment.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        BtnEnrollment.setForeground(new java.awt.Color(255, 255, 255));
        BtnEnrollment.setText("- Enrollment");
        BtnEnrollment.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnEnrollment.addActionListener(this::BtnEnrollmentActionPerformed);

        BtnReport.setBackground(new java.awt.Color(15, 23, 42));
        BtnReport.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        BtnReport.setForeground(new java.awt.Color(255, 255, 255));
        BtnReport.setText("- Report");
        BtnReport.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnReport.addActionListener(this::BtnReportActionPerformed);

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RightLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightLayout.createSequentialGroup()
                        .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnStudent, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BtnDashboard, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1))
                        .addGap(43, 43, 43))
                    .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(BtnSubjcts, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnMajor, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnEnrollment, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BtnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addGap(5, 5, 5)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnDashboard)
                .addGap(18, 18, 18)
                .addComponent(BtnStudent)
                .addGap(18, 18, 18)
                .addComponent(BtnMajor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnSubjcts)
                .addGap(18, 18, 18)
                .addComponent(BtnEnrollment)
                .addGap(18, 18, 18)
                .addComponent(BtnReport)
                .addContainerGap(382, Short.MAX_VALUE))
        );

        jPanel1.add(Right);
        Right.setBounds(0, 0, 150, 680);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Subject Management Of Computer Science");

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(712, 800));

        jPanel3.setBackground(new java.awt.Color(30, 41, 59));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("SUBJECT MANAGEMENT");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Subject ID");

        FieldSubjctID.addActionListener(this::FieldSubjctIDActionPerformed);

        BtnSaveSubject.setBackground(new java.awt.Color(30, 41, 59));
        BtnSaveSubject.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BtnSaveSubject.setForeground(new java.awt.Color(255, 255, 255));
        BtnSaveSubject.setText("SAVE");
        BtnSaveSubject.setToolTipText("");
        BtnSaveSubject.setPreferredSize(new java.awt.Dimension(72, 24));
        BtnSaveSubject.addActionListener(this::BtnSaveSubjectActionPerformed);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Subject Name");

        jTextField2.addActionListener(this::jTextField2ActionPerformed);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Major");

        CBMajor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        CBClass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Class");

        BtnClearSubject.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtnClearSubject.setText("CLEAR");
        BtnClearSubject.setPreferredSize(new java.awt.Dimension(72, 24));
        BtnClearSubject.addActionListener(this::BtnClearSubjectActionPerformed);

        jPanel4.setBackground(new java.awt.Color(30, 41, 59));

        BtnIT.setBackground(new java.awt.Color(30, 41, 59));
        BtnIT.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtnIT.setForeground(new java.awt.Color(255, 255, 255));
        BtnIT.setText("IT");
        BtnIT.addActionListener(this::BtnITActionPerformed);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("SUBJECT LIST BY THE CLASS");

        BtnIS.setBackground(new java.awt.Color(30, 41, 59));
        BtnIS.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtnIS.setForeground(new java.awt.Color(255, 255, 255));
        BtnIS.setText("IS");
        BtnIS.addActionListener(this::BtnISActionPerformed);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 391, Short.MAX_VALUE)
                .addComponent(BtnIT, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnIS, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnIT)
                    .addComponent(jLabel14)
                    .addComponent(BtnIS))
                .addContainerGap())
        );

        jPanel5.setPreferredSize(new java.awt.Dimension(150, 234));

        jPanel8.setBackground(new java.awt.Color(204, 255, 204));
        jPanel8.setForeground(new java.awt.Color(51, 51, 0));
        jPanel8.setPreferredSize(new java.awt.Dimension(60, 22));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel9.setText("Class 1");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel10.setText("jLabel10");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        Class1.setText("jLabel15");

        BtnEdit1.setBackground(new java.awt.Color(30, 41, 59));
        BtnEdit1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtnEdit1.setForeground(new java.awt.Color(255, 255, 255));
        BtnEdit1.setText("EDIT");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Class1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnEdit1)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Class1, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnEdit1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setPreferredSize(new java.awt.Dimension(150, 230));

        jPanel9.setBackground(new java.awt.Color(255, 204, 204));
        jPanel9.setForeground(new java.awt.Color(51, 0, 0));
        jPanel9.setPreferredSize(new java.awt.Dimension(60, 22));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel18.setText("Class 2");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        jLabel11.setText("jLabel11");

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        Class2.setText("jLabel16");

        BtnEdit2.setBackground(new java.awt.Color(30, 41, 59));
        BtnEdit2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtnEdit2.setForeground(new java.awt.Color(255, 255, 255));
        BtnEdit2.setText("EDIT");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jProgressBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Class2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnEdit2)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Class2))
                .addGap(18, 18, 18)
                .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnEdit2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setPreferredSize(new java.awt.Dimension(150, 230));

        jPanel11.setBackground(new java.awt.Color(204, 204, 255));
        jPanel11.setForeground(new java.awt.Color(51, 0, 51));
        jPanel11.setPreferredSize(new java.awt.Dimension(60, 22));

        jLabel19.setBackground(new java.awt.Color(255, 204, 153));
        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel19.setText("Class 3");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        jLabel12.setText("jLabel12");

        jList3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList3);

        Class3.setText("jLabel17");

        Btnedit3.setBackground(new java.awt.Color(30, 41, 59));
        Btnedit3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Btnedit3.setForeground(new java.awt.Color(255, 255, 255));
        Btnedit3.setText("EDIT");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jProgressBar3, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Class3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Btnedit3)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Class3))
                .addGap(18, 18, 18)
                .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btnedit3)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        BtnDelete.setBackground(new java.awt.Color(153, 0, 0));
        BtnDelete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        BtnDelete.setForeground(new java.awt.Color(255, 255, 255));
        BtnDelete.setText("DELETE");
        BtnDelete.setPreferredSize(new java.awt.Dimension(84, 24));
        BtnDelete.addActionListener(this::BtnDeleteActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(FieldSubjctID, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                        .addComponent(jTextField2))
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BtnSaveSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnClearSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7)
                    .addComponent(CBMajor, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CBClass, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(BtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBClass)
                    .addComponent(FieldSubjctID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBMajor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSaveSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnClearSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(Left);
        Left.setBounds(150, 0, 810, 680);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 983, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnStudentActionPerformed
        // TODO add your handling code here:
        new StudentForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnStudentActionPerformed

    private void BtnMajorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMajorActionPerformed
        // TODO add your handling code here:
        new MajorForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnMajorActionPerformed

    private void BtnSubjctsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSubjctsActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_BtnSubjctsActionPerformed

    private void BtnEnrollmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEnrollmentActionPerformed
        // TODO add your handling code here:
        new EnrollmentFrom().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnEnrollmentActionPerformed

    private void BtnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReportActionPerformed
        // TODO add your handling code here:
         new ReportsForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnReportActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void FieldSubjctIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldSubjctIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldSubjctIDActionPerformed

    private void BtnSaveSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSaveSubjectActionPerformed
        // TODO add your handling code here:
     String id    = FieldSubjctID.getText().trim();
    String name  = jTextField2.getText().trim();
    String major = (String) CBMajor.getSelectedItem();
    int level    = Integer.parseInt((String) CBClass.getSelectedItem());

    if (name.isEmpty()) {
        JOptionPane.showMessageDialog(this,
            "Subject Name cannot be empty!");
        return;
    }

    if (isEditMode) {
        // ── MODE UPDATE ──
        Subject updated = new Subject(selectedSubjectId, name, major, level);
        boolean success = controller.updateSubject(updated);
        if (success) {
            JOptionPane.showMessageDialog(this,
                "Subject updated successfully!");
            clearForm();
            loadSubjectList(currentMajorFilter);
        } else {
            JOptionPane.showMessageDialog(this,
                "Failed to update subject!",
                "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        // ── MODE ADD ──
        Subject subject = new Subject(id, name, major, level);
        boolean success = controller.saveSubject(subject);
        if (success) {
            JOptionPane.showMessageDialog(this,
                "Subject saved successfully!");
            clearForm();
            loadSubjectList(currentMajorFilter);
        } else {
            JOptionPane.showMessageDialog(this,
                "Failed! Class " + level + " For " + major +
                " is already full (maximum 4 subjects).",
                "Class Capacity Full", JOptionPane.WARNING_MESSAGE);
        }
    }
    }//GEN-LAST:event_BtnSaveSubjectActionPerformed

    private void BtnClearSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnClearSubjectActionPerformed
        // TODO add your handling code here:
        jTextField2.setText("");
    CBMajor.setSelectedIndex(0);
    CBClass.setSelectedIndex(0);
    autoGenerateId();

    // Reset state edit/delete
    selectedSubjectId   = "";
    selectedSubjectName = "";
    isEditMode          = false;

    // Kembalikan tombol ke state awal
    BtnSaveSubject.setText("SAVE");
    BtnDelete.setEnabled(false);
    BtnDelete.setBackground(new java.awt.Color(200, 200, 200));

    // Clear selection di semua list
    jList1.clearSelection();
    jList2.clearSelection();
    jList3.clearSelection();
    }//GEN-LAST:event_BtnClearSubjectActionPerformed

    private void BtnITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnITActionPerformed
        // TODO add your handling code here:
        loadSubjectList("IT");
    }//GEN-LAST:event_BtnITActionPerformed

    private void BtnISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnISActionPerformed
        // TODO add your handling code here:
        loadSubjectList("IS");
    }//GEN-LAST:event_BtnISActionPerformed

    private void BtnDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDashboardActionPerformed
        // TODO add your handling code here:
        new DashboardForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnDashboardActionPerformed

    private void BtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteActionPerformed

        // TODO add your handling code here:
           if (selectedSubjectId.isEmpty()) {
        JOptionPane.showMessageDialog(this,
            "Please click EDIT on the subject you want to delete first!",
            "Warning", JOptionPane.WARNING_MESSAGE);
        return;
    }

    int confirm = JOptionPane.showConfirmDialog(this,
        "Are you sure you want to delete this subject?:\n\"" +
        jTextField2.getText() + "\" (" + selectedSubjectId + ")?",
        "Delete Confirmation",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.WARNING_MESSAGE);

    if (confirm == JOptionPane.YES_OPTION) {
        boolean success = controller.deleteSubject(selectedSubjectId);
        if (success) {
            JOptionPane.showMessageDialog(this,
                "Subject deleted successfully!");
            clearForm();
            loadSubjectList(currentMajorFilter);
        } else {
            JOptionPane.showMessageDialog(this,
                "Failed to delete subject!",
                "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    }//GEN-LAST:event_BtnDeleteActionPerformed

    private void clearForm() {
    jTextField2.setText("");
    CBMajor.setSelectedIndex(0);
    CBClass.setSelectedIndex(0);
    autoGenerateId();
    isEditMode = false;
    selectedSubjectId = "";
    selectedSubjectName = "";
    BtnSaveSubject.setText("SAVE");
}
    
private void loadSubjectList(String major) {
    currentMajorFilter = major;
    updateClassPanel(jList1, jProgressBar1, jLabel10, Class1, jPanel8, major, 1);
    updateClassPanel(jList2, jProgressBar2, jLabel11, Class2, jPanel9, major, 2);
    updateClassPanel(jList3, jProgressBar3, jLabel12, Class3, jPanel11, major, 3);
}

private void updateClassPanel(javax.swing.JList<String> list,
                               javax.swing.JProgressBar bar,
                               javax.swing.JLabel countLabel,
                               javax.swing.JLabel titleLabel,
                               javax.swing.JPanel badgePanel,
                               String major, int classLevel) {
    List<Subject> subjects = controller.getSubjectsByClass(major, classLevel);
    int count = subjects.size();

    // Update list
    DefaultListModel<String> model = new DefaultListModel<>();
    for (Subject s : subjects) {
        model.addElement(s.getSubjectName());
    }
    list.setModel(model);

    // Update progress bar
    bar.setMaximum(4);
    bar.setValue(count);

    // Update label count
    countLabel.setText(count + "/4 subjects");
    titleLabel.setText("Class " + classLevel + " " + major);

    // Warna badge
    java.awt.Color badgeColor;
if (classLevel == 1) {
    badgeColor = new java.awt.Color(204, 255, 204); // hijau muda - Class 1
} else if (classLevel == 2) {
    badgeColor = new java.awt.Color(255, 204, 204); // merah muda - Class 2
} else {
    badgeColor = new java.awt.Color(204, 204, 255); // ungu muda - Class 3
}
badgePanel.setBackground(badgeColor);

    // Tentukan tombol EDIT yang sesuai
    javax.swing.JButton editBtn = (classLevel == 1) ? BtnEdit1
                                : (classLevel == 2) ? BtnEdit2
                                : Btnedit3;

    // Hapus listener lama supaya tidak menumpuk
    for (java.awt.event.ActionListener al : editBtn.getActionListeners()) {
        editBtn.removeActionListener(al);
    }

    // Tambah listener baru ke tombol EDIT
    editBtn.addActionListener(e -> {
        int idx = list.getSelectedIndex();
        if (idx < 0 || idx >= subjects.size()) {
            JOptionPane.showMessageDialog(this,
                "Please select a subject from the list first!",
                "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Isi form dengan data subject yang dipilih
        Subject selected = subjects.get(idx);
        selectedSubjectId   = selected.getSubjectId();
        selectedSubjectName = selected.getSubjectName();
        isEditMode = true;

        FieldSubjctID.setText(selected.getSubjectId());
        jTextField2.setText(selected.getSubjectName());
        CBMajor.setSelectedItem(selected.getMajor());
        CBClass.setSelectedItem(String.valueOf(selected.getClassLevel()));

        // Ubah tombol SAVE jadi UPDATE
        BtnSaveSubject.setText("UPDATE");

        // Aktifkan tombol Delete
        BtnDelete.setEnabled(true);
        BtnDelete.setBackground(new java.awt.Color(220, 53, 69));

        JOptionPane.showMessageDialog(this,
            "Mode Edit: " + selected.getSubjectName() + "\n" +
            "Edit the name and click UPDATE, or click DELETE to remove it.",
            "Edit Subject", JOptionPane.INFORMATION_MESSAGE);
    });
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new SubjectForm().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnClearSubject;
    private javax.swing.JButton BtnDashboard;
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton BtnEdit1;
    private javax.swing.JButton BtnEdit2;
    private javax.swing.JButton BtnEnrollment;
    private javax.swing.JButton BtnIS;
    private javax.swing.JButton BtnIT;
    private javax.swing.JButton BtnMajor;
    private javax.swing.JButton BtnReport;
    private javax.swing.JButton BtnSaveSubject;
    private javax.swing.JButton BtnStudent;
    private javax.swing.JButton BtnSubjcts;
    private javax.swing.JButton Btnedit3;
    private javax.swing.JComboBox<String> CBClass;
    private javax.swing.JComboBox<String> CBMajor;
    private javax.swing.JLabel Class1;
    private javax.swing.JLabel Class2;
    private javax.swing.JLabel Class3;
    private javax.swing.JTextField FieldSubjctID;
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Right;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
