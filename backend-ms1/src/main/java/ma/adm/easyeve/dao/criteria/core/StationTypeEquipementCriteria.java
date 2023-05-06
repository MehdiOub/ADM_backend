package  ma.adm.easyeve.dao.criteria.core;


import ma.adm.easyeve.zynerator.criteria.BaseCriteria;
import java.util.List;

public class StationTypeEquipementCriteria extends  BaseCriteria  {


    private StationCriteria station ;
    private List<StationCriteria> stations ;
    private TypeEquipementCriteria typeEquipement ;
    private List<TypeEquipementCriteria> typeEquipements ;


    public StationTypeEquipementCriteria(){}


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
    public TypeEquipementCriteria getTypeEquipement(){
        return this.typeEquipement;
    }

    public void setTypeEquipement(TypeEquipementCriteria typeEquipement){
        this.typeEquipement = typeEquipement;
    }
    public List<TypeEquipementCriteria> getTypeEquipements(){
        return this.typeEquipements;
    }

    public void setTypeEquipements(List<TypeEquipementCriteria> typeEquipements){
        this.typeEquipements = typeEquipements;
    }
}
