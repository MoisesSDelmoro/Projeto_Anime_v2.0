/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.view;

import br.inatel.projeto.dao.AnimeDAO;
import br.inatel.projeto.dao.MangaDAO;
import br.inatel.projeto.model.Anime;
import br.inatel.projeto.model.Manga;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Moises Delmoro
 */
public class ListarManga extends javax.swing.JFrame {

    /**
     * Creates new form ListarManga
     */
    public ListarManga() {
        initComponents();

        threadComboBox();

        setLocationRelativeTo(null);
    }
    private Thread combo;
    int cont = 0;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        Bot_Excluir = new javax.swing.JButton();
        btn_Voltar = new javax.swing.JButton();
        Bot_Editar = new javax.swing.JButton();
        ComboBox_mangas = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        PainelText_Animes = new javax.swing.JTextPane();
        lbl_Nomes = new javax.swing.JLabel();
        lbl_nome = new javax.swing.JLabel();
        lbl_autor = new javax.swing.JLabel();
        lbl_QuantCap = new javax.swing.JLabel();
        lbl_edicao = new javax.swing.JLabel();
        lbl_DataLancamento = new javax.swing.JLabel();
        txt_nome = new javax.swing.JTextField();
        txt_autor = new javax.swing.JTextField();
        txt_quantCap = new javax.swing.JTextField();
        txt_edicao = new javax.swing.JTextField();
        txt_Data = new javax.swing.JTextField();
        lbl_fundo = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Bot_Excluir.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Bot_Excluir.setText("Excluir");
        Bot_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bot_ExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(Bot_Excluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 110, 40));

        btn_Voltar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btn_Voltar.setText("Cancelar");
        btn_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, 110, 40));

        Bot_Editar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Bot_Editar.setText("Editar");
        Bot_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bot_EditarActionPerformed(evt);
            }
        });
        jPanel1.add(Bot_Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 110, 40));

        ComboBox_mangas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPanel1.add(ComboBox_mangas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 200, -1));

        PainelText_Animes.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jScrollPane1.setViewportView(PainelText_Animes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 200, 260));

        lbl_Nomes.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lbl_Nomes.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Nomes.setText("Mangás Cadastrados");
        jPanel1.add(lbl_Nomes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        lbl_nome.setBackground(new java.awt.Color(255, 255, 255));
        lbl_nome.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_nome.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nome.setText("Nome:");
        jPanel1.add(lbl_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        lbl_autor.setBackground(new java.awt.Color(255, 255, 255));
        lbl_autor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_autor.setForeground(new java.awt.Color(255, 255, 255));
        lbl_autor.setText("Autor:");
        jPanel1.add(lbl_autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));

        lbl_QuantCap.setBackground(new java.awt.Color(255, 255, 255));
        lbl_QuantCap.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_QuantCap.setForeground(new java.awt.Color(255, 255, 255));
        lbl_QuantCap.setText("Quantidade de capítulos:");
        jPanel1.add(lbl_QuantCap, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, -1, -1));

        lbl_edicao.setBackground(new java.awt.Color(255, 255, 255));
        lbl_edicao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_edicao.setForeground(new java.awt.Color(255, 255, 255));
        lbl_edicao.setText("Edição");
        jPanel1.add(lbl_edicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, -1));

        lbl_DataLancamento.setBackground(new java.awt.Color(255, 255, 255));
        lbl_DataLancamento.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_DataLancamento.setForeground(new java.awt.Color(255, 255, 255));
        lbl_DataLancamento.setText("Data de lançamento");
        jPanel1.add(lbl_DataLancamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, -1, -1));

        txt_nome.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPanel1.add(txt_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 200, -1));

        txt_autor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPanel1.add(txt_autor, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 200, -1));

        txt_quantCap.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPanel1.add(txt_quantCap, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, 50, -1));

        txt_edicao.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jPanel1.add(txt_edicao, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 50, -1));

        txt_Data.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txt_Data.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DataActionPerformed(evt);
            }
        });
        jPanel1.add(txt_Data, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 110, -1));

        lbl_fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/inatel/projeto/img/06.jpg"))); // NOI18N
        jPanel1.add(lbl_fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Bot_ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bot_ExcluirActionPerformed
        // TODO add your handling code here:
        MangaDAO mangaDAO = new MangaDAO();
        Manga mangaAux = new Manga();
        mangaDAO.deletarManga(ComboBox_mangas.getSelectedIndex() + 1);
        JOptionPane.showMessageDialog(null, "Excluído com sucesso!!!");

        ComboBox_mangas.removeAllItems();

        ArrayList<Manga> ArrayManga;
        MangaDAO ma = new MangaDAO();
        ArrayManga = ma.buscarIdManga();
        for (Manga mang : ArrayManga) {
            ComboBox_mangas.addItem(mang.getNome());
        }

        txt_nome.setText("");
        txt_autor.setText("");
        txt_quantCap.setText("");
        txt_edicao.setText("");
        txt_Data.setText("");
        Bot_Editar.setText("Editar");

    }//GEN-LAST:event_Bot_ExcluirActionPerformed

    private void btn_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VoltarActionPerformed
        // TODO add your handling code here:
        
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_VoltarActionPerformed
    private void Bot_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bot_EditarActionPerformed
        // TODO add your handling code here:
        if (cont % 2 == 0) {

            Bot_Editar.setText("Atualizar");
            MangaDAO mangaDAO = new MangaDAO();
            Manga mangaAux = new Manga();
            mangaAux = mangaDAO.buscarManga(ComboBox_mangas.getSelectedIndex() + 1);

            txt_nome.setText(mangaAux.getNome());
            txt_autor.setText(mangaAux.getAutor());
            txt_quantCap.setText(mangaAux.getQuantCap() + "");
            txt_edicao.setText(mangaAux.getEdicao());
            txt_Data.setText(mangaAux.getDataLancamento());

        } else {

            Manga aEd = new Manga();

            aEd.setNome(txt_nome.getText());
            aEd.setAutor(txt_autor.getText());
            aEd.setQuantCap(Integer.parseInt(txt_quantCap.getText()));
            aEd.setEdicao(txt_edicao.getText());
            aEd.setDataLancamento(txt_Data.getText());

            MangaDAO maDAO = new MangaDAO();
            maDAO.editarManga(ComboBox_mangas.getSelectedIndex() + 1, aEd);

            txt_nome.setText("");
            txt_autor.setText("");
            txt_quantCap.setText("");
            txt_edicao.setText("");
            txt_Data.setText("");
            Bot_Editar.setText("Editar");

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!!!");
        }
        cont++;
    }//GEN-LAST:event_Bot_EditarActionPerformed

    private void txt_DataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DataActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListarManga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListarManga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListarManga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListarManga.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListarManga().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bot_Editar;
    private javax.swing.JButton Bot_Excluir;
    private javax.swing.JComboBox<String> ComboBox_mangas;
    private javax.swing.JTextPane PainelText_Animes;
    private javax.swing.JButton btn_Voltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_DataLancamento;
    private javax.swing.JLabel lbl_Nomes;
    private javax.swing.JLabel lbl_QuantCap;
    private javax.swing.JLabel lbl_autor;
    private javax.swing.JLabel lbl_edicao;
    private javax.swing.JLabel lbl_fundo;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JTextField txt_Data;
    private javax.swing.JTextField txt_autor;
    private javax.swing.JTextField txt_edicao;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JTextField txt_quantCap;
    // End of variables declaration//GEN-END:variables

    public void threadComboBox() {

        ArrayList<Manga> ArrayManga;
        MangaDAO ma = new MangaDAO();
        ArrayManga = ma.buscarIdManga();
        for (Manga mang : ArrayManga) {
            ComboBox_mangas.addItem(mang.getNome());
        }

        combo = new Thread() {

            @Override
            public void run() {
                while (true) {

                    try {

                        Manga mg = new Manga();
                        mg = (Manga) ma.buscarManga(ComboBox_mangas.getSelectedIndex() + 1);
                        PainelText_Animes.setText(mg.toStringLabel() + "");

                        Thread.sleep(500);
                    } catch (InterruptedException ex) {

                    }

                }

            }

        };

        combo.start();
    }

}
