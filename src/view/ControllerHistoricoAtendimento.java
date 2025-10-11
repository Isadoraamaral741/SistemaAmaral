/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package view;

import bean.Historicoatendimento;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author isado
 */
public class ControllerHistoricoAtendimento {
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
        Historicoatendimento historicoAtendimento = (Historicoatendimento) lista.get(rowIndex);
        if (columnIndex == 0) {
            return historicoAtendimento.getIaaIdAtendimento();
        }
        if (columnIndex == 1) {
            return historicoAtendimento.getIaaTipoAtendimento();
        }
        if (columnIndex == 2) {
            return historicoAtendimento.getIaaAtendente();
        }
        if (columnIndex == 3) {
            return historicoAtendimento.getIaaValor();
        }
        return "";
    }

    public String getColumnName(int column) {
        if (column == 0) {
            return "Código";
        }
        if (column == 1) {
            return "Nome";
        }
        if (column == 2) {
            return "Cpf";
        }
        if (column == 3) {
            return "Data Nascimento";
        }
        return "";
    }
}
