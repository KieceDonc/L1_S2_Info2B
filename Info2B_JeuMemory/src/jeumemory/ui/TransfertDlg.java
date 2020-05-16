/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeumemory.ui;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import jeumemory.Joueur;
import jeumemory.LesJoueurs;
import jeumemory.LesPersonnages;
import jeumemory.Transfert;

/**
 *
 * @author Valentin
 */
public class TransfertDlg extends javax.swing.JDialog {
    
    private static final String TAG = TransfertDlg.class.getName();
    
    public interface setOnTransferSucceed{
        void onTransferSucceed(Transfert transfert);
    }
    
    private setOnTransferSucceed listener; // instance de l'écouteur qui permet de renvoyer le transfert
    private LesJoueurs lstPlayers; //collection des joueurs, pour initialiser la liste déroulante avec les pseudos des joueurs
    private int indj; //indice joueur courant
    private Transfert transfert; // cette classe sera étudiée ultérieurement –laisser l’attribut en commentaire
    private int indjs; //indice du joueur sélectionnédans la liste déroulante
    private String fs; //famille du personnage sélectionné en cliquant sur un des personnages du joueur sélectionné
    
    private boolean setupFinished = false; // utilisé contre un bug
    private boolean allowToResizeDroit = true; // utilisé contre un bug
    private boolean transfertAlreadyDone = false;

