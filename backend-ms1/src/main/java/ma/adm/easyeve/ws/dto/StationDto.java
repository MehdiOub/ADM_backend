package  ma.adm.easyeve.ws.dto;

import ma.adm.easyeve.zynerator.audit.Log;
import ma.adm.easyeve.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class StationDto  extends AuditBaseDto {

    private String libelle  ;


    private List<VoieDto> voies ;
    private List<StationTypeEquipementDto> stationTypeEquipements ;


    public StationDto(){
        super();
    }



    @Log
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }





    public List<VoieDto> getVoies(){
        return this.voies;
    }

    public void setVoies(List<VoieDto> voies){
        this.voies = voies;
    }
    public List<StationTypeEquipementDto> getStationTypeEquipements(){
        return this.stationTypeEquipements;
    }

    public void setStationTypeEquipements(List<StationTypeEquipementDto> stationTypeEquipements){
        this.stationTypeEquipements = stationTypeEquipements;
    }

}
