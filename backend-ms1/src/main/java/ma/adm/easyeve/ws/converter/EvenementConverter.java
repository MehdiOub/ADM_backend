package  ma.adm.easyeve.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.adm.easyeve.bean.core.Station;

import ma.adm.easyeve.zynerator.util.StringUtil;
import ma.adm.easyeve.zynerator.converter.AbstractConverter;
import ma.adm.easyeve.zynerator.util.DateUtil;
import ma.adm.easyeve.bean.history.EvenementHistory;
import ma.adm.easyeve.bean.core.Evenement;
import ma.adm.easyeve.ws.dto.EvenementDto;

@Component
public class EvenementConverter extends AbstractConverter<Evenement, EvenementDto, EvenementHistory> {

    @Autowired
    private StationConverter stationConverter ;
    @Autowired
    private VoieConverter voieConverter ;
    @Autowired
    private EventTypeConverter eventTypeConverter ;
    @Autowired
    private TelePeayageConverter telePeayageConverter ;
    @Autowired
    private AnomalieConverter anomalieConverter ;
    @Autowired
    private MessageTypeConverter messageTypeConverter ;
    @Autowired
    private TypeEquipementConverter typeEquipementConverter ;
    private boolean voie;
    private boolean messageType;
    private boolean telePeayage;
    private boolean typeEquipement;
    private boolean eventType;
    private boolean station;
    private boolean anomalie;

    public  EvenementConverter(){
        super(Evenement.class, EvenementDto.class, EvenementHistory.class);
    }

    @Override
    public Evenement toItem(EvenementDto dto) {
        if (dto == null) {
            return null;
        } else {
        Evenement item = new Evenement();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getJourneytDate()))
                item.setJourneytDate(DateUtil.stringEnToDate(dto.getJourneytDate()));
            if(StringUtil.isNotEmpty(dto.getEventDetails()))
                item.setEventDetails(dto.getEventDetails());
            if(this.voie && dto.getVoie()!=null)
                item.setVoie(voieConverter.toItem(dto.getVoie())) ;

            if(this.messageType && dto.getMessageType()!=null)
                item.setMessageType(messageTypeConverter.toItem(dto.getMessageType())) ;

            if(this.telePeayage && dto.getTelePeayage()!=null)
                item.setTelePeayage(telePeayageConverter.toItem(dto.getTelePeayage())) ;

            if(this.typeEquipement && dto.getTypeEquipement()!=null)
                item.setTypeEquipement(typeEquipementConverter.toItem(dto.getTypeEquipement())) ;

            if(this.eventType && dto.getEventType()!=null)
                item.setEventType(eventTypeConverter.toItem(dto.getEventType())) ;

            if(dto.getStation() != null && dto.getStation().getId() != null){
                item.setStation(new Station());
                item.getStation().setId(dto.getStation().getId());
            }

            if(this.anomalie && dto.getAnomalie()!=null)
                item.setAnomalie(anomalieConverter.toItem(dto.getAnomalie())) ;



        return item;
        }
    }

    @Override
    public EvenementDto toDto(Evenement item) {
        if (item == null) {
            return null;
        } else {
            EvenementDto dto = new EvenementDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(item.getJourneytDate()!=null)
                dto.setJourneytDate(DateUtil.dateTimeToString(item.getJourneytDate()));
            if(StringUtil.isNotEmpty(item.getEventDetails()))
                dto.setEventDetails(item.getEventDetails());
        if(this.voie && item.getVoie()!=null) {
            dto.setVoie(voieConverter.toDto(item.getVoie())) ;
        }
        if(this.messageType && item.getMessageType()!=null) {
            dto.setMessageType(messageTypeConverter.toDto(item.getMessageType())) ;
        }
        if(this.telePeayage && item.getTelePeayage()!=null) {
            dto.setTelePeayage(telePeayageConverter.toDto(item.getTelePeayage())) ;
        }
        if(this.typeEquipement && item.getTypeEquipement()!=null) {
            dto.setTypeEquipement(typeEquipementConverter.toDto(item.getTypeEquipement())) ;
        }
        if(this.eventType && item.getEventType()!=null) {
            dto.setEventType(eventTypeConverter.toDto(item.getEventType())) ;
        }
        if(this.station && item.getStation()!=null) {
            dto.setStation(stationConverter.toDto(item.getStation())) ;
        }
        if(this.anomalie && item.getAnomalie()!=null) {
            dto.setAnomalie(anomalieConverter.toDto(item.getAnomalie())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.voie = value;
        this.messageType = value;
        this.telePeayage = value;
        this.typeEquipement = value;
        this.eventType = value;
        this.station = value;
        this.anomalie = value;
    }


    public StationConverter getStationConverter(){
        return this.stationConverter;
    }
    public void setStationConverter(StationConverter stationConverter ){
        this.stationConverter = stationConverter;
    }
    public VoieConverter getVoieConverter(){
        return this.voieConverter;
    }
    public void setVoieConverter(VoieConverter voieConverter ){
        this.voieConverter = voieConverter;
    }
    public EventTypeConverter getEventTypeConverter(){
        return this.eventTypeConverter;
    }
    public void setEventTypeConverter(EventTypeConverter eventTypeConverter ){
        this.eventTypeConverter = eventTypeConverter;
    }
    public TelePeayageConverter getTelePeayageConverter(){
        return this.telePeayageConverter;
    }
    public void setTelePeayageConverter(TelePeayageConverter telePeayageConverter ){
        this.telePeayageConverter = telePeayageConverter;
    }
    public AnomalieConverter getAnomalieConverter(){
        return this.anomalieConverter;
    }
    public void setAnomalieConverter(AnomalieConverter anomalieConverter ){
        this.anomalieConverter = anomalieConverter;
    }
    public MessageTypeConverter getMessageTypeConverter(){
        return this.messageTypeConverter;
    }
    public void setMessageTypeConverter(MessageTypeConverter messageTypeConverter ){
        this.messageTypeConverter = messageTypeConverter;
    }
    public TypeEquipementConverter getTypeEquipementConverter(){
        return this.typeEquipementConverter;
    }
    public void setTypeEquipementConverter(TypeEquipementConverter typeEquipementConverter ){
        this.typeEquipementConverter = typeEquipementConverter;
    }
    public boolean  isVoie(){
        return this.voie;
    }
    public void  setVoie(boolean voie){
        this.voie = voie;
    }
    public boolean  isMessageType(){
        return this.messageType;
    }
    public void  setMessageType(boolean messageType){
        this.messageType = messageType;
    }
    public boolean  isTelePeayage(){
        return this.telePeayage;
    }
    public void  setTelePeayage(boolean telePeayage){
        this.telePeayage = telePeayage;
    }
    public boolean  isTypeEquipement(){
        return this.typeEquipement;
    }
    public void  setTypeEquipement(boolean typeEquipement){
        this.typeEquipement = typeEquipement;
    }
    public boolean  isEventType(){
        return this.eventType;
    }
    public void  setEventType(boolean eventType){
        this.eventType = eventType;
    }
    public boolean  isStation(){
        return this.station;
    }
    public void  setStation(boolean station){
        this.station = station;
    }
    public boolean  isAnomalie(){
        return this.anomalie;
    }
    public void  setAnomalie(boolean anomalie){
        this.anomalie = anomalie;
    }
}
