/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package round_button;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.CANCEL_OPTION;
import static javax.swing.JOptionPane.NO_OPTION;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import static javax.swing.JOptionPane.YES_OPTION;
import round_button.code.Etudiant;
import round_button.code.traitementFichier;

/**
 *
 * @author acer
 */
public class Supprimer extends javax.swing.JFrame {

    /**
     * Creates new form Supprimer
     */
    public Supprimer() {
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

        jLabel2 = new javax.swing.JLabel();
        txt = new javax.swing.JTextField();
        choix = new javax.swing.JComboBox<>();
        btn2 = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Choisir la filiere:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(310, 220, 110, 20);
        getContentPane().add(txt);
        txt.setBounds(420, 180, 200, 20);

        choix.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Wisd", "Msid", "BigData", "Midvi", "Mql" }));
        getContentPane().add(choix);
        choix.setBounds(420, 220, 200, 20);

        btn2.setText("Supprimer");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2);
        btn2.setBounds(460, 280, 160, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Entre le CNE :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(320, 180, 110, 20);

        jButton1.setText("Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(80, 370, 140, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\acer\\Desktop\\supp.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-90, 0, 870, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public Etudiant rechercher(ArrayList<Etudiant> E,String s){
        Etudiant e=null;
        for(Etudiant ee:E){
            if(ee.getCNE().equals(s)){
               e=ee;
            }
        }
        return e;
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       roundButton rb=new roundButton();
       rb.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    ArrayList<Etudiant> E;
    traitementFichier tf;
    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        String s=txt.getText();
        String fil=choix.getSelectedItem().toString();
        int x;
        if(fil.equals("Wisd")){
            try {
               
                tf=new traitementFichier("Wisd.txt");
                 E=new ArrayList<Etudiant>(); 
                E=tf.Lecture(E);
                Etudiant e=rechercher(E,s);
                if(e!=null){
                     x=JOptionPane.showConfirmDialog(btn2,"Vous Voulez vraiment Supprimer l'etudiant"+s);
                    if(x==YES_OPTION){
                        E.remove(e);
                       tf.addToFileS(E);
                    }
                    if(x==CANCEL_OPTION){
                      txt.setText("");
                       txt.requestFocus();
                     }
                    if(x==NO_OPTION){
                     txt.setText("");
                    txt.requestFocus();
                    }
                    
                }else{
                    JOptionPane.showMessageDialog(btn2,"l'etudiant n'existe pas "+s, "Warning",WARNING_MESSAGE);
                }
                
                
                
                
            } catch (IOException ex) {
                Logger.getLogger(Supprimer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(fil.equals("Msid")){
             try {
                
                tf=new traitementFichier("Msid.txt");
                 E=new ArrayList<Etudiant>(); 
                E=tf.Lecture(E);
                Etudiant e=rechercher(E,s);
                if(e!=null){
                     x=JOptionPane.showConfirmDialog(btn2,"Vous Voulez vraiment Supprimer l'etudiant"+s);
                    if(x==YES_OPTION){
                        E.remove(e);
                       tf.addToFileS(E);
                    }
                    if(x==CANCEL_OPTION){
                      txt.setText("");
                       txt.requestFocus();
                     }
                    if(x==NO_OPTION){
                     txt.setText("");
                    txt.requestFocus();
                    }
                    
                }else{
                    JOptionPane.showMessageDialog(btn2,"l'etudiant n'existe pas "+s, "Warning",WARNING_MESSAGE);
                }
                
            } catch (IOException ex) {
                Logger.getLogger(Supprimer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(fil.equals("Midvi")){
             try {
                tf=new traitementFichier("Midvi.txt");
                 E=new ArrayList<Etudiant>(); 
                E=tf.Lecture(E);
                Etudiant e=rechercher(E,s);
                if(e!=null){
                     x=JOptionPane.showConfirmDialog(btn2,"Vous Voulez vraiment Supprimer l'etudiant"+s);
                    if(x==YES_OPTION){
                        E.remove(e);
                       tf.addToFileS(E);
                    }
                    if(x==CANCEL_OPTION){
                      txt.setText("");
                       txt.requestFocus();
                     }
                    if(x==NO_OPTION){
                     txt.setText("");
                    txt.requestFocus();
                    }
                    
                }else{
                    JOptionPane.showMessageDialog(btn2,"l'etudiant n'existe pas "+s, "Warning",WARNING_MESSAGE);
                }
                
            } catch (IOException ex) {
                Logger.getLogger(Supprimer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(fil.equals("Mql")){
             try {
                tf=new traitementFichier("Mql.txt");
                 E=new ArrayList<Etudiant>(); 
                E=tf.Lecture(E);
                Etudiant e=rechercher(E,s);
                if(e!=null){
                     x=JOptionPane.showConfirmDialog(btn2,"Vous Voulez vraiment Supprimer l'etudiant"+s);
                    if(x==YES_OPTION){
                        E.remove(e);
                       tf.addToFileS(E);
                    }
                    if(x==CANCEL_OPTION){
                      txt.setText("");
                       txt.requestFocus();
                     }
                    if(x==NO_OPTION){
                     txt.setText("");
                    txt.requestFocus();
                    }
                    
                }else{
                    JOptionPane.showMessageDialog(btn2,"l'etudiant n'existe pas "+s, "Warning",WARNING_MESSAGE);
                }
                
            } catch (IOException ex) {
                Logger.getLogger(Supprimer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(fil.equals("BigData")){
             try {
                tf=new traitementFichier("BigData.txt");
                 E=new ArrayList<Etudiant>(); 
                E=tf.Lecture(E);
                Etudiant e=rechercher(E,s);
                if(e!=null){
                     x=JOptionPane.showConfirmDialog(btn2,"Vous Voulez vraiment Supprimer l'etudiant"+s);
                    if(x==YES_OPTION){
                        E.remove(e);
                       tf.addToFileS(E);
                    }
                    if(x==CANCEL_OPTION){
                      txt.setText("");
                       txt.requestFocus();
                     }
                    if(x==NO_OPTION){
                     txt.setText("");
                    txt.requestFocus();
                    }
                    
                }else{
                    JOptionPane.showMessageDialog(btn2,"l'etudiant n'existe pas "+s, "Warning",WARNING_MESSAGE);
                }
                
            } catch (IOException ex) {
                Logger.getLogger(Supprimer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
          
    }//GEN-LAST:event_btn2ActionPerformed

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
            java.util.logging.Logger.getLogger(Supprimer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supprimer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supprimer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supprimer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supprimer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn2;
    private javax.swing.JComboBox<String> choix;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txt;
    // End of variables declaration//GEN-END:variables
}