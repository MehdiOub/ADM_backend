package  ma.adm.easyeve.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.adm.easyeve.zynerator.util.StringUtil;
import ma.adm.easyeve.zynerator.converter.AbstractConverter;
import ma.adm.easyeve.zynerator.util.DateUtil;
import ma.adm.easyeve.bean.history.MessageTypeHistory;
import ma.adm.easyeve.bean.core.MessageType;
import ma.adm.easyeve.ws.dto.MessageTypeDto;

@Component
public class MessageTypeConverter extends AbstractConverter<MessageType, MessageTypeDto, MessageTypeHistory> {


    public  MessageTypeConverter(){
        super(MessageType.class, MessageTypeDto.class, MessageTypeHistory.class);
    }

    @Override
    public MessageType toItem(MessageTypeDto dto) {
        if (dto == null) {
            return null;
        } else {
        MessageType item = new MessageType();
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
    public MessageTypeDto toDto(MessageType item) {
        if (item == null) {
            return null;
        } else {
            MessageTypeDto dto = new MessageTypeDto();
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
