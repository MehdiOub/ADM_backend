package ma.adm.easyeve.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.adm.easyeve.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "message_type")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="message_type_seq",sequenceName="message_type_seq",allocationSize=1, initialValue = 1)
public class MessageTypeHistory extends HistBusinessObject  {


    public MessageTypeHistory() {
    super();
    }

    public MessageTypeHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="message_type_seq")
    public Long getId() {
    return id;
    }
}

