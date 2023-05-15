
import com.util.DBClass;
import com.util.Messages;
import com.util.Rules;
import com.util.Utility;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class PaymentForm extends javax.swing.JFrame{
    
    int seatprice,seatno,ticketid , price;;
    int pass_id,flight_id;
    ImageIcon imageIcon=null;
    ResultSet rs=null;
    ResultSet rs1=null;
    String pass_name,pass_age,pass_contact,pass_passportid,seat_type,flightType,from1,destination1,date1,Arrival,Departure;
    DBClass db = new DBClass();
   // HashMap<String, Object> map = new HashMap<>();
        
    public PaymentForm(int seatno,int pass_id,int flight_id,ImageIcon imageIcon,int ticketid,int price) {
        initComponents();
        jTabbedPane1.setVisible(false);
        Utility.setBorder(this);
        DBClass.SetIcon(this);
        this.pass_id=pass_id;
        this.flight_id=flight_id;
        this.seatno=seatno;
        this.price=price;
        this.imageIcon=imageIcon;
        this.ticketid=ticketid;
        rs = db.getData("select * from ticketinfoview where pass_id="+pass_id);
        try {
            while(rs.next()){
                
                pass_name = rs.getString("pass_name");
                 pass_age = rs.getString("pass_age");
                 pass_contact = rs.getString("pass_contact");
                 pass_passportid = rs.getString("pass_passportid");
                 seat_type = rs.getString("seat_type");
                 flightType = rs.getString("flighttype");
                 from1 = rs.getString("from1");
                 destination1 = rs.getString("destination");
                 date1 = rs.getString("date");
                 Arrival= rs.getString("arrivaltime");
                 Departure = rs.getString ("departuretime");
                 txtflightcharges.setText(price+"");
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(TicketBookingForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnclose = new javax.swing.JButton();
        rbupi = new javax.swing.JRadioButton();
        btncbooking = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        rbcdcard = new javax.swing.JRadioButton();
        lstatus = new javax.swing.JLabel();
        txtflightcharges = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtcardno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        expireddate = new com.github.lgooddatepicker.components.DatePicker();
        jLabel7 = new javax.swing.JLabel();
        txtccv = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnpay1 = new javax.swing.JButton();
        txtpassword = new javax.swing.JPasswordField();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnpay = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 104));

        jPanel2.setBackground(new java.awt.Color(239, 45, 4));

        jLabel1.setText(":: Payment Methods ::");
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 33)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 104));

        btnclose.setText("X");
        btnclose.setBackground(new java.awt.Color(0, 204, 204));
        btnclose.setContentAreaFilled(false);
        btnclose.setFont(new java.awt.Font("Times New Roman", 1, 33)); // NOI18N
        btnclose.setOpaque(true);
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                .addComponent(btnclose))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnclose)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        rbupi.setBackground(new java.awt.Color(255, 255, 104));
        buttonGroup1.add(rbupi);
        rbupi.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        rbupi.setForeground(new java.awt.Color(243, 85, 24));
        rbupi.setText("By UPI ");
        rbupi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbupiActionPerformed(evt);
            }
        });

        btncbooking.setText("Confirm Booking");
        btncbooking.setBackground(new java.awt.Color(239, 45, 4));
        btncbooking.setContentAreaFilled(false);
        btncbooking.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btncbooking.setForeground(new java.awt.Color(255, 255, 104));
        btncbooking.setOpaque(true);
        btncbooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncbookingActionPerformed(evt);
            }
        });

        btnexit.setText("Exit");
        btnexit.setBackground(new java.awt.Color(239, 45, 4));
        btnexit.setContentAreaFilled(false);
        btnexit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnexit.setForeground(new java.awt.Color(255, 255, 104));
        btnexit.setOpaque(true);
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        btnback.setText("Back");
        btnback.setBackground(new java.awt.Color(239, 45, 4));
        btnback.setContentAreaFilled(false);
        btnback.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnback.setForeground(new java.awt.Color(255, 255, 104));
        btnback.setOpaque(true);
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        rbcdcard.setBackground(new java.awt.Color(255, 255, 104));
        buttonGroup1.add(rbcdcard);
        rbcdcard.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        rbcdcard.setForeground(new java.awt.Color(243, 85, 24));
        rbcdcard.setText("By Credit/Debit Card");
        rbcdcard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbcdcardActionPerformed(evt);
            }
        });

        lstatus.setText("Unpaid");
        lstatus.setBackground(new java.awt.Color(153, 0, 0));
        lstatus.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        lstatus.setForeground(new java.awt.Color(102, 0, 51));

        txtflightcharges.setEnabled(false);
        txtflightcharges.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        jLabel11.setText("₹");
        jLabel11.setBackground(new java.awt.Color(243, 85, 24));
        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 28)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(243, 85, 24));

        jLabel12.setText("Total Flight Charges");
        jLabel12.setBackground(new java.awt.Color(243, 85, 24));
        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(243, 85, 24));

        jLabel13.setText("Status");
        jLabel13.setBackground(new java.awt.Color(243, 85, 24));
        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(243, 85, 24));

        jTabbedPane1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel5.setText("Card Number : ");
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(243, 85, 24));

        txtcardno.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel6.setText("Expired Date : ");
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(243, 85, 24));

        jLabel7.setText("CCV : ");
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(243, 85, 24));

        txtccv.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel8.setText("Password : ");
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(243, 85, 24));

        btnpay1.setText("Pay");
        btnpay1.setBackground(new java.awt.Color(239, 45, 4));
        btnpay1.setContentAreaFilled(false);
        btnpay1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnpay1.setForeground(new java.awt.Color(255, 255, 104));
        btnpay1.setOpaque(true);
        btnpay1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpay1ActionPerformed(evt);
            }
        });

        txtpassword.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(58, 58, 58)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtcardno, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(expireddate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtccv)
                    .addComponent(txtpassword))
                .addContainerGap(221, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnpay1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtcardno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(expireddate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtccv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnpay1)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("", jPanel6);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/upi.png"))); // NOI18N

        btnpay.setText("Pay");
        btnpay.setBackground(new java.awt.Color(239, 45, 4));
        btnpay.setContentAreaFilled(false);
        btnpay.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnpay.setForeground(new java.awt.Color(255, 255, 104));
        btnpay.setOpaque(true);
        btnpay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 334, Short.MAX_VALUE)
                .addComponent(btnpay)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnpay)
                .addGap(95, 95, 95))
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("", jPanel5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(btnback)
                .addGap(110, 110, 110)
                .addComponent(btncbooking)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnexit)
                .addGap(99, 99, 99))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rbupi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbcdcard))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtflightcharges, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addGap(38, 38, 38)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lstatus)
                .addGap(50, 50, 50))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jLabel12)
                    .addContainerGap(485, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(490, Short.MAX_VALUE)
                    .addComponent(jLabel13)
                    .addGap(170, 170, 170)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtflightcharges, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11))
                            .addComponent(lstatus))
                        .addGap(31, 31, 31)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbupi)
                    .addComponent(rbcdcard))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnexit)
                    .addComponent(btncbooking)
                    .addComponent(btnback))
                .addGap(35, 35, 35))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(129, 129, 129)
                    .addComponent(jLabel12)
                    .addContainerGap(471, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(129, 129, 129)
                    .addComponent(jLabel13)
                    .addContainerGap(471, Short.MAX_VALUE)))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("");

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, -1));

        setSize(new java.awt.Dimension(729, 631));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btncbookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncbookingActionPerformed
        db.execute("insert into ticketinfo_tb values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)", ticketid,flight_id,flightType,from1,destination1,date1,Arrival,Departure,seatno,seat_type,price,pass_id,pass_name,pass_age,pass_contact,pass_passportid,imageIcon);
        Messages.showInfo("Your Flight Is Booked Successfully...","");
        this.dispose();
        FlightSearch obj = new FlightSearch(pass_id);
        obj.setVisible(true);
    }//GEN-LAST:event_btncbookingActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        this.dispose();
        TicketBookingForm obj = new TicketBookingForm(pass_id, flight_id, seatno, imageIcon);
        obj.setVisible(true);
        
    }//GEN-LAST:event_btnbackActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
         this.dispose();
    }//GEN-LAST:event_btncloseActionPerformed

    private void rbupiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbupiActionPerformed
      jTabbedPane1.setVisible(true);
      jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_rbupiActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
            this.dispose();
            FlightSearch obj = new FlightSearch(pass_id);
            obj.setVisible(true);
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnpayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpayActionPerformed
        jTabbedPane1.setVisible(false);
        lstatus.setText("Paid");
        rbupi.setVisible(false);
        rbcdcard.setVisible(false);
    }//GEN-LAST:event_btnpayActionPerformed

    private void btnpay1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpay1ActionPerformed
        String cnumber = txtcardno.getText();
        String exdate = expireddate.getDateStringOrEmptyString();
        String ccv = txtccv.getText();
        String password = txtpassword.getText();
        
        if(cnumber.isEmpty()){
            Messages.showError("Please Enter The Card Number !", "");
            txtcardno.requestFocus();
            return;
        }
            if(ccv.isEmpty()){
            Messages.showError("Please Enter The Card Code Verification !", "");
            txtccv.requestFocus();
            return;
        }
          if(password.isEmpty()){
            Messages.showError("Please Enter The Password !", "");
            txtpassword.requestFocus();
            return;
        }
            if(Rules.isInteger(cnumber)){
            Messages.showError("Please Enter Valid Number !", "");
            txtcardno.requestFocus();
            return;
        }
              if(!Rules.isInteger(ccv)){
            Messages.showError("Please Enter Valid Number !", "");
            txtccv.requestFocus();
            return;
        }
              if(!Rules.isCardNo(cnumber)){
                  Messages.showError("Card Number Take 12 Numbers !", "");
                  txtcardno.requestFocus();
                  return;
              }
               if(!Rules.isCVV(ccv)){
                  Messages.showError("CCV Number Take 3 Numbers !", "");
                  txtccv.requestFocus();
                  return;
              }
         jTabbedPane1.setVisible(false);
        lstatus.setText("Paid");
          rbupi.setVisible(false);
        rbcdcard.setVisible(false);
    }//GEN-LAST:event_btnpay1ActionPerformed

    private void rbcdcardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbcdcardActionPerformed
         jTabbedPane1.setVisible(true);   
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_rbcdcardActionPerformed


    
    public static void main(String args[]) {
    
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
            java.util.logging.Logger.getLogger(PaymentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentForm(0,0,0,null,0,0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btncbooking;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnpay;
    private javax.swing.JButton btnpay1;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.github.lgooddatepicker.components.DatePicker expireddate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lstatus;
    private javax.swing.JRadioButton rbcdcard;
    private javax.swing.JRadioButton rbupi;
    private javax.swing.JTextField txtcardno;
    private javax.swing.JTextField txtccv;
    private javax.swing.JTextField txtflightcharges;
    private javax.swing.JPasswordField txtpassword;
    // End of variables declaration//GEN-END:variables
}
