/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.hibernate.type.descriptor.sql.TinyIntTypeDescriptor;

/**
 *
 * @author filip
 */

@Entity
public class Smjer {
    
    @Id
    private int sifra;
    private String naziv;
    private BigDecimal cijena;
    
    private int trajanje;
    private TinyIntTypeDescriptor verificiran;
    

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }

    public int getTrajanje() {
        return trajanje;
    }

    public void setTrajanje(int trajanje) {
        this.trajanje = trajanje;
    }

    public TinyIntTypeDescriptor getVerificiran() {
        return verificiran;
    }

    public void setVerificiran(TinyIntTypeDescriptor verificiran) {
        this.verificiran = verificiran;
    }
    
    
}
