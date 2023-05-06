package  ma.adm.easyeve.ws.dto;

import ma.adm.easyeve.zynerator.audit.Log;
import ma.adm.easyeve.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class StationTypeEquipementDto  extends AuditBaseDto {


    private StationDto station ;
    private TypeEquipementDto typeEquipement ;



    public StationTypeEquipementDto(){
        super();
    }




    public StationDto getStation(){
        return this.station;
    }

    public void setStation(StationDto station){
        this.station = station;
    }
    public TypeEquipementDto getTypeEquipement(){
        return this.typeEquipement;
    }

    public void setTypeEquipement(TypeEquipementDto typeEquipement){
        this.typeEquipement = typeEquipement;
    }




}
