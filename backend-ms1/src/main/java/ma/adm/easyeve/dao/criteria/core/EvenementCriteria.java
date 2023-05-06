package  ma.adm.easyeve.dao.criteria.core;


import ma.adm.easyeve.zynerator.criteria.BaseCriteria;
import java.util.List;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class EvenementCriteria extends  BaseCriteria  {

    private String code;
    private String codeLike;
    private LocalDateTime journeytDate;
    private LocalDateTime journeytDateFrom;
    private LocalDateTime journeytDateTo;
    private String eventDetails;
    private String eventDetailsLike;

    private VoieCriteria voie ;
    private List<VoieCriteria> voies ;
    private MessageTypeCriteria messageType ;
    private List<MessageTypeCriteria> messageTypes ;
    private TelePeayageCriteria telePeayage ;
    private List<TelePeayageCriteria> telePeayages ;
    private TypeEquipementCriteria typeEquipement ;
    private List<TypeEquipementCriteria> typeEquipements ;
    private EventTypeCriteria eventType ;
    private List<EventTypeCriteria> eventTypes ;
    private StationCriteria station ;
    private List<StationCriteria> stations ;
    private AnomalieCriteria anomalie ;
    private List<AnomalieCriteria> anomalies ;


    public EvenementCriteria(){}

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

    public LocalDateTime getJourneytDate(){
        return this.journeytDate;
    }
    public void setJourneytDate(LocalDateTime journeytDate){
        this.journeytDate = journeytDate;
    }
    public LocalDateTime getJourneytDateFrom(){
        return this.journeytDateFrom;
    }
    public void setJourneytDateFrom(LocalDateTime journeytDateFrom){
        this.journeytDateFrom = journeytDateFrom;
    }
    public LocalDateTime getJourneytDateTo(){
        return this.journeytDateTo;
    }
    public void setJourneytDateTo(LocalDateTime journeytDateTo){
        this.journeytDateTo = journeytDateTo;
    }
    public String getEventDetails(){
        return this.eventDetails;
    }
    public void setEventDetails(String eventDetails){
        this.eventDetails = eventDetails;
    }
    public String getEventDetailsLike(){
        return this.eventDetailsLike;
    }
    public void setEventDetailsLike(String eventDetailsLike){
        this.eventDetailsLike = eventDetailsLike;
    }


    public VoieCriteria getVoie(){
        return this.voie;
    }

    public void setVoie(VoieCriteria voie){
        this.voie = voie;
    }
    public List<VoieCriteria> getVoies(){
        return this.voies;
    }

    public void setVoies(List<VoieCriteria> voies){
        this.voies = voies;
    }
    public MessageTypeCriteria getMessageType(){
        return this.messageType;
    }

    public void setMessageType(MessageTypeCriteria messageType){
        this.messageType = messageType;
    }
    public List<MessageTypeCriteria> getMessageTypes(){
        return this.messageTypes;
    }

    public void setMessageTypes(List<MessageTypeCriteria> messageTypes){
        this.messageTypes = messageTypes;
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
    public EventTypeCriteria getEventType(){
        return this.eventType;
    }

    public void setEventType(EventTypeCriteria eventType){
        this.eventType = eventType;
    }
    public List<EventTypeCriteria> getEventTypes(){
        return this.eventTypes;
    }

    public void setEventTypes(List<EventTypeCriteria> eventTypes){
        this.eventTypes = eventTypes;
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
    public AnomalieCriteria getAnomalie(){
        return this.anomalie;
    }

    public void setAnomalie(AnomalieCriteria anomalie){
        this.anomalie = anomalie;
    }
    public List<AnomalieCriteria> getAnomalies(){
        return this.anomalies;
    }

    public void setAnomalies(List<AnomalieCriteria> anomalies){
        this.anomalies = anomalies;
    }
}
