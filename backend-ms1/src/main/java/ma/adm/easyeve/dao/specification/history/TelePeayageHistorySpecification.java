package  ma.adm.easyeve.dao.specification.history;

import ma.adm.easyeve.zynerator.specification.AbstractHistorySpecification;
import ma.adm.easyeve.dao.criteria.history.TelePeayageHistoryCriteria;
import ma.adm.easyeve.bean.history.TelePeayageHistory;


public class TelePeayageHistorySpecification extends AbstractHistorySpecification<TelePeayageHistoryCriteria, TelePeayageHistory> {

    public TelePeayageHistorySpecification(TelePeayageHistoryCriteria criteria) {
        super(criteria);
    }

    public TelePeayageHistorySpecification(TelePeayageHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
