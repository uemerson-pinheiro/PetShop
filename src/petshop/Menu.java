/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Menu.java
 *
 * Created on 02/05/2011, 20:52:13
 */
package petshop;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;


/**
 *
 * @author USER
 */
public class Menu extends javax.swing.JFrame {
        
 String seta_look="javax.swing.plaf.metal.MetalLookAndFeel";
  Data mostra_data;  

    /** Creates new form Menu */
    public Menu() {
        initComponents();
        mostra_data=new Data();
        mostra_data.le_data();
        label_data.setText("Data :"+mostra_data.dia+" / "+mostra_data.mes+" / "+mostra_data.ano);
       lookandfeel();
       
       timer1.start();
        
        
    }
       
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timer1 = new org.netbeans.examples.lib.timerbean.Timer();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        label_data = new javax.swing.JLabel();
        label_hora = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        cadastro = new javax.swing.JMenu();
        cliente = new javax.swing.JMenuItem();
        animal = new javax.swing.JMenuItem();
        raca = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        usuario = new javax.swing.JMenuItem();
        servico = new javax.swing.JMenu();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        fornecedor = new javax.swing.JMenuItem();
        venda = new javax.swing.JMenu();
        compra = new javax.swing.JMenu();
        utilitarios = new javax.swing.JMenu();
        Util_cor = new javax.swing.JMenu();
        cor_metal = new javax.swing.JMenuItem();
        cor_windows = new javax.swing.JMenuItem();
        sair = new javax.swing.JMenu();

        timer1.addTimerListener(new org.netbeans.examples.lib.timerbean.TimerListener() {
            public void onTime(java.awt.event.ActionEvent evt) {
                timer1OnTime(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Petshop v.2011");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 36));
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("PETSHOP  Cãopanheiro");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, -1));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 12));
        jLabel1.setText("Sistema Desenvolvido por: Uemersom Pinheiro e Flávio Henrique");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/1266070282_74021699_4-Racoes-de-varias-marcas-para-todo-o-tipo-de-animais-Compra-Venda-1266070282.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 630, 190));

        label_data.setFont(new java.awt.Font("Tahoma", 1, 24));
        label_data.setText("Data:");
        getContentPane().add(label_data, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 550, 330, 60));

        label_hora.setFont(new java.awt.Font("Tahoma", 1, 24));
        label_hora.setText("Hora:");
        getContentPane().add(label_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 610, 270, 60));

        cadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/cadastro.png"))); // NOI18N
        cadastro.setMnemonic('c');
        cadastro.setText("Cadastro");
        cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroActionPerformed(evt);
            }
        });

        cliente.setText("Cliente");
        cliente.setPreferredSize(new java.awt.Dimension(87, 22));
        cliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clienteMouseClicked(evt);
            }
        });
        cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteActionPerformed(evt);
            }
        });
        cadastro.add(cliente);

        animal.setText("Animal");
        animal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                animalActionPerformed(evt);
            }
        });
        cadastro.add(animal);

        raca.setText("Raça");
        raca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                racaMouseClicked(evt);
            }
        });
        raca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                racaActionPerformed(evt);
            }
        });
        cadastro.add(raca);
        cadastro.add(jSeparator1);

        usuario.setText("Usuário");
        usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuarioMouseClicked(evt);
            }
        });
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });
        cadastro.add(usuario);

        servico.setText("Produtos e Serviços");
        servico.setActionCommand("Produtos e Serviço");
        cadastro.add(servico);
        cadastro.add(jSeparator2);

        fornecedor.setText("Fornecedor");
        fornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fornecedorActionPerformed(evt);
            }
        });
        cadastro.add(fornecedor);

        jMenuBar1.add(cadastro);

        venda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/cifrao.png"))); // NOI18N
        venda.setMnemonic('v');
        venda.setText("Venda");
        venda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vendaMouseClicked(evt);
            }
        });
        venda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendaActionPerformed(evt);
            }
        });
        jMenuBar1.add(venda);

        compra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/icone_carrinho.png"))); // NOI18N
        compra.setMnemonic('o');
        compra.setText("Compra");
        compra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                compraMouseClicked(evt);
            }
        });
        compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compraActionPerformed(evt);
            }
        });
        jMenuBar1.add(compra);

        utilitarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/icone-glary-utilities-world-windows.png"))); // NOI18N
        utilitarios.setText("Utilitários");

        Util_cor.setText("Cor de Fundo");

        cor_metal.setText("Metal");
        cor_metal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cor_metalActionPerformed(evt);
            }
        });
        Util_cor.add(cor_metal);

        cor_windows.setText("Motif");
        cor_windows.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cor_windowsActionPerformed(evt);
            }
        });
        Util_cor.add(cor_windows);

        utilitarios.add(Util_cor);

        jMenuBar1.add(utilitarios);

        sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/exit.png"))); // NOI18N
        sair.setMnemonic('s');
        sair.setText("Sair");
        sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sairMouseClicked(evt);
            }
        });
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        jMenuBar1.add(sair);

        setJMenuBar(jMenuBar1);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1280)/2, (screenSize.height-800)/2, 1280, 800);
    }// </editor-fold>//GEN-END:initComponents

    private void sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairMouseClicked
            System.exit(0);
    }//GEN-LAST:event_sairMouseClicked

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
          System.exit(0);
    }//GEN-LAST:event_sairActionPerformed

    private void usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioMouseClicked
         //new cadUsuario().setVisible(true);      
    }//GEN-LAST:event_usuarioMouseClicked

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        new cadUsuario().setVisible(true);   
    }//GEN-LAST:event_usuarioActionPerformed

    private void cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroActionPerformed
        
    }//GEN-LAST:event_cadastroActionPerformed

    private void clienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clienteMouseClicked
      
    }//GEN-LAST:event_clienteMouseClicked

    private void clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteActionPerformed
              // TODO add your handling code here:
    }//GEN-LAST:event_clienteActionPerformed

    private void fornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fornecedorActionPerformed
        new fornecedor().setVisible(true);
    }//GEN-LAST:event_fornecedorActionPerformed

    private void racaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_racaActionPerformed
       new Raca().setVisible(true);
    }//GEN-LAST:event_racaActionPerformed

    private void cor_metalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cor_metalActionPerformed
       seta_look="com.sun.java.swing.plaf.windows.WindowsLookAndFeel";
       lookandfeel();
    }//GEN-LAST:event_cor_metalActionPerformed

    private void cor_windowsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cor_windowsActionPerformed
        seta_look="com.sun.java.swing.plaf.motif.MotifLookAndFeel";
        lookandfeel();
    }//GEN-LAST:event_cor_windowsActionPerformed

    private void animalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_animalActionPerformed
         
    }//GEN-LAST:event_animalActionPerformed

    private void racaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_racaMouseClicked
