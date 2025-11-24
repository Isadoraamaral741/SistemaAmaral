package tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Util {


    public static void habilitar(boolean valor, JComponent... componentes) {
        for (JComponent componente : componentes) {
            componente.setEnabled(valor);
        }
    }

 
    public static void limpar(JComponent... componentes) {
        for (JComponent componente : componentes) {
            if (componente instanceof JTextField) {
                ((JTextField) componente).setText("");
            }
            if (componente instanceof JComboBox) {
                ((JComboBox<?>) componente).setSelectedIndex(-1);
            }
        }
    }


    public static void mensagem(String cad) {
        JOptionPane.showMessageDialog(null, cad);
    }


    public static boolean perguntar(String cad) {
        int resposta = JOptionPane.showConfirmDialog(null, cad, "Confirmação", JOptionPane.YES_NO_OPTION);
        return resposta == JOptionPane.YES_OPTION;
    }

   
      public static int strToInt(String cad){
        return Integer.parseInt(cad);
    }
    public static String intToStr(int num){
        return String.valueOf(num);
    }
    public static double strToDouble(String cad){
        return Double.parseDouble(cad);
    }
    public static String doubleToStr(double num){
        return String.valueOf(num);
    }

    public static Date strToDate(String cad){
        try {
            SimpleDateFormat dataNascFormat = new SimpleDateFormat("dd/MM/yyyy");
            return dataNascFormat.parse(cad);
        } catch (ParseException ex) {
            Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public static String dateToStr(Date dataNasc){
        if(dataNasc == null )return "";
        SimpleDateFormat dataNascFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dataNascFormat.format(dataNasc);
    } 
    
    
}
