package ma.adm.easyeve.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.adm.easyeve.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "event_type")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="event_type_seq",sequenceName="event_type_seq",allocationSize=1, initialValue = 1)
public class EventTypeHistory extends HistBusinessObject  {


    public EventTypeHistory() {
    super();
    }

    public EventTypeHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="event_type_seq")
    public Long getId() {
    return id;
    }
}

