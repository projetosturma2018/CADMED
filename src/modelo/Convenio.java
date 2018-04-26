/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Wagner Morel
 */
public class Convenio {
 
    private int idConsulta;
    private int idPaciente;
    private String nomeConvenio;
    private String descricao;

    /**
     * @return the idConsulta
     */
    public int getIdConsulta() {
        return idConsulta;
    }

    /**
     * @param idConsulta the idConsulta to set
     */
    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    /**
     * @return the idPaciente
     */
    public int getIdPaciente() {
        return idPaciente;
    }

    /**
     * @param idPaciente the idPaciente to set
     */
    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    /**
     * @return the nomeConvenio
     */
    public String getNomeConvenio() {
        return nomeConvenio;
    }

    /**
     * @param nomeConvenio the nomeConvenio to set
     */
    public void setNomeConvenio(String nomeConvenio) {
        this.nomeConvenio = nomeConvenio;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public String getIdconvenio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNomeconvenio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getIdpaciente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setIdConvenio(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


  
}
