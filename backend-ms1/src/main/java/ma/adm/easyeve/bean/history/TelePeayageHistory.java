package ma.adm.easyeve.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.adm.easyeve.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "tele_peayage")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="tele_peayage_seq",sequenceName="tele_peayage_seq",allocationSize=1, initialValue = 1)
public class TelePeayageHistory extends HistBusinessObject  {


    public TelePeayageHistory() {
    super();
    }

    public TelePeayageHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="tele_peayage_seq")
    public Long getId() {
    return id;
    }
}

