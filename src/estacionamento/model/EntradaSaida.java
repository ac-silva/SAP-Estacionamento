package estacionamento.model;

import java.util.Date;

public class EntradaSaida implements Comparable<EntradaSaida>{
    private Date data;
    double valor;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public int compareTo(EntradaSaida o) {
        if (getData() == null || o.getData() == null)
        return 0;
        return getData().compareTo(o.getData());
    }
}
