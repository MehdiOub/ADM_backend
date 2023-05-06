package  ma.adm.easyeve.dao.specification.core;

import ma.adm.easyeve.zynerator.specification.AbstractSpecification;
import ma.adm.easyeve.dao.criteria.core.StationCriteria;
import ma.adm.easyeve.bean.core.Station;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class StationSpecification extends  AbstractSpecification<StationCriteria, Station>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public StationSpecification(StationCriteria criteria) {
        super(criteria);
    }

    public StationSpecification(StationCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
