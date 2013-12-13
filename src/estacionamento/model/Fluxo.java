package estacionamento.model;

import java.util.Date;

public class Fluxo {
    private int idFluxo;
    private Date dataEntrada;
    private Date dataSaida;
    private String placa;

    public int getIdFluxo() {
        return idFluxo;
    }

    public void setIdFluxo(int idFluxo) {
        this.idFluxo = idFluxo;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(Date dataSaida) {
        this.dataSaida = dataSaida;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

   
    
}
