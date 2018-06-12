/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Objects;

/**
 *
 * @author Wagner Morel
 */
public class ConvenioModel {
 
    private int idPaciente;
    private int idConvenio;
    private String nomeConvenio;

    public int getIdConsulta() {
        return idPaciente;
    }

    public void setIdConsulta(int idConsulta) {
        this.idPaciente = idConsulta;
    }

    public int getIdConvenio() {
        return idConvenio;
    }

    public void setIdConvenio(int idConvenio) {
        this.idConvenio = idConvenio;
    }

    public String getNomeConvenio() {
        return nomeConvenio;
    }

    public void setNomeConvenio(String nomeConvenio) {
        this.nomeConvenio = nomeConvenio;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.idPaciente;
        hash = 83 * hash + this.idConvenio;
        hash = 83 * hash + Objects.hashCode(this.nomeConvenio);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ConvenioModel other = (ConvenioModel) obj;
        if (this.idPaciente != other.idPaciente) {
            return false;
        }
        if (this.idConvenio != other.idConvenio) {
            return false;
        }
        if (!Objects.equals(this.nomeConvenio, other.nomeConvenio)) {
            return false;
        }
        return true;
    }

    
    
    @Override
    public String toString() {
        return "Convenio{" + "idConsulta=" + idPaciente + ", idConvenio=" + idConvenio + ", nomeConvenio=" + nomeConvenio + '}';
    }

   



  
}
