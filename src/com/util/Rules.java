
package com.util;

public class Rules {
    public static boolean isInteger(String s){
        try{
            int a=Integer.parseInt(s);
            return true;            
        }catch(Exception ex){
            return false;
        }
    }
    public static boolean isDouble(String s){
        if(s.matches("^\\d+(\\.\\d{2})?$")){
            return true;
        }else{
            return false;
        }
    }
//    public static boolean isEmail(String s){
//        if(s.matches("^\\w+@\\w+\\.\\w{2,3}(\\.\\w{2,3})?$")){
//            return true;
//        }else{
//            return false;
//        }
//        
//    }
    public static boolean isMobile(String s){
        if(s.matches("^\\d{10}$")){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isChars(String s){
        if(s.matches("^[A-Za-z ]+$")){
            return true;
        }else{
            return false;
        }
    }
//    public static boolean isURL(String s){
//        if(s.matches("^(http://)?www\\.\\w+\\.\\w{2,3}(\\.\\w{2,3})?$")){
//            return true;
//        }else{
//            return false;
//        }
//    }
    public static boolean isPassportid(String s){
        if(s.matches("^\\d{6}$")){
            return true;
        }else{
            return false;
        }
    }
     public static boolean isCardNo(String s){
        if(s.matches("^\\d{12}$")){
            return true;
        }else{
            return false;
        }
    }
      public static boolean isCVV(String s){
        if(s.matches("^\\d{3}$")){
            return true;
        }else{
            return false;
        }
    }


}
