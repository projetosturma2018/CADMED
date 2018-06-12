/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import factory.Conexao;
import factory.Conexao1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.PacienteModel;

/**
 *
 * @author PauloGouveia
 */


public class PacienteDAO {
    
    Conexao1 conexao = new Conexao1();
    Connection conex = conexao.criarConexao();

    public int salvarPaciente(PacienteModel paciente) {
        String sqlInsert = " INSERT "
                + " INTO"
                + " paciente(nome, cpf, endereco, rg, sexo, telefone, data_nascimento, medico_responsavel)"        
                + " VALUES(?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement preparacaoSalvar = conex.prepareStatement(sqlInsert);
            preparacaoSalvar.setString(1,paciente.getNome());
            preparacaoSalvar.setString(2, paciente.getCpf());
            preparacaoSalvar.setString(3, paciente.getEndereco());
            preparacaoSalvar.setString(4, paciente.getRg());
            preparacaoSalvar.setString(5, paciente.getSexo());
            preparacaoSalvar.setString(6, paciente.getTelefone());
            preparacaoSalvar.setString(7, paciente.getDataNascimento());
            preparacaoSalvar.setString(8, paciente.getMedicoResponsavel());
            preparacaoSalvar.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public List<PacienteModel> listarTodosPaciente() {
        String sqlSelectAll = "SELECT * FROM paciente";
        List<PacienteModel> listaDeTodosPaciente = new ArrayList<PacienteModel>();
        try {

            PreparedStatement preparacaoSelectAll = conex.prepareStatement(sqlSelectAll);
            ResultSet resultadoListaTodos = preparacaoSelectAll.executeQuery();

            while (resultadoListaTodos.next()) {
                PacienteModel paciente = new PacienteModel();
                paciente.setIdPaciente(resultadoListaTodos.getInt("id_paciente"));
                paciente.setNome(resultadoListaTodos.getString("nome"));
                paciente.setCpf(resultadoListaTodos.getString("cpf"));
                paciente.setEndereco(resultadoListaTodos.getString("endereco"));
                paciente.setRg(resultadoListaTodos.getString("rg"));
                paciente.setSexo(resultadoListaTodos.getString("sexo"));
                paciente.setTelefone(resultadoListaTodos.getString("telefone"));
                paciente.setDataNascimento(resultadoListaTodos.getString("data_nascimento"));
                paciente.setMedicoResponsavel(resultadoListaTodos.getString("medico_responsavel"));
                
                listaDeTodosPaciente.add(paciente);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex);

            return null;

        }
        return listaDeTodosPaciente;
    }

    public void atualizarPaciente(PacienteModel paciente ) {
        
        String sqlUpdate = "update paciente "
                + "set nome = ?, cpf = ?, endereco = ?, rg = ?, sexo = ?, telefone = ?, data_nascimento = ?, medico_responsavel = ?"
                + "where id_paciente = ? ";
        try {

            PreparedStatement preparacaoUpdate = conex.prepareStatement(sqlUpdate);
            preparacaoUpdate.setString(1,paciente.getNome());
            preparacaoUpdate.setString(2, paciente.getCpf());
            preparacaoUpdate.setString(3, paciente.getEndereco());
            preparacaoUpdate.setString(4, paciente.getRg());
            preparacaoUpdate.setString(5, paciente.getSexo());
            preparacaoUpdate.setString(6, paciente.getTelefone());
            preparacaoUpdate.setString(7, paciente.getDataNascimento());
            preparacaoUpdate.setString(8, paciente.getMedicoResponsavel());
            preparacaoUpdate.setInt(9, paciente.getIdPaciente());
            preparacaoUpdate.execute();
        } catch (SQLException ex) {
            Logger.getLogger(PacienteModel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void ExcluirPaciente(PacienteModel paciente) {
        String sqlDelete = "delete from paciente"
                + " where id_paciente = ?";

        try {
            PreparedStatement preparacaoDelete = conex.prepareStatement(sqlDelete);
            preparacaoDelete.setInt(1, paciente.getIdPaciente());
            preparacaoDelete.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
            Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public PacienteModel listarPorIdPaciente(int idPaciente) {
        PacienteModel paciente = new PacienteModel();

        String sqlSelect = " SELECT * FROM paciente WHERE id_paciente = " + idPaciente;

        try {

            PreparedStatement preparacaoSelect = conex.prepareStatement(sqlSelect);
            ResultSet resultadoListar = preparacaoSelect.executeQuery();

            {
                if (resultadoListar.next()) {
                    paciente.setNome(resultadoListar.getString("nome"));
                    paciente.setCpf(resultadoListar.getString("cpf"));
                    paciente.setEndereco(resultadoListar.getString("endereco"));
                    paciente.setRg(resultadoListar.getString("rg"));
                    paciente.setSexo(resultadoListar.getString("sexo"));
                    paciente.setTelefone(resultadoListar.getString("telefone"));
                    paciente.setDataNascimento(resultadoListar.getString("data_nascimento"));
                    paciente.setMedicoResponsavel(resultadoListar.getString("medico_responsavel"));
                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(PacienteModel.class.getName()).log(Level.SEVERE, null, ex);

            return null;

        }
        return paciente;
    }


}
