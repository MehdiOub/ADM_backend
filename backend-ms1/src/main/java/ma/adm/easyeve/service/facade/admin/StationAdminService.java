package ma.adm.easyeve.service.facade.admin;

import java.util.List;
import ma.adm.easyeve.bean.core.Station;
import ma.adm.easyeve.dao.criteria.core.StationCriteria;
import ma.adm.easyeve.dao.criteria.history.StationHistoryCriteria;
import ma.adm.easyeve.zynerator.service.IService;

public interface StationAdminService extends  IService<Station,StationCriteria, StationHistoryCriteria>  {

   Station findByLibelle(String libelle);


}
