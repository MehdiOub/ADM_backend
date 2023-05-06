package ma.adm.easyeve.service.facade.admin;

import java.util.List;
import ma.adm.easyeve.bean.core.TypeEquipement;
import ma.adm.easyeve.dao.criteria.core.TypeEquipementCriteria;
import ma.adm.easyeve.dao.criteria.history.TypeEquipementHistoryCriteria;
import ma.adm.easyeve.zynerator.service.IService;

public interface TypeEquipementAdminService extends  IService<TypeEquipement,TypeEquipementCriteria, TypeEquipementHistoryCriteria>  {

    Long getNextOrdre();
    TypeEquipement findByCode(String code) ;




}
