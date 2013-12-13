package estacionamento.view;

import estacionamento.controller.ControllerControleDePatio;
import estacionamento.model.Fluxo;
import estacionamento.model.Recebimento;
import estacionamento.util.Util;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PainelControleDePatio extends javax.swing.JPanel {
    private ControllerControleDePatio control;
    private List<Fluxo> fluxos;

    public PainelControleDePatio() {
        try {
            this.control = new ControllerControleDePatio();
            initComponents();
            tblVeiculos.setModel(control.carregaVeiculos(tblVeiculos));
            this.fluxos = this.control.getFluxosAtivos();
            carregaDataEHora();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    private void carregaDataEHora() throws Exception{
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    Date data = new Date();
                    String hora = "HH:mm:ss"; 
                    SimpleDateFormat formata = new SimpleDateFormat(hora);
                    hora = formata.format(data);  
                    lblHora.setText(hora);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(PainelControleDePatio.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        t.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        lblNameWindow = new javax.swing.JLabel();
        panel_1 = new javax.swing.JPanel();
        btnAddVeiculo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVeiculos = new javax.swing.JTable();
        tfPlaca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lblPlaca = new javax.swing.JLabel();
        btnRemoveVeiculo = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        jScrollPane3.setViewportView(jTextPane1);

        lblNameWindow.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblNameWindow.setText("Controle de Pátio");

        panel_1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnAddVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estacionamento/resource/upload.png"))); // NOI18N
        btnAddVeiculo.setText("Adiciona Veículo");
        btnAddVeiculo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAddVeiculo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAddVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVeiculoActionPerformed(evt);
            }
        });

        tblVeiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Hora"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblVeiculos);
        if (tblVeiculos.getColumnModel().getColumnCount() > 0) {
            tblVeiculos.getColumnModel().getColumn(0).setHeaderValue("Placa");
            tblVeiculos.getColumnModel().getColumn(1).setHeaderValue("Hora");
        }

        tfPlaca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Hora:");

        lblHora.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblHora.setText("00:00:00");

        lblPlaca.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPlaca.setText("Placa:");

        btnRemoveVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estacionamento/resource/download.png"))); // NOI18N
        btnRemoveVeiculo.setText("Remover Veículo");
        btnRemoveVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveVeiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_1Layout = new javax.swing.GroupLayout(panel_1);
        panel_1.setLayout(panel_1Layout);
        panel_1Layout.setHorizontalGroup(
            panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_1Layout.createSequentialGroup()
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnRemoveVeiculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddVeiculo))
                    .addGroup(panel_1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel_1Layout.createSequentialGroup()
                                .addComponent(lblPlaca)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                                .addGap(55, 55, 55)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblHora)))))
                .addContainerGap())
        );
        panel_1Layout.setVerticalGroup(
            panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlaca)
                    .addComponent(tfPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(lblHora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddVeiculo)
                    .addComponent(btnRemoveVeiculo))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 205, Short.MAX_VALUE)
                        .addComponent(lblNameWindow)
                        .addGap(0, 203, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNameWindow)
                .addGap(15, 15, 15)
                .addComponent(panel_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVeiculoActionPerformed
        try {
            Fluxo f = new Fluxo();
            f.setDataEntrada(new Date());
            f.setPlaca(tfPlaca.getText());
            this.control.save(f);
            tblVeiculos.setModel(control.carregaVeiculos(tblVeiculos));
            tfPlaca.setText("");
            Util.getFormPrincipal(this).setOtherInternalFrame(new PainelCupomEntrada(f));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnAddVeiculoActionPerformed

    private void btnRemoveVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveVeiculoActionPerformed
        try {
            Fluxo f = fluxos.get(tblVeiculos.getSelectedRow());
            f.setDataSaida(new Date());
            //this.control.update(f);
            tblVeiculos.setModel(control.carregaVeiculos(tblVeiculos));
            this.control.registrarRecebimentoDeFluxo(f);
            Util.getFormPrincipal(this).setOtherInternalFrame(new PainelCupomSaida());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoveVeiculoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddVeiculo;
    private javax.swing.JButton btnRemoveVeiculo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblNameWindow;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JPanel panel_1;
    private javax.swing.JTable tblVeiculos;
    private javax.swing.JTextField tfPlaca;
    // End of variables declaration//GEN-END:variables
}
