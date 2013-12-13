package estacionamento.model;


public class Valores {
   private int idValores;
   private double valor;
   private String descricao;
   private int tempo;
   private String tipo;

    public int getIdValores() {
        return idValores;
    }

    public void setIdValores(int idValores) {
        this.idValores = idValores;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   
}
