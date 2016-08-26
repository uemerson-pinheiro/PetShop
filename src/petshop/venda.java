/**
 * Neri Aldoir Neitzke
 */
package petshop;

import java.beans.Statement;
import java.util.Date;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import utilitarios.conexao;
import javax.swing.text.MaskFormatter;

public class venda extends javax.swing.JFrame {

    MaskFormatter formatoData;
    int navega = 0; //variavel apenas para sabermos em qual botao foi clicado
    conexao con_animal, con_venda, con_prodVenda, con_prodVenda2, con_estoque;
    int inicia_combo = 0;
    String ordenacao = "nome_animal";
    boolean primeiraVezCli = true, primeiraVezProd = true;
    int qtdestoquetinha = 0;

    public venda() {
        initComponents();
        con_animal = new conexao();
        con_animal.conecta();
        
        con_venda = new conexao();
        con_venda.conecta();
        
        con_prodVenda2 = new conexao();
        con_prodVenda2.conecta();
        
        
        con_prodVenda = new conexao();
        con_prodVenda.conecta();
        
        con_estoque = new conexao();
        con_estoque.conecta();
        con_animal.executeSQL("select * from animal ");
        con_venda.executeSQL("select * from venda");
        con_prodVenda.executeSQL("select * from itens_venda");
        con_prodVenda2.executeSQL("select * from itens_venda_servico");
        con_estoque.executeSQL("select * from produto_servico");
        
       try {
            while (con_animal.resultset.next()) {
                cb_cliente.addItem(con_animal.resultset.getString("nome_animal"));
            }
            while (con_estoque.resultset.next()) {
                cbProduto.addItem(con_estoque.resultset.getString("nome_produto_servico"));
            }
            
            atualiza_combo_box_cliente();
            con_venda.resultset.first();
            mostrar_dados();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "NÃO localizou dados " + erro);
        }
        preencher_jtable();//chama metodp para preencher o JTable
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo_ordenacao = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_codigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_datavenda = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cb_cliente = new javax.swing.JComboBox();
        botao_primeiro = new javax.swing.JButton();
        botao_anterior = new javax.swing.JButton();
        botao_proximo = new javax.swing.JButton();
        botao_ultimo = new javax.swing.JButton();
        botao_gravar = new javax.swing.JButton();
        botao_inserir = new javax.swing.JButton();
        botao_alterar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        tf_codcli = new javax.swing.JTextField();
        tf_somatotal = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        tf_obs = new javax.swing.JTextField();
        botao_excluir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        tfCodProd = new javax.swing.JTextField();
        cbProduto = new javax.swing.JComboBox();
        tfQuantidade = new javax.swing.JTextField();
        tfPrecoCusto = new javax.swing.JTextField();
        tfPrecoVenda = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manutenção do Cadastro de Cidades");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36));
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Nota Fiscal de Vendas de Mercadorias");

        jLabel2.setText("Número da Nota Fiscal");

        jLabel3.setText("Data da Venda.:");

        jLabel4.setText("Total da Nota.:");

