package ma.adm.easyeve.service.facade.admin;

import java.util.List;
import ma.adm.easyeve.bean.core.StationTypeEquipement;
import ma.adm.easyeve.dao.criteria.core.StationTypeEquipementCriteria;
import ma.adm.easyeve.dao.criteria.history.StationTypeEquipementHistoryCriteria;
import ma.adm.easyeve.zynerator.service.IService;

public interface StationTypeEquipementAdminService extends  IService<StationTypeEquipement,StationTypeEquipementCriteria, StationTypeEquipementHistoryCriteria>  {

    List<StationTypeEquipement> findByStationId(Long id);
    int deleteByStationId(Long id);
    List<StationTypeEquipement> findByTypeEquipementId(Long id);
    int deleteByTypeEquipementId(Long id);



}
