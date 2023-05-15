
import com.util.DBClass;
import com.util.ImageUtility;
import com.util.Utility;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;

public class MainForm extends javax.swing.JFrame {
    
    String usertype,username;
    DBClass db = new DBClass(); 
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss a");
    String msg = "Welcome To Airline Reservation System ... Fly With Us ...";
    int k=0;
    
    public MainForm(String usertype, String username) {
        initComponents();
        this.username=username;
        this.usertype=usertype;
        if(usertype.equals("Employee")){
            employeemenu.setVisible(false);
            empreports.setVisible(false);
        }
         Utility.setBorder(this);
         DBClass.SetIcon(this);
        ImageUtility.changeFrameBackgroundImage(this, "src/images/gift3.gif");
        
        Timer t = new Timer(1000, e->{
            Date d = new Date();
            String s = sdf.format(d);
            jLabel1.setText(s);
        });
        t.start();
        
        Timer t1 = new Timer(100, e ->{
            if(k>msg.length()){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
                }
                k=0;
            }
            String s = msg.substring(0, k);
            lblt.setText(s);
            k++;
        });
        t1.start();
       }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnclose = new javax.swing.JButton();
        lblimage = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        flightmenu = new javax.swing.JMenu();
        addflightmenu = new javax.swing.JMenuItem();
        searchflightmenu = new javax.swing.JMenuItem();
        employeemenu = new javax.swing.JMenu();
        empregmenu = new javax.swing.JMenuItem();
        empsearchmenu = new javax.swing.JMenuItem();
        passengermenu = new javax.swing.JMenu();
        passsearchmenu = new javax.swing.JMenuItem();
        ticketmenu = new javax.swing.JMenu();
        TicketSerarchMenu = new javax.swing.JMenuItem();
        reportmenu = new javax.swing.JMenu();
        empreports = new javax.swing.JMenuItem();
        flightreport = new javax.swing.JMenuItem();
        ticketreport = new javax.swing.JMenuItem();
        passengerreport = new javax.swing.JMenuItem();
        profilemenu = new javax.swing.JMenu();
        myprofile = new javax.swing.JMenuItem();
        myprofile1 = new javax.swing.JMenuItem();

        btnclose.setBackground(new java.awt.Color(0, 204, 204));
        btnclose.setFont(new java.awt.Font("Times New Roman", 1, 33)); // NOI18N
        btnclose.setText("X");
        btnclose.setContentAreaFilled(false);
        btnclose.setOpaque(true);
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));

        lblt.setBackground(new java.awt.Color(0, 0, 204));
        lblt.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblt.setForeground(new java.awt.Color(255, 255, 255));
        lblt.setText("jLabel2");
        lblt.setOpaque(true);

        jLabel1.setBackground(new java.awt.Color(0, 0, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("jLabel1");
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 915, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(219, 219, 219))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblt)))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jMenuBar1.setBackground(new java.awt.Color(0, 204, 204));

        flightmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/flighticon2.png"))); // NOI18N
        flightmenu.setText("Flight          ");
        flightmenu.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N

        addflightmenu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        addflightmenu.setText("Add Flight");
        addflightmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addflightmenuActionPerformed(evt);
            }
        });
        flightmenu.add(addflightmenu);

        searchflightmenu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        searchflightmenu.setText("Search Flight");
        searchflightmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchflightmenuActionPerformed(evt);
            }
        });
        flightmenu.add(searchflightmenu);

        jMenuBar1.add(flightmenu);

        employeemenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/emp1.jpg"))); // NOI18N
        employeemenu.setText("Employee          ");
        employeemenu.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N

        empregmenu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        empregmenu.setText("Employee Registration");
        empregmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empregmenuActionPerformed(evt);
            }
        });
        employeemenu.add(empregmenu);

        empsearchmenu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        empsearchmenu.setText("Search Employee ");
        empsearchmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empsearchmenuActionPerformed(evt);
            }
        });
        employeemenu.add(empsearchmenu);

        jMenuBar1.add(employeemenu);

        passengermenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/passengericon2 (1).png"))); // NOI18N
        passengermenu.setText("Passenger          ");
        passengermenu.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N

        passsearchmenu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        passsearchmenu.setText("Search Passenger");
        passsearchmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passsearchmenuActionPerformed(evt);
            }
        });
        passengermenu.add(passsearchmenu);

        jMenuBar1.add(passengermenu);

        ticketmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ticketicon3.png"))); // NOI18N
        ticketmenu.setText("Ticket          ");
        ticketmenu.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N

        TicketSerarchMenu.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        TicketSerarchMenu.setText("Search Ticket");
        TicketSerarchMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TicketSerarchMenuActionPerformed(evt);
            }
        });
        ticketmenu.add(TicketSerarchMenu);

        jMenuBar1.add(ticketmenu);

        reportmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/m_reports.jpg"))); // NOI18N
        reportmenu.setText("Reports          ");
        reportmenu.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N

        empreports.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        empreports.setText("Employee Reports");
        empreports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empreportsActionPerformed(evt);
            }
        });
        reportmenu.add(empreports);

        flightreport.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        flightreport.setText("Flight Reports");
        flightreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightreportActionPerformed(evt);
            }
        });
        reportmenu.add(flightreport);

        ticketreport.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ticketreport.setText("Ticket Reports");
        ticketreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ticketreportActionPerformed(evt);
            }
        });
        reportmenu.add(ticketreport);

        passengerreport.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        passengerreport.setText("Passenger Reports");
        passengerreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passengerreportActionPerformed(evt);
            }
        });
        reportmenu.add(passengerreport);

        jMenuBar1.add(reportmenu);

        profilemenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usericon1.png"))); // NOI18N
        profilemenu.setText("Profile                ");
        profilemenu.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N

        myprofile.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        myprofile.setText("My Profile");
        myprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myprofileActionPerformed(evt);
            }
        });
        profilemenu.add(myprofile);

        myprofile1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        myprofile1.setText("Exit");
        myprofile1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myprofile1ActionPerformed(evt);
            }
        });
        profilemenu.add(myprofile1);

        jMenuBar1.add(profilemenu);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1288, 459));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addflightmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addflightmenuActionPerformed
        AddFlightForm obj = new AddFlightForm();
        obj.setVisible(true);
    }//GEN-LAST:event_addflightmenuActionPerformed

    private void empregmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empregmenuActionPerformed
        EmployeeRegistration obj = new EmployeeRegistration();
        obj.setVisible(true);
    }//GEN-LAST:event_empregmenuActionPerformed

    private void empsearchmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empsearchmenuActionPerformed
        SearchEmployee obj = new SearchEmployee();
        obj.setVisible(true);
    }//GEN-LAST:event_empsearchmenuActionPerformed

    private void searchflightmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchflightmenuActionPerformed
        SearchFlight obj = new SearchFlight(0);
        obj.setVisible(true);
    }//GEN-LAST:event_searchflightmenuActionPerformed

    private void passsearchmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passsearchmenuActionPerformed
        SearchPassenger obj = new SearchPassenger();
        obj.setVisible(true);
    }//GEN-LAST:event_passsearchmenuActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        dispose();
    }//GEN-LAST:event_btncloseActionPerformed

    private void TicketSerarchMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TicketSerarchMenuActionPerformed
            SearchTicket obj = new SearchTicket();
            obj.setVisible(true);
    }//GEN-LAST:event_TicketSerarchMenuActionPerformed

    private void flightreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightreportActionPerformed
        db.showReport("C:\\Users\\LENOVO\\Desktop\\Airline_Reservation_System\\Airline_Reservation_System\\src\\Reports\\FlightList.jrxml");
    }//GEN-LAST:event_flightreportActionPerformed

    private void myprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myprofileActionPerformed
            this.dispose();
            ProfileForm obj = new ProfileForm(usertype,username);
            obj.setVisible(true);
    }//GEN-LAST:event_myprofileActionPerformed

    private void empreportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empreportsActionPerformed
        db.showReport("C:\\Users\\LENOVO\\Desktop\\Airline_Reservation_System\\Airline_Reservation_System\\src\\Reports\\EmployeeList.jrxml");
    }//GEN-LAST:event_empreportsActionPerformed

    private void ticketreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ticketreportActionPerformed
        String filepath = "C:\\Users\\LENOVO\\Desktop\\Airline_Reservation_System\\Airline_Reservation_System\\src\\Reports\\TicketList.jrxml";
        db.showReport(filepath);
    }//GEN-LAST:event_ticketreportActionPerformed

    private void passengerreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passengerreportActionPerformed
        db.showReport("C:\\Users\\LENOVO\\Desktop\\Airline_Reservation_System\\Airline_Reservation_System\\src\\Reports\\PassengerList.jrxml");
    }//GEN-LAST:event_passengerreportActionPerformed

    private void myprofile1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myprofile1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_myprofile1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm("","").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem TicketSerarchMenu;
    private javax.swing.JMenuItem addflightmenu;
    private javax.swing.JButton btnclose;
    private javax.swing.JMenu employeemenu;
    private javax.swing.JMenuItem empregmenu;
    private javax.swing.JMenuItem empreports;
    private javax.swing.JMenuItem empsearchmenu;
    private javax.swing.JMenu flightmenu;
    private javax.swing.JMenuItem flightreport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblimage;
    private javax.swing.JLabel lblt;
    private javax.swing.JMenuItem myprofile;
    private javax.swing.JMenuItem myprofile1;
    private javax.swing.JMenu passengermenu;
    private javax.swing.JMenuItem passengerreport;
    private javax.swing.JMenuItem passsearchmenu;
    private javax.swing.JMenu profilemenu;
    private javax.swing.JMenu reportmenu;
    private javax.swing.JMenuItem searchflightmenu;
    private javax.swing.JMenu ticketmenu;
    private javax.swing.JMenuItem ticketreport;
    // End of variables declaration//GEN-END:variables
}
