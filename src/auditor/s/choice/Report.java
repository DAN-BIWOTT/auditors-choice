/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package auditor.s.choice;


import databaseDAO.dbConnect;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import util.WindowsLocation;

/**
 *
 * @author PRINCE ALCHEMY
 */
public class Report extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Report() {
        initComponents();
        this.centralizeWindow();
    }
    
    private void centralizeWindow(){
        WindowsLocation.centralizeWindow(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        sidepane = new javax.swing.JPanel();
        Analysis_btn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Home_btn = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Reports_btn = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Audits_btn = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Documentation_btn = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Home = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Audits = new javax.swing.JPanel();
        Analysis = new javax.swing.JPanel();
        Documentation = new javax.swing.JPanel();
        Dashboard = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        Directory = new javax.swing.JLabel();
        Search = new javax.swing.JLabel();
        Recycle = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        Exit = new javax.swing.JLabel();
        AuditorsChoice = new javax.swing.JLabel();
        mPesa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(54, 33, 89));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidepane.setBackground(new java.awt.Color(54, 33, 90));
        sidepane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Analysis_btn.setBackground(new java.awt.Color(85, 65, 100));
        Analysis_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Analysis_btnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Analysis_btnMouseReleased(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_balance.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Analysis");

        javax.swing.GroupLayout Analysis_btnLayout = new javax.swing.GroupLayout(Analysis_btn);
        Analysis_btn.setLayout(Analysis_btnLayout);
        Analysis_btnLayout.setHorizontalGroup(
            Analysis_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Analysis_btnLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );
        Analysis_btnLayout.setVerticalGroup(
            Analysis_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Analysis_btnLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(Analysis_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        sidepane.add(Analysis_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 280, -1));

        Home_btn.setBackground(new java.awt.Color(85, 65, 100));
        Home_btn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Home_btnFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Home_btnFocusLost(evt);
            }
        });
        Home_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Home_btnMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Home_btnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Home_btnMouseReleased(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_house.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Home");

        javax.swing.GroupLayout Home_btnLayout = new javax.swing.GroupLayout(Home_btn);
        Home_btn.setLayout(Home_btnLayout);
        Home_btnLayout.setHorizontalGroup(
            Home_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Home_btnLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );
        Home_btnLayout.setVerticalGroup(
            Home_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Home_btnLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(Home_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)))
        );

        sidepane.add(Home_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 280, -1));

        Reports_btn.setBackground(new java.awt.Color(85, 65, 100));
        Reports_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Reports_btnMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Reports_btnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Reports_btnMouseReleased(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_datareport.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Reports");

        javax.swing.GroupLayout Reports_btnLayout = new javax.swing.GroupLayout(Reports_btn);
        Reports_btn.setLayout(Reports_btnLayout);
        Reports_btnLayout.setHorizontalGroup(
            Reports_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Reports_btnLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );
        Reports_btnLayout.setVerticalGroup(
            Reports_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Reports_btnLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(Reports_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        sidepane.add(Reports_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 280, -1));

        Audits_btn.setBackground(new java.awt.Color(85, 65, 100));
        Audits_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Audits_btnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Audits_btnMouseReleased(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_calculator_alt.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Audits");

        javax.swing.GroupLayout Audits_btnLayout = new javax.swing.GroupLayout(Audits_btn);
        Audits_btn.setLayout(Audits_btnLayout);
        Audits_btnLayout.setHorizontalGroup(
            Audits_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Audits_btnLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );
        Audits_btnLayout.setVerticalGroup(
            Audits_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Audits_btnLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(Audits_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        sidepane.add(Audits_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 280, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Alchemy.Inc");
        sidepane.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 34));

        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 5));
        sidepane.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 170, 20));

        Documentation_btn.setBackground(new java.awt.Color(85, 65, 100));
        Documentation_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Documentation_btnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Documentation_btnMouseReleased(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_document.png"))); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Documentation");

        javax.swing.GroupLayout Documentation_btnLayout = new javax.swing.GroupLayout(Documentation_btn);
        Documentation_btn.setLayout(Documentation_btnLayout);
        Documentation_btnLayout.setHorizontalGroup(
            Documentation_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Documentation_btnLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        Documentation_btnLayout.setVerticalGroup(
            Documentation_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Documentation_btnLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(Documentation_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        sidepane.add(Documentation_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 280, -1));

        bg.add(sidepane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 500));

        Home.setBackground(new java.awt.Color(204, 204, 204));
        Home.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        Home.add(jPanel1, "card2");

        bg.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 830, 450));

        Audits.setBackground(new java.awt.Color(153, 153, 153));
        Audits.setLayout(new java.awt.CardLayout());
        bg.add(Audits, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 830, 450));

        Analysis.setBackground(new java.awt.Color(0, 255, 255));
        Analysis.setLayout(new java.awt.CardLayout());
        bg.add(Analysis, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 830, 450));

        Documentation.setBackground(new java.awt.Color(255, 0, 0));
        Documentation.setLayout(new java.awt.CardLayout());
        bg.add(Documentation, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 830, 450));

        Dashboard.setBackground(new java.awt.Color(122, 72, 221));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Transaction History Search ");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jTextField1.setText("Search...");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        Directory.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Directory.setForeground(new java.awt.Color(204, 204, 204));
        Directory.setText("Reports");

        Search.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Search.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_search2.png"))); // NOI18N

        Recycle.setBackground(new java.awt.Color(122, 72, 221));
        Recycle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RecycleMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                RecycleMouseReleased(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(151, 125, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_refresh.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel14MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel14MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout RecycleLayout = new javax.swing.GroupLayout(Recycle);
        Recycle.setLayout(RecycleLayout);
        RecycleLayout.setHorizontalGroup(
            RecycleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
        );
        RecycleLayout.setVerticalGroup(
            RecycleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout DashboardLayout = new javax.swing.GroupLayout(Dashboard);
        Dashboard.setLayout(DashboardLayout);
        DashboardLayout.setHorizontalGroup(
            DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Recycle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DashboardLayout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(Directory, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(691, Short.MAX_VALUE)))
        );
        DashboardLayout.setVerticalGroup(
            DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DashboardLayout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Recycle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(DashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DashboardLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(Directory, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(57, Short.MAX_VALUE)))
        );

        bg.add(Dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 53, 840, 110));

        table.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RECEIPT", "NAME", "AMOUNT", "TIME", "PHONE NUMBER", "ACCOUNT", "ACCOUNT ID", "POST BALANCE", "TRANSACTION COST", "NOTE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 830, 290));

        Exit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Exit.setForeground(new java.awt.Color(54, 33, 89));
        Exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Exit.setText("X");
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        bg.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 0, 30, 30));

        AuditorsChoice.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        AuditorsChoice.setText("Auditor's Choices");
        bg.add(AuditorsChoice, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 290, 40));

        mPesa.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        mPesa.setForeground(new java.awt.Color(51, 255, 0));
        mPesa.setText("M-Pesa ");
        bg.add(mPesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 156, 220, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClicked

    private void Home_btnFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Home_btnFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_Home_btnFocusGained

    private void Home_btnFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Home_btnFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_Home_btnFocusLost

    private void Home_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home_btnMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_Home_btnMouseClicked

    private void Home_btnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home_btnMouseReleased
        // TODO add your handling code here:
        resetColor(Home_btn);
    }//GEN-LAST:event_Home_btnMouseReleased

    private void Reports_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Reports_btnMouseClicked
        // TODO add your handling code here:
      
    }//GEN-LAST:event_Reports_btnMouseClicked

    private void Reports_btnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Reports_btnMouseReleased
        // TODO add your handling code here:
        resetColor(Reports_btn);
    }//GEN-LAST:event_Reports_btnMouseReleased

    private void Reports_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Reports_btnMousePressed
        //----------------COLOR SETTING---------------
          setColor(Reports_btn);
          //----------------END----------------------
          //---------------------LEVEL SHIFT----------------------
        //---------------------LEVEL SHIFT--------------
        Home.setVisible(false);
        jTextField1.setVisible(false);
        Dashboard.setVisible(true);
        Audits.setVisible(false);
        Documentation.setVisible(false);
        Analysis.setVisible(false);
        try {
            //--------------------------END---------------------
            populate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_Reports_btnMousePressed

    private void populate() throws ClassNotFoundException{
        //--------------DATABASE ACCESS-------------
        if (!AuditorSChoice.exists) {
            dbConnect dbconnection = new dbConnect();

            DefaultTableModel tableModel = (DefaultTableModel) table.getModel();

            try (Connection conn = dbconnection.connectOnline()) {
                System.out.println("so far so good");

                String sql = "SELECT * FROM pesapi_payment LIMIT 100;";
                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery(sql);

                while (rs.next()) {
                    int accountID = rs.getInt("account_id");
                    String receipt = rs.getString("receipt");
                    String time = rs.getString("time");
                    String phoneNumber = rs.getString("phonenumber");
                    String name = rs.getString("name");
                    String account = rs.getString("account");
                    double amount = rs.getDouble("amount");
                    double postBalance = rs.getDouble("post_balance");
                    String note = rs.getString("note");
                    double transactionCost = rs.getDouble("transaction_cost");

                    tableModel.addRow(new Object[]{receipt, name, amount, time, phoneNumber, account, accountID, postBalance, transactionCost, note});
                }

            } catch (SQLException ex) {
                System.out.println("not good!");
                Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
            }
            AuditorSChoice.exists = true;
        }
        //----------------------END--------------------------------
       }
    
    private void Audits_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Audits_btnMousePressed
        // ---------------------COLOR--------------------
        setColor(Audits_btn);
        //---------------------END----------------------
        //---------------------LEVEL SHIFT--------------
        Home.setVisible(false);
        Dashboard.setVisible(false);
        Audits.setVisible(true);
        Documentation.setVisible(false);
        Analysis.setVisible(false);
        //--------------------------END---------------------
    }//GEN-LAST:event_Audits_btnMousePressed

    private void Audits_btnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Audits_btnMouseReleased
        // TODO add your handling code here:
        resetColor(Audits_btn);
    }//GEN-LAST:event_Audits_btnMouseReleased

    private void Analysis_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Analysis_btnMousePressed
        // ------------------------COLOR-------------
        setColor(Analysis_btn);
        //-----------------END-----------------------
        //---------------------LEVEL SHIFT--------------
        Home.setVisible(false);
        Audits.setVisible(false);
        Dashboard.setVisible(false);
        Documentation.setVisible(false);
        Analysis.setVisible(true);
        //--------------------------END---------------------
    }//GEN-LAST:event_Analysis_btnMousePressed

    private void Analysis_btnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Analysis_btnMouseReleased
        // TODO add your handling code here:
        resetColor(Analysis_btn);
    }//GEN-LAST:event_Analysis_btnMouseReleased

    private void Documentation_btnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Documentation_btnMouseReleased
        // TODO add your handling code here:
        resetColor(Documentation_btn);
    }//GEN-LAST:event_Documentation_btnMouseReleased

    private void Documentation_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Documentation_btnMousePressed
        //------------------------COLOR-------------------
        setColor(Documentation_btn);
        //-----------------------END----------------------
        //---------------------LEVEL SHIFT--------------
        Home.setVisible(false);
        Audits.setVisible(false);
        Documentation.setVisible(true);
        Dashboard.setVisible(false);
        Analysis.setVisible(false);
        //--------------------------END---------------------
    }//GEN-LAST:event_Documentation_btnMousePressed

    private void Home_btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Home_btnMousePressed
        // ---------------COLOR SETTING------------------
        setColor(Home_btn);
        //----------------END----------------------------
        //--------------LEVEL SETTING--------------------
        Home.setVisible(true);
        Audits.setVisible(false);
        Dashboard.setVisible(false);
        Documentation.setVisible(false);
        Analysis.setVisible(false);
        jTextField1.setVisible(false);
        //------------------------END-----------------------
    }//GEN-LAST:event_Home_btnMousePressed

    private void jLabel14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MousePressed
        recycleColor(Recycle);
    }//GEN-LAST:event_jLabel14MousePressed

    private void jLabel14MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseReleased
    antiRecycleColor(Recycle);
    }//GEN-LAST:event_jLabel14MouseReleased

    private void RecycleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RecycleMousePressed
        // ----------------------------COLOR--------------------
       // recycleColor(Recycle);
    }//GEN-LAST:event_RecycleMousePressed

    private void RecycleMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RecycleMouseReleased
        // ----------------------COLOR-----------------
       /// antiRecycleColor(Recycle);
    }//GEN-LAST:event_RecycleMouseReleased

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // ----------------------REFRESH PAGE-------------------------
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        model.setRowCount(0);
        AuditorSChoice.exists = false;
        try {
            populate();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    
    void recycleColor(JPanel panel){
        panel.setBackground(new Color(151,125,255));
    }
    
    void antiRecycleColor(JPanel panel){
        panel.setBackground(new Color(122,72,221));
    }
    
    void setColor(JPanel panel){
        panel.setBackground(new Color(85,65,118));
    }
    
    void resetColor(JPanel panel){
        panel.setBackground(new Color(85,65,100));
    }
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Analysis;
    private javax.swing.JPanel Analysis_btn;
    private javax.swing.JLabel AuditorsChoice;
    private javax.swing.JPanel Audits;
    private javax.swing.JPanel Audits_btn;
    private javax.swing.JPanel Dashboard;
    private javax.swing.JLabel Directory;
    private javax.swing.JPanel Documentation;
    private javax.swing.JPanel Documentation_btn;
    private javax.swing.JLabel Exit;
    private javax.swing.JPanel Home;
    private javax.swing.JPanel Home_btn;
    private javax.swing.JPanel Recycle;
    private javax.swing.JPanel Reports_btn;
    private javax.swing.JLabel Search;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel mPesa;
    private javax.swing.JPanel sidepane;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}