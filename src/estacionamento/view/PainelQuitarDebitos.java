package estacionamento.view;

import estacionamento.controller.ControllerQuitarDebitos;
import estacionamento.model.Recebimento;
import estacionamento.model.SaldoDevedorCliente;
import estacionamento.model.Valores;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PainelQuitarDebitos extends javax.swing.JPanel {
    private ControllerQuitarDebitos control;
    private SaldoDevedorCliente sdc;
    
    public PainelQuitarDebitos() {
        try {
            this.control = new ControllerQuitarDebitos();
            initComponents();
            tblDebitosClientes.setModel(this.control.carregaDados(tblDebitosClientes, tfPesquisa.getText()));
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNameWindow = new javax.swing.JLabel();
        painel_1 = new javax.swing.JPanel();
        lblCpf = new javax.swing.JLabel();
        tfPesquisa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDebitosClientes = new javax.swing.JTable();
        painel_2 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblMes = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfMes = new javax.swing.JTextField();
        lblValor = new javax.swing.JLabel();
        tfValor = new javax.swing.JTextField();
        lblValor1 = new javax.swing.JLabel();
        tfTotal = new javax.swing.JTextField();
        btnConfirmar = new javax.swing.JButton();

        lblNameWindow.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblNameWindow.setText("Quitar Débitos");

        painel_1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblCpf.setText("CPF:");

        tfPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPesquisaKeyReleased(evt);
            }
        });

        tblDebitosClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Qtd. Meses", "Saldo Devedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDebitosClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDebitosClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDebitosClientes);

        javax.swing.GroupLayout painel_1Layout = new javax.swing.GroupLayout(painel_1);
        painel_1.setLayout(painel_1Layout);
        painel_1Layout.setHorizontalGroup(
            painel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                    .addGroup(painel_1Layout.createSequentialGroup()
                        .addComponent(lblCpf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPesquisa)))
                .addContainerGap())
        );
        painel_1Layout.setVerticalGroup(
            painel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCpf)
                    .addComponent(tfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        painel_2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblNome.setText("Nome:");

        lblMes.setText("Mês:");

        tfNome.setEnabled(false);

        tfMes.setEnabled(false);

        lblValor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblValor.setText("Valor:");

        tfValor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfValor.setEnabled(false);

        lblValor1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblValor1.setText("Total:");

        tfTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfTotal.setEnabled(false);

        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estacionamento/resource/accept.png"))); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel_2Layout = new javax.swing.GroupLayout(painel_2);
        painel_2.setLayout(painel_2Layout);
        painel_2Layout.setHorizontalGroup(
            painel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_2Layout.createSequentialGroup()
                        .addGroup(painel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMes)
                            .addComponent(lblNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfNome, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                            .addComponent(tfMes))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_2Layout.createSequentialGroup()
                        .addGroup(painel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblValor1)
                            .addComponent(lblValor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTotal)
                            .addComponent(tfValor))
                        .addGap(197, 197, 197))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConfirmar)
                .addContainerGap())
        );
        painel_2Layout.setVerticalGroup(
            painel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMes)
                    .addComponent(tfMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor1)
                    .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblValor)
                    .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConfirmar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painel_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painel_1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblNameWindow)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNameWindow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painel_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painel_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblDebitosClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDebitosClientesMouseClicked
        if(evt.getClickCount() == 2){
            this.sdc = this.control.dados.get(tblDebitosClientes.getSelectedRow());
            tfNome.setText(sdc.getCliente().getNome());
            tfMes.setText(String.valueOf(sdc.getMeses()));
            tfTotal.setText(String.valueOf(sdc.getSaldoDevedor()));
            tfValor.setEnabled(true);
        }
    }//GEN-LAST:event_tblDebitosClientesMouseClicked

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        try {
            double valor = Double.parseDouble(tfValor.getText());
            double mensalidade = ((Valores)this.control.getValorMensalidade()).getValor();
            if(valor % mensalidade == 0){
                Recebimento r = new Recebimento();
                r.setData(new Date());
                r.setIdCliente(sdc.getCliente().getIdCliente());
                r.setValor(valor);
                this.control.save(r);
                limparCampos();
                tblDebitosClientes.setModel(this.control.carregaDados(tblDebitosClientes));
            }else{
                throw new Exception("Valor deve que ser um multiplo do valor da mensalidade!! ("+String.valueOf(mensalidade)+")");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void tfPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisaKeyReleased
        try {
            this.control.carregaDados(tblDebitosClientes, tfPesquisa.getText());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tfPesquisaKeyReleased

    public void limparCampos(){
        tfNome.setText("");
        tfMes.setText("");
        tfTotal.setText("");
        tfValor.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblMes;
    private javax.swing.JLabel lblNameWindow;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblValor;
    private javax.swing.JLabel lblValor1;
    private javax.swing.JPanel painel_1;
    private javax.swing.JPanel painel_2;
    private javax.swing.JTable tblDebitosClientes;
    private javax.swing.JTextField tfMes;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfPesquisa;
    private javax.swing.JTextField tfTotal;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables
}