new Raca().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_racaMouseClicked

    private void timer1OnTime(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timer1OnTime
        mostra_data.le_hora();
       label_hora.setText("Hora :"+mostra_data.hora);
    }//GEN-LAST:event_timer1OnTime

    private void vendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendaActionPerformed
              // TODO add your handling code here:
    }//GEN-LAST:event_vendaActionPerformed

    private void compraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compraActionPerformed
        new compra().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_compraActionPerformed

    private void vendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vendaMouseClicked
       // TODO add your handling code here:
    }//GEN-LAST:event_vendaMouseClicked

    private void compraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_compraMouseClicked
       new compra().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_compraMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Menu().setVisible(true);
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Util_cor;
    private javax.swing.JMenuItem animal;
    private javax.swing.JMenu cadastro;
    private javax.swing.JMenuItem cliente;
    private javax.swing.JMenu compra;
    private javax.swing.JMenuItem cor_metal;
    private javax.swing.JMenuItem cor_windows;
    private javax.swing.JMenuItem fornecedor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel label_data;
    private javax.swing.JLabel label_hora;
    private javax.swing.JMenuItem raca;
    private javax.swing.JMenu sair;
    private javax.swing.JMenu servico;
    private org.netbeans.examples.lib.timerbean.Timer timer1;
    private javax.swing.JMenuItem usuario;
    private javax.swing.JMenu utilitarios;
    private javax.swing.JMenu venda;
    // End of variables declaration//GEN-END:variables
public void lookandfeel(){
    
    try{
        UIManager.setLookAndFeel(seta_look);
        SwingUtilities.updateComponentTreeUI(this);
    }
    catch(Exception erro){
        JOptionPane.showMessageDialog(null, erro);
        
    }
}

    


}
