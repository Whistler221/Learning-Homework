package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author filip
 */

@Entity
@Table(name = "grupa")
public class Grupa extends Entitet{
    
    @JoinTable(name = "grupa")
    @Column(columnDefinition = "varchar(20)", nullable = false)
    private String naziv;
    @ManyToOne
    @JoinColumn(name = "smjer", nullable = false)
    private Smjer smjer;
    @ManyToOne
    @JoinColumn(name = "predavac")
    private Predavac predavac;
    private Date datumpocetka;
    @Column(nullable = false)
    private Integer brojpolaznika;

    @ManyToMany
    @JoinTable(name = "clan",
            joinColumns = { @JoinColumn(name = "grupa") },
            inverseJoinColumns = { @JoinColumn(name = "polaznik") } )
    private List<Polaznik> polaznici;

    public Grupa() {
        this.polaznici = new ArrayList<>();
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