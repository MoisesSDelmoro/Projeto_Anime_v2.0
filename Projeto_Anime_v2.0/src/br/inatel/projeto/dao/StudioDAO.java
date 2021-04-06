/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.dao;

import br.inatel.projeto.model.Studio;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Moises Delmoro
 */
public class StudioDAO extends ConexaoBD {

    public Studio buscarStudio(int idBusca) {
        super.connectToDb();

        Studio s = new Studio();
        s.setIdStudio(idBusca);

        //Comando em SQL:
        String sql = "SELECT * FROM Studio WHERE idStudio= ?";
        //O comando NÃO recebe parâmetros -> consulta estática (st)
        try {
            super.pst = super.con.prepareStatement(sql);
            super.pst.setInt(1, idBusca);
            super.rs = super.pst.executeQuery();
            while (rs.next()) {

                s.setIdStudio(idBusca);
                s.setNome(rs.getString("nome"));
                s.setDiretorAnimacao(rs.getString("diretorAnimacao"));
                s.setDiretorDublagem(rs.getString("diretorDublagem"));
                s.setQualidadeAnim(rs.getFloat("qualidadeAnim"));

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
        return s;
    }

    public ArrayList<Studio> buscarIdStudio() {
        super.connectToDb();

        ArrayList<Studio> std = new ArrayList<>();

        //Comando em SQL:
        String sql = "SELECT * FROM Studio";
        //O comando NÃO recebe parâmetros -> consulta estática (st)
        try {
            super.pst = super.con.prepareStatement(sql);
            super.rs = super.pst.executeQuery();

            while (rs.next()) {

                Studio sti = new Studio();
                sti.setIdStudio(rs.getInt("idStudio"));
                sti.setNome(rs.getString("nome"));
                sti.setDiretorAnimacao(rs.getString("diretorAnimacao"));
                sti.setDiretorDublagem(rs.getString("diretorDublagem"));
                sti.setQualidadeAnim(rs.getFloat("qualidadeAnim"));
                std.add(sti);

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
        return std;
    }
}
