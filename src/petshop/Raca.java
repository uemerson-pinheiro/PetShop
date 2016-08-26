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
public class Raca extends javax.swing.JFrame {
    conexao con_raca;
    String ordenacao="nome_raca";
    /** Creates new form Raca */
    public Raca() {
        initComponents();
        con_raca = new conexao();
        con_raca.conecta();
        con_raca.executeSQL("select * from raca order by "+ordenacao);
       
        preencher_jtable();
    


    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo_ordenacao = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        cod_raca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nome_raca = new javax.swing.JTextField();
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
        jLabel3.setText("Nome da Raça:");

        nome_raca.setText(" ");

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
        jLabel1.setText("RAÇA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(534, 534, 534)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(539, Short.MAX_VALUE))
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
        Pesquisa_raca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Pesquisa_racaMouseClicked(evt);
            }
        });
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
        jRadioButton2.setSelected(true);
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
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                        .addContainerGap(356, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addContainerGap(390, Short.MAX_VALUE))))
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

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/print.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(88, 88, 88)
                                        .addComponent(cod_raca, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(26, 26, 26)
                                        .addComponent(nome_raca, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
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
                                        .addComponent(jButton6)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 284, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(cod_raca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(nome_raca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton6, 0, 0, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(209, 209, 209))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1280)/2, (screenSize.height-800)/2, 1280, 800);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    String url = "jdbc:postgresql://localhost:5432/petshop";
    String driverbancodados = "org.postgresql.Driver";
    Connection con;
    String usuario= "postgres";
    String senha= "postgres";

         String comando = "INSERT INTO raca VALUES (" +

            cod_raca.getText() + ",'" +
            nome_raca.getText() + "')"  ;


	Statement stmt;
    try {
            Class.forName(driverbancodados);
    } 		catch(java.lang.ClassNotFoundException e1) {
        		JOptionPane.showMessageDialog(null, "Problema na carga do driver do banco de dados! Chame o Analista de Sistemas!");
    }

    try {
        con = DriverManager.getConnection(url, usuario, senha);
        stmt = con.createStatement();
        int rs = stmt.executeUpdate(comando);
        JOptionPane.showMessageDialog(null, "Cadastro da Raça Efetuado com Sucesso!");

        stmt.close();
        con.close();

                    cod_raca.setText("");
                    nome_raca.setText("");
                    

                    // Posiciona o cursor no jTextField1
                    cod_raca.requestFocus();


        } catch(SQLException ex) {
          JOptionPane.showMessageDialog(null, "Problemas na conexão com o banco de dados!");

}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
            String url = "jdbc:postgresql://localhost:5432/petshop";
            String driverbancodados = "org.postgresql.Driver";
            Connection con;
            String usuario= "postgres";
            String senha= "postgres";


        String comando = "UPDATE raca SET nome_raca = '" + nome_raca.getText() + "'"
                                      + " WHERE id_raca = "+ cod_raca.getText();

	Statement stmt;
	try {Class.forName(driverbancodados);  }
		catch(java.lang.ClassNotFoundException e1) {JOptionPane.showMessageDialog(null, "Problema na carga do driver do banco de dados! Chame o Analista de Sistemas!");}

	try { con = DriverManager.getConnection(url, usuario, senha);
	stmt = con.createStatement();
	int rs = stmt.executeUpdate(comando);
	JOptionPane.showMessageDialog(null, "Alteração com Sucesso!");
	stmt.close();
	con.close();

                
		nome_raca.setText("");

                cod_raca.requestFocus();     // Posiciona o cursor no
        }

		catch(SQLException ex) { JOptionPane.showMessageDialog(null, "Problemas na conexão com o banco de dados!");  }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
            String url = "jdbc:postgresql://localhost:5432/petshop";
            String driverbancodados = "org.postgresql.Driver";
            Connection con;
            String usuario= "postgres";
            String senha= "postgres";

        int opcao;
       		Object[] botao={"SIM","NÃO"};

        opcao=JOptionPane.showOptionDialog(null,"Deseja realmente excluir?","EXCLUIR",
           JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,botao,botao[0]);

         if (opcao==JOptionPane.YES_OPTION){



        String comando = "DELETE FROM raca " +
                " WHERE ID_raca = " +
                cod_raca.getText();

        Statement stmt;
        try {
                Class.forName(driverbancodados);
        } catch(java.lang.ClassNotFoundException e1) {
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
                        nome_raca.setText("");


                        // Posiciona o cursor no jTextField1
                        cod_raca.requestFocus();


            } catch(SQLException ex) {
              JOptionPane.showMessageDialog(null, "Problemas na conexão com o banco de dados!");

    }}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
             cod_raca.setText("");
            nome_raca.setText("");


            // Posiciona o cursor no jTextField1
            cod_raca.requestFocus();



    }//GEN-LAST:event_jButton4ActionPerformed

    private void cod_racaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cod_racaFocusLost
        // TODO add your handling code here:
         String url = "jdbc:postgresql://localhost:5432/petshop";
    String driverbancodados = "org.postgresql.Driver";
    Connection con;
    String usuario= "postgres";
    String senha= "postgres";


        if (!cod_raca.getText().equalsIgnoreCase("")){

    String comando = "SELECT * FROM raca " +
            "WHERE id_raca = " + cod_raca.getText() ;

    Statement stmt;
    try {
            Class.forName(driverbancodados);
    } catch(java.lang.ClassNotFoundException e1) {
        JOptionPane.showMessageDialog(null, "Problema na carga do driver do banco de dados! Chame o Analista de Sistemas!");
    }
    try
{
        con = DriverManager.getConnection(url, usuario, senha);
        Statement sent= con.createStatement();
        ResultSet result = sent.executeQuery(comando);
        if(result.next())
        {
                cod_raca.setText(result.getString("id_raca"));
                nome_raca.setText(result.getString("nome_raca"));


        }
        else
        {
        JOptionPane.showMessageDialog(null, "Código não cadastrado! Pode usar para um novo cadastro!");
     
        nome_raca.setText("");

                    }
                    sent.close();
                    con.close();
            }
            catch(SQLException ex)
            {
                    System.out.println("Erro de consulta ao sair do campo");
            }
    }
    }//GEN-LAST:event_cod_racaFocusLost

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        ordem_visualizacao("nome_raca");
}//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        ordem_visualizacao("id_raca");
}//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        con_raca.executeSQL("select * from raca where nome_raca like '%"+tf_pesquisa.getText()+"%' order by "+ordenacao);          
        preencher_jtable();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new relatorios.relatorioRaca();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void Pesquisa_racaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Pesquisa_racaMouseClicked
        int linha_selecionada = Pesquisa_raca.getSelectedRow(); //pegar a linha selecionada
        cod_raca.setText(Pesquisa_raca.getValueAt(linha_selecionada, 0).toString());
        nome_raca.setText(Pesquisa_raca.getValueAt(linha_selecionada, 1).toString());
    }//GEN-LAST:event_Pesquisa_racaMouseClicked

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Raca().setVisible(true);
            }
           
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Pesquisa_raca;
    private javax.swing.JTextField cod_raca;
    private javax.swing.ButtonGroup grupo_ordenacao;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nome_raca;
    private javax.swing.JTextField tf_pesquisa;
    // End of variables declaration//GEN-END:variables

    public void preencher_jtable()
    {
        Pesquisa_raca.getColumnModel().getColumn(0).setPreferredWidth(10);
        Pesquisa_raca.getColumnModel().getColumn(1).setPreferredWidth(70);
        
         
        DefaultTableModel modelo = (DefaultTableModel)Pesquisa_raca.getModel();
        modelo.setNumRows(0);
        
        
    
        
        
        try
        {
           while (con_raca.resultset.next()) 
                 modelo.addRow(new Object [] {con_raca.resultset.getString("id_raca"),con_raca.resultset.getString("nome_raca")});
                 con_raca.resultset.first();
          
         }  
         catch (SQLException erro){
             JOptionPane.showMessageDialog(null,"Erro ao listar no JTable "+erro);
        }  
    }
    
    
    public void ordem_visualizacao(String Ordem)
    {
        ordenacao = Ordem;
        con_raca.executeSQL("select * from raca  order by "+ordenacao);           
        preencher_jtable();
      
        try
        {
            con_raca.resultset.first();
        }
         catch (SQLException erro){
             JOptionPane.showMessageDialog(null,"Erro na ordenação dos dados "+erro);
        }
        
        
    }

    
}
