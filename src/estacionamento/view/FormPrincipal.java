package estacionamento.view;

import java.awt.Toolkit;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class FormPrincipal extends javax.swing.JFrame {
    public FormPrincipal() {
        frameInterno = new JInternalFrame();
        frameInterno.setDefaultCloseOperation(HIDE_ON_CLOSE);
        initComponents();
        this.setLocationRelativeTo(null);
        this.pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btnControleDePatio = new javax.swing.JButton();
        btnAddCliente = new javax.swing.JButton();
        btnConsultarPendencias = new javax.swing.JButton();
        btnRegistrarValores = new javax.swing.JButton();
        btnAddGasto = new javax.swing.JButton();
        btnFluxoDeCaixa = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        desktop = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        btnControleDePatio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estacionamento/resource/empty_calendar.png"))); // NOI18N
        btnControleDePatio.setText("Controle de Pátio");
        btnControleDePatio.setFocusable(false);
        btnControleDePatio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnControleDePatio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnControleDePatio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnControleDePatioActionPerformed(evt);
            }
        });
        jToolBar1.add(btnControleDePatio);

        btnAddCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estacionamento/resource/users (2).png"))); // NOI18N
        btnAddCliente.setText("Add Cliente");
        btnAddCliente.setFocusable(false);
        btnAddCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAddCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAddCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddClienteActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAddCliente);

        btnConsultarPendencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estacionamento/resource/search.png"))); // NOI18N
        btnConsultarPendencias.setText("Consultar Pendências");
        btnConsultarPendencias.setFocusable(false);
        btnConsultarPendencias.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConsultarPendencias.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnConsultarPendencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarPendenciasActionPerformed(evt);
            }
        });
        jToolBar1.add(btnConsultarPendencias);

        btnRegistrarValores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estacionamento/resource/dollar_currency_sign.png"))); // NOI18N
        btnRegistrarValores.setText("Gerenciar Preços");
        btnRegistrarValores.setFocusable(false);
        btnRegistrarValores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrarValores.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRegistrarValores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarValoresActionPerformed(evt);
            }
        });
        jToolBar1.add(btnRegistrarValores);

        btnAddGasto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estacionamento/resource/gastos.png"))); // NOI18N
        btnAddGasto.setText("Add Gastos");
        btnAddGasto.setFocusable(false);
        btnAddGasto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAddGasto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAddGasto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddGastoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnAddGasto);

        btnFluxoDeCaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estacionamento/resource/pie_chart.png"))); // NOI18N
        btnFluxoDeCaixa.setText("Fluxo de Caixa");
        btnFluxoDeCaixa.setFocusable(false);
        btnFluxoDeCaixa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFluxoDeCaixa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnFluxoDeCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFluxoDeCaixaActionPerformed(evt);
            }
        });
        jToolBar1.add(btnFluxoDeCaixa);

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estacionamento/resource/shut_down.png"))); // NOI18N
        btnSair.setText("Fechar");
        btnSair.setFocusable(false);
        btnSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSair.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSair);

        desktop.setBackground(new java.awt.Color(240, 240, 240));
        desktop.add(frameInterno);

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1208, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 1208, Short.MAX_VALUE)
            .addComponent(desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desktop))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnControleDePatioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnControleDePatioActionPerformed
        setPanel(new PainelControleDePatio());
    }//GEN-LAST:event_btnControleDePatioActionPerformed

    private void btnAddClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddClienteActionPerformed
        setPanel(new PainelCadastroDeCliente());
    }//GEN-LAST:event_btnAddClienteActionPerformed

    private void btnConsultarPendenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarPendenciasActionPerformed
        setPanel(new PainelQuitarDebitos());
    }//GEN-LAST:event_btnConsultarPendenciasActionPerformed

    private void btnRegistrarValoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarValoresActionPerformed
        setPanel(new PainelRegistrarValores());
    }//GEN-LAST:event_btnRegistrarValoresActionPerformed

    private void btnAddGastoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddGastoActionPerformed
        setPanel(new PainelRegistrarGastos());
    }//GEN-LAST:event_btnAddGastoActionPerformed

    private void btnFluxoDeCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFluxoDeCaixaActionPerformed
        setPanel(new PainelFluxoDeCaixa());
    }//GEN-LAST:event_btnFluxoDeCaixaActionPerformed
    
    private void centralizar(JInternalFrame frm) {
        int dx = this.getWidth();
        frm.setLocation( (dx/2) - (frm.getWidth()/2),  (int) (desktop.getHeight() - frm.getHeight())/2 );
    }
    
    public void setPanel(JPanel painel){
        frameInterno.hide();
        frameInterno.setVisible(true);
        frameInterno.setClosable(true);
        frameInterno.setMaximizable(true);
         
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
         
        if(width < 1024 && height < 768){
            JScrollPane barra = new JScrollPane(painel, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
            frameInterno.setContentPane(barra);  
        }else{
            frameInterno.setContentPane(painel);
        }
        frameInterno.setFrameIcon(null);
        frameInterno.pack();
        //this.setSize(this.getWidth(), frameInterno.getHeight() + 160);
        //this.setLocationRelativeTo(null);
        centralizar(frameInterno);
    }
    
     public void setOtherInternalFrame(JPanel painel){
        if(other == null){
            other = new JInternalFrame();
            other.setVisible(true);
            other.setClosable(true);
            other.setContentPane(painel);
            other.setFrameIcon(null);
            other.pack();
            desktop.add(other);
            centralizar(other);
            try{
                other.setSelected(true);
            }catch(Exception e){}
        }else{
            in = new JInternalFrame();
            in.setVisible(true);
            in.setClosable(true);
            in.setContentPane(painel);
            in.setFrameIcon(null);
            in.pack();
            desktop.add(in);
            centralizar(in);
            try{
                in.setSelected(true);
            }catch(Exception e){}
        }
    }
     
    public void closeOtherInternalFrame(String name){
        if(name.equals("in")){
            in.dispose();
        }else{
            other.dispose();
            other = null;
        }
    }
    
    private JInternalFrame other;
    private JInternalFrame in;
    private javax.swing.JInternalFrame frameInterno;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCliente;
    private javax.swing.JButton btnAddGasto;
    private javax.swing.JButton btnConsultarPendencias;
    private javax.swing.JButton btnControleDePatio;
    private javax.swing.JButton btnFluxoDeCaixa;
    private javax.swing.JButton btnRegistrarValores;
    private javax.swing.JButton btnSair;
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