        cb_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_clienteActionPerformed(evt);
            }
        });

        botao_primeiro.setToolTipText("Vai para o primeiro Registro");
        botao_primeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_primeiroActionPerformed(evt);
            }
        });

        botao_anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_anteriorActionPerformed(evt);
            }
        });

        botao_proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_proximoActionPerformed(evt);
            }
        });

        botao_ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_ultimoActionPerformed(evt);
            }
        });

        botao_gravar.setToolTipText("Grava o registro");
        botao_gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_gravarActionPerformed(evt);
            }
        });

        botao_inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_inserirActionPerformed(evt);
            }
        });

        botao_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_alterarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código do Produto", "Nome do Produto", "Quantidade", "Preço Unitário", "Preço Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel7.setText("Animal:");

        tf_codcli.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tf_codcliFocusLost(evt);
            }
        });

        jLabel23.setText("Observações Gerais.:");

        botao_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_excluirActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setText("Itens desta nota fiscal");

        jLabel9.setText("Cod. Prod.");

        jLabel10.setText("Nome do produto");

        jLabel11.setText("Quant.");

        jLabel12.setText("Preço Unit.");

        jLabel13.setText("Preço total");

        tfCodProd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfCodProdFocusLost(evt);
            }
        });

        cbProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProdutoActionPerformed(evt);
            }
        });

        tfQuantidade.setText(" ");
        tfQuantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfQuantidadeFocusLost(evt);
            }
        });

        tfPrecoCusto.setText(" ");

        tfPrecoVenda.setText(" ");

        jButton2.setText("Adicionar item vendido");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_codcli, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addComponent(jLabel4)
                                .addGap(43, 43, 43)
                                .addComponent(tf_somatotal, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(16, 16, 16)
                                .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_datavenda, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_obs, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(botao_primeiro)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(botao_anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(botao_proximo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(botao_ultimo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(botao_inserir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(botao_gravar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(botao_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(79, 79, 79)
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                                                .addComponent(jLabel11)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(botao_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(157, 157, 157))
                                                    .addComponent(tfPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(23, 23, 23)
                                                .addComponent(jButton2))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(45, 45, 45)
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel13)
                                                .addGap(149, 149, 149)))))
                                .addGap(114, 114, 114))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tfCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfPrecoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)))
                .addContainerGap(214, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(tf_datavenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_codcli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_somatotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(tf_obs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botao_primeiro, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(botao_anterior, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(botao_proximo, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(botao_ultimo, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(botao_inserir, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(botao_gravar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(botao_excluir, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(botao_alterar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCodProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPrecoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            
            String sqlinsert = "insert into Venda "
                    + " values ("
                    + tf_codigo.getText() + ",'"
                    + tf_datavenda.getText() + "',"
                    //+ tfCodProd.getText() + "','"
                    //+ cbProduto.getSelectedItem() + "','"
                    + tf_codcli.getText()+","
                    + tfPrecoVenda.getText() + ")";
            JOptionPane.showMessageDialog(null, "sql = " + sqlinsert);
            con_prodVenda.statement.executeUpdate(sqlinsert);
            JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!");
            atualizaEstoque(); 
            preencher_jtable();
           
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro a tentar Gravar o registro..." + erro);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void tfQuantidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfQuantidadeFocusLost
        tfPrecoVenda.setText(String.valueOf(Double.parseDouble(tfQuantidade.getText())
                * Double.parseDouble(tfPrecoCusto.getText())));
    }//GEN-LAST:event_tfQuantidadeFocusLost
    
    private void tfCodProdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfCodProdFocusLost
        atualizaComboBoxProd();
// TODO add your handling code here:
    }//GEN-LAST:event_tfCodProdFocusLost
    
    private void cbProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProdutoActionPerformed
        // procedimento para atualizar codigo do produto
        if (primeiraVezProd == false) {
            try {
                String sql = "select * from produto_servico Where nome_produto_servico like '" + cbProduto.getSelectedItem() + "'";
                con_estoque.executeSQL(sql);
                con_estoque.resultset.first();
                tfCodProd.setText(con_estoque.resultset.getString("id_produto_servico"));
                cbProduto.setSelectedItem(con_estoque.resultset.getString("nome_produto_servico"));
                qtdestoquetinha = con_estoque.resultset.getInt("estoque");
                 tfPrecoCusto.setText(con_estoque.resultset.getString("valor"));
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null,"Erro a tentar excluir o registro..."+erro);
            }
        }
        primeiraVezProd = false;
        
        
    }//GEN-LAST:event_cbProdutoActionPerformed
            
    private void tf_codcliFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tf_codcliFocusLost
        atualizaComboBoxCli();
        
        
    }//GEN-LAST:event_tf_codcliFocusLost
    
    private void cb_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_clienteActionPerformed
        // procedimento para atualizar codigo do cliente
        if (primeiraVezCli == false) {
            try {
                String sql = "select * from animal Where nome_animal like '" + cb_cliente.getSelectedItem() + "'";
                con_animal.executeSQL(sql);
                con_animal.resultset.first();
                tf_codcli.setText(con_animal.resultset.getString("id_animal"));
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null,"Erro a tentar excluir o registro..."+erro);
            }
        }
        primeiraVezCli = false;

// TODO add your handling code here:
    }//GEN-LAST:event_cb_clienteActionPerformed
                            
    private void botao_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_alterarActionPerformed
       
    }//GEN-LAST:event_botao_alterarActionPerformed
    
    private void botao_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_excluirActionPerformed
       
    }//GEN-LAST:event_botao_excluirActionPerformed
    
    private void botao_gravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_gravarActionPerformed
        //c�digo para Gravar os dados no Banco de Dados
        
        try {
          
            
            String sqlinsert = "insert into Venda "
                    + " values ('"
                    + tf_codigo.getText() + "','"
                    + tf_datavenda.getText() + "','"
                    + tf_codcli.getText() + "','"
                    + tf_somatotal.getText() + "')";
                    //+ tf_obs.getText() + "')";
            JOptionPane.showMessageDialog(null, "sql = " + sqlinsert);
            con_venda.statement.executeUpdate(sqlinsert);
            JOptionPane.showMessageDialog(null,"Gravação realizado com sucesso!");

            //atualiza o ResultSet
            con_venda.resultset = con_venda.statement.executeQuery("Select * from Venda");
            con_venda.resultset.first(); //posiciona no primeiro registro
            mostrar_dados(); //ir� chamar a fun��o em que ir� mstrar os dados no form
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro a tentar Gravar o registro..." + erro);
        }
    }//GEN-LAST:event_botao_gravarActionPerformed
    
    private void botao_inserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_inserirActionPerformed
        
        tf_codigo.setText("");
        tf_datavenda.setText("");
        tf_codcli.setText("");
        tf_somatotal.setText("");
        tf_obs.setText("");
        tf_codigo.requestFocus();
        tf_codigo.setEditable(false);
        try {            
            con_venda.executeSQL("select * from Venda");
            con_venda.resultset.last();
            int ultcod = con_venda.resultset.getInt("id_venda") + 1;
            tf_codigo.setText("" + ultcod);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não localizou dados " + erro);
        }
        //preencher_jtable();
    }//GEN-LAST:event_botao_inserirActionPerformed
    
    private void botao_anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_anteriorActionPerformed
        try {
            con_venda.resultset.previous();
            mostrar_dados();
            //preencher_jtable();
            navega = 1;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não pode ir para o registro anterior " + erro);
        }
    }//GEN-LAST:event_botao_anteriorActionPerformed
    
    private void botao_ultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_ultimoActionPerformed
        try {
            con_venda.resultset.last();
            mostrar_dados();
           // preencher_jtable();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não foi possivel ir para o ultimo registro " + erro);
        }
    }//GEN-LAST:event_botao_ultimoActionPerformed
    
    private void botao_primeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_primeiroActionPerformed
        try {
            con_venda.resultset.first();
            mostrar_dados();
            //preencher_jtable();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "N�o foi poss�vel ir para o primeiro registro " + erro);
        }
    }//GEN-LAST:event_botao_primeiroActionPerformed
    
    private void botao_proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_proximoActionPerformed
        try {
            con_venda.resultset.next();
            mostrar_dados();
            //preencher_jtable();
            navega = 2;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "N�o foi poss�vel ir para o pr�ximo registro " + erro);
        }
    }//GEN-LAST:event_botao_proximoActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new venda().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_alterar;
    private javax.swing.JButton botao_anterior;
    private javax.swing.JButton botao_excluir;
    private javax.swing.JButton botao_gravar;
    private javax.swing.JButton botao_inserir;
    private javax.swing.JButton botao_primeiro;
    private javax.swing.JButton botao_proximo;
    private javax.swing.JButton botao_ultimo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbProduto;
    private javax.swing.JComboBox cb_cliente;
    private javax.swing.ButtonGroup grupo_ordenacao;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tfCodProd;
    private javax.swing.JTextField tfPrecoCusto;
    private javax.swing.JTextField tfPrecoVenda;
    private javax.swing.JTextField tfQuantidade;
    private javax.swing.JTextField tf_codcli;
    private javax.swing.JTextField tf_codigo;
    private javax.swing.JTextField tf_datavenda;
    private javax.swing.JTextField tf_obs;
    private javax.swing.JTextField tf_somatotal;
    // End of variables declaration//GEN-END:variables
    
    public void mostrar_dados() {
        try {
            tf_codigo.setText(con_venda.resultset.getString("id_venda"));
            tf_datavenda.setText(con_venda.resultset.getString("data_venda"));
            tf_codcli.setText(con_venda.resultset.getString("id_animal"));
            tf_somatotal.setText(con_venda.resultset.getString("total_venda"));
            //tf_obs.setText(con_venda.resultset.getString("observacao"));
            
            atualizaComboBoxCli();
        } catch (SQLException erro) {
            if (navega == 1) {
                JOptionPane.showMessageDialog(null, "Olha, você já está no primeiro registro");
            } else if (navega == 2) {
                JOptionPane.showMessageDialog(null, "Olha, você já está no Último registro");
            } else {
                JOptionPane.showMessageDialog(null, "Não localizou dados " + erro);
            }
            navega = 0;
        }
    }

    public void atualiza_combo_box_cliente() {
    }
    
    public void preencher_jtable() {
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(200);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(50);
        
        con_venda.executeSQL("select * from venda where id_venda = " + tf_codigo.getText());
        
        
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);
        
        try {
            
            while (con_venda.resultset.next()) {
                modelo.addRow(new Object[]{con_venda.resultset.getString("id_venda"), con_venda.resultset.getString("data_venda"), con_venda.resultset.getString("id_animal"), con_venda.resultset.getString("total_venda")});
            }
            con_venda.resultset.first();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar no JTable " + erro);
        }
    }
    
    public void ordem_visualizacao(String Ordem) {
        ordenacao = Ordem;
        con_animal.executeSQL("select * from animal  order by " + ordenacao);
       // preencher_jtable();
        atualiza_combo_box_cliente();
        try {
            con_animal.resultset.first();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na ordenação dos dados " + erro);
        }
        mostrar_dados();
        
    }
    
    public void atualizaComboBoxCli() {
        // procedimento para atualizar jcombobox de cliente
        try {
            String sql = "select * from animal Where id_animal =" + tf_codcli.getText();
            con_animal.executeSQL(sql);
            con_animal.resultset.first();
            cb_cliente.setSelectedItem(con_animal.resultset.getString("nome_animal"));
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Não foi possivel localizar Animal");
            tf_codcli.requestFocus();            
        }
    }
    
    public void atualizaComboBoxProd() {
        // procedimento para atualizar jcombobox de produto
        try {
            String sql = "select * from produto_servico Where id_produto_servico =" + tfCodProd.getText();
            con_estoque.executeSQL(sql);
            con_estoque.resultset.first();
            cbProduto.setSelectedItem(con_estoque.resultset.getString("nome_produto_servico"));
            tfPrecoCusto.setText(con_estoque.resultset.getString("valor"));            
            qtdestoquetinha = con_estoque.resultset.getInt("estoque");            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Nao foi possivel localizar estoque");
            tfCodProd.requestFocus();            
        }
        
        
    }
    
    public void atualizaEstoque() {
        //c�digo para atualizar estoque
        int estoqueatual = qtdestoquetinha - Integer.parseInt(tfQuantidade.getText().trim());
        try {
            String sql = "UPDATE produto_servico SET estoque = " + estoqueatual
                    + " where id_produto_servico = " + tfCodProd.getText();
            JOptionPane.showMessageDialog(null, "sql = " + sql);
            con_estoque.statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Baixa no Estoque realizada com sucesso!");
            
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro a tentar dar baixa no estoque.." + erro);
        }
    }
}
