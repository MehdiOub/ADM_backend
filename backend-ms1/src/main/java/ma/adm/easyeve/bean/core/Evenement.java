package ma.adm.easyeve.bean.core;

import java.util.Objects;

import java.time.LocalDateTime;


import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;



import com.fasterxml.jackson.annotation.JsonInclude;
import ma.adm.easyeve.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;




@Entity
@Table(name = "evenement")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="evenement_seq",sequenceName="evenement_seq",allocationSize=1, initialValue = 1)
public class Evenement   extends AuditBusinessObject     {

    private Long id;

    @Column(length = 500)
    private String code;
    private LocalDateTime journeytDate ;
    @Column(length = 500)
    private String eventDetails;

    private Voie voie ;
    
    private MessageType messageType ;
    
    private TelePeayage telePeayage ;
    
    private TypeEquipement typeEquipement ;
    
    private EventType eventType ;
    
    private Station station ;
    
    private Anomalie anomalie ;
    


    public Evenement(){
        super();
    }

    public Evenement(Long id,String code){
        this.id = id;
        this.code = code ;
    }




    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="evenement_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public LocalDateTime getJourneytDate(){
        return this.journeytDate;
    }
    public void setJourneytDate(LocalDateTime journeytDate){
        this.journeytDate = journeytDate;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Voie getVoie(){
        return this.voie;
    }
    public void setVoie(Voie voie){
        this.voie = voie;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public MessageType getMessageType(){
        return this.messageType;
    }
    public void setMessageType(MessageType messageType){
        this.messageType = messageType;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public TelePeayage getTelePeayage(){
        return this.telePeayage;
    }
    public void setTelePeayage(TelePeayage telePeayage){
        this.telePeayage = telePeayage;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public TypeEquipement getTypeEquipement(){
        return this.typeEquipement;
    }
    public void setTypeEquipement(TypeEquipement typeEquipement){
        this.typeEquipement = typeEquipement;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public EventType getEventType(){
        return this.eventType;
    }
    public void setEventType(EventType eventType){
        this.eventType = eventType;
    }
    public String getEventDetails(){
        return this.eventDetails;
    }
    public void setEventDetails(String eventDetails){
        this.eventDetails = eventDetails;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Station getStation(){
        return this.station;
    }
    public void setStation(Station station){
        this.station = station;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Anomalie getAnomalie(){
        return this.anomalie;
    }
    public void setAnomalie(Anomalie anomalie){
        this.anomalie = anomalie;
    }

    @Transient
    public String getLabel() {
        label = code;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Evenement evenement = (Evenement) o;
        return id != null && id.equals(evenement.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

