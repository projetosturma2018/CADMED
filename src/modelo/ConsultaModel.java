/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Objects;

/**
 *
 * @author PauloGouveia
 */
public class ConsultaModel {
    
    
    
    private int idConulta;
    private String descricao;
    private String patologia;
    private String dataConsulta;
    private String horarioConsulta;

    public int getIdConulta() {
        return idConulta;
    }

    public void setIdConulta(int idConulta) {
        this.idConulta = idConulta;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPatologia() {
        return patologia;
    }

    public void setPatologia(String patologia) {
        this.patologia = patologia;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getHorarioConsulta() {
        return horarioConsulta;
    }

    public void setHorarioConsulta(String horarioConsulta) {
        this.horarioConsulta = horarioConsulta;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.idConulta;
        hash = 61 * hash + Objects.hashCode(this.descricao);
        hash = 61 * hash + Objects.hashCode(this.patologia);
        hash = 61 * hash + Objects.hashCode(this.dataConsulta);
        hash = 61 * hash + Objects.hashCode(this.horarioConsulta);
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
        final ConsultaModel other = (ConsultaModel) obj;
        if (this.idConulta != other.idConulta) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.patologia, other.patologia)) {
            return false;
        }
        if (!Objects.equals(this.dataConsulta, other.dataConsulta)) {
            return false;
        }
        if (!Objects.equals(this.horarioConsulta, other.horarioConsulta)) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        return "Consulta{" + "idConulta=" + idConulta + ", descricao=" + descricao + ", patologia=" + patologia + ", dataConsulta=" + dataConsulta + ", horarioConsulta=" + horarioConsulta + '}';
    }

    
    
}
