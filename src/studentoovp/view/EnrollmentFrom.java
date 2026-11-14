/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package studentoovp.view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JComponent;
import javax.swing.JPanel;

import studentoovp.controller.EnrollmentController;
import studentoovp.controller.SubjectController;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import java.util.List;

/**
 *
 * @author ain saipi
 */
public class EnrollmentFrom extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(EnrollmentFrom.class.getName());

    
    private EnrollmentController enrollCtrl = new EnrollmentController();
    private SubjectController subjectCtrl   = new SubjectController();
    private String selectedStudentId   = "";
    private String selectedStudentName = "";
    private String selectedStudentMajor = "";
    private int    selectedClassLevel  = 0;
    /**
     * Creates new form EnrollmentFrom
     */
    public EnrollmentFrom() {
        initComponents();
           // untuk radius setiap panel  
        makeRounded(jPanel2, 30);
        makeRounded(jPanel4, 30);
        makeRounded(jPanel3, 30);
        makeRounded(jPanel7, 20);
        makeRounded(jPanel10, 20);
        makeRounded(jPanel11, 20);
        makeRounded(jPanel5, 20);
        makeRounded(jPanel6, 20);
        
        
        makeRounded(PanelClass1, 15);
        makeRounded(PanelClass2, 15);
        makeRounded(PanelClass3, 15);
        
        
        setupUI();
        
        cmbFilterMajor.addActionListener(e -> {
    String keyword = txtSearchStudent.getText().trim();
    String major = cmbFilterMajor.getSelectedItem().toString();
    loadStudentList(keyword, major);
});
        loadStudentList("", "ALL");
        setupEnrolledTable();
        loadEnrolledList();
        
        btnCariStudent.addActionListener(this::btnCariStudentActionPerformed);
        btnResetStudent.addActionListener(this::btnResetStudentActionPerformed);

        jComboBox2.addActionListener(e -> loadEnrolledList());
        
        makeScrollable();
        
  
        setLocationRelativeTo(null);
 
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
  
  //proses scroll 
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
    setSize(1200, 600);
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


    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        Left = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtSearchStudent = new javax.swing.JTextField();
        cmbFilterMajor = new javax.swing.JComboBox<>();
        btnCariStudent = new javax.swing.JButton();
        btnResetStudent = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listStudents = new javax.swing.JList<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        PanelClass1 = new javax.swing.JPanel();
        LabelTotalStudent1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        PanelClass2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        LabelTotalStudent2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jProgressBar2 = new javax.swing.JProgressBar();
        PanelClass3 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        LabelTotalStudent3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jProgressBar3 = new javax.swing.JProgressBar();
        ChooseClass = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        PanelStudentList = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnEditStudentEnrolled = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel1.setLayout(new java.awt.BorderLayout());

        Right.setBackground(new java.awt.Color(15, 23, 42));
        Right.setForeground(new java.awt.Color(255, 255, 255));
        Right.setPreferredSize(new java.awt.Dimension(150, 400));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("COMPUTER SCIENCE");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("President University");

        jButton1.setBackground(new java.awt.Color(15, 23, 42));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("- Home");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton2.setBackground(new java.awt.Color(15, 23, 42));
        jButton2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("- Student");
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jButton3.setBackground(new java.awt.Color(15, 23, 42));
        jButton3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("- Major");
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton3.addActionListener(this::jButton3ActionPerformed);

        jButton4.setBackground(new java.awt.Color(15, 23, 42));
        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("- Enrollment");
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton4.addActionListener(this::jButton4ActionPerformed);

        jButton5.setBackground(new java.awt.Color(15, 23, 42));
        jButton5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("- Reports");
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton5.addActionListener(this::jButton5ActionPerformed);

        jButton8.setBackground(new java.awt.Color(15, 23, 42));
        jButton8.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("- Subjects");
        jButton8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton8.addActionListener(this::jButton8ActionPerformed);

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
            .addComponent(jSeparator1)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(842, Short.MAX_VALUE))
        );

        jPanel1.add(Right, java.awt.BorderLayout.WEST);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(30, 41, 59));

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("ENROLL STUDENT");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addContainerGap())
        );

        jPanel4.setForeground(new java.awt.Color(51, 0, 0));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText(" CHOOSE STUDENT");

        cmbFilterMajor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnCariStudent.setBackground(new java.awt.Color(30, 41, 59));
        btnCariStudent.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCariStudent.setForeground(new java.awt.Color(255, 255, 255));
        btnCariStudent.setText("FIND");
        btnCariStudent.addActionListener(this::btnCariStudentActionPerformed);

        btnResetStudent.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnResetStudent.setText("RESET");
        btnResetStudent.addActionListener(this::btnResetStudentActionPerformed);

        listStudents.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listStudents);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(cmbFilterMajor, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                                .addComponent(btnCariStudent)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnResetStudent))
                            .addComponent(txtSearchStudent)
                            .addComponent(jScrollPane1))))
                .addGap(23, 23, 23))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSearchStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbFilterMajor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCariStudent)
                    .addComponent(btnResetStudent))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("CHOOSE THE CLASS");

        PanelClass1.setBackground(new java.awt.Color(204, 204, 204));
        PanelClass1.setForeground(new java.awt.Color(153, 153, 153));

        LabelTotalStudent1.setText("12/20 Student");

        jPanel7.setBackground(new java.awt.Color(204, 255, 204));
        jPanel7.setForeground(new java.awt.Color(51, 51, 0));
        jPanel7.setPreferredSize(new java.awt.Dimension(67, 21));

        jLabel7.setBackground(new java.awt.Color(204, 255, 204));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CLASS 1");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel7.setOpaque(true);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
        );

        jLabel6.setText("Database ");

        jLabel10.setText("Linear Algebra");

        jLabel11.setText("Web Programming");

        jLabel12.setText("Programming Concept");

        javax.swing.GroupLayout PanelClass1Layout = new javax.swing.GroupLayout(PanelClass1);
        PanelClass1.setLayout(PanelClass1Layout);
        PanelClass1Layout.setHorizontalGroup(
            PanelClass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelClass1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelClass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelClass1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(PanelClass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelClass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(68, 68, 68))
                    .addGroup(PanelClass1Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelTotalStudent1)
                        .addContainerGap())))
        );
        PanelClass1Layout.setVerticalGroup(
            PanelClass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelClass1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelClass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelTotalStudent1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelClass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelClass1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        PanelClass2.setBackground(new java.awt.Color(204, 204, 204));
        PanelClass2.setPreferredSize(new java.awt.Dimension(298, 87));

        jPanel10.setBackground(new java.awt.Color(255, 204, 204));
        jPanel10.setPreferredSize(new java.awt.Dimension(67, 21));

        jLabel8.setBackground(new java.awt.Color(255, 204, 204));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("CLASS 2");
        jLabel8.setMaximumSize(new java.awt.Dimension(40, 12));
        jLabel8.setMinimumSize(new java.awt.Dimension(40, 12));
        jLabel8.setOpaque(true);
        jLabel8.setPreferredSize(new java.awt.Dimension(40, 12));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
        );

        LabelTotalStudent2.setText("12/20 Student");

        jLabel13.setText("Calculus");

        jLabel14.setText("Economic Survival");

        jLabel15.setText("Web Application");

        jLabel16.setText("Computer Network");

        javax.swing.GroupLayout PanelClass2Layout = new javax.swing.GroupLayout(PanelClass2);
        PanelClass2.setLayout(PanelClass2Layout);
        PanelClass2Layout.setHorizontalGroup(
            PanelClass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelClass2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelClass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelClass2Layout.createSequentialGroup()
                        .addComponent(jProgressBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(16, 16, 16))
                    .addGroup(PanelClass2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(PanelClass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelClass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(59, 59, 59))
                    .addGroup(PanelClass2Layout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelTotalStudent2)
                        .addContainerGap())))
        );
        PanelClass2Layout.setVerticalGroup(
            PanelClass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelClass2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelClass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelTotalStudent2)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelClass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelClass2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        PanelClass3.setBackground(new java.awt.Color(204, 204, 204));
        PanelClass3.setPreferredSize(new java.awt.Dimension(298, 87));

        jPanel11.setBackground(new java.awt.Color(204, 204, 255));
        jPanel11.setPreferredSize(new java.awt.Dimension(67, 21));

        jLabel9.setBackground(new java.awt.Color(204, 204, 255));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 0, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("CLASS 3");
        jLabel9.setOpaque(true);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        LabelTotalStudent3.setText("12/20 Student");

        jLabel17.setText("Computer Organization");

        jLabel18.setText("Object Oriented Programming");

        jLabel19.setText("Probability and Statistic");

        jLabel20.setText("Economic Survival 2");

        javax.swing.GroupLayout PanelClass3Layout = new javax.swing.GroupLayout(PanelClass3);
        PanelClass3.setLayout(PanelClass3Layout);
        PanelClass3Layout.setHorizontalGroup(
            PanelClass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelClass3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelClass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelClass3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(PanelClass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(PanelClass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addGroup(PanelClass3Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelTotalStudent3)))
                .addContainerGap())
        );
        PanelClass3Layout.setVerticalGroup(
            PanelClass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelClass3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelClass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelTotalStudent3)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelClass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelClass3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jProgressBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(PanelClass2, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                    .addComponent(PanelClass1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelClass3, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelClass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelClass2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PanelClass3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ChooseClass.setBackground(new java.awt.Color(30, 41, 59));
        ChooseClass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ChooseClass.setForeground(new java.awt.Color(255, 255, 255));
        ChooseClass.setText("ENROLL");
        ChooseClass.addActionListener(this::ChooseClassActionPerformed);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel21.setText("Name :");

        jLabel22.setText("jLabel22");

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel23.setText("The Class :");

        jLabel24.setText("jLabel24");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(208, 208, 208)
                        .addComponent(ChooseClass, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 4, Short.MAX_VALUE)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ChooseClass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        PanelStudentList.setBackground(new java.awt.Color(255, 255, 255));

        jPanel9.setBackground(new java.awt.Color(30, 41, 59));

        jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("ENROLLED STUDENT LIST");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel25)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(this::jComboBox1ActionPerformed);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton6.setText("RESET");
        jButton6.addActionListener(this::jButton6ActionPerformed);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        btnEditStudentEnrolled.setBackground(new java.awt.Color(30, 41, 59));
        btnEditStudentEnrolled.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnEditStudentEnrolled.setForeground(new java.awt.Color(255, 255, 255));
        btnEditStudentEnrolled.setText("EDIT");
        btnEditStudentEnrolled.addActionListener(this::btnEditStudentEnrolledActionPerformed);

        javax.swing.GroupLayout PanelStudentListLayout = new javax.swing.GroupLayout(PanelStudentList);
        PanelStudentList.setLayout(PanelStudentListLayout);
        PanelStudentListLayout.setHorizontalGroup(
            PanelStudentListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelStudentListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelStudentListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnEditStudentEnrolled, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelStudentListLayout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(512, 512, 512)
                        .addComponent(jButton6))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 965, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        PanelStudentListLayout.setVerticalGroup(
            PanelStudentListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelStudentListLayout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelStudentListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelStudentListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditStudentEnrolled, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Subject Enrollment");

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelStudentList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(53, 53, 53))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelStudentList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
        );

        jPanel1.add(Left, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1191, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1154, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ChooseClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChooseClassActionPerformed
        // TODO add your handling code here:
        if (selectedStudentId.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this,
            "Please select a student first!");
        return;
    }
    if (selectedClassLevel == 0) {
        javax.swing.JOptionPane.showMessageDialog(this,
            "Please select a class first!");
        return;
    }

    int result = enrollCtrl.enrollStudent(
        selectedStudentId, selectedStudentMajor, selectedClassLevel);

    switch (result) {
        case 0:
            javax.swing.JOptionPane.showMessageDialog(this,
                selectedStudentName + " Successfully enrolled in " +
                "Class " + selectedClassLevel + " (" + selectedStudentMajor + ")!");
            updateClassPanels(selectedStudentMajor);
            loadEnrolledList();
           
            // ── Tambahkan ini: refresh list student ──
            loadStudentList("", "ALL");
            
            // Reset pilihan kelas
            selectedClassLevel = 0;
            jLabel24.setText("-");
            PanelClass1.setBackground(new java.awt.Color(204, 204, 204));
            PanelClass2.setBackground(new java.awt.Color(204, 204, 204));
            PanelClass3.setBackground(new java.awt.Color(204, 204, 204));
            break;
        case 1:
            javax.swing.JOptionPane.showMessageDialog(this,
                "Class " + selectedClassLevel + " is already full! (maximum 20 students)",
                "Class is full ", javax.swing.JOptionPane.WARNING_MESSAGE);
            break;
        case 2:
            javax.swing.JOptionPane.showMessageDialog(this,
                selectedStudentName + " sudah terdaftar di kelas ini!",
                "Already Enrolled", javax.swing.JOptionPane.WARNING_MESSAGE);
            break;
        default:
            javax.swing.JOptionPane.showMessageDialog(this,
                "Failed to enroll! Please check the database connection.",
                "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
        
    }//GEN-LAST:event_ChooseClassActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        loadEnrolledList();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        loadEnrolledList();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnCariStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariStudentActionPerformed
        // TODO add your handling code here:
        String keyword = txtSearchStudent.getText().trim();
        String major   = cmbFilterMajor.getSelectedItem().toString();
        loadStudentList(keyword, major);
    }//GEN-LAST:event_btnCariStudentActionPerformed

    private void btnResetStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetStudentActionPerformed
        // TODO add your handling code here:
        txtSearchStudent.setText("");
        cmbFilterMajor.setSelectedIndex(0);
        selectedStudentId    = "";
        selectedStudentName  = "";
        selectedStudentMajor = "";
        selectedClassLevel   = 0;
        jLabel22.setText("-");
        jLabel24.setText("-");
        loadStudentList("", "ALL");
    }//GEN-LAST:event_btnResetStudentActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new StudentForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new DashboardForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new EnrollmentFrom().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new MajorForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        new SubjectForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         new ReportsForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnEditStudentEnrolledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditStudentEnrolledActionPerformed
        // TODO add your handling code here:
        
         int selectedRow = jTable1.getSelectedRow();
    if (selectedRow < 0) {
        javax.swing.JOptionPane.showMessageDialog(this,
            "Pilih student dari tabel terlebih dahulu!",
            "Peringatan", javax.swing.JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Ambil data dari baris yang dipilih
    // Kolom: 0=EnrollID, 1=StudentID, 2=Name, 3=Major, 4=Class, 5=Date
    int enrollmentId   = (int) jTable1.getValueAt(selectedRow, 0);
    String studentId   = jTable1.getValueAt(selectedRow, 1).toString();
    String studentName = jTable1.getValueAt(selectedRow, 2).toString();
    String major       = jTable1.getValueAt(selectedRow, 3).toString();
    String currentClass = jTable1.getValueAt(selectedRow, 4).toString();

    // Dialog pilih kelas baru
    String[] options = {"Class 1", "Class 2", "Class 3"};
    String newClassStr = (String) javax.swing.JOptionPane.showInputDialog(
        this,
        "Pindahkan " + studentName + " [" + major + "]\n" +
        "Kelas saat ini: " + currentClass + "\n\n" +
        "Pilih kelas baru:",
        "Edit Enrollment",
        javax.swing.JOptionPane.QUESTION_MESSAGE,
        null,
        options,
        currentClass
    );

    if (newClassStr == null) return; // user cancel

    // Parse class level dari string "Class X"
    int newClassLevel = Integer.parseInt(newClassStr.replace("Class ", "").trim());

    // Cek kalau kelas sama
    int currentClassLevel = Integer.parseInt(currentClass.replace("Class ", "").trim());
    if (newClassLevel == currentClassLevel) {
        javax.swing.JOptionPane.showMessageDialog(this,
            "Student sudah berada di " + currentClass + "!",
            "Tidak ada perubahan", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        return;
    }

    // Konfirmasi
    int confirm = javax.swing.JOptionPane.showConfirmDialog(this,
        "Pindahkan " + studentName + "\n" +
        "Dari: " + currentClass + " → " + newClassStr + "\n" +
        "Major: " + major + "\n\n" +
        "Tanggal enrollment akan diperbarui ke hari ini.\n" +
        "Lanjutkan?",
        "Konfirmasi Pindah Kelas",
        javax.swing.JOptionPane.YES_NO_OPTION);

    if (confirm != javax.swing.JOptionPane.YES_OPTION) return;

    // Proses update
    boolean success = enrollCtrl.updateEnrollment(enrollmentId, major, newClassLevel);

    if (success) {
        javax.swing.JOptionPane.showMessageDialog(this,
            studentName + " berhasil dipindahkan ke " + newClassStr + "!\n" +
            "Tanggal enrollment diperbarui.",
            "Berhasil", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        // Refresh semua data
        loadEnrolledList();
        updateClassPanels(major);
        loadStudentList("", "ALL");
    } else {
        javax.swing.JOptionPane.showMessageDialog(this,
            newClassStr + " sudah penuh! (maksimal 20 student)\n" +
            "Silakan pilih kelas lain.",
            "Kelas Penuh", javax.swing.JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_btnEditStudentEnrolledActionPerformed

    
    
    // ── SETUP UI ───────────────────────────────────────────
private void setupUI() {
    // ComboBox filter major
    cmbFilterMajor.setModel(new javax.swing.DefaultComboBoxModel<>(
        new String[]{"ALL", "IS", "IT"}));

    // ComboBox enrolled list
    jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(
        new String[]{"ALL", "IS", "IT"}));
    jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(
        new String[]{"ALL", "1", "2", "3"}));

    // Label info kosong dulu
    jLabel22.setText("-");
    jLabel24.setText("-");
}

// ── LOAD STUDENT KE LIST
private void loadStudentList(String keyword, String major) {
    List<String[]> students = enrollCtrl.getStudents(keyword, major);
    
    // Hapus listener DULU sebelum apapun
    for (javax.swing.event.ListSelectionListener l : 
         listStudents.getListSelectionListeners()) {
        listStudents.removeListSelectionListener(l);
    }
    
    // Baru update model
    DefaultListModel<String> model = new DefaultListModel<>();
    for (String[] s : students) {
        model.addElement(s[1] + " (" + s[0] + ") [" + s[2] + "]");
    }
    listStudents.setModel(model);

    // Tambah listener baru
    listStudents.addListSelectionListener(e -> {
        if (!e.getValueIsAdjusting()) {
            int idx = listStudents.getSelectedIndex();
            if (idx >= 0 && idx < students.size()) {
                String[] s = students.get(idx);
                selectedStudentId    = s[0];
                selectedStudentName  = s[1];
                selectedStudentMajor = s[2];
                jLabel22.setText(selectedStudentName);
                updateClassPanels(selectedStudentMajor);
            }
        }
    });
}

// ── UPDATE 3 PANEL KELAS ───────────────────────────────
private void updateClassPanels(String major) {
    updateOneClassPanel(1, major,
        PanelClass1, jLabel6, jLabel10, jLabel11, jLabel12,
        LabelTotalStudent1, jProgressBar1);
    updateOneClassPanel(2, major,
        PanelClass2, jLabel13, jLabel14, jLabel15, jLabel16,
        LabelTotalStudent2, jProgressBar2);
    updateOneClassPanel(3, major,
        PanelClass3, jLabel17, jLabel18, jLabel19, jLabel20,
        LabelTotalStudent3, jProgressBar3);
}

private void updateOneClassPanel(int classLevel, String major,
        javax.swing.JPanel panel,
        javax.swing.JLabel lbl1, javax.swing.JLabel lbl2,
        javax.swing.JLabel lbl3, javax.swing.JLabel lbl4,
        javax.swing.JLabel lblTotal,
        javax.swing.JProgressBar bar) {

    List<String> subjects = subjectCtrl.getSubjectsByClass(major, classLevel)
        .stream()
        .map(s -> s.getSubjectName())
        .collect(java.util.stream.Collectors.toList());

    int count = enrollCtrl.countStudentsInClass(major, classLevel);
    boolean full = count >= 20;

    // Update total label
    lblTotal.setText(count + "/20 Student");
    lblTotal.setForeground(full
        ? new java.awt.Color(163, 45, 45)
        : new java.awt.Color(0, 0, 0));

    // Update progress bar
    bar.setMaximum(20);
    bar.setValue(count);

    // Update subject labels (4 label untuk max 4 subject)
    javax.swing.JLabel[] lbls = {lbl1, lbl2, lbl3, lbl4};
    for (int i = 0; i < lbls.length; i++) {
        if (i < subjects.size()) {
            lbls[i].setText("• " + subjects.get(i));
        } else {
            lbls[i].setText("");
        }
    }

// Warna panel
if (full) {
    panel.setBackground(new java.awt.Color(220, 150, 150));
} else {
    panel.setBackground(new java.awt.Color(204, 204, 204));
}

// ✅ 1. Hapus semua listener lama
for (java.awt.event.MouseListener ml : panel.getMouseListeners()) {
    panel.removeMouseListener(ml);
}

// ✅ 2. Set cursor dulu
panel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

// ✅ 3. Tambah SATU listener saja
panel.addMouseListener(new java.awt.event.MouseAdapter() {
    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
        if (!full && !selectedStudentId.isEmpty()) {
            selectedClassLevel = classLevel;
            jLabel24.setText("Class " + classLevel + " - " + major);
            PanelClass1.setBackground(new java.awt.Color(204, 204, 204));
            PanelClass2.setBackground(new java.awt.Color(204, 204, 204));
            PanelClass3.setBackground(new java.awt.Color(204, 204, 204));
            panel.setBackground(new java.awt.Color(180, 220, 255));
        }
    }
});
}

// ── SETUP TABEL ENROLLED ───────────────────────────────
private void setupEnrolledTable() {
    DefaultTableModel model = new DefaultTableModel(
        new String[]{"Enroll ID", "Student ID", "Name", "Major",
                     "Class", "Date"}, 0) {
        public boolean isCellEditable(int r, int c) { return false; }
    };
    jTable1.setModel(model);
    jTable1.setRowHeight(28);

    // Sembunyikan kolom Enroll ID
    jTable1.getColumnModel().getColumn(0).setMinWidth(0);
    jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
    jTable1.getColumnModel().getColumn(0).setWidth(0);
}

// ── LOAD ENROLLED LIST ─────────────────────────────────
private void loadEnrolledList() {
    String major = jComboBox1.getSelectedItem().toString();
    String cls   = jComboBox2.getSelectedItem().toString();
    enrollCtrl.loadEnrolledToTable(
        (DefaultTableModel) jTable1.getModel(), major, cls);
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
        java.awt.EventQueue.invokeLater(() -> new EnrollmentFrom().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChooseClass;
    private javax.swing.JLabel LabelTotalStudent1;
    private javax.swing.JLabel LabelTotalStudent2;
    private javax.swing.JLabel LabelTotalStudent3;
    private javax.swing.JPanel Left;
    private javax.swing.JPanel PanelClass1;
    private javax.swing.JPanel PanelClass2;
    private javax.swing.JPanel PanelClass3;
    private javax.swing.JPanel PanelStudentList;
    private javax.swing.JPanel Right;
    private javax.swing.JButton btnCariStudent;
    private javax.swing.JButton btnEditStudentEnrolled;
    private javax.swing.JButton btnResetStudent;
    private javax.swing.JComboBox<String> cmbFilterMajor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JProgressBar jProgressBar3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JList<String> listStudents;
    private javax.swing.JTextField txtSearchStudent;
    // End of variables declaration//GEN-END:variables
}
