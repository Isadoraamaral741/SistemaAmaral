/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;
import bean.VendaProduto;
import bean.Vendas;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author isado
 */
public class ControllerVendaProdutos extends AbstractTableModel{
      
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
        VendaProduto vendaProduto = (VendaProduto) lista.get(rowIndex);
        if (columnIndex == 0) {
            return vendaProduto.getIaaIdVendaProdutos();
        }
        if (columnIndex == 1) {
            return vendaProduto.getIaaIdPedido();
        }
        if (columnIndex == 2) {
            return vendaProduto.getIaaIdProduto();
        }
        if (columnIndex == 3) {
            return vendaProduto.getIaaObservacao();
        }
        return "";
    }

    public String getColumnName(int column) {
        if (column == 0) {
            return "Código";
        }
        if (column == 1) {
            return "Pedido";
        }
        if (column == 2) {
            return "Produto";
        }
        if (column == 3) {
            return "Observação";
        }
        return "";
    }
    
}
