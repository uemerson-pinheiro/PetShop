package relatorios;

import java.util.HashMap;
import javax.swing.JOptionPane;



import utilitarios.conexao;

public class relatorioRaca {

    
    conexao con = new conexao();


public relatorioRaca() {
  try 
  {
      con.conecta();
      con.executeSQL("SELECT * from raca");
      JRResultSetDataSource jrRS = new JRResultSetDataSource(con.resultset);
      JasperPrint jasperPrint = JasperFillManager.fillReport(
      "relatorios/report1.jasper", new HashMap(), jrRS);
      JasperViewer.viewReport(jasperPrint);
  } catch (Exception erro){
             JOptionPane.showMessageDialog(null,"deu erro ="+erro);
   }
}

  public static void main (String args[]) 
  {
    new relatorioRaca(); 
  }
}

