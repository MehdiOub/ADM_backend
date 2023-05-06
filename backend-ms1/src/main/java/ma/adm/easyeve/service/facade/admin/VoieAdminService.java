package ma.adm.easyeve.service.facade.admin;

import java.util.List;
import ma.adm.easyeve.bean.core.Voie;
import ma.adm.easyeve.dao.criteria.core.VoieCriteria;
import ma.adm.easyeve.dao.criteria.history.VoieHistoryCriteria;
import ma.adm.easyeve.zynerator.service.IService;

public interface VoieAdminService extends  IService<Voie,VoieCriteria, VoieHistoryCriteria>  {

    List<Voie> findByTypeVoieId(Long id);
    int deleteByTypeVoieId(Long id);
    List<Voie> findByTelePeayageId(Long id);
    int deleteByTelePeayageId(Long id);
    List<Voie> findByStationId(Long id);
    int deleteByStationId(Long id);
    Voie findByLibelleAndStationLibelle(String codeVoie , String libelle) ;



}
