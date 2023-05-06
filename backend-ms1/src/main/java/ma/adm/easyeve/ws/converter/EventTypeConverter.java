package  ma.adm.easyeve.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.adm.easyeve.zynerator.util.StringUtil;
import ma.adm.easyeve.zynerator.converter.AbstractConverter;
import ma.adm.easyeve.zynerator.util.DateUtil;
import ma.adm.easyeve.bean.history.EventTypeHistory;
import ma.adm.easyeve.bean.core.EventType;
import ma.adm.easyeve.ws.dto.EventTypeDto;

@Component
public class EventTypeConverter extends AbstractConverter<EventType, EventTypeDto, EventTypeHistory> {


    public  EventTypeConverter(){
        super(EventType.class, EventTypeDto.class, EventTypeHistory.class);
    }

    @Override
    public EventType toItem(EventTypeDto dto) {
        if (dto == null) {
            return null;
        } else {
        EventType item = new EventType();
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
    public EventTypeDto toDto(EventType item) {
        if (item == null) {
            return null;
        } else {
            EventTypeDto dto = new EventTypeDto();
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
