package ma.adm.easyeve.service.facade.admin;

import java.util.List;
import ma.adm.easyeve.bean.core.EventType;
import ma.adm.easyeve.dao.criteria.core.EventTypeCriteria;
import ma.adm.easyeve.dao.criteria.history.EventTypeHistoryCriteria;
import ma.adm.easyeve.zynerator.service.IService;

public interface EventTypeAdminService extends  IService<EventType,EventTypeCriteria, EventTypeHistoryCriteria>  {


    EventType findByCode(String codeEventType);
}
