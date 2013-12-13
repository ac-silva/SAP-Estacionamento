package estacionamento.view;
import estacionamento.controller.ControllerCadastroDeCliente;
import estacionamento.model.Cliente;
import estacionamento.util.Util;
import java.awt.Component;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PainelCadastroDeCliente extends javax.swing.JPanel {
    private final String[] ufs = {"AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"};
    private final ControllerCadastroDeCliente control;
    private Cliente c;
    public PainelCadastroDeCliente() {
        this.control = new ControllerCadastroDeCliente();
        initComponents();
        for(String uf : ufs){
            comboUf.addItem(uf);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblNameWindow = new javax.swing.JLabel();
        panel_1 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        lblEndereco = new javax.swing.JLabel();
        tfEndereco = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        tfNumero = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        tfCpf = new javax.swing.JTextField();
        tfBairro = new javax.swing.JTextField();
        lblUf = new javax.swing.JLabel();
        comboUf = new javax.swing.JComboBox();
        lblCidade = new javax.swing.JLabel();
        tfCidade = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        tfTelefone = new javax.swing.JTextField();
        lblCelular = new javax.swing.JLabel();
        tfCelular = new javax.swing.JTextField();
        btnSalvarCliente = new javax.swing.JButton();
        panel_2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVeiculos = new javax.swing.JTable();
        btnAddVeiculo = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        lblNameWindow.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblNameWindow.setText("Cadastro de Cliente");

        panel_1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblNome.setText("Nome:");

        lblEndereco.setText("Endereço:");

        lblNumero.setText("Número:");

        lblBairro.setText("Bairro:");

        lblCpf.setText("CPF:");

        lblUf.setText("UF:");

        comboUf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione" }));

        lblCidade.setText("Cidade:");

        lblTelefone.setText("Telefone:");

        lblCelular.setText("Celular:");

        javax.swing.GroupLayout panel_1Layout = new javax.swing.GroupLayout(panel_1);
        panel_1.setLayout(panel_1Layout);
        panel_1Layout.setHorizontalGroup(
            panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_1Layout.createSequentialGroup()
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblBairro)
                            .addComponent(lblEndereco)
                            .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTelefone)
                                .addComponent(lblCidade)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_1Layout.createSequentialGroup()
                                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfCidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                                    .addComponent(tfBairro, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfEndereco, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(5, 5, 5)
                                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNumero)
                                    .addComponent(lblUf))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(comboUf, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_1Layout.createSequentialGroup()
                                .addComponent(tfTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(lblCelular)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panel_1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNome)
                            .addComponent(lblCpf))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCpf)
                            .addComponent(tfNome))))
                .addContainerGap())
        );
        panel_1Layout.setVerticalGroup(
            panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCpf))
                .addGap(34, 34, 34)
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEndereco)
                    .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNumero)
                        .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBairro)
                    .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidade)
                    .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUf)
                    .addComponent(comboUf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCelular)
                    .addComponent(tfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        btnSalvarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estacionamento/resource/save.png"))); // NOI18N
        btnSalvarCliente.setText("Salvar Cadastro");
        btnSalvarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarClienteActionPerformed(evt);
            }
        });

        panel_2.setBorder(javax.swing.BorderFactory.createTitledBorder("Veículos"));

        tblVeiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Modelo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblVeiculos);

        javax.swing.GroupLayout panel_2Layout = new javax.swing.GroupLayout(panel_2);
        panel_2.setLayout(panel_2Layout);
        panel_2Layout.setHorizontalGroup(
            panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        panel_2Layout.setVerticalGroup(
            panel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                .addGap(11, 11, 11))
        );

        btnAddVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estacionamento/resource/add.png"))); // NOI18N
        btnAddVeiculo.setText("Adicionar Veículo");
        btnAddVeiculo.setEnabled(false);
        btnAddVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVeiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblNameWindow)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(panel_1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAddVeiculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalvarCliente)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNameWindow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarCliente)
                    .addComponent(btnAddVeiculo))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public void carregarVeiculos(){
        try {
            tblVeiculos.setModel(control.getVeiculosOfCliente(tblVeiculos, c));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void btnSalvarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarClienteActionPerformed
        try{
            c = new Cliente();
            c.setNome(tfNome.getText());
            c.setCpf(tfCpf.getText());
            c.setEndereco(tfEndereco.getText());
            c.setNumero(tfNumero.getText());
            c.setBairro(tfBairro.getText());
            c.setCidade(tfCidade.getText());
            try{
                c.setUf(ufs[comboUf.getSelectedIndex()-1]);
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Por favor, selecione uma unidade federativa (UF)!", "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }
            c.setTelefone(tfTelefone.getText());
            c.setCelular(tfCelular.getText());
            c.setDataCadastro(new Date());
            c = control.save(c);
            
            Component parent = this.getParent();
            while(!(parent instanceof  JFrame)){
                parent = parent.getParent();
            }
            FormPrincipal fp = (FormPrincipal) Util.getFormPrincipal(this);
            btnSalvarCliente.setEnabled(false);
            btnAddVeiculo.setEnabled(true);
            fp.setOtherInternalFrame(new PainelRegistrarVeiculo(c, this));
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSalvarClienteActionPerformed

    private void btnAddVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVeiculoActionPerformed
        Component parent = this.getParent();
        while(!(parent instanceof  JFrame)){
            parent = parent.getParent();
        }
        FormPrincipal fp = (FormPrincipal) parent;
        fp.setOtherInternalFrame(new PainelRegistrarVeiculo(c, this));
    }//GEN-LAST:event_btnAddVeiculoActionPerformed
/*
    public String getUF(int id){
        String uf = "";
        switch(id){
            case 0: uf = "AC";
            break;
            case 1: uf = "AL";
            break;
            case 2: uf = "AP";
            break;
            case 3: uf = "AM";
            break;
            case 4: uf = "BA";
            break;
            case 5: uf = "CE";
            break;
            case 6: uf = "DF";
            break;
            case 7: uf = "ES";
            break;
            case 8: uf = "GO";
            break;
            case 9: uf = "MA";
            break;
            case 10: uf = "MT";
            break;
            case 11: uf = "MS";
            break;
            case 12: uf = "MG";
            break;
            case 13: uf = "PA";
            break;
            case 14: uf = "PB";
            break;
            case 15: uf = "PR";
            break;
            case 16: uf = "PE";
            break;
            case 17: uf = "PI";
            break;
            case 18: uf = "RJ";
            break;
            case 19: uf = "RN";
            break;
            case 20: uf = "RS";
            break;
            case 21: uf =  "RO";
            break;
            case 22: uf =  "RR";
            break;
            case 23: uf = "SC";
            break;
            case 24: uf = "SP";
            break;
            case 25: uf = "SE";
            break;
            case 26: uf = "TO";
            break;  
        }
        return uf;
    }
    */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddVeiculo;
    private javax.swing.JButton btnSalvarCliente;
    private javax.swing.JComboBox comboUf;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNameWindow;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblUf;
    private javax.swing.JPanel panel_1;
    private javax.swing.JPanel panel_2;
    private javax.swing.JTable tblVeiculos;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JTextField tfCelular;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfCpf;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfTelefone;
    // End of variables declaration//GEN-END:variables
}
