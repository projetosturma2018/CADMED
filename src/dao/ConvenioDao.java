/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import factory.Conexao;
import modelo.Convenio;
import java.sql.*;
import java.sql.PreparedStatement;
/**
 *
 * @author Wagner Morel
 */
public class ConvenioDao {
    
    private final Connection conexao; 
    private int idConvenio;
    private int idPaciente;
    private String nomeConvenio;
    private String descricao;
   
    public ConvenioDao(){
        this.conexao = new Conexao().getConnection();
    }
    
 public void adiciona(Convenio convenio){
 
     String sql = "INSERT INTO convenio (id_convenio, nome_convenio, id_paciente, descricao) VALUES(?,?,?,?)";
    try { 
         try (PreparedStatement stmt = conexao.prepareStatement(sql)) {
             stmt.setString(1, convenio.getIdconvenio());
             stmt.setString(2, convenio.getNomeconvenio());
             stmt.setString(3, convenio.getIdpaciente());
             stmt.setString(4, convenio.getDescricao());
             stmt.execute();
         }
        } 
        catch (SQLException u) { 
            throw new RuntimeException(u);
 
     }
 
        }
}