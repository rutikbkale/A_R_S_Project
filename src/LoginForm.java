import com.util.DBClass;
import com.util.Messages;
import com.util.Utility;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginForm extends javax.swing.JFrame {

    DBClass db = new DBClass();
    ResultSet rs = null;
    
     public LoginForm() {
        initComponents();
        Utility.setBorder(this);
        DBClass.SetIcon(this);
        }
     
    
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbusertype = new javax.swing.JComboBox<>();
        txtusername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        btnregister = new javax.swing.JButton();
        btnlogin = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login Form");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("UserType");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("UserName");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        cmbusertype.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        cmbusertype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Passenger", "Admin", "Employee" }));
        getContentPane().add(cmbusertype, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 180, -1));

        txtusername.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        getContentPane().add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 180, -1));

        txtpassword.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        getContentPane().add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 180, -1));

        btnregister.setBackground(new java.awt.Color(239, 45, 4));
        btnregister.setFont(new java.awt.Font("Times New Roman", 1, 33)); // NOI18N
        btnregister.setForeground(new java.awt.Color(255, 255, 255));
        btnregister.setText("Register");
        btnregister.setContentAreaFilled(false);
        btnregister.setOpaque(true);
        btnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregisterActionPerformed(evt);
            }
        });
        getContentPane().add(btnregister, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, -1, -1));

        btnlogin.setBackground(new java.awt.Color(239, 45, 4));
        btnlogin.setFont(new java.awt.Font("Times New Roman", 1, 33)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(255, 255, 255));
        btnlogin.setText("Login");
        btnlogin.setContentAreaFilled(false);
        btnlogin.setOpaque(true);
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, -1, -1));

        btnclose.setBackground(new java.awt.Color(255, 0, 0));
        btnclose.setFont(new java.awt.Font("Times New Roman", 1, 33)); // NOI18N
        btnclose.setForeground(new java.awt.Color(255, 255, 255));
        btnclose.setText("X");
        btnclose.setContentAreaFilled(false);
        btnclose.setOpaque(true);
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });
        getContentPane().add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/AiroplanImage.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 450));

        setSize(new java.awt.Dimension(669, 452));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        String username = txtusername.getText();
        String password = txtpassword.getText();
        String emp = "Employee";
        String add = "Admin";
        
         if(cmbusertype.getSelectedItem().equals(add)){
            try {
                rs = db.getData("select * from adminlogin_tb where username = ? and password = ?", username,password);
                    if(rs.next()){
                    this.dispose();
                    MainForm obj = new MainForm(add,username);
                    obj.setVisible(true);
                    
                }
                else{
                    Messages.showError("Login Failed !", "Error");
                }
            } catch (SQLException ex) {
                Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(cmbusertype.getSelectedItem().equals(emp)){
            try {
               rs = db.getData("select emp_username and emp_password from empregistration_tb where emp_username = ? and emp_password = ?", username,password);
                if(rs.next()){
                    this.dispose();
                    MainForm obj = new MainForm(emp,username);
                    obj.setVisible(true);
                }
                else{
                    Messages.showError("Login Failed !", "Error");
                }
            } catch (SQLException ex) {Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            try {
                 rs = db.getData("select pass_id ,pass_username ,pass_password from passregistration_tb where pass_username = ? and pass_password = ?", username,password);
                if(rs.next()){
                     this.dispose();
                     FlightSearch obj = new FlightSearch(rs.getInt("pass_id"));
                     obj.setVisible(true);
                }
                else{
                    Messages.showError("Login Failed !", "Error");
                }
            } catch (SQLException ex) {
                Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnloginActionPerformed

    private void btnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregisterActionPerformed
        this.dispose();
        PassengerRegistration obj = new PassengerRegistration();
        obj.setVisible(true);
    }//GEN-LAST:event_btnregisterActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        dispose();
    }//GEN-LAST:event_btncloseActionPerformed

   
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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnregister;
    private javax.swing.JComboBox<String> cmbusertype;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
