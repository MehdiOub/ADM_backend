package ma.adm.easyeve.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.adm.easyeve.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "type_voie")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="type_voie_seq",sequenceName="type_voie_seq",allocationSize=1, initialValue = 1)
public class TypeVoieHistory extends HistBusinessObject  {


    public TypeVoieHistory() {
    super();
    }

    public TypeVoieHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="type_voie_seq")
    public Long getId() {
    return id;
    }
}

