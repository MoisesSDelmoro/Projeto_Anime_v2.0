/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.dao;

import br.inatel.projeto.model.Manga;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Classe responsável pela conexão entre a tabela manga do banco de dados e o
 * objeto manga do java
 *
 * @author Moises Delmoro
 * @author Bruno Pivoto
 * @see br.inatel.projeto.model.Manga;
 * @see java.sql.SQLException;
 * @see java.util.ArrayList;
 * @since 2019/11
 */
public class MangaDAO extends ConexaoBD {

    /**
     * Retorna um (@code boolean) confirmando se o objeto foi inserido na tabela
     *
     * @param novoManga objeto Manga contendo os dados a serem inseridos na
     * tabela
     * @return @code boolean variavel boolean que diz que a operação foi bem
     * sucedida
     * @exception SQLException caso ocorra algum erro realacionado a linguagem
     * MySQL
     * @author Moises Delmoro
     * @author Bruno Pivoto
     * @since 2019/11
     */
    public boolean inserirManga(Manga novoManga) {
        super.connectToDb(); //Conecta ao banco de dados
        //Comando em SQL:
        String sql = "INSERT INTO Manga(nome, autor, quantCap, edicao, dataLancamento) values(?,?,?,?,?)";
        //O comando recebe paramêtros -> consulta dinâmica (pst)

        try {
            super.pst = super.con.prepareStatement(sql);
            super.pst.setString(1, novoManga.getNome()); //1- refere-se à segunda interrogação
            super.pst.setString(2, novoManga.getAutor());  //2- refere-se à terceira interrogação
            super.pst.setInt(3, novoManga.getQuantCap());  //3- refere-se à quarta interrogação
            super.pst.setString(4, novoManga.getEdicao());  //4- refere-se à quinta interrogação
            super.pst.setString(5, novoManga.getDataLancamento());  //5- refere-se à sexta interrogação

            pst.execute();

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

    /**
     * Retorna um (@code Manga) que for referente ao idBusca requisistado na
     * tabela SQL
     *
     * @param idBusca inteiro que será usado para comparativo afim de achar o
     * objeto
     * @return @code Manga objeto Manga na posição correspondente ao idBusca
     * @exception SQLException caso ocorra algum erro realacionado a linguagem
     * MySQL
     * @author Moises Delmoro
     * @author Bruno Pivoto
     * @since 2019/11
     */
    public Manga buscarManga(int idBusca) {
        super.connectToDb();

        Manga ma = new Manga();
        ma.setIdManga(idBusca);

        //Comando em SQL:
        String sql = "SELECT * FROM Manga WHERE idManga = ?";
        //O comando NÃO recebe parâmetros -> consulta estática (st)
        try {
            super.pst = super.con.prepareStatement(sql);
            super.pst.setInt(1, idBusca);
            super.rs = super.pst.executeQuery();
            while (rs.next()) {

                //           ma.setIdManga(idBusca);
                ma.setNome(rs.getString("nome"));
                ma.setAutor(rs.getString("autor"));
                ma.setQuantCap(rs.getInt("quantCap"));
                ma.setEdicao(rs.getString("edicao"));
                ma.setDataLancamento(rs.getString("dataLancamento"));

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
        return ma;
    }

    /**
     * Retorna um (@code Manga) que for referente ao idBusca requisistado no
     * ArrayList
     *
     * @param idBusca inteiro que será usado para comparativo afim de achar o
     * objeto
     * @return @code Manga objeto Manga na posição correspondente ao idBusca
     * @exception SQLException caso ocorra algum erro realacionado a linguagem
     * MySQL
     * @author Moises Delmoro
     * @author Bruno Pivoto
     * @since 2019/11
     */
    public ArrayList<Manga> buscarIdManga() {
        super.connectToDb();

        ArrayList<Manga> manga = new ArrayList<>();

        //Manga ma = new Manga();
        //Comando em SQL:
        String sql = "SELECT * FROM Manga";
        //O comando NÃO recebe parâmetros -> consulta estática (st)
        try {
            super.pst = super.con.prepareStatement(sql);
            super.rs = super.pst.executeQuery();

            while (rs.next()) {

                Manga m = new Manga();

                m.setIdManga(rs.getInt("idManga"));
                m.setNome(rs.getString("nome"));
                m.setAutor(rs.getString("autor"));
                m.setQuantCap(rs.getInt("quantCap"));
                m.setEdicao(rs.getString("edicao"));
                m.setDataLancamento(rs.getString("dataLancamento"));
                manga.add(m);

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
        return manga;
    }

    /**
     * Retorna um (@code Manga) editado com os novos atributos recebidos por
     * parâmetro
     *
     * @param idEdit inteiro que será usado para comparativo afim de achar o
     * objeto
     * @param manga objeto Manga que contém os novos atributos
     * @return @code Manga objeto manga na posição correspondente ao idEdit
     * editado
     * @exception SQLException caso ocorra algum erro realacionado a linguagem
     * MySQL
     * @author Moises Delmoro
     * @author Bruno Pivoto
     * @since 2019/11
     */
    public Manga editarManga(int idEdit, Manga manga) {
        super.connectToDb();
        Manga m = new Manga();

        //Comando em SQL:
        String sql = "UPDATE Manga SET nome=?, autor=?, quantCap=?, edicao=?, dataLancamento=? WHERE idManga= ?";
        //O comando NÃO recebe parâmetros -> consulta estática (st)
        try {
            super.pst = super.con.prepareStatement(sql);
            //super.rs = super.pst.executeQuery();

            pst.setString(1, manga.getNome());
            pst.setString(2, manga.getAutor());
            pst.setInt(3, manga.getQuantCap());
            pst.setString(4, manga.getEdicao());
            pst.setString(5, manga.getDataLancamento());
            pst.setInt(6, idEdit);

            pst.execute();
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
        return manga;
    }

    /**
     * Retorna um (@code boolean) confirmando se o objeto foi excluído realmente
     * da tabela no banco SQL
     *
     * @param idManga inteiro que será usado para comparativo afim de achar o
     * objeto
     * @return @code boolean variavel boolean que diz que a operação foi bem
     * sucedida
     * @exception SQLException caso ocorra algum erro realacionado a linguagem
     * MySQL
     * @author Moises Delmoro
     * @author Bruno Pivoto
     * @since 2019/11
     */
    public boolean deletarManga(int idManga) {
        super.connectToDb();
        //Comando em SQL:
        String sql = "DELETE FROM Manga WHERE idManga=?";
        try {
            super.pst = super.con.prepareStatement(sql);
            super.pst.setInt(1, idManga);
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
