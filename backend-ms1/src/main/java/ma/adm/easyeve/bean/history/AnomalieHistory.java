package ma.adm.easyeve.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.adm.easyeve.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "anomalie")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="anomalie_seq",sequenceName="anomalie_seq",allocationSize=1, initialValue = 1)
public class AnomalieHistory extends HistBusinessObject  {


    public AnomalieHistory() {
    super();
    }

    public AnomalieHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="anomalie_seq")
    public Long getId() {
    return id;
    }
}

