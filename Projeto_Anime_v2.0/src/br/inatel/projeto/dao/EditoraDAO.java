    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.dao;

import br.inatel.projeto.model.Editora;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Moises Delmoro
 */
public class EditoraDAO extends ConexaoBD {

    public Editora buscarEditora(int idBusca) {
        super.connectToDb();

        Editora ed = new Editora();
        ed.setIdEditora(idBusca);

        //Comando em SQL:
        String sql = "SELECT * FROM Editora WHERE idEditora = ?";
        //O comando NÃO recebe parâmetros -> consulta estática (st)
        try {
            super.pst = super.con.prepareStatement(sql);
            super.pst.setInt(1, idBusca);
            super.rs = super.pst.executeQuery();
            while (rs.next()) {

                ed.setIdEditora(idBusca);
                ed.setNome(rs.getString("nome"));
                ed.setEndereco(rs.getString("endereco"));
                ed.setQualidadeServico(rs.getFloat("qualidadeServico"));

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
        return ed;
    }

    public ArrayList<Editora> buscarIdEditora() {
        super.connectToDb();

        ArrayList<Editora> edt = new ArrayList<>();

        //Comando em SQL:
        String sql = "SELECT * FROM Editora";
        //O comando NÃO recebe parâmetros -> consulta estática (st)
        try {
            super.pst = super.con.prepareStatement(sql);
            super.rs = super.pst.executeQuery();

            while (rs.next()) {

                Editora e = new Editora();

                e.setIdEditora(rs.getInt("idEditora"));
                e.setNome(rs.getString("nome"));
                e.setEndereco(rs.getString("endereco"));
                e.setQualidadeServico(rs.getFloat("qualidadeServico"));
                edt.add(e);

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
        return edt;
    }
}
