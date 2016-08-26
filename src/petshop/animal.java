/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * 
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
public class animal extends javax.swing.JFrame {

    conexao con_animal,con_raca;
    String ordenacao2 = "nome_animal";
    String ordenacao = "nome_raca";

    /** Creates new form Raca */
    public animal() {
        initComponents();
        con_animal = new conexao();
        con_raca=new conexao();
        con_animal.conecta();
        con_raca.conecta();
        con_animal.executeSQL("select * from animal order by " + ordenacao2);
        con_raca.executeSQL("select * from raca order by " + ordenacao);
        
        //preencher_jtable1();//preencher pesquisa do nome animal
        //preencher_jtable2();//preencher pesquisa do nome raça
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo_ordenacao = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        cod_animal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nome_animal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Pesquisa_animal = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        dta_animal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        especie_animal = new javax.swing.JTextField();
        pelagem_animal = new javax.swing.JTextField();
        cod_raca = new javax.swing.JTextField();
        n_raca = new javax.swing.JTextField();
        cod_cliente = new javax.swing.JTextField();
        tf_cliente = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Raça");

        jLabel2.setBackground(new java.awt.Color(255, 153, 51));
        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 18));
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Código:");

        cod_animal.setText(" ");
        cod_animal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cod_animalFocusLost(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 18));
        jLabel3.setText("Nome do Animal:");

        nome_animal.setText(" ");

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
        jLabel1.setText("Animal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(534, 534, 534)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(591, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        Pesquisa_animal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Pesquisa_animal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pesquisa_animalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Pesquisa_animal);

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 18));
        jLabel5.setText("Data de Nascimento:");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 1, 18));
        jLabel6.setText("Espécie:");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 1, 18));
        jLabel7.setText("Pelagem:");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 18));
        jLabel8.setText("Cód. Raça:");

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 18));
        jLabel9.setText("Nome:");

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 18));
        jLabel10.setText("Cód. Cliente:");

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 1, 18));
        jLabel11.setText("Nome:");

        cod_raca.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cod_racaFocusLost(evt);
            }
        });

        cod_cliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cod_clienteFocusLost(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/Add.png"))); // NOI18N
        jButton6.setToolTipText("Inserir Novo Registro");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Pesquisar Raça");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Pesquisar Cliente");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Pesquisar Animal");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(especie_animal)
                                        .addComponent(nome_animal, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                        .addComponent(cod_animal, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cod_raca, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cod_cliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dta_animal, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel11))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tf_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                            .addComponent(n_raca, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                            .addComponent(pelagem_animal))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton9)
                                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(443, 443, 443))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6)))
                        .addGap(477, 477, 477)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cod_animal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nome_animal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(dta_animal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton9)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(pelagem_animal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(n_raca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton7)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tf_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton8))
                            .addComponent(jLabel11)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(especie_animal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cod_raca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cod_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1280)/2, (screenSize.height-800)/2, 1280, 800);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        
         try
        {
                        
            String sqlinsert ="insert into animal " +
                    " values ("+
                    cod_animal.getText()+",'"
                    + nome_animal.getText() +"','"
                + dta_animal.getText() +"','"
                + especie_animal.getText() +"','"
                + pelagem_animal.getText() +"',"
                + cod_raca.getText()+","
                
                +cod_cliente.getText()+")";
               
                    //JOptionPane.showMessageDialog(null,"sql = "+sqlinsert);
                    con_animal.statement.executeUpdate(sqlinsert);
                    JOptionPane.showMessageDialog(null,"Gravação realizado com sucesso!");
                    
                    
            
            //atualiza o ResultSet
            con_animal.resultset = con_animal.statement.executeQuery("Select * from animal");
            
            con_animal.resultset.first(); //posiciona no primeiro registro
         
            
            cod_animal.setText("");
            nome_animal.setText("");
            dta_animal.setText("");
            especie_animal.setText("");
            pelagem_animal.setText("");
            cod_raca.setText("");
            n_raca.setText("");
            cod_cliente.setText("");
            tf_cliente.setText("");
            
            cod_animal.requestFocus();
            
            
        }
