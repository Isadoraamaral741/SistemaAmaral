 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package view;

import bean.Vendas;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author isado
 */
public class ControllerVendas extends AbstractTableModel {
        List lista;

    public void setList(List lista) {
        this.lista = lista;
    }

    public Object getBean(int rowIndex) {
       return lista.get(rowIndex);    
    }
    
    public int getRowCount() {
        return lista.size();
    }

    public int getColumnCount() {
        return 4;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        Vendas vendas = (Vendas) lista.get(rowIndex);
        if (columnIndex == 0) {
            return vendas.getIaaIdVenda();
        }
        if (columnIndex == 1) {
            return vendas.getIaaIdClientes();
        }
        if (columnIndex == 2) {
            return vendas.getIaaIdUsuarios();
        }
        if (columnIndex == 3) {
            return vendas.getIaaDataVenda();
        }
        if (columnIndex == 3) {
            return vendas.getIaaTotal();
        }
        return "";
    }

    public String getColumnName(int column) {
        if (column == 0) {
            return "ID";
        }
        if (column == 1) {
            return "Cliente";
        }
        if (column == 2) {
            return "Usuario";
        }
        if (column == 3) {
            return "Data da Venda";
        }
        if (column == 4) {
            return "Total";
        }
        return "";
    }
}
