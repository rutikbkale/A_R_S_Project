
import com.util.DBClass;
import com.util.Messages;
import com.util.Rules;
import com.util.Utility;
import javax.swing.table.DefaultTableModel;


public class SearchEmployee extends javax.swing.JFrame {
    
    DBClass db = new DBClass();

    public SearchEmployee() {
        initComponents();
         Utility.setBorder(this);
         DBClass.SetIcon(this);
        db.enableSearch(EmpTable, "select emp_id,emp_name,emp_address,emp_mobileno,emp_username from empregistration_tb" , cmbtsearch, txtsearch);
        db.fillTable(EmpTable, "select emp_id,emp_name,emp_address,emp_mobileno,emp_username from empregistration_tb");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnclose = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cmbtsearch = new javax.swing.JComboBox<>();
        txtsearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmpTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txtuserid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaddress = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        txtmobileno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        btnback = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 104));

        jPanel2.setBackground(new java.awt.Color(239, 45, 4));

        jLabel1.setText(":: Search Employee ::");
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
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
                .addGap(189, 189, 189)
                .addComponent(btnclose))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(109, 109, 109))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnclose)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel3.setText("Search By :");
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(243, 85, 24));

        cmbtsearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "emp_id", "emp_name" }));
        cmbtsearch.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        txtsearch.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        EmpTable.setBackground(new java.awt.Color(0, 204, 204));
        EmpTable.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        EmpTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        EmpTable.setRowHeight(25);
        EmpTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmpTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(EmpTable);

        jLabel5.setText("Employee ID");
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(243, 85, 24));

        txtuserid.setEnabled(false);
        txtuserid.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N

        jLabel2.setText("Name");
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(243, 85, 24));

        txtname.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N

        jLabel4.setText("Address");
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(243, 85, 24));

        txtaddress.setColumns(20);
        txtaddress.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        txtaddress.setRows(5);
        jScrollPane2.setViewportView(txtaddress);

        jLabel6.setText("Mobile No ");
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(243, 85, 24));

        txtmobileno.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N

        jLabel7.setText("Username ");
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(243, 85, 24));

        txtuser.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N

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

        btnedit.setText("Edit");
        btnedit.setBackground(new java.awt.Color(239, 45, 4));
        btnedit.setContentAreaFilled(false);
        btnedit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnedit.setForeground(new java.awt.Color(255, 255, 104));
        btnedit.setOpaque(true);
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btndelete.setText("Delete");
        btndelete.setBackground(new java.awt.Color(239, 45, 4));
        btndelete.setContentAreaFilled(false);
        btndelete.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 104));
        btndelete.setOpaque(true);
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(91, 91, 91)
                        .addComponent(cmbtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(btnback)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnedit)
                .addGap(193, 193, 193)
                .addComponent(btndelete)
                .addGap(136, 136, 136))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtuserid, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtmobileno, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(66, 66, 66)
                                .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 461, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtuserid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtmobileno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel4))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnback)
                    .addComponent(btnedit)
                    .addComponent(btndelete))
                .addGap(35, 35, 35))
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

        setSize(new java.awt.Dimension(856, 719));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EmpTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmpTableMouseClicked
        int rowIndex = EmpTable.getSelectedRow();
        if (rowIndex == -1) {
            Messages.showError("Please Select a Record!", "Error");
            return;
        }
        else{
            DefaultTableModel model = (DefaultTableModel) EmpTable.getModel();
            String empid = model.getValueAt(rowIndex, 0).toString();
            String empname = model.getValueAt(rowIndex, 1).toString();
            String empaddress = model.getValueAt(rowIndex, 2).toString();
            String empmobileno = model.getValueAt(rowIndex, 3).toString();
            String empusername = model.getValueAt(rowIndex, 4).toString();
           
            txtuserid.setText(empid);
            txtname.setText(empname);
            txtaddress.setText(empaddress);
            txtmobileno.setText(empmobileno);
            txtuser.setText(empusername);
            
        }
    }//GEN-LAST:event_EmpTableMouseClicked

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
       this.dispose();
       MainForm obj = new MainForm("","");
       obj.setVisible(true);
    }//GEN-LAST:event_btnbackActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        int i = EmpTable.getSelectedRow();
        if(i==-1){
            Messages.showError("Please Select Record !", "Error");
        }
        else{
        String empid=txtuserid.getText();
        String empname=txtname.getText();
        String empaddress=txtaddress.getText();
        String empmobileno=txtmobileno.getText();
        String empusername=txtuser.getText();
         if(empname.isEmpty()){
            Messages.showError("Name Can Not Be Empty","Error");
            txtname.requestFocus();
            return;     
        }
        if(!Rules.isChars(empname)){
            Messages.showError("Name Only Take Characters And Spaces.", "Error");
            txtname.requestFocus();
            return;
        }
         if(empaddress.isEmpty()){
            Messages.showError("Address Can Not Be Empty","Error");
            txtaddress.requestFocus();
            return;
        }
         if(empmobileno.isEmpty()){
            Messages.showError("Mobile No Can Not Be Empty","Error");
            txtmobileno.requestFocus();
            return;
        }
         if(!Rules.isMobile(empmobileno)){
            Messages.showError("Mobile No Only Take 10 Numbers.", "Error");
            txtmobileno.requestFocus();
            return;
        }
          if(empusername.isEmpty()){
            Messages.showError("UserName Can Not Be Empty","Error");
            txtuser.requestFocus();
            return;
        }
        if(!Rules.isChars(empusername)){
            Messages.showError("UserName Only Take Characters And Spaces.", "Error");
            txtuser.requestFocus();
            return;
        }
        db.execute("update empregistration_tb set emp_name=?,emp_address=?,emp_mobileno=?,emp_username=? where emp_id=?", empname,empaddress,empmobileno,empusername,empid);
        db.fillTable(EmpTable, "select emp_id,emp_name,emp_address,emp_mobileno,emp_username from empregistration_tb");
        Messages.showInfo("Employee Information Edited Successfully ... ", "");
        Clearfield();
      }
    }//GEN-LAST:event_btneditActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
         int rowIndex = EmpTable.getSelectedRow();
        if (rowIndex == -1) {
            Messages.showError("Please Select a Record!", "Error");
            return;
        }
        else{
            int s =Messages.showConfirm("Are You Want To Delete The Employee Details ?", "Error");
            if(s==0){
                Object fid = EmpTable.getValueAt(rowIndex, 0);
                db.execute("delete from empregistration_tb where emp_id = ?",fid);
                Messages.showInfo("Record Deleted Successfully...", "Error");
                db.fillTable(EmpTable,"select * from empregistration_tb");
                Clearfield();
            }
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    void Clearfield(){
        txtuserid.setText("");
        txtname.setText("");
        txtuser.setText("");
        txtaddress.setText("");
        txtmobileno.setText("");
    }
    
    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
 this.dispose();
    }//GEN-LAST:event_btncloseActionPerformed

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
            java.util.logging.Logger.getLogger(SearchEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable EmpTable;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JComboBox<String> cmbtsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtaddress;
    private javax.swing.JTextField txtmobileno;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtuser;
    private javax.swing.JTextField txtuserid;
    // End of variables declaration//GEN-END:variables
}
