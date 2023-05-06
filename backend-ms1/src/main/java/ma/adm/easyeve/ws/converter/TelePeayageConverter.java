package  ma.adm.easyeve.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.adm.easyeve.zynerator.util.StringUtil;
import ma.adm.easyeve.zynerator.converter.AbstractConverter;
import ma.adm.easyeve.zynerator.util.DateUtil;
import ma.adm.easyeve.bean.history.TelePeayageHistory;
import ma.adm.easyeve.bean.core.TelePeayage;
import ma.adm.easyeve.ws.dto.TelePeayageDto;

@Component
public class TelePeayageConverter extends AbstractConverter<TelePeayage, TelePeayageDto, TelePeayageHistory> {


    public  TelePeayageConverter(){
        super(TelePeayage.class, TelePeayageDto.class, TelePeayageHistory.class);
    }

    @Override
    public TelePeayage toItem(TelePeayageDto dto) {
        if (dto == null) {
            return null;
        } else {
        TelePeayage item = new TelePeayage();
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
    public TelePeayageDto toDto(TelePeayage item) {
        if (item == null) {
            return null;
        } else {
            TelePeayageDto dto = new TelePeayageDto();
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
