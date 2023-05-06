package  ma.adm.easyeve.ws.dto;

import ma.adm.easyeve.zynerator.audit.Log;
import ma.adm.easyeve.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class EvenementDto  extends AuditBaseDto {

    private String code  ;
    private String journeytDate ;
    private String eventDetails  ;

    private VoieDto voie ;
    private MessageTypeDto messageType ;
    private TelePeayageDto telePeayage ;
    private TypeEquipementDto typeEquipement ;
    private EventTypeDto eventType ;
    private StationDto station ;
    private AnomalieDto anomalie ;



    public EvenementDto(){
        super();
    }



    @Log
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }

    @Log
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getJourneytDate(){
        return this.journeytDate;
    }
    public void setJourneytDate(String journeytDate){
        this.journeytDate = journeytDate;
    }

    @Log
    public String getEventDetails(){
        return this.eventDetails;
    }
    public void setEventDetails(String eventDetails){
        this.eventDetails = eventDetails;
    }


    public VoieDto getVoie(){
        return this.voie;
    }

    public void setVoie(VoieDto voie){
        this.voie = voie;
    }
    public MessageTypeDto getMessageType(){
        return this.messageType;
    }

    public void setMessageType(MessageTypeDto messageType){
        this.messageType = messageType;
    }
    public TelePeayageDto getTelePeayage(){
        return this.telePeayage;
    }

    public void setTelePeayage(TelePeayageDto telePeayage){
        this.telePeayage = telePeayage;
    }
    public TypeEquipementDto getTypeEquipement(){
        return this.typeEquipement;
    }

    public void setTypeEquipement(TypeEquipementDto typeEquipement){
        this.typeEquipement = typeEquipement;
    }
    public EventTypeDto getEventType(){
        return this.eventType;
    }

    public void setEventType(EventTypeDto eventType){
        this.eventType = eventType;
    }
    public StationDto getStation(){
        return this.station;
    }

    public void setStation(StationDto station){
        this.station = station;
    }
    public AnomalieDto getAnomalie(){
        return this.anomalie;
    }

    public void setAnomalie(AnomalieDto anomalie){
        this.anomalie = anomalie;
    }




}