    /**
     * Creates new form TransferDlg
     */
    public TransfertDlg(java.awt.Frame parent, boolean modal, LesJoueurs lstPlayers,int indj, setOnTransferSucceed listener) {
        super(parent, modal);
        initComponents();        
        this.lstPlayers = lstPlayers;
        this.indj = indj;
        this.transfert=null;
        this.listener=listener;
        this.fs=null;
        initCombo();// méthode pour remplir la liste déroulante
        indjs = 0;
        Message.setText("Le joueur "+lstPlayers.getJoueur(indj).getPseudo()+" a obtenu une famille complète");
        Infos.setText("Personnages de "+lstPlayers.getJoueur(indj).getPseudo()+" : \n"+lstPlayers.getJoueur(indj).getPaquet()+"\n\n");
        //TODO Commenter  boutonActionPerformed (http://ufrsciencestech.u-bourgogne.fr/licence1/Info2B_InterfacesVisuelles/TP/tp6_I2B_2020.pdf)
        //TODO Dans le jeu, la boite ne s’ouvriraque si au moins un autre joueur à des cartes. /!\/!\/!\/!\/!\/!\/!\/!\/!\/!\/!\/!\/!\/!\/!\/!\/!\/!\/!\/!\
        initPanneauGauche();
        JButtonTransfert.setEnabled(false);
        setOnWindowSizeChangeListener();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanneauG = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        Message = new javax.swing.JLabel();
        ComboJoueurs = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Infos = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        JButtonTransfert = new javax.swing.JButton();
        Fermer = new javax.swing.JButton();
        PanneauD = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 3));

        PanneauG.setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(PanneauG);

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel4.setLayout(new java.awt.GridLayout(2, 0));

        jPanel3.setLayout(new java.awt.GridLayout(2, 0));
        jPanel3.add(Message);

        ComboJoueurs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboJoueursActionPerformed(evt);
            }
        });
        jPanel3.add(ComboJoueurs);

        jPanel4.add(jPanel3);

        Infos.setColumns(20);
        Infos.setRows(5);
        jScrollPane1.setViewportView(Infos);

        jPanel4.add(jScrollPane1);

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel2.setLayout(new java.awt.GridLayout(1, 2));

        JButtonTransfert.setText("Transfert");
        JButtonTransfert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonTransfertActionPerformed(evt);
            }
        });
        jPanel2.add(JButtonTransfert);

        Fermer.setText("Fermer");
        Fermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FermerActionPerformed(evt);
            }
        });
        jPanel2.add(Fermer);

        jPanel1.add(jPanel2, java.awt.BorderLayout.SOUTH);

        getContentPane().add(jPanel1);

        PanneauD.setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(PanneauD);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboJoueursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboJoueursActionPerformed
        this.indjs = ComboJoueurs.getSelectedIndex();
        if (indjs != -1){ // si un item dans la liste a été sélectionné alors
            if(this.indjs == this.indj) { // on vérifie que l'utilisateur n'a pas sélectionné le joueur courant. Si c'est le cas, on lui indique
                Infos.append("Sélectionnez un joueur différent du joueur courant !\n\n");
                PanneauD.removeAll();
                PanneauD.repaint();
            }else { // sinon on affiche les informations relatives au joueur sélectionné
                Infos.append("Joueur sélectionné: "+lstPlayers.getJoueur(indjs).toString()+"\n\n");
                initPanneauDroit();
                dessinePanneau(PanneauD,lstPlayers.getJoueur(indjs).getPaquet());
            }
        }
        enableTransfertIfNeeded();
    }//GEN-LAST:event_ComboJoueursActionPerformed

    private void FermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FermerActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_FermerActionPerformed

    private void JButtonTransfertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonTransfertActionPerformed
        Joueur jCourant = lstPlayers.getJoueur(indj);
        Joueur jCible = lstPlayers.getJoueur(indjs);

        transfert = new Transfert(jCourant, jCible, fs);
        int result = transfert.execute();
        System.out.println(result);
        if(result>0){
            transfertAlreadyDone=true;
            initPanneauGauche();
            initPanneauDroit();
            JButtonTransfert.setEnabled(false);
            System.out.println(jCourant.getEnPossession().toString());
            System.out.println(jCible.getEnPossession().toString());
            Infos.append(transfert.getDeroulement()+"\n\n");
        }else{
            Infos.append("Il est nécessaire de sélectionner un joueur qui a au moins une carte\n\n");
        }
    }//GEN-LAST:event_JButtonTransfertActionPerformed

    private void boutonActionPerformed(ActionEvent evt){
        if(!transfertAlreadyDone){
            LesPersonnages lp = lstPlayers.getJoueur(indjs).getPaquet(); // on récupère les personnages du joueur sélectionné
            int t = lp.getTaille(); // on récupère la taille des personnages 
            JButton bt=(JButton) evt.getSource(); // on récupère le boutton sur lequel l'utilisateur a cliqué
            fs = bt.getName();// la proprité Name, contient ici le nom du personnage affiché sur le bouton
            for(int i = 0; i < t; i++) {
                JButton b = (JButton)(PanneauD.getComponent(i));
                if (b.getName().equals(fs)){
                    b.setBorder(BorderFactory.createMatteBorder(10, 10, 10, 10, new java.awt.Color(255, 0, 0)));
                }else{
                    b.setBorder(null);
                }
            }
            LesPersonnages lps = lp.getPersosFamille(fs);
            Infos.append("Vous pouvez récupérer "+lps.getTaille()+" personnages : \n"+lps+"\n\n");
            enableTransfertIfNeeded();   
        }
    }
    
    private void initCombo(){
       for(int x=0;x<lstPlayers.getNbJoueurs();x++){
           ComboJoueurs.addItem(lstPlayers.getJoueur(x).getPseudo());
       } 
    }
    
    private void setOnWindowSizeChangeListener(){ // on ajoute un " écouteur " de quand la taille de la fenêtre change
        this.addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent e) {
                if(setupFinished){
                    dessinePanneau(PanneauG,lstPlayers.getJoueur(indj).getPaquet()); // la taille de la fenêtre a changé donc on modifie la taille de nos images
                }
                if(indjs!=-1&&indjs!=indj){
                    dessinePanneau(PanneauD,lstPlayers.getJoueur(indjs).getPaquet()); // la taille de la fenêtre a changé donc on modifie la taille de nos images                    
                }
            }
        });
        System.out.println(TAG+": adding on component resized listener");
    }
    
    private void initPanneauGauche(){
        PanneauG.removeAll();
        this.repaint();
        LesPersonnages lcs = lstPlayers.getJoueur(indj).getPaquet();
        int t = lcs.getTaille();
        int n = 1+(t-1)/4;
        PanneauG.setLayout(new java.awt.GridLayout(0,n));
        int buttonSize=this.getWidth()/(3*n);
        for(int x=0;x<t;x++){
            JButton bt = new JButton();
            bt.setPreferredSize(new Dimension(buttonSize,buttonSize));
            PanneauG.add(bt);
        }
        this.pack();
        dessinePanneau(PanneauG,lstPlayers.getJoueur(indj).getPaquet());
        setupFinished = true; 
    }
   
    private void initPanneauDroit(){
        PanneauD.removeAll();
        this.repaint();
        LesPersonnages lcs = lstPlayers.getJoueur(indjs).getPaquet();
        int t = lcs.getTaille();
        int n = 1+(t-1)/4;
        PanneauD.setLayout(new java.awt.GridLayout(0,n));
        int buttonSize=this.getWidth()/(3*n);
        for(int x=0;x<t;x++){
            JButton bt = new JButton();
            bt.setPreferredSize(new Dimension(buttonSize,buttonSize));
            bt.setName(lcs.getPerso(x).getFamille().getNom());
            bt.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    boutonActionPerformed(e);
                }                
            });
            PanneauD.add(bt);
        }
        this.pack();
        dessinePanneau(PanneauD,lstPlayers.getJoueur(indjs).getPaquet());

    }
    
    public void dessinePanneau(JPanel jp, LesPersonnages lc){
        int size = lc.getTaille();
        for(int x=0;x<size;x++){
            JButton currentJB = (JButton) jp.getComponent(x);
            currentJB.setIcon(new ImageIcon(lc.getPerso(x).getPhoto().getScaledInstance(currentJB.getWidth(),currentJB.getHeight(), Image.SCALE_SMOOTH)));        
        }    
    }
    
    private void enableTransfertIfNeeded(){
        if(shouldEnableTransfert()){
            JButtonTransfert.setEnabled(true);
        }else{
            JButtonTransfert.setEnabled(false);
        }
    }
    
    private boolean shouldEnableTransfert(){
        return fs!=null&&indjs!=-1&&indjs!=indj&&!transfertAlreadyDone;
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
            java.util.logging.Logger.getLogger(TransfertDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransfertDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransfertDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransfertDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TransfertDlg dialog = new TransfertDlg(new javax.swing.JFrame(), true,null,0,null);
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
    private javax.swing.JComboBox<String> ComboJoueurs;
    private javax.swing.JButton Fermer;
    private javax.swing.JTextArea Infos;
    private javax.swing.JButton JButtonTransfert;
    private javax.swing.JLabel Message;
    private javax.swing.JPanel PanneauD;
    private javax.swing.JPanel PanneauG;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
