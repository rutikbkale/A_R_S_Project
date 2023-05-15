
import com.util.DBClass;
import com.util.Messages;
import com.util.Rules;
import com.util.Utility;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class FlightSearch extends javax.swing.JFrame {

    DBClass db = new DBClass();
    Connection con = null;
    Statement st = null;
    DefaultTableModel model =null;
     int flight_id,pass_id;
     
     public FlightSearch(int pass_id) {
        try {
            initComponents();
             Utility.setBorder(this);
             DBClass.SetIcon(this);
            this.pass_id=pass_id;
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline", "root", "12345");
            db.fillTable(FlightTable,"select * from PassengerFlightView");
        } catch (SQLException ex) {
            Logger.getLogger(FlightSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnclose = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        cmbflighttype = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtfrom = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtdestination = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtdate = new com.github.lgooddatepicker.components.DatePicker();
        jScrollPane1 = new javax.swing.JScrollPane();
        FlightTable = new javax.swing.JTable();
        btnsearch = new javax.swing.JButton();
        btnyflights = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 104));

        jPanel2.setBackground(new java.awt.Color(239, 45, 4));

        jLabel1.setText(":: Flight Search ::");
        jLabel1.setBackground(new java.awt.Color(255, 255, 104));
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(179, 179, 179)
                .addComponent(btnclose))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnclose)
                .addGap(0, 50, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel11.setText("Flight Type");
        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(243, 85, 24));

        cmbflighttype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "National", "International", " ", " " }));
        cmbflighttype.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel4.setText(" From");
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(243, 85, 24));

        txtfrom.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel5.setText("Destination");
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(243, 85, 24));

        txtdestination.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel6.setText("Date");
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(243, 85, 24));

        FlightTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "", "Title 3", "Title 4"
            }
        ));
        FlightTable.setBackground(new java.awt.Color(0, 204, 204));
        FlightTable.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        FlightTable.setGridColor(new java.awt.Color(0, 0, 0));
        FlightTable.setRowHeight(25);
        FlightTable.setSelectionForeground(new java.awt.Color(51, 0, 255));
        FlightTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FlightTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(FlightTable);

        btnsearch.setText("Search");
        btnsearch.setBackground(new java.awt.Color(239, 45, 4));
        btnsearch.setContentAreaFilled(false);
        btnsearch.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnsearch.setForeground(new java.awt.Color(255, 255, 104));
        btnsearch.setOpaque(true);
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        btnyflights.setText("Your Booked Flights");
        btnyflights.setBackground(new java.awt.Color(239, 45, 4));
        btnyflights.setContentAreaFilled(false);
        btnyflights.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnyflights.setForeground(new java.awt.Color(255, 255, 104));
        btnyflights.setOpaque(true);
        btnyflights.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnyflightsActionPerformed(evt);
            }
        });

        btnlogout.setBackground(new java.awt.Color(239, 45, 4));
        btnlogout.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnlogout.setForeground(new java.awt.Color(255, 255, 104));
        btnlogout.setText("Log Out");
        btnlogout.setContentAreaFilled(false);
        btnlogout.setOpaque(true);
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbflighttype, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdestination, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnyflights)
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(cmbflighttype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtfrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtdestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(btnsearch)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnyflights)
                    .addComponent(btnlogout))
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(723, 736));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        
        try {
            String ftype = cmbflighttype.getSelectedItem().toString();
            String from = txtfrom.getText();
            String destination = txtdestination.getText();
            String date = txtdate.getDateStringOrEmptyString();
            
            if(from.isEmpty()){
                Messages.showError("From City Can Not Be Empty","Error");
                txtfrom.requestFocus();
                return;
            }
            if(!Rules.isChars(from)){
                Messages.showError("From City Only Take Characters And Spaces.", "Error");
                txtfrom.requestFocus();
                return;
            }
            if(destination.isEmpty()){
                Messages.showError("Destination City Can Not Be Empty","Error");
                txtdestination.requestFocus();
                return;
            }
            if(!Rules.isChars(destination)){
                Messages.showError("Destination City Only Take Characters And Spaces.", "Error");
                txtdestination.requestFocus();
                return;
            }
            if(date.isEmpty()){
                Messages.showError("Please Select Date ","Error");
                txtdate.requestFocus();
                return;
            }           
            st=con.createStatement();
            String query;
            query = "SELECT * FROM addflightinfo_tb WHERE flighttype LIKE '%" + ftype + "%' AND from1 LIKE '%" + from + "%' AND destination LIKE '%" + destination + "%' AND date LIKE '%" + date + "%'";
            ResultSet rs = st.executeQuery(query);
             if(rs.next()){
            String[] columnNames = {"Flight Id","Flight Name","Flight Type", "From", "Destination", "Date","Arrival Time","Departure Time"};
            model= new DefaultTableModel(columnNames, 0);
            do {
            String flightType = rs.getString("flighttype");
            String from1 = rs.getString("from1");
            String destination1 = rs.getString("destination");
            String date1 = rs.getString("date");
            flight_id = rs.getInt("FlightId");
            String flightName=rs.getString("flightname");
            String Arrival= rs.getString("arrivaltime");
            String Departure = rs.getString ("departuretime");
            model.addRow(  new Object[]{flight_id,flightName,flightType, from1, destination1, date1,Arrival,Departure});
            }while (rs.next());
            FlightTable.setModel(model);                 
        }
            else{
                Messages.showError("This flight is not available !", "");
               db.fillTable(FlightTable,"select * from PassengerFlightView");
            }  
        }
        catch (SQLException ex) {
            Logger.getLogger(FlightSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnsearchActionPerformed


    private void FlightTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FlightTableMouseClicked
            int row = FlightTable.getSelectedRow();
            int data = (int)FlightTable.getValueAt(row, 0);
        
           FlightInformation   obj = new FlightInformation(data,pass_id);              
           this.dispose();
           obj.setVisible(true);
    }//GEN-LAST:event_FlightTableMouseClicked

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        dispose();
    }//GEN-LAST:event_btncloseActionPerformed

    private void btnyflightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnyflightsActionPerformed
           this.dispose();
           CancelTicketForm obj = new CancelTicketForm(pass_id, flight_id);
            obj.setVisible(true);
    }//GEN-LAST:event_btnyflightsActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
            int s = Messages.showConfirm("Are You Want To Log Out ?","");
            if(s==0){
                this.dispose();
                LoginForm obj = new LoginForm();
                obj.setVisible(true);
            }
    }//GEN-LAST:event_btnlogoutActionPerformed

   
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
            java.util.logging.Logger.getLogger(FlightSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FlightSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FlightSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FlightSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
               java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FlightSearch(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable FlightTable;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnyflights;
    private javax.swing.JComboBox<String> cmbflighttype;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.github.lgooddatepicker.components.DatePicker txtdate;
    private javax.swing.JTextField txtdestination;
    private javax.swing.JTextField txtfrom;
    // End of variables declaration//GEN-END:variables
}
