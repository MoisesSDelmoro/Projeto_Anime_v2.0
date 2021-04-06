/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Moises Delmoro
 */
@Entity
@Table(name = "manga", catalog = "mydb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Manga.findAll", query = "SELECT m FROM Manga m")
    , @NamedQuery(name = "Manga.findByIdManga", query = "SELECT m FROM Manga m WHERE m.idManga = :idManga")
    , @NamedQuery(name = "Manga.findByNome", query = "SELECT m FROM Manga m WHERE m.nome = :nome")
    , @NamedQuery(name = "Manga.findByAutor", query = "SELECT m FROM Manga m WHERE m.autor = :autor")
    , @NamedQuery(name = "Manga.findByQuantCap", query = "SELECT m FROM Manga m WHERE m.quantCap = :quantCap")
    , @NamedQuery(name = "Manga.findByEdicao", query = "SELECT m FROM Manga m WHERE m.edicao = :edicao")
    , @NamedQuery(name = "Manga.findByDataLancamento", query = "SELECT m FROM Manga m WHERE m.dataLancamento = :dataLancamento")})
public class Manga implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idManga")
    private Integer idManga;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "autor")
    private String autor;
    @Basic(optional = false)
    @Column(name = "quantCap")
    private int quantCap;
    @Basic(optional = false)
    @Column(name = "edicao")
    private String edicao;
    @Basic(optional = false)
    @Column(name = "dataLancamento")
    @Temporal(TemporalType.DATE)
    private String dataLancamento;

    public Manga() {
    }

    public Manga(Integer idManga) {
        this.idManga = idManga;
    }

    public Manga(Integer idManga, String nome, String autor, int quantCap, String edicao, String dataLancamento) {
        this.idManga = idManga;
        this.nome = nome;
        this.autor = autor;
        this.quantCap = quantCap;
        this.edicao = edicao;
        this.dataLancamento = dataLancamento;
    }

    public Integer getIdManga() {
        return idManga;
    }

    public void setIdManga(Integer idManga) {
        Integer oldIdManga = this.idManga;
        this.idManga = idManga;
        changeSupport.firePropertyChange("idManga", oldIdManga, idManga);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        String oldAutor = this.autor;
        this.autor = autor;
        changeSupport.firePropertyChange("autor", oldAutor, autor);
    }

    public int getQuantCap() {
        return quantCap;
    }

    public void setQuantCap(int quantCap) {
        int oldQuantCap = this.quantCap;
        this.quantCap = quantCap;
        changeSupport.firePropertyChange("quantCap", oldQuantCap, quantCap);
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        String oldEdicao = this.edicao;
        this.edicao = edicao;
        changeSupport.firePropertyChange("edicao", oldEdicao, edicao);
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        String oldDataLancamento = this.dataLancamento;
        this.dataLancamento = dataLancamento;
        changeSupport.firePropertyChange("dataLancamento", oldDataLancamento, dataLancamento);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idManga != null ? idManga.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Manga)) {
            return false;
        }
        Manga other = (Manga) object;
        if ((this.idManga == null && other.idManga != null) || (this.idManga != null && !this.idManga.equals(other.idManga))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "IdManga: " + this.idManga;
    }


    public String toStringLabel() {
        return "Nome: " + nome
                + "\nAutor: " + autor
                + "\nQuantidade de episódios: " + this.quantCap
                + "\n Edicao: " + edicao
                + "\nData de lancamento: " + this.dataLancamento;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
