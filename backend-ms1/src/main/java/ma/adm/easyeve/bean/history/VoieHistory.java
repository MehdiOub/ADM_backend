package ma.adm.easyeve.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.adm.easyeve.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "voie")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="voie_seq",sequenceName="voie_seq",allocationSize=1, initialValue = 1)
public class VoieHistory extends HistBusinessObject  {


    public VoieHistory() {
    super();
    }

    public VoieHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="voie_seq")
    public Long getId() {
    return id;
    }
}

