

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package round_button;

import javax.swing.UIManager;


/**
 *
 * @author acer
 */
public class Round_Button {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       try{
       UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
       }catch(Exception e){
           System.err.println(e.getMessage());
       }
       roundButton rb=new roundButton();
       
       rb.setSize(800,500);
       rb.setLocationRelativeTo(null);
       rb.setVisible(true);
    }
    
}
