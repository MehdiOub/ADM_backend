package  ma.adm.easyeve.dao.specification.history;

import ma.adm.easyeve.zynerator.specification.AbstractHistorySpecification;
import ma.adm.easyeve.dao.criteria.history.EventTypeHistoryCriteria;
import ma.adm.easyeve.bean.history.EventTypeHistory;


public class EventTypeHistorySpecification extends AbstractHistorySpecification<EventTypeHistoryCriteria, EventTypeHistory> {

    public EventTypeHistorySpecification(EventTypeHistoryCriteria criteria) {
        super(criteria);
    }

    public EventTypeHistorySpecification(EventTypeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
