package ma.adm.easyeve.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.adm.easyeve.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "station")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="station_seq",sequenceName="station_seq",allocationSize=1, initialValue = 1)
public class StationHistory extends HistBusinessObject  {


    public StationHistory() {
    super();
    }

    public StationHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="station_seq")
    public Long getId() {
    return id;
    }
}

