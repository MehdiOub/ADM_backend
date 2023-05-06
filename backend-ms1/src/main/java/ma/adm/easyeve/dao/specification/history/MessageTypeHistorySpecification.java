package  ma.adm.easyeve.dao.specification.history;

import ma.adm.easyeve.zynerator.specification.AbstractHistorySpecification;
import ma.adm.easyeve.dao.criteria.history.MessageTypeHistoryCriteria;
import ma.adm.easyeve.bean.history.MessageTypeHistory;


public class MessageTypeHistorySpecification extends AbstractHistorySpecification<MessageTypeHistoryCriteria, MessageTypeHistory> {

    public MessageTypeHistorySpecification(MessageTypeHistoryCriteria criteria) {
        super(criteria);
    }

    public MessageTypeHistorySpecification(MessageTypeHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
