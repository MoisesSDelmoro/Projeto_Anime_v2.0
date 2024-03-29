/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inatel.projeto.view;

import javax.swing.JOptionPane;

/**
 *
 * @author Moises Delmoro
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();

        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        bot_Cadastrar = new javax.swing.JButton();
        bot_Listar = new javax.swing.JButton();
        bot_Sair = new javax.swing.JButton();
        lbl_fundo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Menu_Cadastrar = new javax.swing.JMenu();
        MenuCadastar_Anime = new javax.swing.JMenuItem();
        MenuCadastrar_Manga = new javax.swing.JMenuItem();
        Menu_Consultar = new javax.swing.JMenu();
        MenuConsultar_Anime = new javax.swing.JMenuItem();
        MenuConsulta_Manga = new javax.swing.JMenuItem();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bot_Cadastrar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        bot_Cadastrar.setText("Cadastar");
        bot_Cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_CadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(bot_Cadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 270, 110, -1));

        bot_Listar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        bot_Listar.setText("Listar");
        bot_Listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_ListarActionPerformed(evt);
            }
        });
        getContentPane().add(bot_Listar, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 320, 110, -1));

        bot_Sair.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        bot_Sair.setText("Sair");
        bot_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot_SairActionPerformed(evt);
            }
        });
        getContentPane().add(bot_Sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 90, -1));

        lbl_fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/inatel/projeto/img/03.jpg"))); // NOI18N
        getContentPane().add(lbl_fundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 700, 410));

        Menu_Cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/inatel/projeto/img/add16x16.png"))); // NOI18N
        Menu_Cadastrar.setText("Cadastrar");

        MenuCadastar_Anime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/inatel/projeto/img/add16x16.png"))); // NOI18N
        MenuCadastar_Anime.setText("Anime");
        MenuCadastar_Anime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastar_AnimeActionPerformed(evt);
            }
        });
        Menu_Cadastrar.add(MenuCadastar_Anime);

        MenuCadastrar_Manga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/inatel/projeto/img/add16x16.png"))); // NOI18N
        MenuCadastrar_Manga.setText("Manga");
        MenuCadastrar_Manga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadastrar_MangaActionPerformed(evt);
            }
        });
        Menu_Cadastrar.add(MenuCadastrar_Manga);

        jMenuBar1.add(Menu_Cadastrar);

        Menu_Consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/inatel/projeto/img/search16x16.png"))); // NOI18N
        Menu_Consultar.setText("Consultar");

        MenuConsultar_Anime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/inatel/projeto/img/search16x16.png"))); // NOI18N
        MenuConsultar_Anime.setText("Anime");
        MenuConsultar_Anime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuConsultar_AnimeActionPerformed(evt);
            }
        });
        Menu_Consultar.add(MenuConsultar_Anime);

        MenuConsulta_Manga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/inatel/projeto/img/search16x16.png"))); // NOI18N
        MenuConsulta_Manga.setText("Manga");
        MenuConsulta_Manga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuConsulta_MangaActionPerformed(evt);
            }
        });
        Menu_Consultar.add(MenuConsulta_Manga);

        jMenuBar1.add(Menu_Consultar);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bot_ListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_ListarActionPerformed
        // TODO add your handling code here:

        int aux = 0;

        do {
            try {

                aux = Integer.parseInt(JOptionPane.showInputDialog(this, "O quê deseja listar?"
                        + "\n1: Anime."
                        + "\n2: Mangá."
                        + "\n0: Cancelar."));

                switch (aux) {
                    case 1:
                        br.inatel.projeto.view.ListarAnime list_anim = new ListarAnime();
                        list_anim.setVisible(true);
                        dispose();
                        aux = 0;
                        break;
                    case 2:
                        br.inatel.projeto.view.ListarManga list_mang = new ListarManga();
                        list_mang.setVisible(true);
                        dispose();
                        aux = 0;
                        break;
                    case 0:
                        break;

                    default:
                        JOptionPane.showMessageDialog(this, "Opcao ínvalida!!!");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Entrada ínvalida!!!");
            }
        } while (aux != 0);


    }//GEN-LAST:event_bot_ListarActionPerformed

    private void bot_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_SairActionPerformed
        // TODO add your handling code here:
        dispose();

    }//GEN-LAST:event_bot_SairActionPerformed

    private void MenuCadastar_AnimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastar_AnimeActionPerformed
        // TODO add your handling code here:

        br.inatel.projeto.view.CadastroAnime cad_anim = new CadastroAnime();
        cad_anim.setVisible(true);
        dispose();

    }//GEN-LAST:event_MenuCadastar_AnimeActionPerformed

    private void bot_CadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot_CadastrarActionPerformed
        // TODO add your handling code here:
        /*
        int aux = Integer.parseInt(JOptionPane.showInputDialog("Deseja cadastrar:"
                + "\n1: Anime"
                + "\n2: Mangá"
                + "\n0: Cancelar"));*/
        int aux = 0;

        do {
            try {

                aux = Integer.parseInt(JOptionPane.showInputDialog(this, "O quê deseja listar?"
                        + "\n1: Anime."
                        + "\n2: Mangá."
                        + "\n0: Cancelar."));

                switch (aux) {
                    case 1:
                        br.inatel.projeto.view.CadastroAnime cad_anim = new CadastroAnime();
                        cad_anim.setVisible(true);
                        dispose();
                        aux = 0;
                        break;
                    case 2:
                        br.inatel.projeto.view.CadastroManga cad_mang = new CadastroManga();
                        cad_mang.setVisible(true);
                        dispose();
                        aux = 0;
                        break;
                    case 0:
                        break;

                    default:
                        JOptionPane.showMessageDialog(this, "Opcao ínvalida!!!");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Entrada ínvalida!!!");
            }
        } while (aux != 0);


    }//GEN-LAST:event_bot_CadastrarActionPerformed

    private void MenuCadastrar_MangaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadastrar_MangaActionPerformed
        // TODO add your handling code here:

        CadastroManga cad_mang = new CadastroManga();
        cad_mang.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuCadastrar_MangaActionPerformed

    private void MenuConsultar_AnimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuConsultar_AnimeActionPerformed
        // TODO add your handling code here:

        br.inatel.projeto.view.ListarAnime list_anim = new ListarAnime();
        list_anim.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuConsultar_AnimeActionPerformed

    private void MenuConsulta_MangaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuConsulta_MangaActionPerformed
        // TODO add your handling code here:
        br.inatel.projeto.view.ListarManga list_mang = new ListarManga();
        list_mang.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuConsulta_MangaActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuCadastar_Anime;
    private javax.swing.JMenuItem MenuCadastrar_Manga;
    private javax.swing.JMenuItem MenuConsulta_Manga;
    private javax.swing.JMenuItem MenuConsultar_Anime;
    private javax.swing.JMenu Menu_Cadastrar;
    private javax.swing.JMenu Menu_Consultar;
    private javax.swing.JButton bot_Cadastrar;
    private javax.swing.JButton bot_Listar;
    private javax.swing.JButton bot_Sair;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lbl_fundo;
    // End of variables declaration//GEN-END:variables
}
