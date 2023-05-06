package ma.adm.easyeve.service.impl.admin;

import ma.adm.easyeve.bean.core.EventType;
import ma.adm.easyeve.bean.history.EventTypeHistory;
import ma.adm.easyeve.dao.criteria.core.EventTypeCriteria;
import ma.adm.easyeve.dao.criteria.history.EventTypeHistoryCriteria;
import ma.adm.easyeve.dao.facade.core.EventTypeDao;
import ma.adm.easyeve.dao.facade.history.EventTypeHistoryDao;
import ma.adm.easyeve.dao.specification.core.EventTypeSpecification;
import ma.adm.easyeve.service.facade.admin.EventTypeAdminService;
import ma.adm.easyeve.zynerator.service.AbstractServiceImpl;
import ma.adm.easyeve.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class EventTypeAdminServiceImpl extends AbstractServiceImpl<EventType,EventTypeHistory, EventTypeCriteria, EventTypeHistoryCriteria, EventTypeDao,
EventTypeHistoryDao> implements EventTypeAdminService {


    public EventType findByReferenceEntity(EventType t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(EventType.class,EventTypeHistory.class, EventTypeHistoryCriteria.class, EventTypeSpecification.class);
    }

    @Override
    public EventType findByCode(String codeEventType) {
        return  dao.findByCode(codeEventType) ;
    }

    public EventTypeAdminServiceImpl(EventTypeDao dao, EventTypeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}