
package round_button.code;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author acer
 */
public class Filier implements Serializable{
    private int Id ;
    private String name;
    private ArrayList<Etudiant> l;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Etudiant> getL() {
        return l;
    }

    public void setL(ArrayList<Etudiant> l) {
        this.l = l;
    }

    public Filier(String name,int Id) {
        this.Id = Id;
        this.name = name;
    }

    @Override
    public String toString() {
        return  name;
    }
}
