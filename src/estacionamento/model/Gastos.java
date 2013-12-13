package estacionamento.model;

import java.util.Date;


public class Gastos extends EntradaSaida{
    private int idGasto;
    private String descricao;
    private Date dataVencimento;

    public int getIdGasto() {
        return idGasto;
    }

    public void setIdGasto(int idGasto) {
        this.idGasto = idGasto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getDataQuitado() {
        return super.getData();
    }

    public void setDataQuitado(Date dataQuitado) {
        super.setData(dataQuitado);
    }
}
