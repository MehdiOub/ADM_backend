package  ma.adm.easyeve.dao.specification.history;

import ma.adm.easyeve.zynerator.specification.AbstractHistorySpecification;
import ma.adm.easyeve.dao.criteria.history.TypeEquipementHistoryCriteria;
import ma.adm.easyeve.bean.history.TypeEquipementHistory;


public class TypeEquipementHistorySpecification extends AbstractHistorySpecification<TypeEquipementHistoryCriteria, TypeEquipementHistory> {

    public TypeEquipementHistorySpecification(TypeEquipementHistoryCriteria criteria) {
        super(criteria);
    }

    public TypeEquipementHistorySpecification(TypeEquipementHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
