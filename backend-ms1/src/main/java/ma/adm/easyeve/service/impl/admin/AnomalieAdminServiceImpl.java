package ma.adm.easyeve.service.impl.admin;

import ma.adm.easyeve.bean.core.Anomalie;
import ma.adm.easyeve.bean.history.AnomalieHistory;
import ma.adm.easyeve.dao.criteria.core.AnomalieCriteria;
import ma.adm.easyeve.dao.criteria.history.AnomalieHistoryCriteria;
import ma.adm.easyeve.dao.facade.core.AnomalieDao;
import ma.adm.easyeve.dao.facade.history.AnomalieHistoryDao;
import ma.adm.easyeve.dao.specification.core.AnomalieSpecification;
import ma.adm.easyeve.service.facade.admin.AnomalieAdminService;
import ma.adm.easyeve.zynerator.service.AbstractServiceImpl;
import ma.adm.easyeve.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class AnomalieAdminServiceImpl extends AbstractServiceImpl<Anomalie,AnomalieHistory, AnomalieCriteria, AnomalieHistoryCriteria, AnomalieDao,
AnomalieHistoryDao> implements AnomalieAdminService {


    public Anomalie findByReferenceEntity(Anomalie t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(Anomalie.class,AnomalieHistory.class, AnomalieHistoryCriteria.class, AnomalieSpecification.class);
    }

    public AnomalieAdminServiceImpl(AnomalieDao dao, AnomalieHistoryDao historyDao) {
        super(dao, historyDao);
    }

}