package estacionamento.view;

import estacionamento.controller.ControllerRegistrarGastos;
import estacionamento.model.Gastos;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

public class PainelRegistrarGastos extends javax.swing.JPanel {
    private ControllerRegistrarGastos control;
    private List<Gastos> gastos;
    private Gastos g;
    private MaskFormatter dataMask;
    
    public PainelRegistrarGastos() {
        try {
            this.control = new ControllerRegistrarGastos();
            this.gastos = control.getObjectsGastos();
            this.g = new Gastos();
            dataMask = new MaskFormatter("##/##/####"); 
            initComponents();
            tblGastos.setModel(this.control.getGastos(tblGastos));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNameWindow = new javax.swing.JLabel();
        painel_1 = new javax.swing.JPanel();
        lblDescricao = new javax.swing.JLabel();
        tfDescricao = new javax.swing.JTextField();
        lblValor = new javax.swing.JLabel();
        tfValor = new javax.swing.JTextField();
        lblDataDeVencimento = new javax.swing.JLabel();
        lblQuitado = new javax.swing.JLabel();
        comboQuitado = new javax.swing.JComboBox();
        btnSalvar = new javax.swing.JButton();
        tfDataVencimento = new javax.swing.JFormattedTextField(dataMask);
        painel_2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblGastos = new javax.swing.JTable();
        btnPesquisar = new javax.swing.JButton();
        lblPesquisa = new javax.swing.JLabel();
        tfPesquisa = new javax.swing.JTextField();

        lblNameWindow.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblNameWindow.setText("Registrar Gastos ");

        painel_1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblDescricao.setText("Descrição:");

        lblValor.setText("Valor:");

        lblDataDeVencimento.setText("Data de Vencimento:");

        lblQuitado.setText("Quitado:");

        comboQuitado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione...", "Sim", "Não" }));

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estacionamento/resource/save.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel_1Layout = new javax.swing.GroupLayout(painel_1);
        painel_1.setLayout(painel_1Layout);
        painel_1Layout.setHorizontalGroup(
            painel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel_1Layout.createSequentialGroup()
                        .addGroup(painel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblQuitado)
                            .addComponent(lblDataDeVencimento)
                            .addComponent(lblValor)
                            .addComponent(lblDescricao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfDescricao)
                            .addGroup(painel_1Layout.createSequentialGroup()
                                .addGroup(painel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(comboQuitado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfValor, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                    .addComponent(tfDataVencimento))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel_1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalvar)))
                .addContainerGap())
        );
        painel_1Layout.setVerticalGroup(
            painel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescricao)
                    .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataDeVencimento)
                    .addComponent(tfDataVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValor)
                    .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuitado)
                    .addComponent(comboQuitado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSalvar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painel_2.setBorder(javax.swing.BorderFactory.createTitledBorder("Gastos Lançados"));

        tblGastos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descrição", "Valor", "Status", "Vencimento", "Data Quitado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblGastos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblGastosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblGastos);

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        lblPesquisa.setText("Descrição:");

        tfPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPesquisaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout painel_2Layout = new javax.swing.GroupLayout(painel_2);
        painel_2.setLayout(painel_2Layout);
        painel_2Layout.setHorizontalGroup(
            painel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                    .addGroup(painel_2Layout.createSequentialGroup()
                        .addComponent(lblPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfPesquisa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisar)))
                .addContainerGap())
        );
        painel_2Layout.setVerticalGroup(
            painel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel_2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPesquisa)
                    .addComponent(tfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(painel_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(painel_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(254, Short.MAX_VALUE)
                .addComponent(lblNameWindow)
                .addContainerGap(210, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNameWindow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painel_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painel_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            if(g.getIdGasto() == 0){
                g = new Gastos();
            }
            g.setDescricao(tfDescricao.getText());
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            g.setDataVencimento(format.parse(tfDataVencimento.getText()));
            g.setValor(Double.parseDouble(tfValor.getText()));
            if(comboQuitado.getSelectedIndex() == 1){
                g.setDataQuitado(new Date());
            }else if(comboQuitado.getSelectedIndex() == 0){
                throw new  Exception("Por favor, informar se está quitado!!");
            }
            this.control.save(g);
            limparCampos();
            tblGastos.setModel(this.control.getGastos(tblGastos));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_btnSalvarActionPerformed
    
    public void limparCampos(){
        tfDescricao.setText("");
        tfValor.setText("");
        tfDataVencimento.setText("");
    }
    
    private void tblGastosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblGastosMouseClicked
        if(evt.getClickCount() == 2){
            g = this.gastos.get(tblGastos.getSelectedRow());
            tfDescricao.setText(g.getDescricao());
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            tfDataVencimento.setText(format.format(g.getDataVencimento()));
            tfValor.setText(String.valueOf(g.getValor()));
        }
    }//GEN-LAST:event_tblGastosMouseClicked

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        try {
            tblGastos.setModel(this.control.getGastos(tblGastos, tfPesquisa.getText()));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void tfPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisaKeyReleased
         try {
            tblGastos.setModel(this.control.getGastos(tblGastos, tfPesquisa.getText()));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tfPesquisaKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox comboQuitado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDataDeVencimento;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblNameWindow;
    private javax.swing.JLabel lblPesquisa;
    private javax.swing.JLabel lblQuitado;
    private javax.swing.JLabel lblValor;
    private javax.swing.JPanel painel_1;
    private javax.swing.JPanel painel_2;
    private javax.swing.JTable tblGastos;
    private javax.swing.JFormattedTextField tfDataVencimento;
    private javax.swing.JTextField tfDescricao;
    private javax.swing.JTextField tfPesquisa;
    private javax.swing.JTextField tfValor;
    // End of variables declaration//GEN-END:variables
}
