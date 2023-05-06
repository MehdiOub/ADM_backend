package  ma.adm.easyeve.dao.specification.history;

import ma.adm.easyeve.zynerator.specification.AbstractHistorySpecification;
import ma.adm.easyeve.dao.criteria.history.VoieHistoryCriteria;
import ma.adm.easyeve.bean.history.VoieHistory;


public class VoieHistorySpecification extends AbstractHistorySpecification<VoieHistoryCriteria, VoieHistory> {

    public VoieHistorySpecification(VoieHistoryCriteria criteria) {
        super(criteria);
    }

    public VoieHistorySpecification(VoieHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
