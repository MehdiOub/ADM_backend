package  ma.adm.easyeve.dao.specification.core;

import ma.adm.easyeve.zynerator.specification.AbstractSpecification;
import ma.adm.easyeve.dao.criteria.core.TelePeayageCriteria;
import ma.adm.easyeve.bean.core.TelePeayage;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class TelePeayageSpecification extends  AbstractSpecification<TelePeayageCriteria, TelePeayage>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public TelePeayageSpecification(TelePeayageCriteria criteria) {
        super(criteria);
    }

    public TelePeayageSpecification(TelePeayageCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
