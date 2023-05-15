
import com.util.DBClass;
import com.util.Messages;
import com.util.Utility;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ChangePassword extends javax.swing.JFrame {

    String usertype,username;
    DBClass db = new DBClass();
    ResultSet rs;
    
    public ChangePassword(String usertype,String username) {
        initComponents();
        Utility.setBorder(this);
        DBClass.SetIcon(this);
        this.usertype=usertype;
        this.username=username;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lusertype = new javax.swing.JLabel();
        lusertype1 = new javax.swing.JLabel();
        lusertype2 = new javax.swing.JLabel();
        txtoldpass = new javax.swing.JPasswordField();
        txtcpass = new javax.swing.JPasswordField();
        txtnewpass = new javax.swing.JTextField();
        btnback = new javax.swing.JButton();
        btnchange = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 104));

        lusertype.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        lusertype.setForeground(new java.awt.Color(243, 85, 24));
        lusertype.setText("Old Password : ");

        lusertype1.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        lusertype1.setForeground(new java.awt.Color(243, 85, 24));
        lusertype1.setText("New Password : ");

        lusertype2.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        lusertype2.setForeground(new java.awt.Color(243, 85, 24));
        lusertype2.setText("Confirm Password : ");

        txtoldpass.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        txtcpass.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        txtnewpass.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        btnback.setBackground(new java.awt.Color(243, 85, 24));
        btnback.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnback.setForeground(new java.awt.Color(255, 255, 104));
        btnback.setText("Back");
        btnback.setContentAreaFilled(false);
        btnback.setOpaque(true);
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        btnchange.setBackground(new java.awt.Color(243, 85, 24));
        btnchange.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnchange.setForeground(new java.awt.Color(255, 255, 104));
        btnchange.setText("Change");
        btnchange.setContentAreaFilled(false);
        btnchange.setOpaque(true);
        btnchange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchangeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lusertype)
                            .addComponent(lusertype2)
                            .addComponent(lusertype1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnback)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnchange)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtoldpass, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                        .addComponent(txtnewpass)
                        .addComponent(txtcpass)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lusertype)
                    .addComponent(txtoldpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lusertype1)
                    .addComponent(txtnewpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lusertype2)
                    .addComponent(txtcpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnback)
                    .addComponent(btnchange))
                .addContainerGap(35, Short.MAX_VALUE))
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

        setSize(new java.awt.Dimension(424, 258));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
            this.dispose();
            ProfileForm obj = new ProfileForm(usertype,username);
            obj.setVisible(true);
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnchangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchangeActionPerformed
            String oldpaas = txtoldpass.getText();
            String newpass = txtnewpass.getText();
            String confirmpass = txtcpass.getText();
            
            if(usertype.equals("Admin")){
                try {
                    rs=db.getData("select password from adminlogin_tb where password = ?", oldpaas);
                    if(rs.next()){
                        if(newpass.equals("")){
                            Messages.showError("New Password Field Can Not Be Empty !", "");
                            txtnewpass.requestFocus();
                            return;
                        }
                        if(!confirmpass.equals(newpass)){
                             Messages.showError("Please Confirm Password !", "");
                             txtcpass.requestFocus();
                             return;
                        }
                        db.execute("update adminlogin_tb set password = ? where password="+oldpaas+"",confirmpass);
                        Messages.showInfo("Your Password Is Changed Successfully ...", "");
                        this.dispose();
                        LoginForm obj = new LoginForm();
                        obj.setVisible(true);
                    }
                    else{
                        Messages.showError("Please Enter Valid Password !","");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ChangePassword.class.getName()).log(Level.SEVERE, null, ex);
                }
            }else{
                try {
                    rs=db.getData("select emp_password from empregistration_tb where emp_password = ?", oldpaas);
                    if(rs.next()){
                        if(newpass.equals("")){
                            Messages.showError("New Password Field Can Not Be Empty !", "");
                            txtnewpass.requestFocus();
                            return;
                        }
                        if(!confirmpass.equals(newpass)){
                             Messages.showError("Please Confirm Password !", "");
                             txtcpass.requestFocus();
                             return;
                        }
                        db.execute("update empregistration_tb set emp_password = ? where emp_password="+oldpaas+"",confirmpass);
                        Messages.showInfo("Your Password Is Changed Successfully ...", "");
                        this.dispose();
                        LoginForm obj = new LoginForm();
                        obj.setVisible(true);
                    }
                    else{
                        Messages.showError("Please Enter Valid Password !","");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(ChangePassword.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            }
    }//GEN-LAST:event_btnchangeActionPerformed

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
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePassword(null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnchange;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lusertype;
    private javax.swing.JLabel lusertype1;
    private javax.swing.JLabel lusertype2;
    private javax.swing.JPasswordField txtcpass;
    private javax.swing.JTextField txtnewpass;
    private javax.swing.JPasswordField txtoldpass;
    // End of variables declaration//GEN-END:variables
}
