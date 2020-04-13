/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeumemory.ui;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import jeumemory.Joueur;
import jeumemory.LesJoueurs;

/**
 *
 * @author Valentin
 */
public class VisuJoueursDlg extends javax.swing.JDialog {

    private static final String TAG = VisuJoueursDlg.class.getName();
    
    private LesJoueurs playersToShow; // enregistre la liste des joueurs
    
    private boolean showButtonAlreadyPressed = false;
    
    /**
     * Creates new form VisuJoueursDlg
     */
    public VisuJoueursDlg(java.awt.Frame parent, boolean modal, LesJoueurs playersToShow) {
        super(parent, modal);
        this.playersToShow = playersToShow;
        initComponents();
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

        jLabel1 = new javax.swing.JLabel();
        show = new javax.swing.JButton();
        Panneau = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Choissisez un joueur pour voir ses caractéristiques");
        getContentPane().add(jLabel1, java.awt.BorderLayout.PAGE_START);

        show.setText("Afficher");
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });
        getContentPane().add(show, java.awt.BorderLayout.PAGE_END);

        Panneau.setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(Panneau, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void initPanneau(){  
        JScrollPane jScrollPane = new JScrollPane();
        JTextArea showInfo = new JTextArea();
        jScrollPane.add(showInfo);
        
        if(playersToShow!=null){ // on vérifie que des joueurs existent
                
            int nbPlayers = playersToShow.getNbJoueurs();
            Panneau.setLayout(new GridLayout(1,nbPlayers));
            if(nbPlayers>0){
                for(int x=0;x<nbPlayers;x++){ // on parcourt la liste des joueurs
                    JButton jb = new JButton(); // on crée un nouveau 
                    Joueur currentPlayer = playersToShow.getJoueur(x); // on récupère le joueur courant
                    jb.setText(""+currentPlayer.getPseudo()); // le texte prendre la valeur du pseudo du joueur
                    jb.addActionListener(new java.awt.event.ActionListener(){ // on ajoute un écouter
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            System.out.println(TAG+": "+currentPlayer.getPseudo()+" button clicked");
                            showInfo.setText(currentPlayer.toString()); // si l'utilisateur clique sur le bouton on affiche les informations du joueur
                        }                    
                    });
                    Panneau.add(jb);
                }
            }
            Panneau.add(showInfo);  // on ajoute le boutton crée
            showInfo.setText("Texte qui sert à avoir une bonne dimension"
                    + "\nTexte qui sert à avoir une bonne dimension"
                    + "\nTexte qui sert à avoir une bonne dimension"
                    + "\nTexte qui sert à avoir une bonne dimension\n\n\n\n\n\n\n"); // on rempli notre JTextArea avec du texte bidon pour avoir une dimension "acceptable"
        }else{ // On affiche visuellement une erreur
            System.out.println(TAG+": playersToShow = null");
            jLabel1.setText("Aucun joueur n'a été sélectionné, veuillez sélectionner des joueurs");
            show.setText("Annuler");
        }
        pack();
        showInfo.setText(""); // on supprime le texte bidon servant à avoir une dimension acceptable
    }
    
    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        System.out.println(TAG+": show button pressed");
        if(playersToShow!=null){
            if(!showButtonAlreadyPressed){
                showButtonAlreadyPressed=true;
                showPhoto();
                setOnWindowSizeChangeListener();
            }
        }else{ // il n'existe pas de joueurs. le boutton à donc prit comme texte ( " Annuler " ) et on souhaite donc annuler le dialog
            this.setVisible(false);
            this.dispose();
        }
    }//GEN-LAST:event_showActionPerformed


    private void setOnWindowSizeChangeListener(){ // on ajoute un " écouteur " de quand la taille de la fenêtre change
        this.addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent e) {
                showPhoto(); // la taille de la fenêtre a changé donc on modifie la taille de notre image
            }
        });
        System.out.println(TAG+": adding on component resized listener");
    }
    
    private void showPhoto(){
        int nbPlayer = Panneau.getComponentCount()-1; // -1 car on exclue le JTextArea
        for(int x=0;x<nbPlayer;x++){ // on parcourt la liste des composants
            JButton currentButton = (JButton) Panneau.getComponent(x); // on récupère le JButton courant
            Joueur currentPlayer = playersToShow.getJoueur(x); // on récupère le joueur courant
            Image scaledImg = currentPlayer.getImgJoueur().getImage().getScaledInstance(currentButton.getWidth(), currentButton.getHeight(), Image.SCALE_SMOOTH); // on crée une image à la taille du bouton courant
            currentButton.setIcon(new ImageIcon(scaledImg)); // on affiche la photo du joueur
        }
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
            java.util.logging.Logger.getLogger(VisuJoueursDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisuJoueursDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisuJoueursDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisuJoueursDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VisuJoueursDlg dialog = new VisuJoueursDlg(new javax.swing.JFrame(), true,null);
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
    private javax.swing.JPanel Panneau;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton show;
    // End of variables declaration//GEN-END:variables
}
