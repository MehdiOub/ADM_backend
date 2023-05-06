package  ma.adm.easyeve.dao.specification.core;

import ma.adm.easyeve.zynerator.specification.AbstractSpecification;
import ma.adm.easyeve.dao.criteria.core.VoieCriteria;
import ma.adm.easyeve.bean.core.Voie;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class VoieSpecification extends  AbstractSpecification<VoieCriteria, Voie>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicateFk("typeVoie","id", criteria.getTypeVoie()==null?null:criteria.getTypeVoie().getId());
        addPredicateFk("typeVoie","id", criteria.getTypeVoies());
        addPredicateFk("typeVoie","code", criteria.getTypeVoie()==null?null:criteria.getTypeVoie().getCode());
        addPredicateFk("telePeayage","id", criteria.getTelePeayage()==null?null:criteria.getTelePeayage().getId());
        addPredicateFk("telePeayage","id", criteria.getTelePeayages());
        addPredicateFk("telePeayage","code", criteria.getTelePeayage()==null?null:criteria.getTelePeayage().getCode());
        addPredicateFk("station","id", criteria.getStation()==null?null:criteria.getStation().getId());
        addPredicateFk("station","id", criteria.getStations());
    }

    public VoieSpecification(VoieCriteria criteria) {
        super(criteria);
    }

    public VoieSpecification(VoieCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
