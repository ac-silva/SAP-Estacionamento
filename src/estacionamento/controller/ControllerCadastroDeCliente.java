package estacionamento.controller;

import estacionamento.model.Cliente;
import estacionamento.model.DAOCliente;
import estacionamento.model.DAOVeiculo;
import estacionamento.model.Veiculo;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ControllerCadastroDeCliente {
    DAOCliente dao;
    
    public ControllerCadastroDeCliente(){
        this.dao = new DAOCliente();
    }
    
    public Cliente save(Cliente c) throws Exception{
        c = this.dao.save(c);
        return c;
    }
    
    public void update(Cliente c) throws Exception{
        this.dao.update(c);
    }
    
    public DefaultTableModel getVeiculosOfCliente(JTable t, Cliente c) throws Exception{
        DefaultTableModel model = (DefaultTableModel) t.getModel();
        model.setRowCount(0);
        DAOVeiculo daoVeiculo =  new DAOVeiculo();
        for(Veiculo v : daoVeiculo.selectVeiculsOfClient(c)){
            String[] listData = {v.getPlaca(), v.getModelo()};
            model.addRow(listData);
        }
        return model;
    }
   
}
