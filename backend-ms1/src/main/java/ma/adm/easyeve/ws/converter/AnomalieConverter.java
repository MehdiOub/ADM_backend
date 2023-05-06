package  ma.adm.easyeve.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.adm.easyeve.zynerator.util.StringUtil;
import ma.adm.easyeve.zynerator.converter.AbstractConverter;
import ma.adm.easyeve.zynerator.util.DateUtil;
import ma.adm.easyeve.bean.history.AnomalieHistory;
import ma.adm.easyeve.bean.core.Anomalie;
import ma.adm.easyeve.ws.dto.AnomalieDto;

@Component
public class AnomalieConverter extends AbstractConverter<Anomalie, AnomalieDto, AnomalieHistory> {


    public  AnomalieConverter(){
        super(Anomalie.class, AnomalieDto.class, AnomalieHistory.class);
    }

    @Override
    public Anomalie toItem(AnomalieDto dto) {
        if (dto == null) {
            return null;
        } else {
        Anomalie item = new Anomalie();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
        return item;
        }
    }
    @Override
    public AnomalieDto toDto(Anomalie item) {
        if (item == null) {
            return null;
        } else {
            AnomalieDto dto = new AnomalieDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
        return dto;
        }
    }
    public void initObject(boolean value) {
    }


}
