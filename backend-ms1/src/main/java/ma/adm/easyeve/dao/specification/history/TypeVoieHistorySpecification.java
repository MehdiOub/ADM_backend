package  ma.adm.easyeve.dao.specification.history;

import ma.adm.easyeve.zynerator.specification.AbstractHistorySpecification;
import ma.adm.easyeve.dao.criteria.history.TypeVoieHistoryCriteria;
import ma.adm.easyeve.bean.history.TypeVoieHistory;


public class TypeVoieHistorySpecification extends AbstractHistorySpecification<TypeVoieHistoryCriteria, TypeVoieHistory> {

    public TypeVoieHistorySpecification(TypeVoieHistoryCriteria criteria) {
        super(criteria);
    }

    public TypeVoieHistorySpecification(TypeVoieHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
