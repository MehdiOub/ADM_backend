package  ma.adm.easyeve.dao.criteria.core;


import ma.adm.easyeve.zynerator.criteria.BaseCriteriaEnhanced;
import java.util.List;

public class TypeEquipementCriteria extends  BaseCriteriaEnhanced  {

    private String code;
    private String codeLike;
    private String libelle;
    private String libelleLike;
    private Boolean entree;
    private String description;
    private String descriptionLike;



    public TypeEquipementCriteria(){}

    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getCodeLike(){
        return this.codeLike;
    }
    public void setCodeLike(String codeLike){
        this.codeLike = codeLike;
    }

    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }
    public String getLibelleLike(){
        return this.libelleLike;
    }
    public void setLibelleLike(String libelleLike){
        this.libelleLike = libelleLike;
    }

    public Boolean getEntree(){
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
    public String getDescriptionLike(){
        return this.descriptionLike;
    }
    public void setDescriptionLike(String descriptionLike){
        this.descriptionLike = descriptionLike;
    }


}
