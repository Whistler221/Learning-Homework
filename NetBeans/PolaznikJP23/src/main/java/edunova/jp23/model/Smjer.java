/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp23.model;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author filip
 */
@Entity
public class Smjer extends Entitet {
    
    @NotNull    (message = "Obavezno postaviti naziv (naziv je null)")
    @NotEmpty   (message = "Naiv moze biti prazan")
    @Size       (min=3, max=50, message = "Naziv mora biti izmedju 3 i 50 znakova")
    private String naziv;
    private BigDecimal cijena;
    private Integer trajanje;
    private Boolean verificiran;

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

    public Integer getTrajanje() {
        return trajanje;
    }

    public void setTrajanje(Integer trajanje) {
        this.trajanje = trajanje;
    }

    public Boolean getVerificiran() {
        return verificiran;
    }

    public void setVerificiran(Boolean verificiran) {
        this.verificiran = verificiran;
    }
    
    
}
