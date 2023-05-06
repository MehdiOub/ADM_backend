package  ma.adm.easyeve.dao.specification.core;

import ma.adm.easyeve.zynerator.specification.AbstractSpecification;
import ma.adm.easyeve.dao.criteria.core.StationTypeEquipementCriteria;
import ma.adm.easyeve.bean.core.StationTypeEquipement;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class StationTypeEquipementSpecification extends  AbstractSpecification<StationTypeEquipementCriteria, StationTypeEquipement>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicateFk("station","id", criteria.getStation()==null?null:criteria.getStation().getId());
        addPredicateFk("station","id", criteria.getStations());
        addPredicateFk("typeEquipement","id", criteria.getTypeEquipement()==null?null:criteria.getTypeEquipement().getId());
        addPredicateFk("typeEquipement","id", criteria.getTypeEquipements());
        addPredicateFk("typeEquipement","code", criteria.getTypeEquipement()==null?null:criteria.getTypeEquipement().getCode());
    }

    public StationTypeEquipementSpecification(StationTypeEquipementCriteria criteria) {
        super(criteria);
    }

    public StationTypeEquipementSpecification(StationTypeEquipementCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
