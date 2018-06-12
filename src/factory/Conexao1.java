
package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PauloGouveia
 */
public class Conexao1 {

private static final String URL_DB = "jdbc:postgresql://localhost:5432/CADMED";
private static final String USUARIO = "postgres";
    private static final String SENHA = "postgres";
    private  String status = "não conectado";

    public Connection criarConexao() {

        Connection conexao = null;

        try {
            conexao = DriverManager.getConnection(URL_DB, USUARIO, SENHA);

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        if (conexao != null) 
            status = "CONECTADO!";
           
         else 
            status = "NÃO CONECTADO";
            
        
        return conexao;
    }

    public String getStatus() {
        return status;

    }
}
