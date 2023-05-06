package  ma.adm.easyeve.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ma.adm.easyeve.bean.core.Station;

import ma.adm.easyeve.zynerator.util.StringUtil;
import ma.adm.easyeve.zynerator.converter.AbstractConverter;
import ma.adm.easyeve.zynerator.util.DateUtil;
import ma.adm.easyeve.bean.history.StationTypeEquipementHistory;
import ma.adm.easyeve.bean.core.StationTypeEquipement;
import ma.adm.easyeve.ws.dto.StationTypeEquipementDto;

@Component
public class StationTypeEquipementConverter extends AbstractConverter<StationTypeEquipement, StationTypeEquipementDto, StationTypeEquipementHistory> {

    @Autowired
    private StationConverter stationConverter ;
    @Autowired
    private TypeEquipementConverter typeEquipementConverter ;
    private boolean station;
    private boolean typeEquipement;

    public  StationTypeEquipementConverter(){
        super(StationTypeEquipement.class, StationTypeEquipementDto.class, StationTypeEquipementHistory.class);
    }

    @Override
    public StationTypeEquipement toItem(StationTypeEquipementDto dto) {
        if (dto == null) {
            return null;
        } else {
        StationTypeEquipement item = new StationTypeEquipement();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(dto.getStation() != null && dto.getStation().getId() != null){
                item.setStation(new Station());
                item.getStation().setId(dto.getStation().getId());
            }

            if(this.typeEquipement && dto.getTypeEquipement()!=null)
                item.setTypeEquipement(typeEquipementConverter.toItem(dto.getTypeEquipement())) ;



        return item;
        }
    }

    @Override
    public StationTypeEquipementDto toDto(StationTypeEquipement item) {
        if (item == null) {
            return null;
        } else {
            StationTypeEquipementDto dto = new StationTypeEquipementDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
        if(this.station && item.getStation()!=null) {
            dto.setStation(stationConverter.toDto(item.getStation())) ;
        }
        if(this.typeEquipement && item.getTypeEquipement()!=null) {
            dto.setTypeEquipement(typeEquipementConverter.toDto(item.getTypeEquipement())) ;
        }


        return dto;
        }
    }


    public void initObject(boolean value) {
        this.station = value;
        this.typeEquipement = value;
    }


    public StationConverter getStationConverter(){
        return this.stationConverter;
    }
    public void setStationConverter(StationConverter stationConverter ){
        this.stationConverter = stationConverter;
    }
    public TypeEquipementConverter getTypeEquipementConverter(){
        return this.typeEquipementConverter;
    }
    public void setTypeEquipementConverter(TypeEquipementConverter typeEquipementConverter ){
        this.typeEquipementConverter = typeEquipementConverter;
    }
    public boolean  isStation(){
        return this.station;
    }
    public void  setStation(boolean station){
        this.station = station;
    }
    public boolean  isTypeEquipement(){
        return this.typeEquipement;
    }
    public void  setTypeEquipement(boolean typeEquipement){
        this.typeEquipement = typeEquipement;
    }
}
