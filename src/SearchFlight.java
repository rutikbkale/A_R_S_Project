
import com.util.DBClass;
import com.util.Messages;
import com.util.Rules;
import com.util.Utility;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class SearchFlight extends javax.swing.JFrame {

    DBClass db = new DBClass();
    ResultSet rs = null;
    int pass_id;
    DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
    DefaultComboBoxModel<String> model1=  new DefaultComboBoxModel<>();
    
    public SearchFlight(int pass_id) {
        initComponents();
         Utility.setBorder(this);
         DBClass.SetIcon(this);
        this.pass_id=pass_id;
        db.fillTable(FlightTable, "select * from addflightinfo_tb");
        db.enableSearch(FlightTable, "select * from addflightinfo_tb ", cmbtsearch, txtsearch);
        SourceAirportName();
        DestinationAirportName();
    }

    void fillcombo(String City){
             try {
                        model.removeAllElements();
                       rs = db.getData("select airport_name from airportname_tb where city_name = ?",City);
                       while(rs.next()){
                       model.addElement(rs.getString("airport_name"));
                       cmbfromaname.setModel(model);
               }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }         
    }
    
        void fillcombo1(String City){
             try {
                        model1.removeAllElements();
                       rs = db.getData("select airport_name from airportname_tb where city_name = ?",City);
                       while(rs.next()){
                       model1.addElement(rs.getString("airport_name"));
                       cmbdestinationaname.setModel(model1);
               }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }         
    }
    
     public void SourceAirportName(){
             txtfrom.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                try {
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
        jLabel3 = new javax.swing.JLabel();
        cmbtsearch = new javax.swing.JComboBox<>();
        txtsearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        FlightTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtflightid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtflightname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cmbflighttype = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtfrom = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtdestination = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtdate = new com.github.lgooddatepicker.components.DatePicker();
        jLabel8 = new javax.swing.JLabel();
        txtatime = new com.github.lgooddatepicker.components.TimePicker();
        jLabel9 = new javax.swing.JLabel();
        txtdtime = new com.github.lgooddatepicker.components.TimePicker();
        btnedit = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txteclassseat = new javax.swing.JTextField();
        txteprice = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtbclassseat = new javax.swing.JTextField();
        txtbprice = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtfclassseat = new javax.swing.JTextField();
        txtfprice = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cmbfromaname = new javax.swing.JComboBox<>();
        cmbdestinationaname = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 104));

        jPanel2.setBackground(new java.awt.Color(239, 45, 4));

        jLabel1.setText(":: Search Flight ::");
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
                .addGap(235, 235, 235)
                .addComponent(btnclose))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnclose)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel3.setText("Search By : ");
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(243, 85, 24));

        cmbtsearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "flightid", "flightname", "flighttype", " " }));
        cmbtsearch.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N

        txtsearch.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N

        FlightTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12", "Title 13", "Title 14", "Title 15", "Title 16"
            }
        ));
        FlightTable.setBackground(new java.awt.Color(0, 204, 204));
        FlightTable.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        FlightTable.setRowHeight(25);
        FlightTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FlightTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(FlightTable);

        jLabel2.setText("Flight ID");
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(243, 85, 24));

        txtflightid.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtflightid.setEnabled(false);

        jLabel4.setText("Flight Name");
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(243, 85, 24));

        txtflightname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel11.setText("Flight Type");
        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(243, 85, 24));

        cmbflighttype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "National", "International", " ", " " }));

        jLabel5.setText(" From");
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(243, 85, 24));

        txtfrom.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel6.setText("Destination");
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(243, 85, 24));

        txtdestination.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel7.setText("Date");
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(243, 85, 24));

        jLabel8.setText("Arrival Time");
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(243, 85, 24));

        jLabel9.setText("Departure Time");
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(243, 85, 24));

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

        jLabel10.setText("Total Number Of Seats In :");
        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(243, 85, 24));

        jLabel14.setText("Price of seats :");
        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(243, 85, 24));

        jLabel13.setText("Economy Class ");
        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(243, 85, 24));

        txteclassseat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        txteprice.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel12.setText("Business Class ");
        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(243, 85, 24));

        txtbclassseat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        txtbprice.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel15.setText("First Class ");
        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(243, 85, 24));

        txtfclassseat.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        txtfprice.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        jLabel16.setText("Airport Name :");
        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(243, 85, 24));

        jLabel17.setText("Airport Name :");
        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(243, 85, 24));

        cmbfromaname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        cmbdestinationaname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", " " }));
        cmbdestinationaname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmbtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(btnedit)
                        .addGap(162, 162, 162)
                        .addComponent(btndelete)
                        .addGap(157, 157, 157)
                        .addComponent(btnback)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel16))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtflightid, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtflightname)
                                            .addComponent(cmbflighttype, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtfrom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(28, 28, 28)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtbclassseat, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txteclassseat, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtfclassseat, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(12, 12, 12))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel17)
                        .addGap(45, 45, 45)
                        .addComponent(cmbdestinationaname, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtdtime, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(162, 162, 162)))))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtbprice, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txteprice, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtfprice, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbfromaname, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtdestination, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(35, 35, 35)
                        .addComponent(txtatime, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(196, 196, 196))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel7)
                        .addGap(39, 39, 39)
                        .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtflightid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel14))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel11)
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtfrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15)
                                    .addComponent(txtfclassseat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtfprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtflightname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbflighttype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)
                                    .addComponent(txtbclassseat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtbprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(59, 59, 59)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txteclassseat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txteprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(61, 61, 61)
                            .addComponent(jLabel13))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(cmbfromaname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(txtatime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtdestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtdtime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(cmbdestinationaname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnedit)
                    .addComponent(btndelete)
                    .addComponent(btnback))
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

        setSize(new java.awt.Dimension(887, 850));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void FlightTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FlightTableMouseClicked
        int rowIndex = FlightTable.getSelectedRow();
        if (rowIndex == -1) {
            Messages.showError("Please Select a Record!", "Error");
            return;
        }
        else{
            DefaultTableModel model1 = (DefaultTableModel) FlightTable.getModel();
            String flightid = model1.getValueAt(rowIndex, 0).toString();
            String flightname = model1.getValueAt(rowIndex, 1).toString();
            String flighttype = model1.getValueAt(rowIndex, 2).toString();
            String from = model1.getValueAt(rowIndex, 3).toString();
            String fairportname = model1.getValueAt(rowIndex, 4).toString();
            String destination = model1.getValueAt(rowIndex, 5).toString();
            String dairportname = model1.getValueAt(rowIndex, 6).toString();
            String dateString = model1.getValueAt(rowIndex, 7).toString();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate date = LocalDate.parse(dateString, formatter);
            String atime = model1.getValueAt(rowIndex, 8).toString();
            String dtime = model1.getValueAt(rowIndex, 9).toString();
            String EClassSeat = model1.getValueAt(rowIndex, 10).toString();
            String BClassSeat = model1.getValueAt(rowIndex, 11).toString();
            String FClassSeat = model1.getValueAt(rowIndex, 12).toString();
            String EClassPrice = model1.getValueAt(rowIndex, 13).toString();
            String BClassPrice = model1.getValueAt(rowIndex, 14).toString();
            String FClassPrice = model1.getValueAt(rowIndex, 15).toString();
             
            txtflightid.setText(flightid);
            txtflightname.setText(flightname);
           cmbflighttype.setSelectedItem(flighttype);
            txtfrom.setText(from);
            
            fillcombo(from);
            cmbfromaname.setSelectedItem(fairportname);
            txtdestination.setText(destination);
            
            fillcombo1(destination);
            cmbdestinationaname.setSelectedItem(dairportname);
            txtdate.setDate(date);
            txtatime.setText(atime);
            txtdtime.setText(dtime);
            txteclassseat.setText(EClassSeat);
            txtbclassseat.setText(BClassSeat);
            txtfclassseat.setText(FClassSeat);
            txteprice.setText(EClassPrice);
            txtbprice.setText(BClassPrice);
            txtfprice.setText(FClassPrice);
       }
    }//GEN-LAST:event_FlightTableMouseClicked
       
        public void clearfield(){
            
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
        model.removeAllElements();
        model1.removeAllElements();
        
    }
    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed

        int i = FlightTable.getSelectedRow();
        if(i==-1){
            Messages.showError("Please Select Record !", "Error");
        }
        else{

            String fid = txtflightid.getText();
            String fname = txtflightname.getText();
            String ftype = cmbflighttype.getSelectedItem().toString();
            String date = txtdate.getDateStringOrEmptyString();
            String from = txtfrom.getText();
            String fairportname = cmbfromaname.getSelectedItem().toString();
            String destination = txtdestination.getText();
            String dairportname = cmbdestinationaname.getSelectedItem().toString();
            String atime = txtatime.getText();
            String dtime = txtdtime.getText();
             String EClassSeat = txteclassseat.getText();
            String BClassSeat = txtbclassseat.getText();
            String FClassSeat = txtfclassseat.getText();
            String EClassPrice = txteprice.getText();
            String BClassPrice = txtbprice.getText();
            String FClassPrice = txtfprice.getText();

            // Validation for Flight Search frame

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
         if(atime.isEmpty()){
            Messages.showError("Please Select Arrival Time ","Error");
            txtatime.requestFocus();
            return;
        }
         if(dtime.isEmpty()){
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
        if(!Rules.isDouble(EClassPrice)){
            Messages.showError("Please Enter Valid Number of Economy Class Price.", "Error");
            txteprice.requestFocus();
            return;
        }
        if(BClassPrice.isEmpty()){
            Messages.showError("Please Enter Business Class Price","Error");
            txtbprice.requestFocus();
            return;     
        }
        if(!Rules.isDouble(BClassPrice)){
            Messages.showError("Please Enter Valid Number of Business Class Price.", "Error");
            txtbprice.requestFocus();
            return;
        }
        if(FClassPrice.isEmpty()){
            Messages.showError("Please Enter First Class Price","Error");
            txtfprice.requestFocus();
            return;     
        }
        if(!Rules.isDouble(FClassPrice)){
            Messages.showError("Please Enter Valid Number of First Class Price.", "Error");
            txtfprice.requestFocus();
            return;
        }
            db.execute("update  addflightinfo_tb set flightname=?,flighttype=?,from1=?,airport_name1=?,destination=?,airport_name2=?,date=?,arrivaltime=?,departuretime=?,economySeats=?,businessSeats=?,firstSeats=?,economyPrice=?,businessPrice=?,firstPrice=? where flightid =?", fname,ftype,from,fairportname,destination,dairportname,date,atime,dtime,EClassSeat,BClassSeat,FClassSeat,EClassPrice,BClassPrice,FClassPrice,fid);
            Messages.showInfo("Flight Information Updated Successfully","Success");
            db.fillTable(FlightTable, "select * from addflightinfo_tb");
            clearfield();
        }
    }//GEN-LAST:event_btneditActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        int rowIndex = FlightTable.getSelectedRow();
        if (rowIndex == -1) {
            Messages.showError("Please Select a Record!", "Error");
            return;
        }
        else{
            int s =Messages.showConfirm("Are You Want To Delete The Flight Details ?", "Error");
            if(s==0){
                Object fid = FlightTable.getValueAt(rowIndex, 0);
                db.execute("delete from addflightinfo_tb where flightid = ?",fid);
                Messages.showInfo("Record Deleted Successfully...", "Error");
                db.fillTable(FlightTable,"select * from addflightinfo_tb");
                clearfield();
            }
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed

        this.dispose();
        MainForm obj = new MainForm("","");
        obj.setVisible(true);
    }//GEN-LAST:event_btnbackActionPerformed

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
            java.util.logging.Logger.getLogger(SearchFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchFlight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchFlight(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable FlightTable;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JComboBox<String> cmbdestinationaname;
    private javax.swing.JComboBox<String> cmbflighttype;
    private javax.swing.JComboBox<String> cmbfromaname;
    private javax.swing.JComboBox<String> cmbtsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
