package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author filip
 */

@Entity
@Table(name = "predavac")
public class Predavac extends Entitet{
    
    @ManyToOne
    @JoinColumn(name = "osoba", nullable = false)
    private Osoba osoba;

    @Column(columnDefinition = "varchar(50)")
    private String iban;
    
    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
         
}