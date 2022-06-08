package fatec.poo.view;

import fatec.poo.model.Produto;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.swing.JOptionPane;

public class GuiProduto extends javax.swing.JFrame {

    public GuiProduto(ArrayList<Produto> produtos) {
        initComponents();
        this.cadProd = produtos;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnConsultar = new javax.swing.JButton();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        txtQtdeDisponivel = new javax.swing.JTextField();
        txtEstoqueMinimo = new javax.swing.JTextField();
        txtPrecoUnitario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Código");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Descrição");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Qtde.Disponível");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Preço Unitário");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Estoque Mínimo");

        btnConsultar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/pesq.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnIncluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/add.png"))); // NOI18N
        btnIncluir.setText("Incluir");
        btnIncluir.setEnabled(false);
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnAlterar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Alterar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setEnabled(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/Eraser.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setEnabled(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnSair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fatec/poo/view/icon/exit.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        txtDescricao.setEnabled(false);

        txtQtdeDisponivel.setToolTipText("");
        txtQtdeDisponivel.setEnabled(false);

        txtEstoqueMinimo.setEnabled(false);

        txtPrecoUnitario.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtQtdeDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPrecoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEstoqueMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtDescricao))))
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txtQtdeDisponivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEstoqueMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecoUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsultar)
                    .addComponent(btnIncluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnSair))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed

        codigoDoProduto = txtCodigo.getText();
        
         if(codigoDoProduto.isEmpty()) {
            jpane.showMessageDialog(jpane, "É necessário preencher o campo codigo");
            return;
        }
        
        for(int i = 0; i < this.cadProd.size(); i++) {
            Produto obj = this.cadProd.get(i);
        
            if (Objects.equals(obj.getCodigo(), codigoDoProduto)) {
                jpane.showMessageDialog(jpane, "Produto ja cadastrado");
                txtCodigo.setText(null);
                txtDescricao.setText(null);
                txtEstoqueMinimo.setText(null);
                txtPrecoUnitario.setText(null);
                txtQtdeDisponivel.setText(null);
                return;
            }
        }

        objProduto = new Produto(txtCodigo.getText(), txtDescricao.getText());
        objProduto.setQtdeEstoque(Double.parseDouble(txtQtdeDisponivel.getText()));
        objProduto.setPreco(Double.parseDouble(txtPrecoUnitario.getText()));
        objProduto.setEstoqueMinimo(Double.parseDouble(txtEstoqueMinimo.getText()));       
        cadProd.add(objProduto);
        
        jpane.showMessageDialog(jpane, "Produto cadastrado com sucesso");
        txtDescricao.setEnabled(false);
        txtEstoqueMinimo.setEnabled(false);
        txtPrecoUnitario.setEnabled(false);
        txtQtdeDisponivel.setEnabled(false);
        txtCodigo.setText(null);
        txtDescricao.setText(null);
        txtEstoqueMinimo.setText(null);
        txtPrecoUnitario.setText(null);
        txtQtdeDisponivel.setText(null);
        btnIncluir.setEnabled(false);
    }//GEN-LAST:event_btnIncluirActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        produtoEncontrado = null;
        
        codigoDoProduto = txtCodigo.getText();
        
        if(txtCodigo.getText().isEmpty()) {
            jpane.showMessageDialog(jpane, "É necessário preencher o campo codigo");
            return;
        }
        
        for(int i = 0; i < this.cadProd.size(); i++) {
            Produto obj = this.cadProd.get(i);
            
            if (Objects.equals(obj.getCodigo(), codigoDoProduto)) {
                produtoEncontrado = obj;
            }
        }
        
        if (produtoEncontrado != null) {
            txtDescricao.setText(produtoEncontrado.getDescricao());
            txtEstoqueMinimo.setText(String.valueOf(produtoEncontrado.getEstoqueMinimo()));
            txtPrecoUnitario.setText(String.valueOf(produtoEncontrado.getPreco()));
            txtQtdeDisponivel.setText(String.valueOf(produtoEncontrado.getQtdeEstoque()));
            
            txtDescricao.setEnabled(true);
            txtEstoqueMinimo.setEnabled(true);
            txtPrecoUnitario.setEnabled(true);
            txtQtdeDisponivel.setEnabled(true);
            btnAlterar.setEnabled(true);
            btnExcluir.setEnabled(true);
        } else {
            jpane.showMessageDialog(jpane, "Esse produto não foi cadastrado mas pode ser adicionado atraves do botão incluir");
            btnIncluir.setEnabled(true);
            txtDescricao.setEnabled(true);
            txtEstoqueMinimo.setEnabled(true);
            txtPrecoUnitario.setEnabled(true);
            txtQtdeDisponivel.setEnabled(true);
            txtDescricao.requestFocus();
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        codigoDoProduto = txtCodigo.getText();
        
        for(int i = 0; i < this.cadProd.size(); i++) {
            Produto obj = this.cadProd.get(i);
            
            if (Objects.equals(obj.getCodigo(), codigoDoProduto)) {
                obj.setDescricao(txtDescricao.getText());
                txtDescricao.setText(obj.getDescricao());
                obj.setQtdeEstoque(Double.parseDouble(txtQtdeDisponivel.getText()));
                txtQtdeDisponivel.setText(String.valueOf(obj.getQtdeEstoque()));
                obj.setPreco(Double.parseDouble(txtPrecoUnitario.getText()));
                txtPrecoUnitario.setText(String.valueOf(obj.getPreco()));
                obj.setEstoqueMinimo(Double.parseDouble(txtEstoqueMinimo.getText()));
                txtEstoqueMinimo.setText(String.valueOf(obj.getEstoqueMinimo()));
                
                
                
                jpane.showMessageDialog(jpane, "Produto alterado com sucesso");
                txtDescricao.setEnabled(false);
                txtEstoqueMinimo.setEnabled(false);
                txtPrecoUnitario.setEnabled(false);
                txtQtdeDisponivel.setEnabled(false);
            }
                    
        }
        
        txtCodigo.setText(null);
        txtDescricao.setText(null);
        txtEstoqueMinimo.setText(null);
        txtPrecoUnitario.setText(null);
        txtQtdeDisponivel.setText(null);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed

        codigoDoProduto = txtCodigo.getText();
        
        for(int i = 0; i < this.cadProd.size(); i++) {
            Produto obj = this.cadProd.get(i);
            
            if (Objects.equals(obj.getCodigo(), codigoDoProduto)) {
                this.cadProd.remove(i);
                jpane.showMessageDialog(jpane, "Produto excluido com sucesso");
                txtDescricao.setEnabled(false);
                txtEstoqueMinimo.setEnabled(false);
                txtPrecoUnitario.setEnabled(false);
                txtQtdeDisponivel.setEnabled(false);
            }
                    
        }
        
        txtCodigo.setText(null);
        txtDescricao.setText(null);
        txtEstoqueMinimo.setText(null);
        txtPrecoUnitario.setText(null);
        txtQtdeDisponivel.setText(null);
        btnAlterar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }//GEN-LAST:event_btnExcluirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtEstoqueMinimo;
    private javax.swing.JTextField txtPrecoUnitario;
    private javax.swing.JTextField txtQtdeDisponivel;
    // End of variables declaration//GEN-END:variables
    private ArrayList<Produto> cadProd;
    private Produto objProduto;
    private String codigoDoProduto;    
    private Produto produtoEncontrado;
    private JOptionPane jpane; 

}
