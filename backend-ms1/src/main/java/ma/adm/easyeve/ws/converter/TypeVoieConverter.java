package  ma.adm.easyeve.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.adm.easyeve.zynerator.util.StringUtil;
import ma.adm.easyeve.zynerator.converter.AbstractConverter;
import ma.adm.easyeve.zynerator.util.DateUtil;
import ma.adm.easyeve.bean.history.TypeVoieHistory;
import ma.adm.easyeve.bean.core.TypeVoie;
import ma.adm.easyeve.ws.dto.TypeVoieDto;

@Component
public class TypeVoieConverter extends AbstractConverter<TypeVoie, TypeVoieDto, TypeVoieHistory> {


    public  TypeVoieConverter(){
        super(TypeVoie.class, TypeVoieDto.class, TypeVoieHistory.class);
    }

    @Override
    public TypeVoie toItem(TypeVoieDto dto) {
        if (dto == null) {
            return null;
        } else {
        TypeVoie item = new TypeVoie();
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
    public TypeVoieDto toDto(TypeVoie item) {
        if (item == null) {
            return null;
        } else {
            TypeVoieDto dto = new TypeVoieDto();
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
