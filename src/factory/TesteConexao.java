/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;
import java.sql.Connection; 
import java.sql.SQLException;
/**
 *
 * @author Wagner Morel
 */
public class TesteConexao {
  
    public static void main(String[] args) throws SQLException {
        try (Connection conexao = new Conexao().getConnection()) {
            System.out.println("Conexão aberta!");
        }
     }
}
