package ma.adm.easyeve.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.adm.easyeve.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "voie")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="voie_seq",sequenceName="voie_seq",allocationSize=1, initialValue = 1)
public class Voie   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String libelle;
    @Column(length = 500)
    private String code;

    private TypeVoie typeVoie ;
    
    private TelePeayage telePeayage ;
    
    private Station station ;

    public Voie(){
        super();
    }

    public Voie(Long id,String libelle){
        this.id = id;
        this.libelle = libelle ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="voie_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public TypeVoie getTypeVoie(){
        return this.typeVoie;
    }
    public void setTypeVoie(TypeVoie typeVoie){
        this.typeVoie = typeVoie;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public TelePeayage getTelePeayage(){
        return this.telePeayage;
    }
    public void setTelePeayage(TelePeayage telePeayage){
        this.telePeayage = telePeayage;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Station getStation(){
        return this.station;
    }
    public void setStation(Station station){
        this.station = station;
    }

    @Transient
    public String getLabel() {
        label = libelle;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Voie voie = (Voie) o;
        return id != null && id.equals(voie.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

