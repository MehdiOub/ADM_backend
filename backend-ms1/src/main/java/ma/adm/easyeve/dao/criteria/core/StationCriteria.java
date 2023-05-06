package  ma.adm.easyeve.dao.criteria.core;


import ma.adm.easyeve.zynerator.criteria.BaseCriteria;
import java.util.List;

public class StationCriteria extends  BaseCriteria  {

    private String libelle;
    private String libelleLike;



    public StationCriteria(){}

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


}
