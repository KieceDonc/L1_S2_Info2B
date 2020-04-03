package jeumemory.ui;

import java.awt.Image;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import jeumemory.Famille;
import jeumemory.Joueur;
import jeumemory.LesJoueurs;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vv224843
 */
public class InitDialog extends javax.swing.JDialog {
    
    public interface setOnOptSelected {
        void onOptSelected(LesJoueurs lj, int difficulty);
    }
    
    private LesJoueurs selectedPlayers; // liste des joueurs sélectionnées par l'utilisateur
    private setOnOptSelected optListener; // utilisé pour enregistrer l'adresse de l'instance du "callback" afin de renvoyer les données
    private static final String TAG = InitDialog.class.getName(); // utilisé pour les logs pour avoir plus de précision d'où viens les logs
    /**
     * Il existe 4 niveaux de difficulté : Enfant, débutant, avancé et expert. 
     * Pour nous il correspondra au nombre de personnage dût à la difficulté = 4 ou 10 ou 18 ou 32
     */
    private int difficulty=4; // la difficulté par défaut est de 4 ( mode débutant ) 

    /**
     * Creates new form InitDialog
     */
    public InitDialog(java.awt.Frame parent, boolean modal, setOnOptSelected optListener) {
        super(parent, modal);
        this.selectedPlayers = new LesJoueurs();
        this.optListener = optListener; 
        initComponents();
        addOnWindowSizeChangeListener();
        jRadioButtonChild.setSelected(true); // par défault le niveau de difficulté enfant est sélectioné
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupDifficulty = new javax.swing.ButtonGroup();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Info = new javax.swing.JTextArea();
        BPhoto = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        Cancel = new javax.swing.JButton();
        Submit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jRadioButtonChild = new javax.swing.JRadioButton();
        jRadioButtonBeginner = new javax.swing.JRadioButton();
        jRadioButtonAdvance = new javax.swing.JRadioButton();
        jRadioButtonExpert = new javax.swing.JRadioButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jCheckBoxLara = new javax.swing.JCheckBox();
        jCheckBoxJack = new javax.swing.JCheckBox();
        jCheckBoxJS = new javax.swing.JCheckBox();
        jCheckBoxAmadeus = new javax.swing.JCheckBox();
        jPanel11 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel6.setLayout(new java.awt.GridLayout(2, 0));

        Info.setColumns(20);
        Info.setRows(5);
        jScrollPane1.setViewportView(Info);

        jPanel6.add(jScrollPane1);

        BPhoto.setBorder(null);
        jPanel6.add(BPhoto);

        getContentPane().add(jPanel6, java.awt.BorderLayout.EAST);

        jPanel1.setLayout(new java.awt.GridLayout(1, 2));

        Cancel.setText("Annuler");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        jPanel1.add(Cancel);

        Submit.setText("Valider");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        jPanel1.add(Submit);

        getContentPane().add(jPanel1, java.awt.BorderLayout.SOUTH);

        jPanel2.setLayout(new java.awt.GridLayout(1, 2));

        jPanel7.setLayout(new java.awt.BorderLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Choissisez la taille du jeu");
        jPanel7.add(jLabel1, java.awt.BorderLayout.NORTH);

        jPanel4.setLayout(new java.awt.GridLayout(4, 1));

        buttonGroupDifficulty.add(jRadioButtonChild);
        jRadioButtonChild.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonChildActionPerformed(evt);
            }
        });
        jPanel4.add(jRadioButtonChild);

        buttonGroupDifficulty.add(jRadioButtonBeginner);
        jRadioButtonBeginner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonBeginnerActionPerformed(evt);
            }
        });
        jPanel4.add(jRadioButtonBeginner);

        buttonGroupDifficulty.add(jRadioButtonAdvance);
        jRadioButtonAdvance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAdvanceActionPerformed(evt);
            }
        });
        jPanel4.add(jRadioButtonAdvance);

        buttonGroupDifficulty.add(jRadioButtonExpert);
        jRadioButtonExpert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonExpertActionPerformed(evt);
            }
        });
        jPanel4.add(jRadioButtonExpert);

        jPanel7.add(jPanel4, java.awt.BorderLayout.WEST);

        jPanel8.setLayout(new java.awt.GridLayout(4, 1));

        jLabel6.setText("Enfant ( 4 personnages, 2 familles  )");
        jPanel8.add(jLabel6);

        jLabel7.setText("Débutant ( 10 personnages, 4 familles  )");
        jPanel8.add(jLabel7);

        jLabel8.setText("Avancé ( 18 personnages, 6 familles )");
        jPanel8.add(jLabel8);

        jLabel9.setText("Expert ( 32 personnages, 6 familles )");
        jPanel8.add(jLabel9);

        jPanel7.add(jPanel8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel7);

        jPanel9.setLayout(new java.awt.BorderLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Choisissez les joueurs créés par défaut");
        jPanel9.add(jLabel2, java.awt.BorderLayout.NORTH);

        jPanel10.setLayout(new java.awt.GridLayout(4, 1));

        jCheckBoxLara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxLaraActionPerformed(evt);
            }
        });
        jPanel10.add(jCheckBoxLara);

        jCheckBoxJack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxJackActionPerformed(evt);
            }
        });
        jPanel10.add(jCheckBoxJack);

        jCheckBoxJS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxJSActionPerformed(evt);
            }
        });
        jPanel10.add(jCheckBoxJS);

        jCheckBoxAmadeus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxAmadeusActionPerformed(evt);
            }
        });
        jPanel10.add(jCheckBoxAmadeus);

        jPanel9.add(jPanel10, java.awt.BorderLayout.WEST);

        jPanel11.setLayout(new java.awt.GridLayout(4, 1));

        jLabel10.setText("Lara");
        jPanel11.add(jLabel10);

        jLabel11.setText("Jack");
        jPanel11.add(jLabel11);

        jLabel12.setText("Jean-Sébastien");
        jPanel11.add(jLabel12);

        jLabel13.setText("Amadeus");
        jPanel11.add(jLabel13);

        jPanel9.add(jPanel11, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxLaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxLaraActionPerformed
        Joueur lara = getPlayer("Lara",Famille.communs);
        
        if(jCheckBoxLara.isSelected()){
            addPlayer(lara);
        }else{
            deletePlayer(lara);
        }
                
        System.out.println(TAG+": Lara action performed"+"\n"+"selectedPlayers ( LesJoueurs )="+selectedPlayers.toString());
        updateDisplayedInformation();
    }//GEN-LAST:event_jCheckBoxLaraActionPerformed

    private void jCheckBoxJackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxJackActionPerformed
        Joueur jack = getPlayer("Jack",Famille.communs);
        
        if(jCheckBoxJack.isSelected()){
            addPlayer(jack);
        }else{
            deletePlayer(jack);
        }
        
        System.out.println(TAG+": Jack action performed"+"\n"+"selectedPlayers ( LesJoueurs )="+selectedPlayers.toString());
        updateDisplayedInformation();
    }//GEN-LAST:event_jCheckBoxJackActionPerformed

    private void jCheckBoxJSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxJSActionPerformed
        Joueur jb = getPlayer("Jean-Sébastien",Famille.rares);
        
        if(jCheckBoxJS.isSelected()){
            addPlayer(jb);
        }else{
            deletePlayer(jb);
        }

        System.out.println(TAG+": Jean-Sébastien action performed"+"\n"+"selectedPlayers ( LesJoueurs )="+selectedPlayers.toString());
        updateDisplayedInformation();

    }//GEN-LAST:event_jCheckBoxJSActionPerformed

    private void jCheckBoxAmadeusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxAmadeusActionPerformed
        Joueur amadeus = getPlayer("Amadeus",Famille.rares);   

        if(jCheckBoxAmadeus.isSelected()){
            addPlayer(amadeus);
        }else{
            deletePlayer(amadeus);
        }
        
        System.out.println(TAG+": Amadeus action performed"+"\n"+"selectedPlayers ( LesJoueurs )="+selectedPlayers.toString());  
        updateDisplayedInformation();
    }//GEN-LAST:event_jCheckBoxAmadeusActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        System.out.println(TAG+": Cancel button selected");
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_CancelActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        System.out.println(TAG
                +": Submit button selected."
                +"\ndifficultyLvl ="+difficulty
                +"\n"+"selectedPlayers ( LesJoueurs )="+selectedPlayers.toString()
        ); // Création de log 
        optListener.onOptSelected(selectedPlayers, difficulty); // on renvoie les données sélectionnées au "main" soit JeuMemory
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_SubmitActionPerformed

    private void jRadioButtonChildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonChildActionPerformed
        difficulty = 4; // On indique que le niveau de difficulté sélectionné est celui d'enfant
        System.out.println(TAG+": Child difficulty selected (4) "); // Création de log 
    }//GEN-LAST:event_jRadioButtonChildActionPerformed

    private void jRadioButtonBeginnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonBeginnerActionPerformed
        difficulty = 10; // On indique que le niveau de difficulté sélectionné est celui d'un 
        System.out.println(TAG+": Beginner difficulty selected (8) "); // Création de log 

    }//GEN-LAST:event_jRadioButtonBeginnerActionPerformed

    private void jRadioButtonAdvanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAdvanceActionPerformed
        difficulty = 18; // On indique que le niveau de difficulté sélectionné est celui d'un joueur avancé
        System.out.println(TAG+": Advance difficulty selected (16) "); // Création de log 

    }//GEN-LAST:event_jRadioButtonAdvanceActionPerformed

    private void jRadioButtonExpertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonExpertActionPerformed
        difficulty = 32; // On indique que le niveau de difficulté sélectionné est celui d'un joueur expert
        System.out.println(TAG+": Advance difficulty selected (32) "); // Création de log 

    }//GEN-LAST:event_jRadioButtonExpertActionPerformed
    
    private void updateDisplayedInformation(){
        if(selectedPlayers.getNbJoueurs()>0){
            Joueur currentPlayer = selectedPlayers.getJoueur(selectedPlayers.getNbJoueurs()-1); // on récupère le dernier joueur ajouté
            updateBPhoto();
            Info.setText(currentPlayer.toString()); // on affiche les informations du joueur
        }else{
            BPhoto.setIcon(null);
            Info.setText("");
        }
    }
    
    private void addOnWindowSizeChangeListener(){ // on ajoute un " écouteur " de quand la taille de la fenêtre change
        this.addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent e) {
                updateBPhoto(); // la taille de la fenêtre a changé donc on modifie la taille de notre image
            }
        });
    }
    
    private void updateBPhoto(){
        if(selectedPlayers.getNbJoueurs()>0){
            Joueur currentPlayer = selectedPlayers.getJoueur(selectedPlayers.getNbJoueurs()-1); // on récupère le dernier joueur ajouté
            Image scaledImg = currentPlayer.getImgJoueur().getImage().getScaledInstance(BPhoto.getWidth(), BPhoto.getHeight(), Image.SCALE_SMOOTH); // on crée une image à la taille du bouton
            BPhoto.setIcon(new ImageIcon(scaledImg)); // on montre l'image du joueur    
        }
    }
    
    private Joueur getPlayer(String playerName,Famille famille){
        System.out.println("/jeumemory/img/"+playerName.toLowerCase()+".jpg");
        ImageIcon playerIcon = new ImageIcon(getClass().getResource("/jeumemory/img/"+playerName.toLowerCase()+".jpg"));
        return new Joueur(playerName, playerIcon,famille);
        
    }
    
    private void addPlayer(Joueur player){
        try { // on essaye d'ajouté le joueur à la liste
            selectedPlayers.ajouteJoueur(player);
        } catch (Exception e) { // si le joueur est déjà présent dans la liste, on affiche que le développeur est débile
            System.out.println(TAG+": "+e.toString());
        }
    }
    
    private void deletePlayer(Joueur player){
        try{ // on essaye de retirer le joueur à la liste
            selectedPlayers.supprimeJoueur(player);
        }catch(Exception e){  // si le joueur n'est pas présent dans la liste, on affiche que le développeur est débile
            System.out.println(TAG+": "+e.toString());
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
            java.util.logging.Logger.getLogger(InitDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InitDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InitDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InitDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InitDialog dialog = new InitDialog(new javax.swing.JFrame(), true, null);
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
    private javax.swing.JButton BPhoto;
    private javax.swing.JButton Cancel;
    private javax.swing.JTextArea Info;
    private javax.swing.JButton Submit;
    private javax.swing.ButtonGroup buttonGroupDifficulty;
    private javax.swing.JCheckBox jCheckBoxAmadeus;
    private javax.swing.JCheckBox jCheckBoxJS;
    private javax.swing.JCheckBox jCheckBoxJack;
    private javax.swing.JCheckBox jCheckBoxLara;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButtonAdvance;
    private javax.swing.JRadioButton jRadioButtonBeginner;
    private javax.swing.JRadioButton jRadioButtonChild;
    private javax.swing.JRadioButton jRadioButtonExpert;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
