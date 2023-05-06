package  ma.adm.easyeve.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.adm.easyeve.bean.core.Station;

import ma.adm.easyeve.zynerator.util.StringUtil;
import ma.adm.easyeve.zynerator.converter.AbstractConverter;
import ma.adm.easyeve.zynerator.util.DateUtil;
import ma.adm.easyeve.bean.history.VoieHistory;
import ma.adm.easyeve.bean.core.Voie;
import ma.adm.easyeve.ws.dto.VoieDto;

@Component
public class VoieConverter extends AbstractConverter<Voie, VoieDto, VoieHistory> {

    @Autowired
    private StationConverter stationConverter ;
    @Autowired
    private TelePeayageConverter telePeayageConverter ;
    @Autowired
    private TypeVoieConverter typeVoieConverter ;
    private boolean typeVoie;
    private boolean telePeayage;
    private boolean station;

    public  VoieConverter(){
        super(Voie.class, VoieDto.class, VoieHistory.class);
    }

    @Override
    public Voie toItem(VoieDto dto) {
        if (dto == null) {
            return null;
        } else {
        Voie item = new Voie();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(this.typeVoie && dto.getTypeVoie()!=null)
                item.setTypeVoie(typeVoieConverter.toItem(dto.getTypeVoie())) ;

            if(this.telePeayage && dto.getTelePeayage()!=null)
                item.setTelePeayage(telePeayageConverter.toItem(dto.getTelePeayage())) ;

            if(dto.getStation() != null && dto.getStation().getId() != null){
                item.setStation(new Station());
                item.getStation().setId(dto.getStation().getId());
            }



        return item;
        }
    }

    @Override
    public VoieDto toDto(Voie item) {
        if (item == null) {
            return null;
        } else {
            VoieDto dto = new VoieDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
        if(this.typeVoie && item.getTypeVoie()!=null) {
            dto.setTypeVoie(typeVoieConverter.toDto(item.getTypeVoie())) ;
        }
        if(this.telePeayage && item.getTelePeayage()!=null) {
            dto.setTelePeayage(telePeayageConverter.toDto(item.getTelePeayage())) ;
        }
        if(this.station && item.getStation()!=null) {
            dto.setStation(stationConverter.toDto(item.getStation())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.typeVoie = value;
        this.telePeayage = value;
        this.station = value;
    }


    public StationConverter getStationConverter(){
        return this.stationConverter;
    }
    public void setStationConverter(StationConverter stationConverter ){
        this.stationConverter = stationConverter;
    }
    public TelePeayageConverter getTelePeayageConverter(){
        return this.telePeayageConverter;
    }
    public void setTelePeayageConverter(TelePeayageConverter telePeayageConverter ){
        this.telePeayageConverter = telePeayageConverter;
    }
    public TypeVoieConverter getTypeVoieConverter(){
        return this.typeVoieConverter;
    }
    public void setTypeVoieConverter(TypeVoieConverter typeVoieConverter ){
        this.typeVoieConverter = typeVoieConverter;
    }
    public boolean  isTypeVoie(){
        return this.typeVoie;
    }
    public void  setTypeVoie(boolean typeVoie){
        this.typeVoie = typeVoie;
    }
    public boolean  isTelePeayage(){
        return this.telePeayage;
    }
    public void  setTelePeayage(boolean telePeayage){
        this.telePeayage = telePeayage;
    }
    public boolean  isStation(){
        return this.station;
    }
    public void  setStation(boolean station){
        this.station = station;
    }
}
