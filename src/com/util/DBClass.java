package com.util;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class DBClass {
    public Connection cn;
    public static String pvalue="";
    
    //Connect to Database
    public void connect(){
        try{        
        cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/airline", "root", "12345");
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }
    
          public int getNextId(String table, String column) throws SQLException{
        String url = "jdbc:mysql://localhost/airline";
        String user = "root";
        String password = "12345";
        try {
            cn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.err.println("Error connecting to the database: " + e.getMessage());
        }
        int nextId = -1;
        String sql = "SELECT MAX("+column+") FROM " + table;
        try (Statement statement = cn.createStatement();
             ResultSet result = statement.executeQuery(sql)) {
            if (result.next()) {
                nextId = result.getInt(1)+ 1;
            } else {
                nextId = 1;
            }
            
        } catch (SQLException e) {
            throw new SQLException("Error getting next ID from table " + table + ": " + e.getMessage());
        }
       return nextId;
  }
          
  public void close(){
        try{
        cn.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
   
  public static void SetIcon(JFrame frame){                
        Image img = new ImageIcon(frame.getClass().getResource(".//images/ars.png")).getImage();
         frame.setIconImage(img);
    }
  
      public void enableSearch(JTable tab,String query,JComboBox cmb,JTextField txt){
        txt.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(txt.getText().equals("")){                    
                    fillTable(tab, query);
                }else{
                    String s=query+" where "+cmb.getSelectedItem()+" like '%"+txt.getText()+"%'";
                    fillTable(tab, s);
                }
                pvalue=cmb.getSelectedItem()+" like '%"+txt.getText()+"%'";
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if(txt.getText().equals("")){
                    fillTable(tab, query);
                }else{
                    String s=query+" where "+cmb.getSelectedItem()+" like '%"+txt.getText()+"%'";
                    fillTable(tab, query);
                }
                pvalue=cmb.getSelectedItem()+" like '%"+txt.getText()+"%'";
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                
            }
        });
        
    }

    public void fillTable(JTable table,String sql,Object ... args){
        try{
        connect();
        DefaultTableModel dt=(DefaultTableModel)table.getModel();
        dt.setRowCount(0);
        PreparedStatement ps=cn.prepareStatement(sql);
        int i=1;
            for(Object obj : args){
                ps.setObject(i, obj);
                i++;
            }
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            Object obj[]=new Object[dt.getColumnCount()];
            for(int j=0;j<obj.length;j++){
                obj[j]=rs.getObject(j+1);
            }
            dt.addRow(obj);
        }
        close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
    public void fillTable2(JTable table,String sql,Object ... args){
        try{
        connect();
        table.setRowHeight(50);
        //Get column names from table
        Object cols[]=new Object[table.getColumnCount()];
        for(int i=0;i<cols.length;i++){
            cols[i]=table.getColumnName(i);            
        }
        PreparedStatement ps=cn.prepareStatement(sql);
        int i=1;
            for(Object obj : args){
                ps.setObject(i, obj);
                i++;
            }
        ResultSet rs=ps.executeQuery();
        ResultSetMetaData rsd=rs.getMetaData();
        //4 cols ==> Object  Roll  Name  Address Photo[ImageIcon]        
        DefaultTableModel dt=new DefaultTableModel()
        {            
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                
                try {                   
                        if(rsd.getColumnTypeName(columnIndex+1).equals("MEDIUMBLOB")){
                            return ImageIcon.class; //Returns Class type object                        }
                        }else{
                            return super.getColumnClass(columnIndex); //To change body of generated methods, choose Tools | Templates.
                        }
                    
                } catch (SQLException ex) {
                    Logger.getLogger(DBClass.class.getName()).log(Level.SEVERE, null, ex);
                }
                return null;
            }
        }; 
        //set column names in dt
        dt.setColumnIdentifiers(cols);
        table.setModel(dt);
        while(rs.next()){
            Object obj[]=new Object[dt.getColumnCount()];
            for(int j=0;j<obj.length;j++){
                if(rsd.getColumnTypeName(j+1).equals("MEDIUMBLOB")){
                    InputStream in=rs.getBinaryStream(j+1);
                    byte b[]=new byte[in.available()];
                    in.read(b); //Read data from InputStream and store in byte array
                    ImageIcon img=new ImageIcon(b); //ImageIcon(byte b[])
                    Image im=img.getImage();
                    im=im.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
                    img.setImage(im);
                    obj[j]=img;
                }else{
                obj[j]=rs.getObject(j+1);
                }
            }
            dt.addRow(obj);
        }
        close();
        
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
    
     public void fillTableWithStructure(JTable table,String sql,Object ... args){
        try{
        connect();
        DefaultTableModel dt=(DefaultTableModel)table.getModel();
        dt.setRowCount(0);
        PreparedStatement ps=cn.prepareStatement(sql);
        int i=1;
            for(Object obj : args){
                ps.setObject(i, obj);
                i++;
            }
        ResultSet rs=ps.executeQuery();
        //Get column names from resultset
        ResultSetMetaData rsd=rs.getMetaData(); //Data/Information about ResultSet
        String cols[]=new String[rsd.getColumnCount()];
        try{
        for(int j=0;i<cols.length;j++){
            
            cols[j]=rsd.getColumnName(j+1);
            System.out.println(cols[j]);
            
        }
        }catch(Exception ex){
                
        }
        System.out.println(Arrays.toString(cols));
        dt.setColumnIdentifiers(cols);
        while(rs.next()){
            Object obj[]=new Object[dt.getColumnCount()];
            for(int j=0;j<obj.length;j++){
                obj[j]=rs.getObject(j+1);
            }
            dt.addRow(obj);
        }
        close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
    public void applySearch(JTable tab,JComboBox cmb,JTextField txt,String query,Object ... args){
        txt.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                if(txt.getText().equals("")){                    
                    fillTable(tab, query);
                }else{
                    String s=query+" where "+cmb.getSelectedItem()+" like '%"+txt.getText()+"%'";
                    fillTable(tab, s);
                }
                pvalue=cmb.getSelectedItem()+" like '%"+txt.getText()+"%'";
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                if(txt.getText().equals("")){
                    fillTable(tab, query);
                }else{
                    String s=query+" where "+cmb.getSelectedItem()+" like '%"+txt.getText()+"%'";
                    fillTable(tab, query);
                }
                pvalue=cmb.getSelectedItem()+" like '%"+txt.getText()+"%'";
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                
            }
        });
    }
    //Scond version for images
    public void applySearch2(JTable table,JComboBox cmbfield,JTextField txtsearch,String sql,Object ... args){
        txtsearch.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                fillTable2(table, sql+ " where "+cmbfield.getSelectedItem()+" like '%"+txtsearch.getText()+"%'", args);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                fillTable2(table, sql+ " where "+cmbfield.getSelectedItem()+" like '%"+txtsearch.getText()+"%'", args);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                
            }
        });
    }
     public void execute(String sql,Object ... args){
        try{
            connect();
            PreparedStatement ps=cn.prepareStatement(sql);
            int i=1;
            for(Object obj : args){
                if(obj instanceof File){ // type of obj is File
                    //FileInputStream is derived from InputStream class
                FileInputStream fis=new FileInputStream((File)obj);
                ps.setBinaryStream(i, fis);
                }else{
                ps.setObject(i, obj);
                }
                i++;
            }
            ps.executeUpdate();
            close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    //Get Data
    //ResultSet rs=getData("select * from Stud")
    public ResultSet getData(String sql,Object ... args){
        ResultSet rs=null;
        try{
            connect();
            PreparedStatement ps=cn.prepareStatement(sql);
            int i=1;
            for(Object obj : args){
                ps.setObject(i, obj);
                i++;
            }
            rs=ps.executeQuery();
            //close(); //Dont close connection
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return rs;
        
    }
    public void showReport(String reportPath){
        try {
            connect();
            JasperReport jr=JasperCompileManager.compileReport(new File(reportPath).getAbsolutePath());
            JasperPrint jp=JasperFillManager.fillReport(jr, null, cn);
                          
            JasperViewer.viewReport(jp);
            close();
            pvalue="";
        } catch (JRException ex) {
            Logger.getLogger(DBClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void showReport(String reportPath,HashMap<String,Object> map){
        try {
            connect();
            JasperReport jr=JasperCompileManager.compileReport(new File(reportPath).getAbsolutePath()); 
            JasperPrint jp=JasperFillManager.fillReport(jr, map, cn);
            JasperViewer.viewReport(jp);

            pvalue="";
            close();
        } catch (JRException ex) {
            Logger.getLogger(DBClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void fillCombo(JComboBox cmb,String sql){
        try {
            cmb.removeAllItems(); 
            ResultSet rs=getData(sql);
            while(rs.next()){
                cmb.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DBClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 }
