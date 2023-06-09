package ma.adm.easyeve.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.adm.easyeve.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "evenement")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="evenement_seq",sequenceName="evenement_seq",allocationSize=1, initialValue = 1)
public class EvenementHistory extends HistBusinessObject  {


    public EvenementHistory() {
    super();
    }

    public EvenementHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="evenement_seq")
    public Long getId() {
    return id;
    }
}

