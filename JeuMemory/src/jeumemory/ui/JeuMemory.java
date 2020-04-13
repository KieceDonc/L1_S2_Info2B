package jeumemory.ui;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import jeumemory.Erreur;
import jeumemory.Famille;
import jeumemory.Joueur;
import jeumemory.LesJoueurs;
import jeumemory.LesPersonnages;
import jeumemory.Personnage;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Valentin
 */
public class JeuMemory extends javax.swing.JFrame {
    
    private static final String TAG = JeuMemory.class.getName();
    
    private LesJoueurs lstPlayers = new LesJoueurs();
    private LesPersonnages lstPerso;
    
    private int difficultyLvl;
    
    /**
     * Creates new form Exo3
     */
    public JeuMemory() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaInfo = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        demarrer = new javax.swing.JButton();
        recommencer = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jBImg1 = new javax.swing.JButton();
        jBImg2 = new javax.swing.JButton();
        jBImg3 = new javax.swing.JButton();
        jBImg4 = new javax.swing.JButton();
        jBImg5 = new javax.swing.JButton();
        jBImg6 = new javax.swing.JButton();
        jBImg7 = new javax.swing.JButton();
        jBImg8 = new javax.swing.JButton();
        jBImg9 = new javax.swing.JButton();
        jBImg10 = new javax.swing.JButton();
        jBImg11 = new javax.swing.JButton();
        jBImg12 = new javax.swing.JButton();
        jBImg13 = new javax.swing.JButton();
        jBImg14 = new javax.swing.JButton();
        jBImg15 = new javax.swing.JButton();
        jBImg16 = new javax.swing.JButton();
        jBImg17 = new javax.swing.JButton();
        jBImg18 = new javax.swing.JButton();
        jBImg19 = new javax.swing.JButton();
        jBImg20 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Options = new javax.swing.JMenuItem();
        AjoutJoueur = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Joueur = new javax.swing.JMenuItem();
        Cartes = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        Transfert_Test = new javax.swing.JMenuItem();
        Bataille_Test = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.GridLayout(3, 1));

        jLabel1.setText("Work in progress");
        jPanel1.add(jLabel1);

        jLabel2.setText("WIP");
        jPanel1.add(jLabel2);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("WIP");
        jPanel1.add(jLabel3);

        jPanel4.add(jPanel1, java.awt.BorderLayout.NORTH);

        jTextAreaInfo.setColumns(20);
        jTextAreaInfo.setRows(5);
        jScrollPane1.setViewportView(jTextAreaInfo);

        jPanel4.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel2.setLayout(new java.awt.GridLayout(1, 2));

        demarrer.setText("Démarrer");
        demarrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demarrerActionPerformed(evt);
            }
        });
        jPanel2.add(demarrer);

        recommencer.setText("Recommencer");
        recommencer.setEnabled(false);
        jPanel2.add(recommencer);

        jPanel4.add(jPanel2, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanel4, java.awt.BorderLayout.WEST);

        jPanel3.setLayout(new java.awt.GridLayout(4, 5));

        jBImg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImg1ActionPerformed(evt);
            }
        });
        jPanel3.add(jBImg1);

        jBImg2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImg2ActionPerformed(evt);
            }
        });
        jPanel3.add(jBImg2);

        jBImg3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImg3ActionPerformed(evt);
            }
        });
        jPanel3.add(jBImg3);

        jBImg4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImg4ActionPerformed(evt);
            }
        });
        jPanel3.add(jBImg4);

        jBImg5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImg5ActionPerformed(evt);
            }
        });
        jPanel3.add(jBImg5);

        jBImg6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImg6ActionPerformed(evt);
            }
        });
        jPanel3.add(jBImg6);

        jBImg7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImg7ActionPerformed(evt);
            }
        });
        jPanel3.add(jBImg7);

        jBImg8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImg8ActionPerformed(evt);
            }
        });
        jPanel3.add(jBImg8);

        jBImg9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImg9ActionPerformed(evt);
            }
        });
        jPanel3.add(jBImg9);

        jBImg10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImg10ActionPerformed(evt);
            }
        });
        jPanel3.add(jBImg10);

        jBImg11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImg11ActionPerformed(evt);
            }
        });
        jPanel3.add(jBImg11);

        jBImg12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImg12ActionPerformed(evt);
            }
        });
        jPanel3.add(jBImg12);

        jBImg13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImg13ActionPerformed(evt);
            }
        });
        jPanel3.add(jBImg13);

        jBImg14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImg14ActionPerformed(evt);
            }
        });
        jPanel3.add(jBImg14);

        jBImg15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImg15ActionPerformed(evt);
            }
        });
        jPanel3.add(jBImg15);

        jBImg16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImg16ActionPerformed(evt);
            }
        });
        jPanel3.add(jBImg16);

        jBImg17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImg17ActionPerformed(evt);
            }
        });
        jPanel3.add(jBImg17);

        jBImg18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImg18ActionPerformed(evt);
            }
        });
        jPanel3.add(jBImg18);

        jBImg19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImg19ActionPerformed(evt);
            }
        });
        jPanel3.add(jBImg19);

        jBImg20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBImg20ActionPerformed(evt);
            }
        });
        jPanel3.add(jBImg20);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Paramètres");

        Options.setText("Options");
        Options.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OptionsActionPerformed(evt);
            }
        });
        jMenu1.add(Options);

        AjoutJoueur.setText("Ajout joueur");
        AjoutJoueur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjoutJoueurActionPerformed(evt);
            }
        });
        jMenu1.add(AjoutJoueur);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Visualiser");

        Joueur.setText("Joueur");
        Joueur.setEnabled(false);
        Joueur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JoueurActionPerformed(evt);
            }
        });
        jMenu2.add(Joueur);

        Cartes.setText("Cartes");
        Cartes.setEnabled(false);
        Cartes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CartesActionPerformed(evt);
            }
        });
        jMenu2.add(Cartes);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Test");

        Transfert_Test.setText("Transfert");
        Transfert_Test.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Transfert_TestActionPerformed(evt);
            }
        });
        jMenu3.add(Transfert_Test);

        Bataille_Test.setText("Bataille");
        Bataille_Test.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bataille_TestActionPerformed(evt);
            }
        });
        jMenu3.add(Bataille_Test);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void OptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OptionsActionPerformed
        JDialog opt = new InitDialog(this,true,new InitDialog.setOnOptSelected() {
        @Override
        public void onOptSelected(LesJoueurs lj, int difficulty) { // on ajoute un écouteur qui permet de savoir quand l'utilisateur a fini de sélectionner des options
            try { // on essaye d'ajouter une liste de joueur
                lstPlayers.ajouteJoueurs(lj);
            } catch (Exception ex) { // si un joueur est déjà présent dans la liste on affiche une erreur indiquant qu'aucun joueur n'a été ajouté
                showErrorDlg(Erreur.OnePlayerAlreadyInTheList);
            }
            difficultyLvl = difficulty; // on change le niveau de difficulté par rapport à ce que l'utilisateur a choisit
            if(difficultyLvl!=0){
                lstPerso = new LesPersonnages(difficulty);    
            }
        }
        });
        opt.setVisible(true);
    }//GEN-LAST:event_OptionsActionPerformed

    private void JoueurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JoueurActionPerformed
        VisuJoueursDlg visuJoueursDlg = new VisuJoueursDlg(this,true,lstPlayers);
        visuJoueursDlg.setVisible(true);    
    }//GEN-LAST:event_JoueurActionPerformed

    private void jBImg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImg1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBImg1ActionPerformed

    private void jBImg2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImg2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBImg2ActionPerformed

    private void jBImg3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImg3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBImg3ActionPerformed

    private void jBImg4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImg4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBImg4ActionPerformed

    private void jBImg5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImg5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBImg5ActionPerformed

    private void jBImg6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImg6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBImg6ActionPerformed

    private void jBImg7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImg7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBImg7ActionPerformed

    private void jBImg8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImg8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBImg8ActionPerformed

    private void jBImg9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImg9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBImg9ActionPerformed

    private void jBImg10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImg10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBImg10ActionPerformed

    private void jBImg11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImg11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBImg11ActionPerformed

    private void jBImg12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImg12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBImg12ActionPerformed

    private void jBImg13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImg13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBImg13ActionPerformed

    private void jBImg14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImg14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBImg14ActionPerformed

    private void jBImg15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImg15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBImg15ActionPerformed

    private void jBImg16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImg16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBImg16ActionPerformed

    private void jBImg17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImg17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBImg17ActionPerformed

    private void jBImg18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImg18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBImg18ActionPerformed

    private void jBImg19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImg19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBImg19ActionPerformed

    private void jBImg20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBImg20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBImg20ActionPerformed

    private void demarrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demarrerActionPerformed
        if(lstPlayers.getNbJoueurs()>2){ // pour démarrer le jeu, il doit y avoir au moins 2 joueurs
            if(difficultyLvl!=0){
                if(lstPlayers.arePlayersValidCompareToDifficulty(difficultyLvl)){ // on vérifie si les joueurs ont tous choisi une famille préféré qui est dans le niveau de difficulté
                    demarrer.setEnabled(false); // on supprime la possibilité de réappuyer sur le boutton démarré
                    Options.setEnabled(false); // on supprime la possibilité de réappuyer sur le boutton démarré
                    AjoutJoueur.setEnabled(false);  // on supprime la possibilité de réappuyer sur le boutton ajouté un joueur
                    recommencer.setEnabled(true); 
                    Joueur.setEnabled(true); // Le bouton joueur dans le menu option menu est maintenant disponible 
                    Cartes.setEnabled(true); // Le bouton cartes dans le menu option menu est maintenant disponible
                }else{
                    showErrorDlg(Erreur.PlayerSelectedFamillyNotInRange);
                }
            }else{
                showErrorDlg(Erreur.mustChooseDifficulty);
            }   
        }else{
            jTextAreaInfo.setText(Erreur.youMustSelectTwoPlayer);
        }
    }//GEN-LAST:event_demarrerActionPerformed

    private void AjoutJoueurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjoutJoueurActionPerformed
        if(difficultyLvl!=0){
            SaisieJoueurDlg saisieJoueurDlg = new SaisieJoueurDlg(this, true, lstPerso,new SaisieJoueurDlg.setOnNewPlayerCreated() {
                @Override
                public void onNewPlayerCreated(jeumemory.Joueur newPlayer) {
                    try {
                        System.out.println(TAG+" new Player added : "+newPlayer.toString());
                        lstPlayers.ajouteJoueur(newPlayer);
                    } catch (Exception ex) { // L'utilisateur essaye d'ajouté un joueur déjà présent dans la liste des joueurs
                        showErrorDlg(Erreur.playerAlreadyInDataBase);
                        System.out.println(TAG+" trying to add a player who's already in the list"+newPlayer.toString()+"\n"+ex.toString());
                    }
                }
            });
            saisieJoueurDlg.setVisible(true);
        }else{ // L'utilisateur essaye d'ajouté un joueur mais n'a pas sélectionné de niveau de difficulté. ( il faut un niveau de difficulté pour famille préféré )
            showErrorDlg(Erreur.mustChooseDifficulty);
        }
    }//GEN-LAST:event_AjoutJoueurActionPerformed

    private void CartesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CartesActionPerformed
        Joueur j=new Joueur("FanMemory",new ImageIcon(getClass().getResource("/jeumemory/img/anonyme.jpg")));
        j.initPaquetTest();         
        VisuPersonnagesDlg visuPersonnagesDlg = new VisuPersonnagesDlg(this,true,j);
        visuPersonnagesDlg.setVisible(true);
    }//GEN-LAST:event_CartesActionPerformed

    private void Transfert_TestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Transfert_TestActionPerformed
        try {
            lstPlayers = new LesJoueurs();
            Joueur j1=new Joueur("FanMemory0", Famille.communs);
            j1.initPaquetTest();
            Joueur j2=new Joueur("FanMemory1", Famille.communs);
            j2.getPaquet().ajoutePerso(new Personnage(Famille.epiques, "burnout", 20));
            j2.getPaquet().ajoutePerso(new Personnage(Famille.epiques, "funk-ops", 30));
            j2.getPaquet().ajoutePerso(new Personnage(Famille.alpinsFemmes, "mogul-master", 10));
            this.lstPlayers.ajouteJoueur(j1);
            this.lstPlayers.ajouteJoueur(j2);
            TransfertDlg diag = new TransfertDlg(this,true,lstPlayers,null);
            diag.setVisible(true);
        } catch (Exception ex) {
            System.out.println(TAG+": This shouldn't been call ( Transfert_TestActionPerformed() )");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_Transfert_TestActionPerformed

    private void Bataille_TestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bataille_TestActionPerformed
        // ajout de cartes aux2 premiers joueurs 
        try {
            lstPlayers = new LesJoueurs();
            Joueur j1=new Joueur("FanMemory0", Famille.communs);
            j1.initPaquetTest();
            Joueur j2=new Joueur("FanMemory1", Famille.communs);
            j2.getPaquet().ajoutePerso(new Personnage(Famille.epiques, "burnout", 20));
            j2.getPaquet().ajoutePerso(new Personnage(Famille.epiques, "funk-ops", 30));
            j2.getPaquet().ajoutePerso(new Personnage(Famille.alpinsFemmes, "mogul-master", 10));
            this.lstPlayers.ajouteJoueur(j1);
            this.lstPlayers.ajouteJoueur(j2);
            BatailleDlg diag = new BatailleDlg(this, true,lstPlayers,0);
            diag.setSize(1000,600);
            diag.setVisible(true);
        } catch (Exception ex) {
            System.out.println(TAG+": This shouldn't been call ( Bataille_TestActionPerformed() )\n");
            ex.printStackTrace();
        }
    }//GEN-LAST:event_Bataille_TestActionPerformed

    private void showErrorDlg(String error){
        ErrorDlg errorDlg = new ErrorDlg(this,true,error);
        errorDlg.setVisible(true);
    }
    
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
            java.util.logging.Logger.getLogger(JeuMemory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JeuMemory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JeuMemory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JeuMemory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JeuMemory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AjoutJoueur;
    private javax.swing.JMenuItem Bataille_Test;
    private javax.swing.JMenuItem Cartes;
    private javax.swing.JMenuItem Joueur;
    private javax.swing.JMenuItem Options;
    private javax.swing.JMenuItem Transfert_Test;
    private javax.swing.JButton demarrer;
    private javax.swing.JButton jBImg1;
    private javax.swing.JButton jBImg10;
    private javax.swing.JButton jBImg11;
    private javax.swing.JButton jBImg12;
    private javax.swing.JButton jBImg13;
    private javax.swing.JButton jBImg14;
    private javax.swing.JButton jBImg15;
    private javax.swing.JButton jBImg16;
    private javax.swing.JButton jBImg17;
    private javax.swing.JButton jBImg18;
    private javax.swing.JButton jBImg19;
    private javax.swing.JButton jBImg2;
    private javax.swing.JButton jBImg20;
    private javax.swing.JButton jBImg3;
    private javax.swing.JButton jBImg4;
    private javax.swing.JButton jBImg5;
    private javax.swing.JButton jBImg6;
    private javax.swing.JButton jBImg7;
    private javax.swing.JButton jBImg8;
    private javax.swing.JButton jBImg9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaInfo;
    private javax.swing.JButton recommencer;
    // End of variables declaration//GEN-END:variables

}
