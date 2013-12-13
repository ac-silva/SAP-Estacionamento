package estacionamento.view;


public class PainelCupomSaida extends javax.swing.JPanel {

    
    public PainelCupomSaida() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jScrollPane1.setEnabled(false);

        jTextArea1.setBackground(new java.awt.Color(240, 234, 197));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("                       <EMPRESA>\nCOMPROVANTE DE PRESTAÇÃO DE SERVIÇO DO ESTACIONAMENTO\n<EMPRESA>.\nENDEREÇO: <ENDERECOEMPRESA>\nTELEFONE: <TELEFONEEMPRESA>\nCNPJ: <CNPJEMPRESA>\n\n\n<DATAEHORA>                                      <ID>\n-----------------------------------------------------\nCLIENTE: <CLIENTE>\nPLACA DO VEÍCULO: <PLACA>\nHORA ENTRADA: <HORAENTRADA>\nHORA SAIDA: <HORASAIDA>\n-----------------------------------------------------\nTOTAL:...................................<VALORTOTAL>");
        jScrollPane1.setViewportView(jTextArea1);

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
