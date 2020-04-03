/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeumemory.ui;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import jeumemory.Joueur;
import jeumemory.LesPersonnages;
import jeumemory.Personnage;

/**
 *
 * @author Valentin
 */
public class VisuPersonnagesDlg extends javax.swing.JDialog {
    
    private static final String TAG = VisuPersonnagesDlg.class.getName();

    private Joueur currentPlayer;
    /**
     * Creates new form VisuPersonnagesDlg
     */
    public VisuPersonnagesDlg(java.awt.Frame parent, boolean modal, Joueur currentPlayer) {
        super(parent, modal);
        System.out.println(TAG+": started");
        this.currentPlayer=currentPlayer;
        initComponents();
        initLabel();
        initPanneau();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CartesDuJoueur = new javax.swing.JLabel();
        jPanelTrombi = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Show = new javax.swing.JButton();
        Score = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        CartesDuJoueur.setText("Cartes du joueur : ");
        getContentPane().add(CartesDuJoueur, java.awt.BorderLayout.NORTH);

        jPanelTrombi.setVerifyInputWhenFocusTarget(false);
        jPanelTrombi.setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(jPanelTrombi, java.awt.BorderLayout.CENTER);

        jPanel1.setLayout(new java.awt.BorderLayout());

        Show.setText("Afficher");
        Show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowActionPerformed(evt);
            }
        });
        jPanel1.add(Show, java.awt.BorderLayout.SOUTH);

        Score.setText("Score :");
        jPanel1.add(Score, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowActionPerformed
        System.out.println(TAG+": show button clicked");
        
        LesPersonnages characterList = currentPlayer.getEnPossession();
        int nbCharacter = characterList.getTaille();

        if(nbCharacter>0){
            int nbButton = jPanelTrombi.getComponentCount();
            for(int x=0;x<nbButton;x++){
                JButton currentB = (JButton) jPanelTrombi.getComponent(x);
                currentB.setIcon(new ImageIcon(characterList.getPerso(x).getPhoto()));
            }    
        }
    }//GEN-LAST:event_ShowActionPerformed
    
    private void initLabel(){
        String toScore = "Score : "+currentPlayer.getScore();
        Score.setText(toScore);
        
        String toCartesDuJoueur = "Cartes du joueur : "+currentPlayer.getPseudo();
        CartesDuJoueur.setText(toCartesDuJoueur);
    }
    
    private void initPanneau(){
        LesPersonnages characterList = currentPlayer.getEnPossession();
        System.out.println(TAG+": list character = "+characterList.toString());
        int nbCharacter = characterList.getTaille();
        
        if(nbCharacter>0){
            int dim = getSquareDim(nbCharacter);
            jPanelTrombi.setLayout(new GridLayout(dim,dim));
            ImageIcon anonymIcon = new ImageIcon(getClass().getResource("/jeumemory/img/anonyme.jpg")); // on récupère l'image "anonyme"
            for(int x=0;x<nbCharacter;x++){
                System.out.println(x);
                JButton jb = new JButton();
                jb.setPreferredSize(new Dimension(anonymIcon.getIconWidth(),anonymIcon.getIconHeight())); // on définit la taille du boutton a partir de la taille de l'image d'anonyme
                jPanelTrombi.add(jb);
            }
        }
        pack();
    }
    
    /**
     * On chercher à faire un beau carré à partir d'un certains nombre de personnages
     * On chercher donc la puissance de 2 pour laquel 2^x <= nombre de personnages
     * @return 
     */
    private int getSquareDim(int nbCharacter){
        int currentP =-1;
        boolean founded=false;
        do{
            currentP++;
            if(Math.pow(2,currentP)>=nbCharacter){
                founded=true;
            }
        }while(currentP<50&&!founded);
        return currentP;
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
            java.util.logging.Logger.getLogger(VisuPersonnagesDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisuPersonnagesDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisuPersonnagesDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisuPersonnagesDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VisuPersonnagesDlg dialog = new VisuPersonnagesDlg(new javax.swing.JFrame(), true,null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CartesDuJoueur;
    private javax.swing.JLabel Score;
    private javax.swing.JButton Show;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelTrombi;
    // End of variables declaration//GEN-END:variables
}
