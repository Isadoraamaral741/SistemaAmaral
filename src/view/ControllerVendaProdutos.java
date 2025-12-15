/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.Vendaproduto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author isado
 */
public class ControllerVendaProdutos extends AbstractTableModel {

    List lista;

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }

    public List getList() {
        return this.lista;
    }

    public void addBean(Vendaproduto vendaProduto) {
        this.lista.add(vendaProduto);
        this.fireTableDataChanged();
    }

    public void removeBean(Vendaproduto vendaProduto) {
        this.lista.remove(vendaProduto);
        this.fireTableDataChanged();
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
        Vendaproduto vendaProduto = (Vendaproduto) lista.get(rowIndex);
        if (columnIndex == 0) {
            return vendaProduto.getProdutos();
        }
        if (columnIndex == 1) {
            return vendaProduto.getIaaQuantidade();
        }
        if (columnIndex == 2) {
            return vendaProduto.getIaaValor();
        }
        if (columnIndex == 3) {
            return vendaProduto.getIaaValor() * vendaProduto.getIaaQuantidade();
        }
        return "";
    }

    public String getColumnName(int column) {
        if (column == 0) {
            return "Produto";
        }
        if (column == 1) {
            return "Quantidade";
        }
        if (column == 2) {
            return "Valor Unit.";
        }
        if (column == 3) {
            return "Total";
        }
        return "";
    }

}
