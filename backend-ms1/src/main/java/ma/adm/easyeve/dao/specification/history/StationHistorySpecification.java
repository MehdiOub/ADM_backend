package  ma.adm.easyeve.dao.specification.history;

import ma.adm.easyeve.zynerator.specification.AbstractHistorySpecification;
import ma.adm.easyeve.dao.criteria.history.StationHistoryCriteria;
import ma.adm.easyeve.bean.history.StationHistory;


public class StationHistorySpecification extends AbstractHistorySpecification<StationHistoryCriteria, StationHistory> {

    public StationHistorySpecification(StationHistoryCriteria criteria) {
        super(criteria);
    }

    public StationHistorySpecification(StationHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
