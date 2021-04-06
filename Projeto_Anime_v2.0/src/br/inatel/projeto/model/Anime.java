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
@Table(name = "anime", catalog = "mydb", schema = "")
@NamedQueries({
    @NamedQuery(name = "Anime.findAll", query = "SELECT a FROM Anime a")
    , @NamedQuery(name = "Anime.findByIdAnime", query = "SELECT a FROM Anime a WHERE a.idAnime = :idAnime")
    , @NamedQuery(name = "Anime.findByNome", query = "SELECT a FROM Anime a WHERE a.nome = :nome")
    , @NamedQuery(name = "Anime.findByProtagonista", query = "SELECT a FROM Anime a WHERE a.protagonista = :protagonista")
    , @NamedQuery(name = "Anime.findByQuantidadeEP", query = "SELECT a FROM Anime a WHERE a.quantidadeEP = :quantidadeEP")
    , @NamedQuery(name = "Anime.findByNotaAnime", query = "SELECT a FROM Anime a WHERE a.notaAnime = :notaAnime")
    , @NamedQuery(name = "Anime.findByStudioidStudio", query = "SELECT a FROM Anime a WHERE a.studioidStudio = :studioidStudio")
    , @NamedQuery(name = "Anime.findByEditoraidEditora", query = "SELECT a FROM Anime a WHERE a.editoraidEditora = :editoraidEditora")
    , @NamedQuery(name = "Anime.findByMangaidManga", query = "SELECT a FROM Anime a WHERE a.mangaidManga = :mangaidManga")})

public class Anime implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idAnime")
    private Integer idAnime;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "protagonista")
    private String protagonista;
    @Basic(optional = false)
    @Column(name = "quantidadeEP")
    private int quantidadeEP;
    @Basic(optional = false)
    @Column(name = "notaAnime")
    private String notaAnime;
    @Basic(optional = false)
    @Column(name = "Studio_idStudio")
    private int studioidStudio;
    @Basic(optional = false)
    @Column(name = "Editora_idEditora")
    private int editoraidEditora;
    @Column(name = "Manga_idManga")
    private Integer mangaidManga;

    private int distribuidoraidDistribuidora;

    public Anime() {
    }

    public Anime(Integer idAnime) {
        this.idAnime = idAnime;
    }

    public Anime(Integer idAnime, String nome, String protagonista, int quantidadeEP, String notaAnime, int studioidStudio, int editoraidEditora) {
        this.idAnime = idAnime;
        this.nome = nome;
        this.protagonista = protagonista;
        this.quantidadeEP = quantidadeEP;
        this.notaAnime = notaAnime;
        this.studioidStudio = studioidStudio;
        this.editoraidEditora = editoraidEditora;
    }

    public Integer getIdAnime() {
        return idAnime;
    }

    public void setIdAnime(Integer idAnime) {
        Integer oldIdAnime = this.idAnime;
        this.idAnime = idAnime;
        changeSupport.firePropertyChange("idAnime", oldIdAnime, idAnime);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getProtagonista() {
        return protagonista;
    }

    public void setProtagonista(String protagonista) {
        String oldProtagonista = this.protagonista;
        this.protagonista = protagonista;
        changeSupport.firePropertyChange("protagonista", oldProtagonista, protagonista);
    }

    public int getQuantidadeEP() {
        return quantidadeEP;
    }

    public void setQuantidadeEP(int quantidadeEP) {
        int oldQuantidadeEP = this.quantidadeEP;
        this.quantidadeEP = quantidadeEP;
        changeSupport.firePropertyChange("quantidadeEP", oldQuantidadeEP, quantidadeEP);
    }

    public String getNotaAnime() {
        return notaAnime;
    }

    public void setNotaAnime(String notaAnime) {
        String oldNotaAnime = this.notaAnime;
        this.notaAnime = notaAnime;
        changeSupport.firePropertyChange("notaAnime", oldNotaAnime, notaAnime);
    }

    public int getStudioidStudio() {
        return studioidStudio;
    }

    public void setStudioidStudio(int studioidStudio) {
        int oldStudioidStudio = this.studioidStudio;
        this.studioidStudio = studioidStudio;
        changeSupport.firePropertyChange("studioidStudio", oldStudioidStudio, studioidStudio);
    }

    public int getEditoraidEditora() {
        return editoraidEditora;
    }

    public void setEditoraidEditora(int editoraidEditora) {
        int oldEditoraidEditora = this.editoraidEditora;
        this.editoraidEditora = editoraidEditora;
        changeSupport.firePropertyChange("editoraidEditora", oldEditoraidEditora, editoraidEditora);
    }

    public Integer getMangaidManga() {
        return mangaidManga;
    }

    public void setMangaidManga(Integer mangaidManga) {
        Integer oldMangaidManga = this.mangaidManga;
        this.mangaidManga = mangaidManga;
        changeSupport.firePropertyChange("mangaidManga", oldMangaidManga, mangaidManga);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAnime != null ? idAnime.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Anime)) {
            return false;
        }
        Anime other = (Anime) object;
        if ((this.idAnime == null && other.idAnime != null) || (this.idAnime != null && !this.idAnime.equals(other.idAnime))) {
            return false;
        }
        return true;
    }

    public int getDistribuidoraidDistribuidora() {
        return distribuidoraidDistribuidora;
    }

    public void setDistribuidoraidDistribuidora(int distribuidoraidDistribuidora) {
        int oldDistribuidoraidDistribuidora = this.distribuidoraidDistribuidora;
        this.distribuidoraidDistribuidora = distribuidoraidDistribuidora;
        changeSupport.firePropertyChange("distribuidoraidDistribuidora", oldDistribuidoraidDistribuidora, distribuidoraidDistribuidora);
    }

    @Override
    public String toString() {
        return "Id = " + this.idAnime;
    }

    public String toStringLabel() {
        return "Nome: " + this.nome
                + "\nProtagonista: " + this.protagonista
                + "\nQuantidade de episódios: " + this.quantidadeEP
                + "\nNota do Anime: " + this.notaAnime;
    }

}
