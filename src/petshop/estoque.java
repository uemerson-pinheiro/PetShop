/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Raca.java
 *
 * Created on 05/05/2011, 22:32:03
 */
package petshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utilitarios.conexao;

/**
 *
 * @author Administrador
 */
public class estoque extends javax.swing.JFrame {

    conexao con_raca;
    String ordenacao = "id_produto_servico",tipo="P",destaque="N";

    /** Creates new form Raca */
    public estoque() {
        initComponents();
        con_raca = new conexao();
        con_raca.conecta();
        con_raca.executeSQL("select * from produto_servico order by " + ordenacao);
        
        preencher_jtable();
        
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo_ordenacao = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        cod_raca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        descricao = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Pesquisa_raca = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        tf_pesquisa = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        qtde = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        valor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        tipoProduto = new javax.swing.JRadioButton();
        tipoServico = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        destaqueSim = new javax.swing.JRadioButton();
        destaqueNao = new javax.swing.JRadioButton();
        grupo = new javax.swing.JTextField();
        subgrupo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Raça");

        jLabel2.setBackground(new java.awt.Color(255, 153, 51));
        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18));
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Código:");

        cod_raca.setText(" ");
        cod_raca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cod_racaFocusLost(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18));
        jLabel3.setText("Descrição:");

        descricao.setText(" ");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/gravar3.png"))); // NOI18N
        jButton1.setToolTipText("Gravar Registro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/edit-icon.png"))); // NOI18N
        jButton2.setToolTipText("Editar/Alterar Registro");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/delete-user-icon.png"))); // NOI18N
        jButton3.setToolTipText("Excluir Registro");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/ico-limpeza.png"))); // NOI18N
        jButton4.setToolTipText("Limpar todos Campos");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 36));
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Estoque Produto e Serviço");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(271, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        Pesquisa_raca.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nome", "Tipo"
            }
        ));
        jScrollPane1.setViewportView(Pesquisa_raca);

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 14));
        jLabel4.setText("Pesquisa:");

        jRadioButton1.setBackground(new java.awt.Color(153, 153, 255));
        grupo_ordenacao.add(jRadioButton1);
        jRadioButton1.setText("Código");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(153, 153, 255));
        grupo_ordenacao.add(jRadioButton2);
        jRadioButton2.setText("Nome");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jButton5.setText("Pesquisar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                        .addContainerGap(331, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addContainerGap(341, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2)
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18));
        jLabel5.setText("Quantidade:");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18));
        jLabel6.setText("Valor:");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 18));
        jLabel7.setText("Grupo:");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 18));
        jLabel8.setText("Sub-Grupo:");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setText("Tipo");

        grupo_ordenacao.add(tipoProduto);
        tipoProduto.setSelected(true);
        tipoProduto.setText("Produto");
        tipoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoProdutoActionPerformed(evt);
            }
        });

        grupo_ordenacao.add(tipoServico);
        tipoServico.setText("Serviço");
        tipoServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoServicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel9))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tipoServico)
                            .addComponent(tipoProduto))))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(tipoProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tipoServico)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setText("Destaque");

        buttonGroup1.add(destaqueSim);
        destaqueSim.setText("Sim");

        buttonGroup1.add(destaqueNao);
        destaqueNao.setSelected(true);
        destaqueNao.setText("Não");
        destaqueNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destaqueNaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(destaqueNao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(destaqueSim, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))
                        .addGap(34, 34, 34)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(destaqueSim)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(destaqueNao)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 18));
        jLabel11.setText("Nome:");

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/Add.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(subgrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(descricao, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5))
                                    .addComponent(nome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE))
                                .addGap(10, 10, 10)
                                .addComponent(qtde, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(jLabel6)
                                .addGap(8, 8, 8)
                                .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cod_raca, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(332, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cod_raca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel5))
                    .addComponent(qtde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(grupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel8))
                            .addComponent(subgrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6, 0, 0, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, 0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(102, 102, 102))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1251)/2, (screenSize.height-800)/2, 1251, 800);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        
         try {
            
            String sqlinsert = "insert into produto_servico values ("
                + cod_raca.getText() + ",'"
                 + nome.getText()+"','"  
                + descricao.getText() + "',"
                + qtde.getText()+","
                + valor.getText()+",'"
                + grupo.getText()+"','"
                + subgrupo.getText()+"','"
                + tipo+"','"
                + destaque+"')";
            
            //JOptionPane.showMessageDialog(null, "sql = " + sqlinsert);
            con_raca.statement.executeUpdate(sqlinsert);
            JOptionPane.showMessageDialog(null, "Gravação realizada com sucesso!");
           
            preencher_jtable();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro a tentar Gravar o registro..." + erro);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
         try
{
            String sql ="UPDATE produto_servico SET nome_produto_servico ='"+nome.getText()+"',"+
                    "descricao_detalhada = '" +descricao.getText()+"',"+
                    "estoque = ' " +qtde.getText()+"',"+
                    "valor = '" +valor.getText()+"',"+
                    "grupo = '" + grupo.getText()+"',"+
                    "subgrupo = '" + subgrupo.getText()+"',"+
                   "tipo = '" +tipo+"',"+
                    "destaque = '"  +destaque+"'"+
                    " where id_produto_servico = "+cod_raca.getText();
            
            JOptionPane.showMessageDialog(null, "sql = " + sql);
            con_raca.statement.executeUpdate(sql);
            
            
            JOptionPane.showMessageDialog(null,"Alteração realizado com sucesso!");
            
           
            con_raca.executeSQL("Select * from produto_servico  order by "+ordenacao);
           
            con_raca.resultset.next(); //posiciona no primeiro registro
            mostrar_dados(); //irá chamar a função em que irá mstrar os dados no form
        }
catch (SQLException erro)
{
    JOptionPane.showMessageDialog(null,"Erro a tentar Alterar o registro..."+erro);
}
        
        
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String url = "jdbc:postgresql://localhost:5432/petshop";
        String driverbancodados = "org.postgresql.Driver";
        Connection con;
        String usuario = "postgres";
        String senha = "postgres";
        
        int opcao;
        Object[] botao = {"SIM", "NÃO"};
        
        opcao = JOptionPane.showOptionDialog(null, "Deseja realmente excluir?", "EXCLUIR",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, botao, botao[0]);
        
        if (opcao == JOptionPane.YES_OPTION) {
            
            
            
            String comando = "DELETE FROM produto_servico "
                    + " WHERE ID_produto_servico = "
                    + cod_raca.getText();
            
            Statement stmt;
            try {
                Class.forName(driverbancodados);
            } catch (java.lang.ClassNotFoundException e1) {
                JOptionPane.showMessageDialog(null, "Problema na carga do driver do banco de dados! Chame o Analista de Sistemas!");
            }
            
            try {
                con = DriverManager.getConnection(url, usuario, senha);
                stmt = con.createStatement();
                int rs = stmt.executeUpdate(comando);
                JOptionPane.showMessageDialog(null, "Exclusão Efetuada com Sucesso!");
                
                stmt.close();
                con.close();
                
                cod_raca.setText("");
                nome.setText("");
                descricao.setText("");
                qtde.setText("");
                 valor.setText("");
                grupo.setText("");
                subgrupo.setText("");


                // Posiciona o cursor no jTextField1
                cod_raca.requestFocus();
                
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Problemas na conexão com o banco de dados!");
                
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        cod_raca.setText("");
        nome.setText("");
        descricao.setText("");
        qtde.setText("");
        valor.setText("");
        grupo.setText("");
        subgrupo.setText("");


        // Posiciona o cursor no jTextField1
        cod_raca.requestFocus();
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed
    
    private void cod_racaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cod_racaFocusLost
        // TODO add your handling code here:
        String url = "jdbc:postgresql://localhost:5432/petshop";
        String driverbancodados = "org.postgresql.Driver";
        Connection con;
        String usuario = "postgres";
        String senha = "postgres";
        
        
        if (!cod_raca.getText().equalsIgnoreCase("")) {
            
            String comando = "SELECT * FROM produto_servico "
                    + "WHERE id_produto_servico = " + cod_raca.getText();
            
            Statement stmt;
            try {
                Class.forName(driverbancodados);
            } catch (java.lang.ClassNotFoundException e1) {
                JOptionPane.showMessageDialog(null, "Problema na carga do driver do banco de dados! Chame o Analista de Sistemas!");
            }
            try {
                con = DriverManager.getConnection(url, usuario, senha);
                Statement sent = con.createStatement();
                ResultSet result = sent.executeQuery(comando);
                if (result.next()) {
                    cod_raca.setText(result.getString("id_produto_servico"));
                    nome.setText(result.getString("nome_produto_servico"));
                    descricao.setText(result.getString("descricao_detalhada"));
                    qtde.setText(result.getString("estoque"));
                    valor.setText(result.getString("valor"));
                    grupo.setText(result.getString("grupo"));
                    subgrupo.setText(result.getString("subgrupo"));
                    if(con_raca.resultset.getString("tipo").equals("P"))
                        tipoProduto.setSelected(true);
                    else
                        tipoServico.setSelected(true);

                    
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Código não cadastrado! Pode usar para um novo cadastro!");
                    nome.setText("");
                    descricao.setText("");
                    qtde.setText("");
                    valor.setText("");
                    grupo.setText("");
                    subgrupo.setText("");
                    
                }
                sent.close();
                con.close();
            } catch (SQLException ex) {
                System.out.println("Erro de consulta ao sair do campo");
            }
        }
    }//GEN-LAST:event_cod_racaFocusLost
    
    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        ordem_visualizacao("nome_produto_servico");
}//GEN-LAST:event_jRadioButton2ActionPerformed
    
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        ordem_visualizacao("id_produto_servico");
}//GEN-LAST:event_jRadioButton1ActionPerformed
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        con_raca.executeSQL("select * from produto_servico where nome_produto_servico like '%" + tf_pesquisa.getText() + "%' order by " + ordenacao);        
        preencher_jtable();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tipoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoProdutoActionPerformed
        tipo="P";
    }//GEN-LAST:event_tipoProdutoActionPerformed

    private void tipoServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoServicoActionPerformed
    tipo="S";
    }//GEN-LAST:event_tipoServicoActionPerformed

    private void destaqueNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destaqueNaoActionPerformed
      destaque="N";
    }//GEN-LAST:event_destaqueNaoActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        cod_raca.setText("");
        nome.setText("");
        descricao.setText("");
        qtde.setText("");
        valor.setText("");
        grupo.setText("");
        subgrupo.setText("");
        //tipo="P";
        //destaque="S";
        cod_raca.setEditable(false);
        try
        {                
            con_raca.executeSQL("select * from produto_servico ");
            con_raca.resultset.last();
            int ultcod = con_raca.resultset.getInt("id_produto_servico") + 1;
            cod_raca.setText(""+ultcod);
        }    
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null,"Não localizou dados "+erro);
        }
        preencher_jtable();
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new estoque().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Pesquisa_raca;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cod_raca;
    private javax.swing.JTextField descricao;
    private javax.swing.JRadioButton destaqueNao;
    private javax.swing.JRadioButton destaqueSim;
    private javax.swing.JTextField grupo;
    private javax.swing.ButtonGroup grupo_ordenacao;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField qtde;
    private javax.swing.JTextField subgrupo;
    private javax.swing.JTextField tf_pesquisa;
    private javax.swing.JRadioButton tipoProduto;
    private javax.swing.JRadioButton tipoServico;
    private javax.swing.JTextField valor;
    // End of variables declaration//GEN-END:variables

    public void preencher_jtable() {
        Pesquisa_raca.getColumnModel().getColumn(0).setPreferredWidth(10);
        Pesquisa_raca.getColumnModel().getColumn(1).setPreferredWidth(70);
        Pesquisa_raca.getColumnModel().getColumn(2).setPreferredWidth(10);
        
        
        DefaultTableModel modelo = (DefaultTableModel) Pesquisa_raca.getModel();
        modelo.setNumRows(0);
        
        
        
        
        
        try {
            while (con_raca.resultset.next()) {
                modelo.addRow(new Object[]{con_raca.resultset.getString("id_produto_servico"), 
                    con_raca.resultset.getString("nome_produto_servico"),con_raca.resultset.getString("tipo")});
            }
            con_raca.resultset.first();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar no JTable " + erro);
        }        
    }
    
    public void ordem_visualizacao(String Ordem) {
        ordenacao = Ordem;
        con_raca.executeSQL("select * from produto_servico  order by " + ordenacao);        
        preencher_jtable();
        
        try {
            con_raca.resultset.first();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na ordenação dos dados " + erro);
        }
        
        
    }
    
     public void mostrar_dados()
{
        try
{
            cod_raca.setText(con_raca.resultset.getString("id_produto_servico"));
            nome.setText(con_raca.resultset.getString("nome_produto_servico"));
            descricao.setText(con_raca.resultset.getString("descricao_detalhada"));
            qtde.setText(con_raca.resultset.getString("estoque"));
            valor.setText(con_raca.resultset.getString("valor"));
            grupo.setText(con_raca.resultset.getString("grupo"));
            subgrupo.setText(con_raca.resultset.getString("subgrupo"));
            if (con_raca.resultset.getString("tipo").equals("P"))
                tipoProduto.setSelected(true);
            else
                tipoServico.setSelected(true);
        
                if(con_raca.resultset.getString("destaque").equals("N"))
                    destaqueNao.setSelected(true);
                else
                    destaqueSim.setSelected(true);
                    
                    }
catch(SQLException erro)
{
   
        JOptionPane.showMessageDialog(null,"Não localizou dados "+erro);
    
}
    }
}
