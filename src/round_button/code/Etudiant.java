/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package round_button.code;

import java.io.Serializable;

public class Etudiant implements Serializable{
    private String CNE;
    private String name,lastname;
    private String sexe;
    private String daten;

    public String getDaten() {
        return daten;
    }

    public void setDaten(String daten) {
        this.daten = daten;
    }
    private Filier fil;

    public Etudiant(String CNE, String name, String lastname,String daten,Filier fil,String sexe) {
        this.CNE = CNE;
        this.name = name;
        this.lastname = lastname;
        this.sexe = sexe;
        this.daten = daten;
        this.fil = fil;
    }

    public String getCNE() {
        return CNE;
    }

    public void setCNE(String CNE) {
        this.CNE = CNE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public Filier getFil() {
        return fil;
    }

    public void setFil(Filier fil) {
        this.fil = fil;
    }

    public Etudiant(String CNE, String name, String lastname, String sexe, Filier fil) {
        this.CNE = CNE;
        this.name = name;
        this.lastname = lastname;
        this.sexe = sexe;
        this.fil = fil;
    }

    @Override
    public String toString() {
        return "Etudiant{" + "CNE=" + CNE + ", name=" + name + ", lastname=" + lastname + ", date=" +daten+ ", fil=" + fil +", sexe=" + sexe + '}';
    }
    
}
