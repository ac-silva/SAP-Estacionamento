package estacionamento.controller;

import estacionamento.model.DAOGastos;
import estacionamento.model.Gastos;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class ControllerRegistrarGastos {
    private DAOGastos dao;
    
    public ControllerRegistrarGastos(){
        this.dao = new DAOGastos();
    }
    
    public void save(Gastos g) throws Exception{
        if(g.getIdGasto() != 0){
            this.dao.update(g);
        }else{
            this.dao.save(g);
        }
    }
    
    public TableModel getGastos(JTable t) throws Exception{
        DefaultTableModel model = (DefaultTableModel) t.getModel();
        model.setRowCount(0);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        for(Gastos g : this.dao.selectALL()){
            Object[] tudo = null;
            if(g.getDataQuitado() != null){
                Object[] dados = {g.getDescricao(), String.valueOf(g.getValor()), "Ok", format.format(g.getDataVencimento()), format.format(g.getDataQuitado())};
                tudo = dados;
            }else{
                Object[] dados = {g.getDescricao(), String.valueOf(g.getValor()), "falta!", format.format(g.getDataVencimento()), ""};
                tudo = dados;
            }
            
            model.addRow(tudo);
        }
        return model;
    }
    
    public TableModel getGastos(JTable t, String descricao) throws Exception{
        DefaultTableModel model = (DefaultTableModel) t.getModel();
        model.setRowCount(0);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        for(Gastos g : this.dao.selectByDescricao(descricao)){
            Object[] tudo = null;
            if(g.getDataQuitado() != null){
                Object[] dados = {g.getDescricao(), String.valueOf(g.getValor()), "Ok", format.format(g.getDataVencimento()), format.format(g.getDataQuitado())};
                tudo = dados;
            }else{
                Object[] dados = {g.getDescricao(), String.valueOf(g.getValor()), "falta!", format.format(g.getDataVencimento()), ""};
                tudo = dados;
            }
            
            model.addRow(tudo);
        }
        return model;
    }
    
    public List<Gastos> getObjectsGastos() throws Exception{
        return this.dao.selectALL();
    }
}
