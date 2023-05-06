package ma.adm.easyeve.service.facade.admin;

import java.util.List;
import ma.adm.easyeve.bean.core.Evenement;
import ma.adm.easyeve.dao.criteria.core.EvenementCriteria;
import ma.adm.easyeve.dao.criteria.history.EvenementHistoryCriteria;
import ma.adm.easyeve.zynerator.service.IService;

public interface EvenementAdminService extends  IService<Evenement,EvenementCriteria, EvenementHistoryCriteria>  {

    List<Evenement> findByVoieId(Long id);
    int deleteByVoieId(Long id);
    List<Evenement> findByMessageTypeId(Long id);
    int deleteByMessageTypeId(Long id);
    List<Evenement> findByTelePeayageId(Long id);
    int deleteByTelePeayageId(Long id);
    List<Evenement> findByTypeEquipementId(Long id);
    int deleteByTypeEquipementId(Long id);
    List<Evenement> findByEventTypeId(Long id);
    int deleteByEventTypeId(Long id);
    List<Evenement> findByStationId(Long id);
    int deleteByStationId(Long id);
    List<Evenement> findByAnomalieId(Long id);
    int deleteByAnomalieId(Long id);



}
