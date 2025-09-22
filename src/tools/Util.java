/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tools;

import java.awt.TextField;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
 public static boolean perguntar(String cad) {
    int resposta = JOptionPane.showConfirmDialog(null, cad, "Confirmação", JOptionPane.YES_NO_OPTION);
    return resposta == JOptionPane.YES_OPTION;
}
      public static int strToInt(String num) {
        return Integer.valueOf(num);
    }

    public static String intToStr(int num) {
        return String.valueOf(num);
    }

    public static double strToDouble(String num) {
        return Double.valueOf(num);
    }

    public static String doubleToStr(double num) {
        return String.valueOf(num);
    }
     public static Date strToDate(String data) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            return sdf.parse(data);
        } catch (ParseException e) {
            return null;
        }
    }

    public static String dateToStr(Date data) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(data);
    }
    
    }
     

