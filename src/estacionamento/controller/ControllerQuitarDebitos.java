package estacionamento.controller;

import estacionamento.model.Cliente;
import estacionamento.model.DAOCliente;
import estacionamento.model.DAORecebimento;
import estacionamento.model.DAOValores;
import estacionamento.model.Recebimento;
import estacionamento.model.SaldoDevedorCliente;
import estacionamento.model.Valores;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ControllerQuitarDebitos {
    private final DAOCliente daoCliente;
    private final DAORecebimento daoRecebimento;
    private final DAOValores daoValores;
    public  ArrayList<SaldoDevedorCliente> dados;
    
    public ControllerQuitarDebitos(){
        this.daoCliente = new DAOCliente();
        this.daoRecebimento = new DAORecebimento();
        this.daoValores = new DAOValores();
    }
    
    public TableModel carregaDados(JTable t) throws Exception{
        this.dados = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) t.getModel();
        model.setRowCount(0);
        final double MES_EM_MILISEGUNDOS = 30.0 * 24.0 * 60.0 * 60.0 * 1000.0;
        for(Cliente c : this.daoCliente.selectALL()){
             int numeroDeMeses = (int)((new Date().getTime() - c.getDataCadastro().getTime())/MES_EM_MILISEGUNDOS);
             List<Recebimento> rece = daoRecebimento.findRecebimentosByCliente(c);
             double totalPago = 0;
             for(Recebimento r : rece){
                 totalPago += r.getValor();
             }
             
             Valores v = (Valores) daoValores.findByTipoAndTempo("Mês", 1);
             int meses = (int)(numeroDeMeses - (totalPago/v.getValor()));
             if(v != null && (v.getValor() * meses) != 0){
                SaldoDevedorCliente sdc = new SaldoDevedorCliente();
                sdc.setCliente(c);
                sdc.setMeses(meses);
                sdc.setSaldoDevedor(v.getValor() * meses);
                String[] item = {c.getNome(), c.getCpf(), String.valueOf(meses), String.valueOf(sdc.getSaldoDevedor())};
                model.addRow(item);
                this.dados.add(sdc);
             }
        }
        return model;
    }
    
    public TableModel carregaDados(JTable t, String cpf) throws Exception{
        this.dados = new ArrayList<>();
        DefaultTableModel model = (DefaultTableModel) t.getModel();
        model.setRowCount(0);
        final double MES_EM_MILISEGUNDOS = 30.0 * 24.0 * 60.0 * 60.0 * 1000.0;
        for(Cliente c : this.daoCliente.selectForCpf(cpf)){
             int numeroDeMeses = (int)((new Date().getTime() - c.getDataCadastro().getTime())/MES_EM_MILISEGUNDOS);
             List<Recebimento> rece = daoRecebimento.findRecebimentosByCliente(c);
             double totalPago = 0;
             for(Recebimento r : rece){
                 totalPago += r.getValor();
             }
             
             Valores v = (Valores) daoValores.findByTipoAndTempo("Mês", 1);
             int meses = (int)(numeroDeMeses - (totalPago/v.getValor()));
             if(v != null && (v.getValor() * meses) != 0){
                SaldoDevedorCliente sdc = new SaldoDevedorCliente();
                sdc.setCliente(c);
                sdc.setMeses(meses);
                sdc.setSaldoDevedor(v.getValor() * meses);
                String[] item = {c.getNome(), c.getCpf(), String.valueOf(meses), String.valueOf(sdc.getSaldoDevedor())};
                model.addRow(item);
                this.dados.add(sdc);
             }
        }
        return model;
    }
    
    public Object getValorMensalidade() throws Exception{
        return daoValores.findByTipoAndTempo("Mês", 1);
    }
    
    public void save(Recebimento r) throws Exception{
        this.daoRecebimento.save(r);
    }
    
}
