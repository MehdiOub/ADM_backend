package ma.adm.easyeve.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.adm.easyeve.zynerator.audit.AuditBusinessObjectEnhanced;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "type_equipement")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="type_equipement_seq",sequenceName="type_equipement_seq",allocationSize=1, initialValue = 1)
public class TypeEquipement   extends AuditBusinessObjectEnhanced     {

    private Long id;

    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String libelle;
    @Column(columnDefinition = "boolean default false")
    private Boolean entree = false;
    @Column(length = 500)
    private String description;



    public TypeEquipement(){
        super();
    }

    public TypeEquipement(Long id,String libelle){
        this.id = id;
        this.libelle = libelle ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="type_equipement_seq")
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
    public Boolean  getEntree(){
        return this.entree;
    }
    public void setEntree(Boolean entree){
        this.entree = entree;
    }
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
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
        TypeEquipement typeEquipement = (TypeEquipement) o;
        return id != null && id.equals(typeEquipement.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

