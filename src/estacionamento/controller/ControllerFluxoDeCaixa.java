package estacionamento.controller;

import estacionamento.model.DAOCliente;
import estacionamento.model.DAOGastos;
import estacionamento.model.DAORecebimento;
import estacionamento.model.Gastos;
import estacionamento.model.Recebimento;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ControllerFluxoDeCaixa {
    private final DAORecebimento daoEntradas;
    private final DAOGastos daoSaidas;
    private final DAOCliente daoCliente;
    private List entradasSaidas;
    public double entradas;
    public double saidas;
    public double saldo;
    
    public ControllerFluxoDeCaixa(){
        this.daoEntradas = new DAORecebimento();
        this.daoSaidas = new DAOGastos();
        this.entradasSaidas = new ArrayList<>();
        this.daoCliente = new DAOCliente();
    }
    
    public TableModel getEntradasSaidas(JTable t, String inicio, String fim) throws Exception{
        DefaultTableModel model = (DefaultTableModel) t.getModel();
        this.saldo = 0;
        this.saidas = 0;
        this.entradas = 0;
        model.setRowCount(0);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        this.entradasSaidas = this.daoEntradas.selectALLInInterval(format.parse(inicio), format.parse(fim));
        this.entradasSaidas.addAll(this.daoSaidas.selectALLQuitadosInInterval(format.parse(inicio), format.parse(fim)));
        Collections.sort(this.entradasSaidas);
        Collections.reverse(this.entradasSaidas);
        for(Object o : this.entradasSaidas){
            if(o instanceof Gastos){
                Gastos g = (Gastos) o;
                String[] row = {format.format(g.getData()), g.getDescricao(), "", String.valueOf(g.getValor())};
                this.saldo -= g.getValor();
                this.saidas += g.getValor();
                model.addRow(row);
            }else if(o instanceof Recebimento){
                Recebimento r = (Recebimento) o;
                String[] row = {format.format(r.getData()), daoCliente.findById(r.getIdCliente()).getNome(), String.valueOf(r.getValor()), ""};
                this.saldo += r.getValor();
                this.entradas += r.getValor();
                model.addRow(row);
            }
        }
        return model;
    }
    
    public double getCaixa() throws Exception{
        double caixa = 0;
        List es = this.daoEntradas.selectALL();
        es.addAll(this.daoSaidas.selectALLQuitados());
         for(Object o : es){
            if(o instanceof Gastos){
                Gastos g = (Gastos) o;
                caixa -= g.getValor();
            }else if(o instanceof Recebimento){
                Recebimento r = (Recebimento) o;  
                caixa += r.getValor();
            }
        }
        return caixa;
    }
}
