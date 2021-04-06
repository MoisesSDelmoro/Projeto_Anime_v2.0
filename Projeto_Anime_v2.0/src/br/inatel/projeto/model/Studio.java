/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Moises Delmoro
 */
@Entity
@Table(name = "studio", catalog = "mydb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Studio.findAll", query = "SELECT s FROM Studio s")
    , @NamedQuery(name = "Studio.findByIdStudio", query = "SELECT s FROM Studio s WHERE s.idStudio = :idStudio")
    , @NamedQuery(name = "Studio.findByNome", query = "SELECT s FROM Studio s WHERE s.nome = :nome")
    , @NamedQuery(name = "Studio.findByQualidadeAnim", query = "SELECT s FROM Studio s WHERE s.qualidadeAnim = :qualidadeAnim")
    , @NamedQuery(name = "Studio.findByDiretorAnimacao", query = "SELECT s FROM Studio s WHERE s.diretorAnimacao = :diretorAnimacao")
    , @NamedQuery(name = "Studio.findByDiretorDublagem", query = "SELECT s FROM Studio s WHERE s.diretorDublagem = :diretorDublagem")})
public class Studio implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idStudio")
    private Integer idStudio;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "qualidadeAnim")
    private float qualidadeAnim;
    @Basic(optional = false)
    @Column(name = "diretorAnimacao")
    private String diretorAnimacao;
    @Basic(optional = false)
    @Column(name = "diretorDublagem")
    private String diretorDublagem;

    public Studio() {
    }

    public Studio(Integer idStudio) {
        this.idStudio = idStudio;
    }

    public Studio(Integer idStudio, String nome, float qualidadeAnim, String diretorAnimacao, String diretorDublagem) {
        this.idStudio = idStudio;
        this.nome = nome;
        this.qualidadeAnim = qualidadeAnim;
        this.diretorAnimacao = diretorAnimacao;
        this.diretorDublagem = diretorDublagem;
    }

    public Integer getIdStudio() {
        return idStudio;
    }

    public void setIdStudio(Integer idStudio) {
        Integer oldIdStudio = this.idStudio;
        this.idStudio = idStudio;
        changeSupport.firePropertyChange("idStudio", oldIdStudio, idStudio);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public float getQualidadeAnim() {
        return qualidadeAnim;
    }

    public void setQualidadeAnim(float qualidadeAnim) {
        float oldQualidadeAnim = this.qualidadeAnim;
        this.qualidadeAnim = qualidadeAnim;
        changeSupport.firePropertyChange("qualidadeAnim", oldQualidadeAnim, qualidadeAnim);
    }

    public String getDiretorAnimacao() {
        return diretorAnimacao;
    }

    public void setDiretorAnimacao(String diretorAnimacao) {
        String oldDiretorAnimacao = this.diretorAnimacao;
        this.diretorAnimacao = diretorAnimacao;
        changeSupport.firePropertyChange("diretorAnimacao", oldDiretorAnimacao, diretorAnimacao);
    }

    public String getDiretorDublagem() {
        return diretorDublagem;
    }

    public void setDiretorDublagem(String diretorDublagem) {
        String oldDiretorDublagem = this.diretorDublagem;
        this.diretorDublagem = diretorDublagem;
        changeSupport.firePropertyChange("diretorDublagem", oldDiretorDublagem, diretorDublagem);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idStudio != null ? idStudio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Studio)) {
            return false;
        }
        Studio other = (Studio) object;
        if ((this.idStudio == null && other.idStudio != null) || (this.idStudio != null && !this.idStudio.equals(other.idStudio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Id: " + idStudio;
    }

    public String toStringLabel() {
        return "Nome: " + nome 
                + "\nQualidade de animacao: " + this.qualidadeAnim
                + "\nDiretor de Animacao: " + diretorAnimacao 
                + "\nDiretor de dublagem: " + diretorDublagem;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
