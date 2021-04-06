/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.dao;

import br.inatel.projeto.model.Anime;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Moises Delmoro
 */
public class AnimeDAO extends ConexaoBD {

    /**
     * ********************** INSERIR DADOS ********************************
     */
    public boolean inserirAnime(Anime novoAnime) {
        super.connectToDb(); //Conecta ao banco de dados
        //Comando em SQL:
        String sql = "INSERT INTO Anime(nome, protagonista, quantidadeEP, notaAnime, Studio_idStudio, Editora_idEditora, Manga_idManga) VALUES (?,?,?,?,?,?,?)";
        //O comando recebe paramêtros -> consulta dinâmica (pst)

        try {
            super.pst = super.con.prepareStatement(sql);
            super.pst.setString(1, novoAnime.getNome()); //2- refere-se à segunda interrogação
            super.pst.setString(2, novoAnime.getProtagonista());  //3- refere-se à terceira interrogação
            super.pst.setInt(3, novoAnime.getQuantidadeEP());  //4- refere-se à quarta interrogação
            super.pst.setString(4, novoAnime.getNotaAnime());  //5- refere-se à quinta interrogação
            super.pst.setInt(5, novoAnime.getStudioidStudio());  //6- refere-se à sexta interrogação
            super.pst.setInt(6, novoAnime.getEditoraidEditora());  //7- refere-se à setima interrogação
            super.pst.setInt(7, novoAnime.getMangaidManga());  //8- refere-se à oitava interrogação

            pst.execute();

        } catch (SQLException ex) {
            System.out.println("Erro = " + ex.getMessage());
            super.sucesso = false;
        } finally {
            try {   //Encerra a conexão
                super.con.close();
                super.pst.close();
            } catch (SQLException ex) {
                System.out.println("Erro = " + ex.getMessage());
            }
        }
        return sucesso;
    }

    public Anime buscarAnime(int idBusca) {
        Anime an = new Anime();
        an.setIdAnime(idBusca);

        super.connectToDb();
        //Comando em SQL:
        String sql = "SELECT * FROM Anime WHERE idAnime = ?";
        //O comando NÃO recebe parâmetros -> consulta estática (st)
        try {
            super.pst = super.con.prepareStatement(sql);
            super.pst.setInt(1, idBusca);
            super.rs = super.pst.executeQuery();
            System.out.println("Lista de Animes: ");
            while (rs.next()) {

                an.setNome(rs.getString("nome"));
                an.setProtagonista(rs.getString("protagonista"));
                an.setQuantidadeEP(rs.getInt("quantidadeEP"));
                an.setNotaAnime(rs.getString("notaAnime"));
                //an.setEditoraidEditora("editoraidEditora");

            }
        } catch (SQLException ex) {
            System.out.println("Erro = " + ex.getMessage());
        } finally {
            try {
                super.con.close();
                super.pst.close();
            } catch (SQLException ex) {
                System.out.println("Erro = " + ex.getMessage());
            }
        }
        return an;
    }

    public ArrayList<Anime> buscarIdAnime() {

        super.connectToDb();

        ArrayList<Anime> anim = new ArrayList<>();
        //Comando em SQL:
        String sql = "SELECT * FROM Anime";

        //O comando NÃO recebe parâmetros -> consulta estática (st)
        try {
            super.pst = super.con.prepareStatement(sql);
            super.rs = super.pst.executeQuery();
            while (rs.next()) {

                Anime an = new Anime();
                an.setIdAnime(rs.getInt("idAnime"));
                an.setNome(rs.getString("nome"));
                an.setProtagonista(rs.getString("protagonista"));
                an.setQuantidadeEP(rs.getInt("quantidadeEP"));
                an.setNotaAnime(rs.getString("notaAnime"));
                an.setEditoraidEditora(rs.getInt("editoraidEditora"));
                an.setStudioidStudio(rs.getInt("studioidStudio"));
                an.setMangaidManga(rs.getInt("mangaidManga"));
                anim.add(an);
            }
        } catch (SQLException ex) {
            System.out.println("Erro = " + ex.getMessage());
        } finally {
            try {
                super.con.close();
                super.pst.close();
            } catch (SQLException ex) {
                System.out.println("Erro = " + ex.getMessage());
            }
        }
        return anim;
    }

    public boolean deletarAnime(int idDeletar) {
        super.connectToDb();
        //Comando em SQL:
        String sql = "DELETE FROM Anime WHERE idAnime=?";
        try {
            super.pst = super.con.prepareStatement(sql);
            super.pst.setInt(1, idDeletar);
            super.pst.execute();
        } catch (SQLException ex) {
            System.out.println("Erro = " + ex.getMessage());
        } finally {
            try {
                super.con.close();
                super.pst.close();
            } catch (SQLException ex) {
                System.out.println("Erro = " + ex.getMessage());
            }
        }
        return sucesso;
    }

}
