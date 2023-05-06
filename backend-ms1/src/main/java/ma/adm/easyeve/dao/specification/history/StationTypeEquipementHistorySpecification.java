package  ma.adm.easyeve.dao.specification.history;

import ma.adm.easyeve.zynerator.specification.AbstractHistorySpecification;
import ma.adm.easyeve.dao.criteria.history.StationTypeEquipementHistoryCriteria;
import ma.adm.easyeve.bean.history.StationTypeEquipementHistory;


public class StationTypeEquipementHistorySpecification extends AbstractHistorySpecification<StationTypeEquipementHistoryCriteria, StationTypeEquipementHistory> {

    public StationTypeEquipementHistorySpecification(StationTypeEquipementHistoryCriteria criteria) {
        super(criteria);
    }

    public StationTypeEquipementHistorySpecification(StationTypeEquipementHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
