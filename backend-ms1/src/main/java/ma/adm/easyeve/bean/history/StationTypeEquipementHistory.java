package ma.adm.easyeve.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.adm.easyeve.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "station_type_equipement")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="station_type_equipement_seq",sequenceName="station_type_equipement_seq",allocationSize=1, initialValue = 1)
public class StationTypeEquipementHistory extends HistBusinessObject  {


    public StationTypeEquipementHistory() {
    super();
    }

    public StationTypeEquipementHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="station_type_equipement_seq")
    public Long getId() {
    return id;
    }
}

