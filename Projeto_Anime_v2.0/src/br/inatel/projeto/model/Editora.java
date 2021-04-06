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
@Table(name = "editora", catalog = "mydb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Editora.findAll", query = "SELECT e FROM Editora e")
    , @NamedQuery(name = "Editora.findByIdEditora", query = "SELECT e FROM Editora e WHERE e.idEditora = :idEditora")
    , @NamedQuery(name = "Editora.findByNome", query = "SELECT e FROM Editora e WHERE e.nome = :nome")
    , @NamedQuery(name = "Editora.findByEndereco", query = "SELECT e FROM Editora e WHERE e.endereco = :endereco")
    , @NamedQuery(name = "Editora.findByQualidadeServico", query = "SELECT e FROM Editora e WHERE e.qualidadeServico = :qualidadeServico")})
public class Editora implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEditora")
    private Integer idEditora;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "endereco")
    private String endereco;
    @Basic(optional = false)
    @Column(name = "qualidadeServico")
    private float qualidadeServico;

    public Editora() {
    }

    public Editora(Integer idEditora) {
        this.idEditora = idEditora;
    }

    public Editora(Integer idEditora, String nome, String endereco, float qualidadeServico) {
        this.idEditora = idEditora;
        this.nome = nome;
        this.endereco = endereco;
        this.qualidadeServico = qualidadeServico;
    }

    public Integer getIdEditora() {
        return idEditora;
    }

    public void setIdEditora(Integer idEditora) {
        Integer oldIdEditora = this.idEditora;
        this.idEditora = idEditora;
        changeSupport.firePropertyChange("idEditora", oldIdEditora, idEditora);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        String oldEndereco = this.endereco;
        this.endereco = endereco;
        changeSupport.firePropertyChange("endereco", oldEndereco, endereco);
    }

    public float getQualidadeServico() {
        return qualidadeServico;
    }

    public void setQualidadeServico(float qualidadeServico) {
        float oldQualidadeServico = this.qualidadeServico;
        this.qualidadeServico = qualidadeServico;
        changeSupport.firePropertyChange("qualidadeServico", oldQualidadeServico, qualidadeServico);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEditora != null ? idEditora.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Editora)) {
            return false;
        }
        Editora other = (Editora) object;
        if ((this.idEditora == null && other.idEditora != null) || (this.idEditora != null && !this.idEditora.equals(other.idEditora))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Id: " + this.idEditora;
    }

    public String toStringLabel() {
        return "Nome: " + nome 
                + "\nEndereco: " + endereco 
                + "\nQualidade: " + this.qualidadeServico;
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
