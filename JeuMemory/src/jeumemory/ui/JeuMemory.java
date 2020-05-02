package jeumemory.ui;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.Timer;
import jeumemory.Erreur;
import jeumemory.Famille;
import jeumemory.Jeu;
import jeumemory.Joueur;
import jeumemory.LesJoueurs;
import jeumemory.LesPersonnages;
import jeumemory.Personnage;
import jeumemory.PlateauJeu;
import jeumemory.Transfert;
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
    private PlateauJeu plateau;
    private Jeu jeu;
    
    private int difficultyLvl;
    private int l1, c1, l2, c2;// pour les cartes sélectionnées à chaque tour de jeu
    
    private boolean forbiddenToPlay=false;// interdiction de retourné des cartes ( sert pendant le timer de startTimer() ) 
    
    /**
     * Creates new form Exo3
     */
    public JeuMemory() {
        initComponents();
        l1=-1;
        c1=-1;
        l2=-1;
        c2=-1;     
    }
    
    public void initJeu(){
        demarrer.setEnabled(false); // on supprime la possibilité de réappuyer sur le boutton démarré
        Options.setEnabled(false); // on supprime la possibilité de réappuyer sur le boutton démarré
        AjoutJoueur.setEnabled(false);  // on supprime la possibilité de réappuyer sur le boutton ajouté un joueur
        recommencer.setEnabled(true); 
        Joueur.setEnabled(true); // Le bouton joueur dans le menu option menu est maintenant disponible 
        Cartes.setEnabled(true); // Le bouton cartes dans le menu option menu est maintenant disponible
        plateau = new PlateauJeu(difficultyLvl); // on initialise le plateau de jeu en donnant en paramètre le niveau de difficulté qui correspond également au nombre de carte
        plateau.initPlateauJeu();
        jPanelPlateau.setLayout(new GridLayout(0,plateau.getNbCol()));
        for(int x=0;x<difficultyLvl*2;x++){ // on crée un bouton pour chaque chaque
            JButton current = new JButton();
            current.setPreferredSize(new Dimension(150,150));
            current.setName(String.valueOf(x));
            current.addActionListener(new ActionListener(){ 
                @Override
                public void actionPerformed(ActionEvent evt){
                    boutonActionPerformed(evt);
                }
            });
            jPanelPlateau.add(current);
        }
        jeu = new Jeu(lstPerso,lstPlayers,difficultyLvl*2);
        showWhoMustPlay(jeu.getJoueurCourant().getPseudo());
        showNbPersoRestant(difficultyLvl);
        showNbPersoFounded(0);
        this.pack();
    }
    
    /**
     * Supprime toutes les données de la partie précédente
     */
    private void wipeData(){
        lstPlayers.wipeDataForEveryPlayer();
        jPanelPlateau.removeAll();
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
        JLabelShowNbPersoFounded = new javax.swing.JLabel();
        JLabelShowNbPersoLeft = new javax.swing.JLabel();
        JLabelShowHowMustPlay = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaInfo = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        demarrer = new javax.swing.JButton();
        recommencer = new javax.swing.JButton();
        jPanelPlateau = new javax.swing.JPanel();
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

        JLabelShowNbPersoFounded.setText(" ");
        jPanel1.add(JLabelShowNbPersoFounded);

        JLabelShowNbPersoLeft.setText(" ");
        jPanel1.add(JLabelShowNbPersoLeft);

        JLabelShowHowMustPlay.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        JLabelShowHowMustPlay.setText(" ");
        jPanel1.add(JLabelShowHowMustPlay);

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
        recommencer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recommencerActionPerformed(evt);
            }
        });
        jPanel2.add(recommencer);

        jPanel4.add(jPanel2, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanel4, java.awt.BorderLayout.WEST);

        jPanelPlateau.setLayout(new java.awt.GridLayout(4, 5));
        getContentPane().add(jPanelPlateau, java.awt.BorderLayout.CENTER);

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
        opt.setSize(600,400);
        opt.setVisible(true);
    }//GEN-LAST:event_OptionsActionPerformed

    private void JoueurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JoueurActionPerformed
        VisuJoueursDlg visuJoueursDlg = new VisuJoueursDlg(this,true,lstPlayers);
        visuJoueursDlg.setVisible(true);    
    }//GEN-LAST:event_JoueurActionPerformed

    private void demarrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demarrerActionPerformed
        if(lstPlayers.getNbJoueurs()>=2){ // pour démarrer le jeu, il doit y avoir au moins 2 joueurs
            if(difficultyLvl!=0){
                if(lstPlayers.arePlayersValidCompareToDifficulty(difficultyLvl)){ // on vérifie si les joueurs ont tous choisi une famille préférée qui est dans le niveau de difficulté
                    initJeu();
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
        VisuPersonnagesDlg visuPersonnagesDlg = new VisuPersonnagesDlg(this,true,jeu.getJoueurCourant());
        visuPersonnagesDlg.setVisible(true);
    }//GEN-LAST:event_CartesActionPerformed

    private void Transfert_TestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Transfert_TestActionPerformed
        TransfertDlg diag = new TransfertDlg(this,true,getExampleLesJoueurs(),0,null);
        diag.setSize(600,600);
        diag.setVisible(true);
    }//GEN-LAST:event_Transfert_TestActionPerformed

    private void Bataille_TestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bataille_TestActionPerformed
        BatailleDlg diag = new BatailleDlg(this, true,getExampleLesJoueurs(),0);
        diag.setSize(1000,600);
        diag.setVisible(true);
    }//GEN-LAST:event_Bataille_TestActionPerformed

    private void recommencerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recommencerActionPerformed
        wipeData();
        initJeu();
    }//GEN-LAST:event_recommencerActionPerformed

    private void boutonActionPerformed(java.awt.event.ActionEvent evt){
        if(!forbiddenToPlay){ // permet d'interdire au joueur de retourné plus de 2 cartes
            if(l1!=-1){ // on détecte que le joueur viens de cliquer sur la deuxième carte
                forbiddenToPlay=true; // on lui interdit de retourné de nouvelle cartes
            }
            JButton current = (JButton) evt.getSource(); // on récupère le bouton qui a été cliqué
            if(current.getIcon()==null){ // Permet d'interdire l'exécution du code sur une carte déjà retourné
                String num = current.getName(); // on réucpère le numéro du bouton
                int[] position = plateau.getCase(Integer.parseInt(num)); // on récupère la position du bouton par rapport au plateau
                Personnage perso = lstPerso.getPerso(plateau.getCase(position[0], position[1])); // on récupère le personnage qui correspond au button
                current.setIcon(new ImageIcon(perso.getPhoto().getScaledInstance(current.getWidth(), current.getHeight(), Image.SCALE_SMOOTH))); // on affiche son image
                if(l1==-1&&c1==-1){ // on enregistre les coordonnées du boutton cliqué
                    l1 = position[0];
                    c1 = position[1];
                }else{
                    l2 = position[0];
                    c2 = position[1];
                    startTimer();
                }   
            }
        }
    }
    
    private void showErrorDlg(String error){
        ErrorDlg errorDlg = new ErrorDlg(this,true,error);
        errorDlg.setVisible(true);
    }
    
    private void showNbPersoFounded(int nb){
        JLabelShowNbPersoFounded.setText("Nb de personnages trouvés : "+nb);
    }
    
    private void showNbPersoRestant(int nb){
        JLabelShowNbPersoLeft.setText("Nb de personnages restants : "+nb);
    }
    
    private void showWhoMustPlay(String name){
        JLabelShowHowMustPlay.setText("C'est à "+name+" de jouer !");
    }
    
        
    public void startTimer(){// définit un timer qui lance la vérification des deux personnages au bout d'une demi-seconde
        Timer t = new Timer(500, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                verifPersos();
            }
        });
        t.setRepeats(false);
        t.start();
    }
    
    public void verifPersos(){
        if(plateau.getCase(l1,c1)==plateau.getCase(l2, c2)){ // les personnages des deux cartes sont identiques
            int result = jeu.traiterTour(jeu.getJoueurCourant(), plateau.getCase(l1, c1));
            switch(result){
                case 0:{
                    jTextAreaInfo.append(jeu.getJoueurCourant().getPseudo()+" a gagné !\n\n");        
                    forbiddenToPlay = true;
                    break;
                }
                case 1:{
                    TransfertDlg diag = new TransfertDlg(this,true,lstPlayers,jeu.getIndiceJoueurCourant(), new TransfertDlg.setOnTransferSucceed() {
                        @Override
                        public void onTransferSucceed(Transfert transfert) {
                            jTextAreaInfo.append("\n\n"+transfert.getDeroulement());
                        }
                    });
                    diag.setSize(600,600);
                    diag.setVisible(true);
                    break;
                }
                case 2:{
                    BatailleDlg diag = new BatailleDlg(this, true,lstPlayers,jeu.getIndiceJoueurCourant());
                    diag.setSize(1000,600);
                    diag.setVisible(true);
                    break;
                }
            }
            plateau.invalide(l1, c1, l2, c2);
            if(plateau.jeuVide()){
                showWinner_s();
                forbiddenToPlay = true;
            }else{
                changeJoueurCourant();
            }
        }else{
            changeJoueurCourant();
            cleanReturnedCards();
        }
        l1=-1;
        c1=-1;
        l2=-1;
        c2=-1;
    }
    
    /**
     * Permet "d'effacé" les cartes retournées par le joueur
     */
    public void cleanReturnedCards(){
            int positionButton1 = l1*plateau.getNbCol()+c1; // on récupère la position du bouton 1
            int positionButton2 = l2*plateau.getNbCol()+c2; // on récupère la position du bouton 2
            System.out.println(positionButton1+" "+positionButton2);
            JButton button1 = (JButton)jPanelPlateau.getComponent(positionButton1); // on récupère le bouton 1
            JButton button2 = (JButton)jPanelPlateau.getComponent(positionButton2); // on récupère le bouton 2
            button1.setIcon(null); // on "efface" la photo retourner par le joueur
            button2.setIcon(null); // on "efface" la photo retourner par le joueur
    }
    
    /**
     * Permet de changer le joueur courant au prochain qui normalement censé joué + Mise à jour UI 
     */
    public void changeJoueurCourant(){
        int nbJoueur = lstPlayers.getNbJoueurs();
        int prochainJoueurCourant = jeu.getIndiceJoueurCourant()+1;
        if(prochainJoueurCourant == nbJoueur){ // permet de faire une boucle, pour 2 joueur par ex : joueur 0 ensuite j1 puis  j0, j1, etc ... 
            prochainJoueurCourant = 0;
        }
        jeu.setIndiceJoueurCourant(prochainJoueurCourant);//Le joueur courant change et est fixé au joueur suivant.      
        showWhoMustPlay(jeu.getJoueurCourant().getPseudo());
        showNbPersoRestant(plateau.getNbp());
        showNbPersoFounded(difficultyLvl-plateau.getNbp());  
        forbiddenToPlay=false;
    }
    
    /**
     * Permet de montrer le/les gagnats
     */
    public void showWinner_s(){
        boolean moreThanOneWinner = false;
        String toShow ="";
        try{
            LesJoueurs Gagnant = lstPlayers.getGagnant();
            if(Gagnant.getNbJoueurs()==0){
               toShow= Gagnant.getJoueur(0).getPseudo();
            }else{
                moreThanOneWinner=true;
                for(int x=0;x<Gagnant.getNbJoueurs();x++){ // on récupère le pseudo de tout les gagnants
                    toShow+=Gagnant.getJoueur(x).getPseudo()+" ";
                }
            }
            if(moreThanOneWinner){
                jTextAreaInfo.append(toShow+" ont gagné !\n\n");            
            }else{
                jTextAreaInfo.append(toShow+" a gagné !\n\n");            
            }
        }catch(Exception ex){
            System.out.println("This shoudln't be called ( at showWinner_s() )");
        }
    }
    
    /**
     * @return Liste de joueurs 
     */
    public LesJoueurs getExampleLesJoueurs(){
        LesJoueurs toReturn=null;
        try{
            toReturn = new LesJoueurs();
            Joueur j1 = new Joueur("Joueur 1", Famille.communs);
            j1.initPaquetTest();
            Joueur j2 = new Joueur("Joueur 2", Famille.communs);
            j2.getPaquet().ajoutePerso(new Personnage(Famille.epiques, "burnout", 20));
            j2.getPaquet().ajoutePerso(new Personnage(Famille.epiques, "funk-ops", 30));
            j2.getPaquet().ajoutePerso(new Personnage(Famille.alpinsFemmes, "mogul-master", 10));
            toReturn.ajouteJoueur(j1);
            toReturn.ajouteJoueur(j2);
        }catch (Exception ex) {
            System.out.println(TAG+": This shouldn't been call ( getExampleLesJoueurs )");
            ex.printStackTrace();
        }
        return toReturn;
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
    private javax.swing.JLabel JLabelShowHowMustPlay;
    private javax.swing.JLabel JLabelShowNbPersoFounded;
    private javax.swing.JLabel JLabelShowNbPersoLeft;
    private javax.swing.JMenuItem Joueur;
    private javax.swing.JMenuItem Options;
    private javax.swing.JMenuItem Transfert_Test;
    private javax.swing.JButton demarrer;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelPlateau;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaInfo;
    private javax.swing.JButton recommencer;
    // End of variables declaration//GEN-END:variables

}
