package  ma.adm.easyeve.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.adm.easyeve.zynerator.util.StringUtil;
import ma.adm.easyeve.zynerator.converter.AbstractConverterEnhanced;
import ma.adm.easyeve.zynerator.util.DateUtil;
import ma.adm.easyeve.bean.history.TypeEquipementHistory;
import ma.adm.easyeve.bean.core.TypeEquipement;
import ma.adm.easyeve.ws.dto.TypeEquipementDto;

@Component
public class TypeEquipementConverter extends AbstractConverterEnhanced<TypeEquipement, TypeEquipementDto, TypeEquipementHistory> {


    public  TypeEquipementConverter(){
        super(TypeEquipement.class, TypeEquipementDto.class, TypeEquipementHistory.class);
    }

    @Override
    public TypeEquipement toItem(TypeEquipementDto dto) {
        if (dto == null) {
            return null;
        } else {
        TypeEquipement item = new TypeEquipement();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(dto.getEntree() != null)
                item.setEntree(dto.getEntree());
            if(StringUtil.isNotEmpty(dto.getDescription()))
                item.setDescription(dto.getDescription());


        convertRefentielAttribute(dto, item);
        return item;
        }
    }

    @Override
    public TypeEquipementDto toDto(TypeEquipement item) {
        if (item == null) {
            return null;
        } else {
            TypeEquipementDto dto = new TypeEquipementDto();
            if(StringUtil.isNotEmpty(item.getId()))
                dto.setId(item.getId());
            if(StringUtil.isNotEmpty(item.getCode()))
                dto.setCode(item.getCode());
            if(StringUtil.isNotEmpty(item.getLibelle()))
                dto.setLibelle(item.getLibelle());
                dto.setEntree(item.getEntree());
            if(StringUtil.isNotEmpty(item.getDescription()))
                dto.setDescription(item.getDescription());


        convertRefentielAttribute(item, dto);
        return dto;
        }
    }


    public void initObject(boolean value) {
    }


}
