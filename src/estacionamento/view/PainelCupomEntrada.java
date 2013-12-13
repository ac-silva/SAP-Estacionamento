package estacionamento.view;

import estacionamento.model.Fluxo;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PainelCupomEntrada extends javax.swing.JPanel {
    private Fluxo f;
    
    public PainelCupomEntrada(Fluxo f) {
        initComponents();
        this.f = f;
        txtArea.setText(carregarDados());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();

        jScrollPane1.setEnabled(false);

        txtArea.setBackground(new java.awt.Color(240, 234, 197));
        txtArea.setColumns(20);
        txtArea.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        txtArea.setLineWrap(true);
        txtArea.setRows(5);
        txtArea.setText("                       <EMPRESA>\nCOMPROVANTE DE PRESTAÇÃO DE SERVIÇO DO ESTACIONAMENTO\n<EMPRESA>.\nENDEREÇO: <ENDERECOEMPRESA>\nTELEFONE: <TELEFONEEMPRESA>\nCNPJ: <CNPJEMPRESA>\n\n\n<DATAEHORA>                                      <ID>\n-----------------------------------------------------\nCLIENTE: <CLIENTE>\nPLACA DO VEÍCULO: <PLACA>\nHORA ENTRADA: <HORAENTRADA>\n-----------------------------------------------------\n");
        jScrollPane1.setViewportView(txtArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

   private String carregarDados(){
        String hora = "HH:mm:ss"; 
        SimpleDateFormat formata = new SimpleDateFormat(hora);
        String dados = "<EMPRESA>\nCOMPROVANTE DE PRESTAÇÃO DE SERVIÇO DO ESTACIONAMENTO\n<EMPRESA>."
                + "\nENDEREÇO: <ENDERECOEMPRESA>\nTELEFONE: <TELEFONEEMPRESA>\nCNPJ: <CNPJEMPRESA>\n\n\n"+formata.format(new Date())+" "
                + "                                     <ID>\n-----------------------------------------------------"
                + "\nCLIENTE: <CLIENTE>\nPLACA DO VEÍCULO: "+this.f.getPlaca()+"\nHORA ENTRADA: "+ formata.format(this.f.getDataEntrada())
                + "\n-----------------------------------------------------\n";
        return dados;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}
