package estacionamento.model;

import java.util.Date;


public class Recebimento extends EntradaSaida{
    private int idRecebimentos;
    private int idCliente;
    private int idFluxo;

    public int getIdRecebimentos() {
        return idRecebimentos;
    }

    public void setIdRecebimentos(int idRecebimentos) {
        this.idRecebimentos = idRecebimentos;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdFluxo() {
        return idFluxo;
    }

    public void setIdFluxo(int idFluxo) {
        this.idFluxo = idFluxo;
    }
}
