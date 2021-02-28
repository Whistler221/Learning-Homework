/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

/**
 *
 * @author filip
 */

@Entity
public class Grupa {
    
    @Id
    private int sifra;
    private String naziv;
    @ManyToOne
    private Smjer smjer;
    @ManyToOne
    private Predavac predavac;
    private Date datumpocetka;
    private Integer brojpolaznika;
    @ManyToMany
    private List<Polaznik> polaznici=new ArrayList<>();

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

    public Smjer getSmjer() {
        return smjer;
    }

    public void setSmjer(Smjer smjer) {
        this.smjer = smjer;
    }

    public Predavac getPredavac() {
        return predavac;
    }

    public void setPredavac(Predavac predavac) {
        this.predavac = predavac;
    }

    public Date getDatumpocetka() {
        return datumpocetka;
    }

    public void setDatumpocetka(Date datumpocetka) {
        this.datumpocetka = datumpocetka;
    }

    public Integer getBrojpolaznika() {
        return brojpolaznika;
    }

    public void setBrojpolaznika(Integer brojpolaznika) {
        this.brojpolaznika = brojpolaznika;
    }

    public List<Polaznik> getPolaznici() {
        return polaznici;
    }

    public void setPolaznici(List<Polaznik> polaznici) {
        this.polaznici = polaznici;
    }
    
    
    

    
    
    
}
