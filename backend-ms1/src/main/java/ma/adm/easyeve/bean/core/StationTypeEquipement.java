package ma.adm.easyeve.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.adm.easyeve.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "station_type_equipement")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="station_type_equipement_seq",sequenceName="station_type_equipement_seq",allocationSize=1, initialValue = 1)
public class StationTypeEquipement   extends AuditBusinessObject     {

    private Long id;


    private Station station ;
    
    private TypeEquipement typeEquipement ;
    


    public StationTypeEquipement(){
        super();
    }





    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="station_type_equipement_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Station getStation(){
        return this.station;
    }
    public void setStation(Station station){
        this.station = station;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public TypeEquipement getTypeEquipement(){
        return this.typeEquipement;
    }
    public void setTypeEquipement(TypeEquipement typeEquipement){
        this.typeEquipement = typeEquipement;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StationTypeEquipement stationTypeEquipement = (StationTypeEquipement) o;
        return id != null && id.equals(stationTypeEquipement.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

