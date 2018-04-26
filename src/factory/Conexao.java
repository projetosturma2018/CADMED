/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException;

/**
 *
 * @author Wagner Morel
 */
public class Conexao {
 private static final String URL_DB = "jdbc:postgresql://localhost:5432/CADMED";
private static final String USUARIO = "postgres";
    private static final String SENHA = "postgres";
    private final  String status = "não conectado";

    public Conexao() {
       //To change body of generated methods, choose Tools | Templates.
    }
     public Connection getConnection() {
	
        
		Connection conexao = null;

        try {
            Class.forName("com.postgres.jdbc.Driver");
            conexao = DriverManager.getConnection(URL_DB, USUARIO, SENHA);

		} catch (ClassNotFoundException | SQLException e) {
		}
        
		return conexao;
     }
     
     public String getStatus() {
        return status;

    }
	}



