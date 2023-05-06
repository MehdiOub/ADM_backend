package ma.adm.easyeve.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.adm.easyeve.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "type_equipement")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="type_equipement_seq",sequenceName="type_equipement_seq",allocationSize=1, initialValue = 1)
public class TypeEquipementHistory extends HistBusinessObject  {


    public TypeEquipementHistory() {
    super();
    }

    public TypeEquipementHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="type_equipement_seq")
    public Long getId() {
    return id;
    }
}

