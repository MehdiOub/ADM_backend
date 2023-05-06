package  ma.adm.easyeve.dao.specification.core;

import ma.adm.easyeve.zynerator.specification.AbstractSpecification;
import ma.adm.easyeve.dao.criteria.core.AnomalieCriteria;
import ma.adm.easyeve.bean.core.Anomalie;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class AnomalieSpecification extends  AbstractSpecification<AnomalieCriteria, Anomalie>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public AnomalieSpecification(AnomalieCriteria criteria) {
        super(criteria);
    }

    public AnomalieSpecification(AnomalieCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
