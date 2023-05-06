package ma.adm.easyeve.bean.core;

import java.util.Objects;
import java.util.List;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.adm.easyeve.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "station")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="station_seq",sequenceName="station_seq",allocationSize=1, initialValue = 1)
public class Station   extends AuditBusinessObject     {

    private Long id;
    @Column(length = 500)
    private String libelle;
    private List<Voie> voies ;
    private List<StationTypeEquipement> stationTypeEquipements ;
    public Station(){
        super();
    }
    public Station(Long id,String libelle){
        this.id = id;
        this.libelle = libelle ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="station_seq")
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
    @OneToMany(mappedBy = "station")
    public List<Voie> getVoies(){
        return this.voies;
    }
    public void setVoies(List<Voie> voies){
        this.voies = voies;
    }
    @OneToMany(mappedBy = "station")
    public List<StationTypeEquipement> getStationTypeEquipements(){
        return this.stationTypeEquipements;
    }
    public void setStationTypeEquipements(List<StationTypeEquipement> stationTypeEquipements){
        this.stationTypeEquipements = stationTypeEquipements;
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
        Station station = (Station) o;
        return id != null && id.equals(station.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

