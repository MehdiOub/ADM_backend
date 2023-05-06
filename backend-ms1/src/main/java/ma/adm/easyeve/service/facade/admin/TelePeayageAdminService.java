package ma.adm.easyeve.service.facade.admin;

import java.util.List;
import ma.adm.easyeve.bean.core.TelePeayage;
import ma.adm.easyeve.dao.criteria.core.TelePeayageCriteria;
import ma.adm.easyeve.dao.criteria.history.TelePeayageHistoryCriteria;
import ma.adm.easyeve.zynerator.service.IService;

public interface TelePeayageAdminService extends  IService<TelePeayage,TelePeayageCriteria, TelePeayageHistoryCriteria>  {


    TelePeayage findByCode(String codeTelePeage);
}
