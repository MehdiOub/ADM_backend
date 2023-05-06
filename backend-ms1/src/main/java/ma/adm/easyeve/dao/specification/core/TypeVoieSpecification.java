package  ma.adm.easyeve.dao.specification.core;

import ma.adm.easyeve.zynerator.specification.AbstractSpecification;
import ma.adm.easyeve.dao.criteria.core.TypeVoieCriteria;
import ma.adm.easyeve.bean.core.TypeVoie;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class TypeVoieSpecification extends  AbstractSpecification<TypeVoieCriteria, TypeVoie>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public TypeVoieSpecification(TypeVoieCriteria criteria) {
        super(criteria);
    }

    public TypeVoieSpecification(TypeVoieCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
