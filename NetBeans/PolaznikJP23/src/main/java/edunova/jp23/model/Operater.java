/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp23.model;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
public class Operater extends Osoba{
    
    @NotNull    (message = "Lozinka ne prazna")
    @NotEmpty   (message = "Lozinka ne prazna")
    
    private String lozinka;

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }
    
    public String getImePrezime() {
        return getIme() + " " + getPrezime();
    }
}
