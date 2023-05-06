package  ma.adm.easyeve.ws.dto;

import ma.adm.easyeve.zynerator.audit.Log;
import ma.adm.easyeve.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class VoieDto  extends AuditBaseDto {

    private String libelle  ;
    private String code  ;

    private TypeVoieDto typeVoie ;
    private TelePeayageDto telePeayage ;
    private StationDto station ;



    public VoieDto(){
        super();
    }



    @Log
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }

    @Log
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }


    public TypeVoieDto getTypeVoie(){
        return this.typeVoie;
    }

    public void setTypeVoie(TypeVoieDto typeVoie){
        this.typeVoie = typeVoie;
    }
    public TelePeayageDto getTelePeayage(){
        return this.telePeayage;
    }

    public void setTelePeayage(TelePeayageDto telePeayage){
        this.telePeayage = telePeayage;
    }
    public StationDto getStation(){
        return this.station;
    }

    public void setStation(StationDto station){
        this.station = station;
    }




}