catch (SQLException erro)
{
    JOptionPane.showMessageDialog(null,"Erro a tentar Gravar o registro..."+erro);
}
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
             try
{
            String sql ="UPDATE animal SET nome_animal ='"+nome_animal.getText()+"',"+
                    "dt_nasc_animal = '" +dta_animal.getText()+"',"+
                    "especie_animal = ' " +especie_animal.getText()+"',"+
                    "pelagem_animal = '" +pelagem_animal.getText()+"',"+
                    "id_raca = " + cod_raca.getText()+","+
                    "id_cliente = " + cod_cliente.getText()+""+
                   
                    " where id_animal = "+cod_animal.getText();
            
            JOptionPane.showMessageDialog(null, "sql = " + sql);
            con_animal.statement.executeUpdate(sql);
            
          
            JOptionPane.showMessageDialog(null,"Alteração realizado com sucesso!");
            
            //atualiza o ResultSet
            con_animal.executeSQL("Select * from animal  order by "+ordenacao2);
           
            con_animal.resultset.next(); //posiciona no primeiro registro
            
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
            
            
            
            String comando = "DELETE FROM animal "
                    + " WHERE ID_animal = "
                    + cod_animal.getText();
            
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
                
                cod_animal.setText("");
                nome_animal.setText("");
                dta_animal.setText("");
                especie_animal.setText("");
                pelagem_animal.setText("");
               


                // Posiciona o cursor no jTextField1
                cod_animal.requestFocus();
                
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Problemas na conexão com o banco de dados!");
                
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        cod_animal.setText("");
        nome_animal.setText("");
        dta_animal.setText("");
        especie_animal.setText("");
        pelagem_animal.setText("");
         cod_raca.setText("");
          n_raca.setText("");     
          cod_cliente.setText("");
            tf_cliente.setText("");

        // Posiciona o cursor no jTextField1
        cod_animal.requestFocus();
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed
    
    private void cod_animalFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cod_animalFocusLost
        // TODO add your handling code here:
        String url = "jdbc:postgresql://localhost:5432/petshop";
        String driverbancodados = "org.postgresql.Driver";
        Connection con;
        String usuario = "postgres";
        String senha = "postgres";
        
        
        if (!cod_animal.getText().equalsIgnoreCase("")) {
            
            String comando = "SELECT * FROM animal "
                    + "WHERE id_animal = " + cod_animal.getText();
            
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
                    cod_animal.setText(result.getString("id_animal"));
                    nome_animal.setText(result.getString("nome_animal"));
                    dta_animal.setText(result.getString("dt_nasc_animal"));
                    especie_animal.setText(result.getString("especie_animal"));
                    pelagem_animal.setText(result.getString("pelagem_animal"));
                    cod_raca.setText(result.getString("id_raca"));
                    cod_cliente.setText(result.getString("id_cliente"));
               
                    
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Código não cadastrado! Pode usar para um novo cadastro!");
                    
                    nome_animal.setText("");
                    dta_animal.setText("");
                    especie_animal.setText("");
                    pelagem_animal.setText("");
                    
                }
                sent.close();
                con.close();
            } catch (SQLException ex) {
                System.out.println("Erro de consulta ao sair do campo");
            }
        }
    }//GEN-LAST:event_cod_animalFocusLost
            
    private void Pesquisa_animalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pesquisa_animalMouseClicked
        
    }//GEN-LAST:event_Pesquisa_animalMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        cod_animal.setText("");
        nome_animal.setText("");
        dta_animal.setText("");
        especie_animal.setText("");
        pelagem_animal.setText("");
        cod_raca.setText("");
        n_raca.setText("");
        cod_cliente.setText("");
        tf_cliente.setText("");
        nome_animal.requestFocus();
        cod_animal.setEditable(false);
        try
        {                
            con_animal.executeSQL("select * from animal order by id_animal");
            con_animal.resultset.last();
            int ultcod = con_animal.resultset.getInt("id_animal") + 1;
            cod_animal.setText(""+ultcod);
        }    
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null,"Não localizou dados "+erro);
        }
        preencher_jtable1();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
            
        con_animal.executeSQL("select * from animal where nome_animal like '%" + nome_animal.getText() + "%' ");
        preencher_jtable1();
          
    
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        con_raca.executeSQL("select * from raca where nome_raca like '%" + n_raca.getText() + "%'" );
        preencher_jtable2();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void cod_racaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cod_racaFocusLost
        String url = "jdbc:postgresql://localhost:5432/petshop";
        String driverbancodados = "org.postgresql.Driver";
        Connection con;
        String usuario = "postgres";
        String senha = "postgres";
        
        
        if (!cod_raca.getText().equalsIgnoreCase("")) {
            
            String comando = "SELECT * FROM raca "
                    + "WHERE id_raca = " + cod_raca.getText();
            
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
                    cod_raca.setText(result.getString("id_raca"));
                    n_raca.setText(result.getString("nome_raca"));
                    
               
                    
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Código não cadastrado! Pode usar para um novo cadastro!");
                    
                    n_raca.setText("");
                    
                    
                }
                sent.close();
                con.close();
            } catch (SQLException ex) {
                System.out.println("Erro de consulta ao sair do campo");
            }
        }
    }//GEN-LAST:event_cod_racaFocusLost

    private void cod_clienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cod_clienteFocusLost
        String url = "jdbc:postgresql://localhost:5432/petshop";
        String driverbancodados = "org.postgresql.Driver";
        Connection con;
        String usuario = "postgres";
        String senha = "postgres";
        
        
        if (!cod_cliente.getText().equalsIgnoreCase("")) {
            
            String comando = "SELECT * FROM cliente "
                    + "WHERE id_cliente= " + cod_cliente.getText();
            
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
                    cod_cliente.setText(result.getString("id_cliente"));
                    tf_cliente.setText(result.getString("nome_cliente"));
                    
               
                    
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Código não cadastrado! Pode usar para um novo cadastro!");
                    
                    tf_cliente.setText("");
                    
                    
                }
                sent.close();
                con.close();
            } catch (SQLException ex) {
                System.out.println("Erro de consulta ao sair do campo");
            }
        }
    }//GEN-LAST:event_cod_clienteFocusLost

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
                con_raca.executeSQL("select * from cliente where nome_cliente like '%" + tf_cliente.getText() + "%'" );
        preencher_jtable3();

    }//GEN-LAST:event_jButton8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new animal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Pesquisa_animal;
    private javax.swing.JTextField cod_animal;
    private javax.swing.JTextField cod_cliente;
    private javax.swing.JTextField cod_raca;
    private javax.swing.JTextField dta_animal;
    private javax.swing.JTextField especie_animal;
    private javax.swing.ButtonGroup grupo_ordenacao;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField n_raca;
    private javax.swing.JTextField nome_animal;
    private javax.swing.JTextField pelagem_animal;
    private javax.swing.JTextField tf_cliente;
    // End of variables declaration//GEN-END:variables

    public void preencher_jtable1() {
        Pesquisa_animal.getColumnModel().getColumn(0).setPreferredWidth(10);
        Pesquisa_animal.getColumnModel().getColumn(1).setPreferredWidth(70);
        
        
        DefaultTableModel modelo = (DefaultTableModel) Pesquisa_animal.getModel();
        modelo.setNumRows(0);
        
        
        
        
        
        try {
            while (con_animal.resultset.next()) {
                modelo.addRow(new Object[]{con_animal.resultset.getString("id_animal"), con_animal.resultset.getString("nome_animal")});
            }
            con_animal.resultset.first();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar no JTable " + erro);
        }
    }
        
         public void preencher_jtable2() {
        Pesquisa_animal.getColumnModel().getColumn(0).setPreferredWidth(10);
        Pesquisa_animal.getColumnModel().getColumn(1).setPreferredWidth(70);
        
        
        DefaultTableModel modelo = (DefaultTableModel) Pesquisa_animal.getModel();
        modelo.setNumRows(0);
        
        
        
        
        
        try {
            while (con_raca.resultset.next()) {
                modelo.addRow(new Object[]{con_raca.resultset.getString("id_raca"), con_raca.resultset.getString("nome_raca")});
            }
            con_raca.resultset.first();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar no JTable " + erro);
        }
         }
        
         public void preencher_jtable3() {
        Pesquisa_animal.getColumnModel().getColumn(0).setPreferredWidth(10);
        Pesquisa_animal.getColumnModel().getColumn(1).setPreferredWidth(70);
        
        
        DefaultTableModel modelo = (DefaultTableModel) Pesquisa_animal.getModel();
        modelo.setNumRows(0);
        
        
        
        
        
        try {
            while (con_raca.resultset.next()) {
                modelo.addRow(new Object[]{con_raca.resultset.getString("id_cliente"), con_raca.resultset.getString("nome_cliente")});
            }
            con_raca.resultset.first();
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao listar no JTable " + erro);
        }
    }
    
   
        
    
}
