package  ma.adm.easyeve.dao.specification.history;

import ma.adm.easyeve.zynerator.specification.AbstractHistorySpecification;
import ma.adm.easyeve.dao.criteria.history.AnomalieHistoryCriteria;
import ma.adm.easyeve.bean.history.AnomalieHistory;


public class AnomalieHistorySpecification extends AbstractHistorySpecification<AnomalieHistoryCriteria, AnomalieHistory> {

    public AnomalieHistorySpecification(AnomalieHistoryCriteria criteria) {
        super(criteria);
    }

    public AnomalieHistorySpecification(AnomalieHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
