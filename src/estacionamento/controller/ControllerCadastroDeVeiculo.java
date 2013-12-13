package estacionamento.controller;

import estacionamento.model.DAOVeiculo;
import estacionamento.model.Veiculo;

public class ControllerCadastroDeVeiculo {
    DAOVeiculo daoVeiculo;
    
    public ControllerCadastroDeVeiculo(){
        this.daoVeiculo = new DAOVeiculo();
    }
    
    public void save(Veiculo v) throws Exception{
        this.daoVeiculo.save(v);
    }
}
