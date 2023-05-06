package  ma.adm.easyeve.dao.specification.history;

import ma.adm.easyeve.zynerator.specification.AbstractHistorySpecification;
import ma.adm.easyeve.dao.criteria.history.EvenementHistoryCriteria;
import ma.adm.easyeve.bean.history.EvenementHistory;


public class EvenementHistorySpecification extends AbstractHistorySpecification<EvenementHistoryCriteria, EvenementHistory> {

    public EvenementHistorySpecification(EvenementHistoryCriteria criteria) {
        super(criteria);
    }

    public EvenementHistorySpecification(EvenementHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
