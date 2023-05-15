
package com.util;

import javax.swing.JOptionPane;

public class Messages {
    
    public static void showInfo(String msg,String title){
        JOptionPane.showMessageDialog(null, msg,title,JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void showError(String msg,String title){
        JOptionPane.showMessageDialog(null, msg,title,JOptionPane.ERROR_MESSAGE);
    }
  
    public static int showConfirm(String msg,String title){        
        return JOptionPane.showConfirmDialog(null, msg,title,JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
    }
}
