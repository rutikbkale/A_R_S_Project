
import com.util.DBClass;
import com.util.Messages;
import com.util.Rules;
import com.util.Utility;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

public class AddFlightForm extends javax.swing.JFrame {

      DBClass db = new DBClass();
      ResultSet rs =null;
      String from,destination;
      DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
      DefaultComboBoxModel<String> model1 = new DefaultComboBoxModel<>();
      
    public AddFlightForm() {
        initComponents();
        Utility.setBorder(this);
        DBClass.SetIcon(this);
        txtdate.setDate(LocalDate.now());
        txtdate.addDateChangeListener(e->{    
            LocalDate birthdate = txtdate.getDate();
            LocalDate currentdate = LocalDate.now();            
            });
        btnclear.setEnabled(false);
        btnsave.setEnabled(false);
        btnback.setEnabled(false);
        SourceAirportName();
        DestinationAirportName();
    }
    
    public void SourceAirportName(){
             txtfrom.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                try {
                        model.removeAllElements();
                        rs = db.getData("select airport_name from airportname_tb where city_name = ?",txtfrom.getText());
                       while(rs.next()){
                       model.addElement(rs.getString("airport_name"));
                    }
                    cmbfromaname.setModel(model);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
    });    
}
    
    public void DestinationAirportName(){
             txtdestination.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                try {
                        model1.removeAllElements();
                        rs = db.getData("select airport_name from airportname_tb where city_name = ?",txtdestination.getText());
                       while (rs.next()) {
                       model1.addElement(rs.getString("airport_name"));
                    }
                    cmbdestinationaname.setModel(model1);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
}
    
 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnclose = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtflightid = new javax.swing.JTextField();
        txtflightname = new javax.swing.JTextField();
        txtfrom = new javax.swing.JTextField();
        txtdestination = new javax.swing.JTextField();
        txtdate = new com.github.lgooddatepicker.components.DatePicker();
        btnsave = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        btnnew = new javax.swing.JButton();
        txtatime = new com.github.lgooddatepicker.components.TimePicker();
        txtdtime = new com.github.lgooddatepicker.components.TimePicker();
        jLabel11 = new javax.swing.JLabel();
        cmbflighttype = new javax.swing.JComboBox<>();
        btnback = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txteclassseat = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtbclassseat = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtfclassseat = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txteprice = new javax.swing.JTextField();
        txtbprice = new javax.swing.JTextField();
        txtfprice = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cmbfromaname = new javax.swing.JComboBox<>();
        cmbdestinationaname = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 104));

        jPanel2.setBackground(new java.awt.Color(239, 45, 4));

        jLabel1.setText(":: Add Flights ::");
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
                .addGap(358, 358, 358)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnclose))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnclose)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel2.setText("Flight ID");
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(243, 85, 24));

        jLabel3.setText("Flight Name");
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(243, 85, 24));

        jLabel4.setText(" From");
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(243, 85, 24));

        jLabel5.setText("Destination");
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(243, 85, 24));

        jLabel6.setText("Date");
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(243, 85, 24));

        jLabel7.setText("Arrival Time");
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(243, 85, 24));

        jLabel8.setText("Departure Time");
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(243, 85, 24));

        txtflightid.setEnabled(false);
        txtflightid.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        txtflightname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        txtfrom.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        txtdestination.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

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

        btnnew.setText("New");
        btnnew.setBackground(new java.awt.Color(239, 45, 4));
        btnnew.setContentAreaFilled(false);
        btnnew.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnnew.setForeground(new java.awt.Color(255, 255, 104));
        btnnew.setOpaque(true);
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });

        jLabel11.setText("Flight Type");
        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(243, 85, 24));

        cmbflighttype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "National", "International" }));
        cmbflighttype.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

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

        jLabel9.setText("First Class ");
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(243, 85, 24));

        txteclassseat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel10.setText("Total Number Of Seats In :");
        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(243, 85, 24));

        jLabel12.setText("Business Class ");
        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(243, 85, 24));

        txtbclassseat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel13.setText("Economy Class ");
        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(243, 85, 24));

        txtfclassseat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel14.setText("Price of seats :");
        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(243, 85, 24));

        txteprice.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        txtbprice.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        txtfprice.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel15.setText("Airport Name :");
        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(243, 85, 24));

        jLabel16.setText("Airport Name :");
        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(243, 85, 24));

        cmbfromaname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cmbfromaname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        cmbdestinationaname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cmbdestinationaname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnback)
                        .addGap(124, 124, 124))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel3))
                                        .addGap(42, 42, 42)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtflightname, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbflighttype, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtflightid, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(144, 144, 144)
                                        .addComponent(txtfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6))
                                        .addGap(19, 19, 19)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtatime, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtdtime, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel10)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(btnnew))
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cmbfromaname, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel13)
                                        .addGap(30, 30, 30))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnsave)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(cmbdestinationaname, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtdestination, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(124, 124, 124)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel9)
                                                    .addComponent(jLabel12)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(141, 141, 141)
                                                .addComponent(btnclear)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtfclassseat, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtbclassseat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txteclassseat, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtfprice, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtbprice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txteprice, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel14))
                        .addGap(48, 48, 48))))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtflightid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(txtflightname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(cmbflighttype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel7)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(txtatime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtdtime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel14))
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtfrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel13)
                                .addComponent(jLabel15)
                                .addComponent(cmbfromaname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(30, 30, 30)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel12)
                                .addComponent(jLabel5)
                                .addComponent(txtdestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(33, 33, 33)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(jLabel16)
                                .addComponent(cmbdestinationaname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(txteprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(txtbprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(txtfprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txteclassseat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(txtbclassseat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(txtfclassseat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnew)
                    .addComponent(btnsave)
                    .addComponent(btnclear)
                    .addComponent(btnback))
                .addGap(37, 37, 37))
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

        setSize(new java.awt.Dimension(965, 728));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
         try {
             clearfield();
            int  nextId;
            nextId = db.getNextId("addflightinfo_tb","flightid");
            txtflightid.setText(""+nextId);
           txtflightname.requestFocus();
          btnclear.setEnabled(true);
          btnsave.setEnabled(true);
          btnback.setEnabled(true);
        } catch (SQLException ex) {
            Logger.getLogger(AddFlightForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnnewActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        String fid = txtflightid.getText();
        String fname = txtflightname.getText();
        String ftype = cmbflighttype.getSelectedItem().toString();
        String date = txtdate.getDateStringOrEmptyString();
        String arrivalt = txtatime.getText();
        String departuret = txtdtime.getText();
        String EClassSeat= txteclassseat.getText();
        String BClassSeat= txtbclassseat.getText();
        String FClassSeat= txtfclassseat.getText();
        String EClassPrice= txteprice.getText();
        String BClassPrice= txtbprice.getText();
        String FClassPrice= txtfprice.getText();
        from = txtfrom.getText();
        destination = txtdestination.getText();
        String fairportname = cmbfromaname.getSelectedItem().toString();
        String dairportname = cmbdestinationaname.getSelectedItem().toString();

        // Validation For Add Flight
         
         if(fname.isEmpty()){
            Messages.showError("Flight Name Can Not Be Empty","Error");
            txtflightname.requestFocus();
            return;     
        }
        if(!Rules.isChars(fname)){
            Messages.showError("Flight Name Only Take Characters And Spaces.", "Error");
            txtflightname.requestFocus();
            return;
        }
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
         if(arrivalt.isEmpty()){
            Messages.showError("Please Select Arrival Time ","Error");
            txtatime.requestFocus();
            return;
        }
         if(departuret.isEmpty()){
            Messages.showError("Please Select Departure Time ","Error");
            txtdtime.requestFocus();
            return;
        }
          if(EClassSeat.isEmpty()){
            Messages.showError("Please Enter Economy Class Seats","Error");
            txteclassseat.requestFocus();
            return;     
        }
        if(!Rules.isInteger(EClassSeat)){
            Messages.showError("Please Enter Valid Number of Economy Class Seats.", "Error");
            txteclassseat.requestFocus();
            return;
        }
         if(BClassSeat.isEmpty()){
            Messages.showError("Please Enter Business Class Seats","Error");
            txtbclassseat.requestFocus();
            return;     
        }
        if(!Rules.isInteger(BClassSeat)){
            Messages.showError("Please Enter Valid Number of Business Class Seats.", "Error");
            txtbclassseat.requestFocus();
            return;
        }
         if(FClassSeat.isEmpty()){
            Messages.showError("Please Enter First Class Seats","Error");
            txtfclassseat.requestFocus();
            return;     
        }
        if(!Rules.isInteger(FClassSeat)){
            Messages.showError("Please Enter Valid Number of First Class Seats.", "Error");
            txtfclassseat.requestFocus();
            return;
        }
        if(EClassPrice.isEmpty()){
            Messages.showError("Please Enter Economy Class Price","Error");
            txteprice.requestFocus();
            return;     
        }
        if(!Rules.isInteger(EClassPrice)){
            Messages.showError("Please Enter Valid Number of Economy Class Price.", "Error");
            txteprice.requestFocus();
            return;
        }
        if(BClassPrice.isEmpty()){
            Messages.showError("Please Enter Business Class Price","Error");
            txtbprice.requestFocus();
            return;     
        }
        if(!Rules.isInteger(BClassPrice)){
            Messages.showError("Please Enter Valid Number of Business Class Price.", "Error");
            txtbprice.requestFocus();
            return;
        }
        if(FClassPrice.isEmpty()){
            Messages.showError("Please Enter First Class Price","Error");
            txtfprice.requestFocus();
            return;     
        }
        if(!Rules.isInteger(FClassPrice)){
            Messages.showError("Please Enter Valid Number of First Class Price.", "Error");
            txtfprice.requestFocus();
            return;
        }
        
         db.execute("insert into addflightinfo_tb values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)",fid,fname,ftype,from,fairportname,destination,dairportname,date,arrivalt,departuret,EClassSeat,BClassSeat,FClassSeat,EClassPrice,BClassPrice,FClassPrice);
        Messages.showInfo("Flight Information Added Successfully.", "Success");
        clearfield();
       
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
       clearfield();
      
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
       
        this.dispose();
        MainForm obj = new MainForm("","");
        obj.setVisible(true);
    }//GEN-LAST:event_btnbackActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        dispose();
    }//GEN-LAST:event_btncloseActionPerformed

    public void clearfield(){
        model.removeAllElements();
        model1.removeAllElements();
        txtflightid.setText("");
        txtflightname.setText("");
        cmbflighttype.setSelectedIndex(0);
        txtfrom.setText("");
        txtdestination.setText("");
        txtdate.setDateToToday();
        txtatime.setText("");
        txtdtime.setText("");
        txteclassseat.setText("");
        txtbclassseat.setText("");
        txtfclassseat.setText("");
        txteprice.setText("");
        txtbprice.setText("");
        txtfprice.setText("");
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddFlightForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddFlightForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddFlightForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddFlightForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddFlightForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnnew;
    private javax.swing.JButton btnsave;
    private javax.swing.JComboBox<String> cmbdestinationaname;
    private javax.swing.JComboBox<String> cmbflighttype;
    private javax.swing.JComboBox<String> cmbfromaname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.github.lgooddatepicker.components.TimePicker txtatime;
    private javax.swing.JTextField txtbclassseat;
    private javax.swing.JTextField txtbprice;
    private com.github.lgooddatepicker.components.DatePicker txtdate;
    private javax.swing.JTextField txtdestination;
    private com.github.lgooddatepicker.components.TimePicker txtdtime;
    private javax.swing.JTextField txteclassseat;
    private javax.swing.JTextField txteprice;
    private javax.swing.JTextField txtfclassseat;
    private javax.swing.JTextField txtflightid;
    private javax.swing.JTextField txtflightname;
    private javax.swing.JTextField txtfprice;
    private javax.swing.JTextField txtfrom;
    // End of variables declaration//GEN-END:variables
}
