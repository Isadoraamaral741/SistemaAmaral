/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import java.awt.TextField;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author u07773981175
 */
public class Util {
    public static void habilitar(boolean valor, JComponent ... compontentes){
         for (int i = 0; i < compontentes.length; i++) {
            compontentes[i].setEnabled(valor);
            
        }
    }
    public static void limpar(JComponent ... components){
        for (int i = 0; i < components.length; i++) {
           if(components[i] instanceof JTextField){
             ((JTextField) components[i]).setText("");
           }
           if(components[i] instanceof JComboBox){
             ((JComboBox) components[i]).setSelectedIndex(-1);
           }
        }
    }
    public static void mensagem(String cad){
        JOptionPane.showMessageDialog(null, cad);
    }
    public static boolean perguntar(String cad){
    JOptionPane.showConfirmDialog(null, cad);
    return true;
    }
    public static int strToInt(String num){
    return Integer.valueOf(num);
    }
    public static String intToStr(int num){
    return String.valueOf(num);
    }
    public static double strToDouble(String num){
     return 0;
    }
    public static String doubleToStr(double num){
      return"";
    }
    public static Date strToDate(String data){
     return null;
    }
    public static String dateToStr(Date data){
      return"";
    }
    
    }
     

