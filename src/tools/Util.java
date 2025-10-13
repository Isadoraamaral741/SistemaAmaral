package tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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

   
    public static int strToInt(String cad) {
        try {
            return Integer.parseInt(cad.trim());
        } catch (Exception e) {
            return 0;
        }
    }

    public static String intToStr(int num) {
        return String.valueOf(num);
    }

    public static double strToDouble(String cad) {
        try {
            return Double.parseDouble(cad.trim().replace(",", "."));
        } catch (Exception e) {
            return 0.0;
        }
    }

    public static String doubleToStr(double num) {
        return String.format("%.2f", num);
    }


    public static Date strToDate(String cad) {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(cad);
        } catch (ParseException e) {
            return null;
        }
    }

    public static String dateToStr(Date data) {
        if (data == null) return "";
        return new SimpleDateFormat("dd/MM/yyyy").format(data);
    }
}
