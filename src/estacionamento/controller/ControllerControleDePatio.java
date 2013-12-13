package estacionamento.controller;

import estacionamento.model.Cliente;
import estacionamento.model.DAOCliente;
import estacionamento.model.DAOFluxo;
import estacionamento.model.DAORecebimento;
import estacionamento.model.DAOValores;
import estacionamento.model.Fluxo;
import estacionamento.model.Recebimento;
import estacionamento.model.Valores;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ControllerControleDePatio {
    private DAOFluxo daoFluxo;
    private DAORecebimento daoRecebimento;
    private DAOValores daoValores;
    private DAOCliente daoCliente;
    
    public ControllerControleDePatio(){
        this.daoFluxo = new DAOFluxo();
        this.daoRecebimento = new DAORecebimento();
        this.daoValores = new DAOValores();
        this.daoCliente = new DAOCliente();
    }
    
    public void save(Fluxo f) throws Exception{
        this.daoFluxo.save(f);
    }
    
    public void update(Fluxo f) throws Exception{
        this.daoFluxo.update(f);
    }
    
    public TableModel carregaVeiculos(JTable t) throws Exception{
        DefaultTableModel model = (DefaultTableModel) t.getModel();
        model.setRowCount(0);      
        String hora = "HH:mm:ss"; 
        SimpleDateFormat formata = new SimpleDateFormat(hora);
        for(Fluxo f : daoFluxo.selectFluxosAtivos()){
            String[] dados = {f.getPlaca(),formata.format(f.getDataEntrada())};
            model.addRow(dados);
        }
        return model;
    }
    
    public List<Fluxo> getFluxosAtivos() throws Exception{
         return this.daoFluxo.selectFluxosAtivos();
    }
    
    private Valores getValores(Fluxo f) throws Exception{
        /*
        Calendar dataInicio = Calendar.getInstance();
        dataInicio.setTime(f.getDataEntrada());
        
        Calendar dataFim = Calendar.getInstance();
        dataFim.setTime(f.getDataSaida());
        */
        Valores v = (Valores) daoValores.findByTipoAndTempo("Hora(s)", (int) (f.getDataSaida().getTime() - f.getDataEntrada().getTime()) / (1000*24*60*60*60));
        System.out.println((f.getDataSaida().getTime() - f.getDataEntrada().getTime()) / (1000*24*60*60*60));
        return v;
    }
    
    public void registrarRecebimentoDeFluxo(Fluxo f) throws Exception{
        Recebimento r = new Recebimento();
        r.setData(new Date());
        Cliente c = daoCliente.findClienteByVeiculo(f.getPlaca());
        if(c == null){
            r.setIdFluxo(f.getIdFluxo());
        }else{
            r.setIdCliente(c.getIdCliente());
        }
        Valores v = this.getValores(f);
        System.out.println(v);
        r.setValor((int) (f.getDataSaida().getTime() - f.getDataEntrada().getTime()) / (1000*24*60*60*60) * v.getValor());
        this.daoRecebimento.save(r);
    }
}
