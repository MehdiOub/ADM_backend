package  ma.adm.easyeve.dao.specification.core;

import ma.adm.easyeve.zynerator.specification.AbstractSpecificationEnhanced;
import ma.adm.easyeve.dao.criteria.core.TypeEquipementCriteria;
import ma.adm.easyeve.bean.core.TypeEquipement;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class TypeEquipementSpecification extends  AbstractSpecificationEnhanced<TypeEquipementCriteria, TypeEquipement>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicateBool("entree", criteria.getEntree());
    }

    public TypeEquipementSpecification(TypeEquipementCriteria criteria) {
        super(criteria);
    }

    public TypeEquipementSpecification(TypeEquipementCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
