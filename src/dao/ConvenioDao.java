/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import factory.Conexao1;
import modelo.ConvenioModel;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author PauloGouveia
 */
public class ConvenioDao {
    
    Conexao1 conexao = new Conexao1();
    Connection conex = conexao.criarConexao();
    
     public int salvarConvenio(ConvenioModel convenio) {
        String sqlInsert = " INSERT "
                + " INTO"
                + " convenio(nome_convenio)"        
                + " VALUES(?)";

        try {
            PreparedStatement preparacaoSalvar = conex.prepareStatement(sqlInsert);
            preparacaoSalvar.setString(1,convenio.getNomeConvenio());
            
            preparacaoSalvar.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public List<ConvenioModel> listarTodosConvenio() {
        String sqlSelectAll = "SELECT * FROM convenio";
        List<ConvenioModel> listaDeTodosConvenio = new ArrayList<ConvenioModel>();
        try {

            PreparedStatement preparacaoSelectAll = conex.prepareStatement(sqlSelectAll);
            ResultSet resultadoListaTodos = preparacaoSelectAll.executeQuery();

            while (resultadoListaTodos.next()) {
                ConvenioModel convenio = new ConvenioModel();
                convenio.setNomeConvenio(resultadoListaTodos.getString("nome"));
                
                listaDeTodosConvenio.add(convenio);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(ConvenioModel.class.getName()).log(Level.SEVERE, null, ex);

            return null;

        }
        return listaDeTodosConvenio;
    }

    public void atualizarConvenio(ConvenioModel convenio) {
        String sqlUpdate = "update convenio "
                + " set nome_convenio = ? "
                + " where id_convenio = ? ";
        try {

            PreparedStatement preparacaoUpdate = conex.prepareStatement(sqlUpdate);
            preparacaoUpdate.setString(1,convenio.getNomeConvenio());
            
            preparacaoUpdate.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ConvenioModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ExcluirConvenio(ConvenioModel convenio) {
        String sqlDelete = "delete from convenio"
                + " where id_convenio = ?";

        try {
            PreparedStatement preparacaoDelete = conex.prepareStatement(sqlDelete);
            preparacaoDelete.setInt(1, convenio.getIdConvenio());
            preparacaoDelete.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(ConvenioModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ConvenioModel listarPorIdConvenio(int idConvenio) {
        ConvenioModel convenio = new ConvenioModel();

        String sqlSelect = " SELECT * FROM convenio WHERE id_convenio = " + idConvenio;

        try {

            PreparedStatement preparacaoSelect = conex.prepareStatement(sqlSelect);
            ResultSet resultadoListar = preparacaoSelect.executeQuery();

            {
                if (resultadoListar.next()) {
                    convenio.setNomeConvenio(resultadoListar.getString("nome"));
                   
                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(ConvenioModel.class.getName()).log(Level.SEVERE, null, ex);

            return null;

        }
        return convenio;
    }


}

