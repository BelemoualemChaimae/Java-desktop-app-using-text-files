/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package round_button.code;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


/**
 *
 * @author acer
 */
public class traitementFichier {
   private String s;
    

    public traitementFichier(String s) throws IOException{
        this.s = s;
       
        
    }

    
    
    public  void addToFile(Object obj,ArrayList<Etudiant> T) {
       try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(s))) {
           T.add((Etudiant) obj);
           oos.writeObject(T);
           
           oos.close();
       }catch(Exception ex){
           
       }
    }
    public  void addToFileS(ArrayList<Etudiant> T) {
       try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(s))) {
          
           oos.writeObject(T);
           
           oos.close();
       }catch(Exception ex){
           
       }
        
        
        
}
   

    
   

    
    
 
    public ArrayList<Etudiant> Lecture(ArrayList<Etudiant> T) {
         
         
             
             try (ObjectInputStream ioss = new ObjectInputStream(new FileInputStream(this.s))) {
                 ArrayList<Etudiant> E =(ArrayList<Etudiant>) ioss.readObject();
                 T=E;
             }catch(Exception ex){
             
         }
             return T ;
           
      
}
    public void lire_file(ArrayList<Etudiant> T){
     for(Etudiant e:T){
         System.out.println(e);
     }
    
}
}
