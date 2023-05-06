package ma.adm.easyeve.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.adm.easyeve.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "tele_peayage")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="tele_peayage_seq",sequenceName="tele_peayage_seq",allocationSize=1, initialValue = 1)
public class TelePeayage   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String libelle;



    public TelePeayage(){
        super();
    }

    public TelePeayage(Long id,String libelle){
        this.id = id;
        this.libelle = libelle ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="tele_peayage_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }

    @Transient
    public String getLabel() {
        label = libelle;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TelePeayage telePeayage = (TelePeayage) o;
        return id != null && id.equals(telePeayage.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

