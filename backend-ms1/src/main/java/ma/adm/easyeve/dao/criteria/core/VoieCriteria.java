package  ma.adm.easyeve.dao.criteria.core;


import ma.adm.easyeve.zynerator.criteria.BaseCriteria;
import java.util.List;

public class VoieCriteria extends  BaseCriteria  {

    private String libelle;
    private String libelleLike;
    private String code;
    private String codeLike;

    private TypeVoieCriteria typeVoie ;
    private List<TypeVoieCriteria> typeVoies ;
    private TelePeayageCriteria telePeayage ;
    private List<TelePeayageCriteria> telePeayages ;
    private StationCriteria station ;
    private List<StationCriteria> stations ;


    public VoieCriteria(){}

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


    public TypeVoieCriteria getTypeVoie(){
        return this.typeVoie;
    }

    public void setTypeVoie(TypeVoieCriteria typeVoie){
        this.typeVoie = typeVoie;
    }
    public List<TypeVoieCriteria> getTypeVoies(){
        return this.typeVoies;
    }

    public void setTypeVoies(List<TypeVoieCriteria> typeVoies){
        this.typeVoies = typeVoies;
    }
    public TelePeayageCriteria getTelePeayage(){
        return this.telePeayage;
    }

    public void setTelePeayage(TelePeayageCriteria telePeayage){
        this.telePeayage = telePeayage;
    }
    public List<TelePeayageCriteria> getTelePeayages(){
        return this.telePeayages;
    }

    public void setTelePeayages(List<TelePeayageCriteria> telePeayages){
        this.telePeayages = telePeayages;
    }
    public StationCriteria getStation(){
        return this.station;
    }

    public void setStation(StationCriteria station){
        this.station = station;
    }
    public List<StationCriteria> getStations(){
        return this.stations;
    }

    public void setStations(List<StationCriteria> stations){
        this.stations = stations;
    }
}
