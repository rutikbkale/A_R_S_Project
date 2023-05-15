import com.util.DBClass;
import com.util.Messages;
import com.util.Rules;
import com.util.Utility;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class PassengerDetail extends javax.swing.JFrame {

     DBClass db = new DBClass();
     ResultSet rs = null;
     String path=null;
     byte [] userimage=null;
     ImageIcon imageIcon=null;
     File pic = null;
     String cid  ;
     int pass_id,data,flight_id;
      String seatType ;
     
    public PassengerDetail(int data, int flight_id,int pass_id, String seatType ) {
        initComponents();
         Utility.setBorder(this);
         DBClass.SetIcon(this);
        this.data=data;
        this.pass_id=pass_id;
        this.flight_id=flight_id;
        this.seatType=seatType;
        txtflightid.setText(flight_id+"");
        txtseatno.setText(""+data);
        txtpid.setText(""+pass_id);
        txtflighttype.setText(""+seatType);
        dob.setDate(LocalDate.now().minusYears(23));
        dob.addDateChangeListener(e->{    
            LocalDate birthdate = dob.getDate();
            LocalDate currentdate = LocalDate.now();            
            Period p = Period.between(birthdate, currentdate);
            int age = p.getYears();
            txtage.setText(age+"");            
        });
    }
   
    public  void setData(){
         try {
             rs=db.getData("select * from passregistration_tb where pass_id="+pass_id);
             while(rs.next()){
                 txtpid.setText(""+pass_id);
             }
         } catch (SQLException ex) {
             Logger.getLogger(PassengerDetail.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnclose = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtpid = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtpname = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtage = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        dob = new com.github.lgooddatepicker.components.DatePicker();
        jLabel17 = new javax.swing.JLabel();
        rbmale = new javax.swing.JRadioButton();
        rbfemale = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        txtcontactno = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtpassportid = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lphoto = new javax.swing.JLabel();
        btnbrowse = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaddress = new javax.swing.JTextArea();
        btnback = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        txtseatno = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtflightid = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtflighttype = new javax.swing.JTextField();

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 104));

        jPanel2.setBackground(new java.awt.Color(239, 45, 4));

        jLabel1.setText(":: Passenger Details ::");
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
                .addGap(180, 180, 180)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnclose))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnclose)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel12.setText("Passenger ID");
        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(243, 85, 24));

        txtpid.setEnabled(false);
        txtpid.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel13.setText("Passenger Name");
        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(243, 85, 24));

        txtpname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel14.setText("Age");
        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(243, 85, 24));

        txtage.setEnabled(false);
        txtage.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel15.setText("Address");
        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(243, 85, 24));

        jLabel16.setText("Date Of Birth");
        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(243, 85, 24));

        jLabel17.setText("Gender");
        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(243, 85, 24));

        buttonGroup1.add(rbmale);
        rbmale.setText("Male");
        rbmale.setBackground(new java.awt.Color(255, 255, 104));
        rbmale.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rbmale.setForeground(new java.awt.Color(243, 85, 24));

        buttonGroup1.add(rbfemale);
        rbfemale.setText("Female");
        rbfemale.setBackground(new java.awt.Color(255, 255, 104));
        rbfemale.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rbfemale.setForeground(new java.awt.Color(243, 85, 24));

        jLabel18.setText("Contact No");
        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(243, 85, 24));

        txtcontactno.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel19.setText("Passport ID");
        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(243, 85, 24));

        txtpassportid.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel20.setText("Upload Photo");
        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(243, 85, 24));

        jPanel3.setPreferredSize(new java.awt.Dimension(150, 165));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lphoto, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lphoto, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
        );

        btnbrowse.setText("Browse");
        btnbrowse.setBackground(new java.awt.Color(239, 45, 4));
        btnbrowse.setContentAreaFilled(false);
        btnbrowse.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnbrowse.setForeground(new java.awt.Color(255, 255, 104));
        btnbrowse.setOpaque(true);
        btnbrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbrowseActionPerformed(evt);
            }
        });

        btnsave.setText("Save");
        btnsave.setBackground(new java.awt.Color(239, 45, 4));
        btnsave.setContentAreaFilled(false);
        btnsave.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnsave.setForeground(new java.awt.Color(255, 255, 104));
        btnsave.setOpaque(true);
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        btnclear.setText("Clear");
        btnclear.setBackground(new java.awt.Color(239, 45, 4));
        btnclear.setContentAreaFilled(false);
        btnclear.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnclear.setForeground(new java.awt.Color(255, 255, 104));
        btnclear.setOpaque(true);
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        txtaddress.setColumns(20);
        txtaddress.setRows(5);
        txtaddress.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jScrollPane1.setViewportView(txtaddress);

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

        jLabel21.setText("Seat No");
        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(243, 85, 24));

        txtseatno.setEnabled(false);
        txtseatno.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel22.setText("Flight ID");
        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(243, 85, 24));

        txtflightid.setEnabled(false);
        txtflightid.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel23.setText("Seat Type");
        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(243, 85, 24));

        txtflighttype.setEnabled(false);
        txtflighttype.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnback)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnsave)
                                .addGap(159, 159, 159))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(113, 113, 113)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel14)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel16)
                                                    .addComponent(jLabel17)
                                                    .addComponent(jLabel18)
                                                    .addComponent(jLabel19))
                                                .addGap(64, 64, 64)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtpassportid)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(rbmale)
                                                        .addGap(41, 41, 41)
                                                        .addComponent(rbfemale))
                                                    .addComponent(txtpname)
                                                    .addComponent(dob, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(txtcontactno)
                                                    .addComponent(txtpid, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jLabel13)
                                            .addComponent(txtage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(47, 47, 47)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel22)
                                            .addComponent(jLabel21)
                                            .addComponent(jLabel23))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtflightid, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnclear)
                            .addComponent(btnbrowse)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtflighttype, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtseatno, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)))
                .addGap(33, 33, 33))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtpid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtpname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(rbmale)
                    .addComponent(rbfemale)
                    .addComponent(txtflightid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtcontactno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtseatno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtflighttype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel23))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(txtpassportid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsave)
                    .addComponent(btnclear)
                    .addComponent(btnback))
                .addGap(43, 43, 43))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 780));

        setSize(new java.awt.Dimension(758, 781));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnbrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbrowseActionPerformed
       try {
        JFileChooser picchose = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files", "jpg", "jpeg", "png", "gif", "bmp");
        picchose.addChoosableFileFilter(filter);
        int result = picchose.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            pic = picchose.getSelectedFile();
            path = pic.getAbsolutePath();
            BufferedImage img = ImageIO.read(pic);
            if (img != null) {
                imageIcon = new ImageIcon(img.getScaledInstance(150, 165, Image.SCALE_DEFAULT));
                lphoto.setIcon(imageIcon);
            } else {
               Messages.showError("Invalid file type", "Error");
            }
        } 
    } catch (IOException ex) {
        Logger.getLogger(PassengerDetail.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnbrowseActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
            txtpid.setText("");
            txtaddress.setText("");
            txtcontactno.setText("");
            txtage.setText("");
            txtpassportid.setText("");
            txtpname.setText("");
            buttonGroup1.clearSelection();
            dob.setDateToToday();
            lphoto.setIcon(null);
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        
        String cname = txtpname.getText();
        String caddress = txtaddress.getText();
        String cdob = dob.getDateStringOrEmptyString();
        String cage = txtage.getText();
         String gender ="";
        if(rbmale.isSelected()){       
            gender = rbmale.getText();
        }
        else{        
            gender=rbfemale.getText();
        }
        String contactno = txtcontactno.getText();
        String passportid = txtpassportid.getText();
        
        // Validation for Passenger Details frame
        
        if(cname.isEmpty()){
            Messages.showError("Name Can Not Be Empty","Error");
            txtpname.requestFocus();
            return;     
        }
        if(!Rules.isChars(cname)){
            Messages.showError("Name Only Take Characters And Spaces.", "Error");
            txtpname.requestFocus();
            return;
        }
         if(caddress.isEmpty()){
            Messages.showError("Address Can Not Be Empty","Error");
            txtaddress.requestFocus();
            return;
        }
          if(cdob.isEmpty()){
            Messages.showError("Birth Date Can Not Be Empty","Error");
            dob.requestFocus();
            return;
        }
           if(cage.isEmpty()){
            Messages.showError("Age Can Not Be Empty","Error");
             dob.requestFocus();
            return;
        }
           if(!rbmale.isSelected() && !rbfemale.isSelected()){
                Messages.showError("Please Select Gender.", "Error");
                return;
            }
            if(contactno.isEmpty()){
            Messages.showError("Mobile No Can Not Be Empty","Error");
            txtcontactno.requestFocus();
            return;
        }
         if(!Rules.isMobile(contactno)){
            Messages.showError("Mobile No Only Take 10 Numbers.", "Error");
            txtcontactno.requestFocus();
            return;
        }
          if(passportid.isEmpty()){
            Messages.showError("Passport ID Can Not Be Empty","Error");
            txtpassportid.requestFocus();
            return;
        }
          if(!Rules.isPassportid(passportid)){
              Messages.showError("Invalid Passport ID","Error");
              txtpassportid.requestFocus();
              return;
          } 
          db.execute("insert into passengerdetails values(?,?,?,?,?,?,?,?,?,?,?,?)",pass_id, cname,caddress,cdob,cage,gender,contactno,passportid,pic,data,seatType,flight_id );
    //db.execute("update passengerdetails set pass_name=?,pass_address=?,pass_date=?,pass_age=?,pass_gender=?,pass_contact=?,pass_passportid=?,pass_photo=? where pass_id=?", cname,caddress,cdob,cage,gender,contactno,passportid,pic,cid);
    Messages.showInfo("Passenger Information Added Successfully..","");
    this.dispose();
    TicketBookingForm obj = new TicketBookingForm(pass_id,flight_id,data,imageIcon);
    obj.setVisible(true);
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        this.dispose();
        FlightSearch obj = new FlightSearch(pass_id);
        obj.setVisible(true);
    }//GEN-LAST:event_btnbackActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PassengerDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PassengerDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PassengerDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PassengerDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PassengerDetail(1,0,0,"").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnbrowse;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnsave;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.github.lgooddatepicker.components.DatePicker dob;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lphoto;
    private javax.swing.JRadioButton rbfemale;
    private javax.swing.JRadioButton rbmale;
    private javax.swing.JTextArea txtaddress;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtcontactno;
    private javax.swing.JTextField txtflightid;
    private javax.swing.JTextField txtflighttype;
    private javax.swing.JTextField txtpassportid;
    private javax.swing.JTextField txtpid;
    private javax.swing.JTextField txtpname;
    private javax.swing.JTextField txtseatno;
    // End of variables declaration//GEN-END:variables
}
