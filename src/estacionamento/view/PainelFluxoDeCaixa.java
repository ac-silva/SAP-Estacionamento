package estacionamento.view;

import estacionamento.controller.ControllerFluxoDeCaixa;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

public class PainelFluxoDeCaixa extends javax.swing.JPanel {
    private ControllerFluxoDeCaixa control;
    private SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
   
    public PainelFluxoDeCaixa() {
        try {
            this.control = new ControllerFluxoDeCaixa();
            initComponents();
            Date data = new Date();
            tfDataInicial.setText(format.format( data ));
            tfDataFinal.setText(format.format( data ));
            tblFluxoDeCaixa.setModel(this.control.getEntradasSaidas(tblFluxoDeCaixa, tfDataInicial.getText(), tfDataFinal.getText()));
            lblCaixa.setText("CAIXA: R$ " + String.valueOf(this.control.getCaixa()));
            lblEntradas.setText("R$ " + String.valueOf(this.control.entradas));
            lblSaidas.setText("R$ " + String.valueOf(this.control.saidas));
            lblSaldo.setText("R$ " + String.valueOf(this.control.saldo));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel_1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comboPeriodo = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        tfDataInicial = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfDataFinal = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFluxoDeCaixa = new javax.swing.JTable();
        lblCaixa = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblEntradas = new javax.swing.JLabel();
        lblSaidas = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();

        painel_1.setBorder(javax.swing.BorderFactory.createTitledBorder("Fluxo de Caixa"));

        jLabel1.setText("Período:");

        comboPeriodo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Último Dia", "Último Semana", "Último Mês", "Último Ano" }));
        comboPeriodo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboPeriodoItemStateChanged(evt);
            }
        });

        jLabel2.setText("De");

        jLabel3.setText("á");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        tblFluxoDeCaixa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Data", "Descrição", "Entrada", "Saída"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblFluxoDeCaixa);

        lblCaixa.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        lblCaixa.setText("CAIXA: R$ 0,00");

        javax.swing.GroupLayout painel_1Layout = new javax.swing.GroupLayout(painel_1);
        painel_1.setLayout(painel_1Layout);
        painel_1Layout.setHorizontalGroup(
            painel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_1Layout.createSequentialGroup()
                        .addGroup(painel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painel_1Layout.createSequentialGroup()
                                .addComponent(lblCaixa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 246, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addComponent(jLabel2))
                        .addGap(2, 2, 2)
                        .addGroup(painel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painel_1Layout.createSequentialGroup()
                                .addComponent(tfDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(2, 2, 2)
                                .addComponent(tfDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        painel_1Layout.setVerticalGroup(
            painel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_1Layout.createSequentialGroup()
                .addGroup(painel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_1Layout.createSequentialGroup()
                        .addGroup(painel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(comboPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfDataInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(tfDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPesquisar)
                            .addComponent(jLabel2)))
                    .addGroup(painel_1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCaixa)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel5.setText("Total de Entradas:");

        jLabel6.setText("Total de Saídas:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("SALDO:");

        lblEntradas.setText("R$ 00,00");

        lblSaidas.setText("R$ 00,00");

        lblSaldo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSaldo.setText("R$ 00,00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEntradas)
                    .addComponent(lblSaidas)
                    .addComponent(lblSaldo))
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painel_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblEntradas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblSaidas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblSaldo))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboPeriodoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboPeriodoItemStateChanged
        try {
            Date data = new Date();
            Calendar c;
            String novaData = format.format(data);
            switch(comboPeriodo.getSelectedIndex()){
                case 0:
                    tfDataInicial.setText(format.format(data));
                    tfDataFinal.setText(format.format(data));
                    break;
                    
                case 1:
                    c = new GregorianCalendar();
                    c.add(Calendar.DAY_OF_MONTH, -7);
                    tfDataInicial.setText(format.format(c.getTime()));
                    tfDataFinal.setText(format.format(data));
                    break;
                    
                case 2:
                    novaData = novaData.substring(3, novaData.length());
                    c = new GregorianCalendar();
                    tfDataInicial.setText("01/" + novaData);
                    tfDataFinal.setText(c.getActualMaximum(java.util.Calendar.DAY_OF_MONTH) +"/"+ novaData);
                    break;
                    
                case 3:
                    novaData = novaData.substring(6, novaData.length());
                    tfDataInicial.setText("01/01/" + novaData);
                    tfDataFinal.setText("31/12/" + novaData);
                    break;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_comboPeriodoItemStateChanged

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            tblFluxoDeCaixa.setModel(this.control.getEntradasSaidas(tblFluxoDeCaixa, tfDataInicial.getText(), tfDataFinal.getText()));
            lblEntradas.setText("R$ " + String.valueOf(this.control.entradas));
            lblSaidas.setText("R$ " + String.valueOf(this.control.saidas));
            lblSaldo.setText("R$ " + String.valueOf(this.control.saldo));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JComboBox comboPeriodo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCaixa;
    private javax.swing.JLabel lblEntradas;
    private javax.swing.JLabel lblSaidas;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JPanel painel_1;
    private javax.swing.JTable tblFluxoDeCaixa;
    private javax.swing.JTextField tfDataFinal;
    private javax.swing.JTextField tfDataInicial;
    // End of variables declaration//GEN-END:variables
}
