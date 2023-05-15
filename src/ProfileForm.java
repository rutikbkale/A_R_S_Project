
import com.util.DBClass;
import com.util.Messages;
import com.util.Utility;


public class ProfileForm extends javax.swing.JFrame {

    String username,usertype;
    
    public ProfileForm(String usertype,String username) {
        initComponents();
        Utility.setBorder(this);
        DBClass.SetIcon(this);
        this.username=username;
        this.usertype=usertype;
        lusertype.setText(usertype);
        lusername.setText(username);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lusertype = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lusername = new javax.swing.JLabel();
        btnclose = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();
        btncpassword = new javax.swing.JButton();
        lprofilephoto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));

        lusertype.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        lusertype.setForeground(new java.awt.Color(243, 85, 24));
        lusertype.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(243, 85, 24));
        jLabel2.setText("Name : ");

        lusername.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        lusername.setForeground(new java.awt.Color(243, 85, 24));
        lusername.setText("jLabel1");

        btnclose.setBackground(new java.awt.Color(153, 0, 0));
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

        btnlogout.setBackground(new java.awt.Color(204, 0, 0));
        btnlogout.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        btnlogout.setForeground(new java.awt.Color(255, 255, 51));
        btnlogout.setText("LogOut");
        btnlogout.setContentAreaFilled(false);
        btnlogout.setOpaque(true);
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        btncpassword.setBackground(new java.awt.Color(204, 0, 0));
        btncpassword.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        btncpassword.setForeground(new java.awt.Color(255, 255, 51));
        btncpassword.setText("Change Password");
        btncpassword.setContentAreaFilled(false);
        btncpassword.setOpaque(true);
        btncpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncpasswordActionPerformed(evt);
            }
        });

        lprofilephoto.setBackground(new java.awt.Color(255, 153, 0));
        lprofilephoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/myprofile (2).jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lprofilephoto, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132)
                .addComponent(btnclose))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lusertype)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(69, 69, 69)
                .addComponent(lusername)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnlogout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(btncpassword)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnclose, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lprofilephoto)))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lusertype)
                    .addComponent(jLabel2)
                    .addComponent(lusername))
                .addGap(81, 81, 81)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlogout)
                    .addComponent(btncpassword))
                .addContainerGap(168, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(512, 464));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        this.dispose();
        MainForm obj = new MainForm(usertype, username);
        obj.setVisible(true);
    }//GEN-LAST:event_btncloseActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
          int s =Messages.showConfirm("Are You Want To Log Out ?","");
          if(s==0){
             this.dispose();
             MainForm o = new MainForm(usertype, username);
             o.setVisible(false);
            LoginForm obj = new LoginForm();
            obj.setVisible(true);
          }
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btncpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncpasswordActionPerformed
        this.dispose();
        ChangePassword obj = new ChangePassword(usertype,username);
        obj.setVisible(true);
        
    }//GEN-LAST:event_btncpasswordActionPerformed

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
            java.util.logging.Logger.getLogger(ProfileForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfileForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfileForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfileForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfileForm("","").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btncpassword;
    private javax.swing.JButton btnlogout;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lprofilephoto;
    private javax.swing.JLabel lusername;
    private javax.swing.JLabel lusertype;
    // End of variables declaration//GEN-END:variables
}
