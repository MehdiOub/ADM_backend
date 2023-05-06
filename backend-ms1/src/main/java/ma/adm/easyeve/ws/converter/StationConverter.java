package  ma.adm.easyeve.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.adm.easyeve.zynerator.util.ListUtil;


import ma.adm.easyeve.zynerator.util.StringUtil;
import ma.adm.easyeve.zynerator.converter.AbstractConverter;
import ma.adm.easyeve.zynerator.util.DateUtil;
import ma.adm.easyeve.bean.history.StationHistory;
import ma.adm.easyeve.bean.core.Station;
import ma.adm.easyeve.ws.dto.StationDto;

@Component
public class StationConverter extends AbstractConverter<Station, StationDto, StationHistory> {

    @Autowired
    private VoieConverter voieConverter ;
    @Autowired
    private TelePeayageConverter telePeayageConverter ;
    @Autowired
    private StationTypeEquipementConverter stationTypeEquipementConverter ;
    @Autowired
    private TypeVoieConverter typeVoieConverter ;
    @Autowired
    private TypeEquipementConverter typeEquipementConverter ;
    private boolean voies;
    private boolean stationTypeEquipements;

    public  StationConverter(){
        super(Station.class, StationDto.class, StationHistory.class);
        init(true);
    }

    @Override
    public Station toItem(StationDto dto) {
        if (dto == null) {
            return null;
        } else {
        Station item = new Station();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());

            if(this.voies && ListUtil.isNotEmpty(dto.getVoies()))
                item.setVoies(voieConverter.toItem(dto.getVoies()));
            if(this.stationTypeEquipements && ListUtil.isNotEmpty(dto.getStationTypeEquipements()))
                item.setStationTypeEquipements(stationTypeEquipementConverter.toItem(dto.getStationTypeEquipements()));

        return item;
        }
    }

    @Override
    public StationDto toDto(Station item) {
        if (item == null) {
            return null;
        } else {
            StationDto dto = new StationDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
        if(this.voies && ListUtil.isNotEmpty(item.getVoies())){
            voieConverter.init(true);
            voieConverter.setStation(false);
            dto.setVoies(voieConverter.toDto(item.getVoies()));
            voieConverter.setStation(true);

        }
        if(this.stationTypeEquipements && ListUtil.isNotEmpty(item.getStationTypeEquipements())){
            stationTypeEquipementConverter.init(true);
            stationTypeEquipementConverter.setStation(false);
            dto.setStationTypeEquipements(stationTypeEquipementConverter.toDto(item.getStationTypeEquipements()));
            stationTypeEquipementConverter.setStation(true);

        }


        return dto;
        }
    }

    public void initList(boolean value) {
        this.voies = value;
        this.stationTypeEquipements = value;
    }

    public void initObject(boolean value) {
    }


    public VoieConverter getVoieConverter(){
        return this.voieConverter;
    }
    public void setVoieConverter(VoieConverter voieConverter ){
        this.voieConverter = voieConverter;
    }
    public TelePeayageConverter getTelePeayageConverter(){
        return this.telePeayageConverter;
    }
    public void setTelePeayageConverter(TelePeayageConverter telePeayageConverter ){
        this.telePeayageConverter = telePeayageConverter;
    }
    public StationTypeEquipementConverter getStationTypeEquipementConverter(){
        return this.stationTypeEquipementConverter;
    }
    public void setStationTypeEquipementConverter(StationTypeEquipementConverter stationTypeEquipementConverter ){
        this.stationTypeEquipementConverter = stationTypeEquipementConverter;
    }
    public TypeVoieConverter getTypeVoieConverter(){
        return this.typeVoieConverter;
    }
    public void setTypeVoieConverter(TypeVoieConverter typeVoieConverter ){
        this.typeVoieConverter = typeVoieConverter;
    }
    public TypeEquipementConverter getTypeEquipementConverter(){
        return this.typeEquipementConverter;
    }
    public void setTypeEquipementConverter(TypeEquipementConverter typeEquipementConverter ){
        this.typeEquipementConverter = typeEquipementConverter;
    }
    public boolean  isVoies(){
        return this.voies ;
    }
    public void  setVoies(boolean voies ){
        this.voies  = voies ;
    }
    public boolean  isStationTypeEquipements(){
        return this.stationTypeEquipements ;
    }
    public void  setStationTypeEquipements(boolean stationTypeEquipements ){
        this.stationTypeEquipements  = stationTypeEquipements ;
    }
}
