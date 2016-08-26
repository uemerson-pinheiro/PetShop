package utilitarios;
import java.sql.*;
import javax.swing.*;

public class conexao
{
        final private String driver = "org.postgresql.Driver";
        // voces verão ainda como efetuar conexão com diversos bancos
        final private String url = "jdbc:postgresql://localhost:5432/petshop";
        final private String usuario = "postgres";
        final private String senha = "postgres";
        private Connection conexao;
        public Statement statement;
        public ResultSet resultset;
    public String executeSQL;
        
       public boolean conecta()
       {
            boolean result = true;
            try 
            {
                Class.forName(driver);
                conexao = DriverManager.getConnection(url, usuario, senha);
                //JOptionPane.showMessageDialog(null,"conectou");
            }
            catch(ClassNotFoundException Driver) 
            {
               JOptionPane.showMessageDialog(null,"Driver não localizado: "+Driver);
               result = false;
            }
            catch(SQLException Fonte) 
            {
                JOptionPane.showMessageDialog(null,"Deu erro na conexão "+
                        "com a fonte de dados: "+Fonte);
                result = false;
            }
            return result; 
       }
       
       public void desconecta()
       {
            boolean result = true;
            try 
            {
                conexao.close();
                JOptionPane.showMessageDialog(null,"banco fechado");
            }
            catch(SQLException fecha) 
            {
                JOptionPane.showMessageDialog(null,"Não foi possivel "+
                        "fechar o banco de dados: "+fecha);
                result = false;
            }

       }
       
       public void executeSQL(String sql)
       {
            try 
            {
                statement = conexao.createStatement(
                        ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
                resultset = statement.executeQuery(sql);
            }
            catch(SQLException sqlex) 
            {
               JOptionPane.showMessageDialog(null,"Não foi possível "+
                       "executar o comando sql,"+sqlex+", o sql passado foi "+sql);
            }

       }

    public String getString(String string) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
       
}