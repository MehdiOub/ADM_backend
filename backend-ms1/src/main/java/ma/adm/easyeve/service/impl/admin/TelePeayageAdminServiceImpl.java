package ma.adm.easyeve.service.impl.admin;

import ma.adm.easyeve.bean.core.TelePeayage;
import ma.adm.easyeve.bean.history.TelePeayageHistory;
import ma.adm.easyeve.dao.criteria.core.TelePeayageCriteria;
import ma.adm.easyeve.dao.criteria.history.TelePeayageHistoryCriteria;
import ma.adm.easyeve.dao.facade.core.TelePeayageDao;
import ma.adm.easyeve.dao.facade.history.TelePeayageHistoryDao;
import ma.adm.easyeve.dao.specification.core.TelePeayageSpecification;
import ma.adm.easyeve.service.facade.admin.TelePeayageAdminService;
import ma.adm.easyeve.zynerator.service.AbstractServiceImpl;
import ma.adm.easyeve.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class TelePeayageAdminServiceImpl extends AbstractServiceImpl<TelePeayage,TelePeayageHistory, TelePeayageCriteria, TelePeayageHistoryCriteria, TelePeayageDao,
TelePeayageHistoryDao> implements TelePeayageAdminService {


    public TelePeayage findByReferenceEntity(TelePeayage t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(TelePeayage.class,TelePeayageHistory.class, TelePeayageHistoryCriteria.class, TelePeayageSpecification.class);
    }

    @Override
    public TelePeayage findByCode(String codeTelePeage) {
        return  dao.findByCode(codeTelePeage) ;
    }

    public TelePeayageAdminServiceImpl(TelePeayageDao dao, TelePeayageHistoryDao historyDao) {
        super(dao, historyDao);
    }

}