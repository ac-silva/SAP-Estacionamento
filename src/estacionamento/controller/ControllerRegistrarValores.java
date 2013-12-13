package estacionamento.controller;

import estacionamento.model.DAOValores;
import estacionamento.model.Fluxo;
import estacionamento.model.Valores;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ControllerRegistrarValores {
    private DAOValores dao;
    
    public ControllerRegistrarValores(){
        this.dao = new DAOValores();
    }
    
    public void save(Valores v) throws Exception{
        this.dao.save(v);
    }
    
    public TableModel getValores(JTable t) throws Exception{
        DefaultTableModel model = (DefaultTableModel) t.getModel();
        model.setRowCount(0);
        for(Valores v : this.dao.selectALL()){
            String[] dados = {v.getDescricao(), String.valueOf(v.getTempo()) + " " + v.getTipo(), String.valueOf(v.getValor())};
            model.addRow(dados);
        }
        return model;
    }
    
    public List<Valores> carregarValores() throws Exception{
        return this.dao.selectALL();
    }
    
    public void deletar(Valores v) throws Exception{
        this.dao.delete(v.getIdValores());
    }
}
