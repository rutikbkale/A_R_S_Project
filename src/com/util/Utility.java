package com.util;

import java.awt.Color;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Utility {
    public static Process executeApp(String appname)
    {
         try {
            Runtime obj=Runtime.getRuntime();
            return obj.exec("rundll32 SHELL32.DLL,ShellExec_RunDLL "+appname);
        } catch (IOException ex) {
             JOptionPane.showMessageDialog(null, ex.toString());
        }
        return null;

    }
    public static void setBorder(JFrame frame){
        frame.getRootPane().setBorder(BorderFactory.createEtchedBorder());
    }
    public static void setBackground(JFrame frame,Color c){
        frame.getContentPane().setBackground(c);
    }
}
