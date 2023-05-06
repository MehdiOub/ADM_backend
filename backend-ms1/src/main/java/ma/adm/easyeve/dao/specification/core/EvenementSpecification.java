package  ma.adm.easyeve.dao.specification.core;

import ma.adm.easyeve.zynerator.specification.AbstractSpecification;
import ma.adm.easyeve.dao.criteria.core.EvenementCriteria;
import ma.adm.easyeve.bean.core.Evenement;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class EvenementSpecification extends  AbstractSpecification<EvenementCriteria, Evenement>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("journeytDate", criteria.getJourneytDate(), criteria.getJourneytDateFrom(), criteria.getJourneytDateTo());
        addPredicateFk("voie","id", criteria.getVoie()==null?null:criteria.getVoie().getId());
        addPredicateFk("voie","id", criteria.getVoies());
        addPredicateFk("voie","code", criteria.getVoie()==null?null:criteria.getVoie().getCode());
        addPredicateFk("messageType","id", criteria.getMessageType()==null?null:criteria.getMessageType().getId());
        addPredicateFk("messageType","id", criteria.getMessageTypes());
        addPredicateFk("messageType","code", criteria.getMessageType()==null?null:criteria.getMessageType().getCode());
        addPredicateFk("telePeayage","id", criteria.getTelePeayage()==null?null:criteria.getTelePeayage().getId());
        addPredicateFk("telePeayage","id", criteria.getTelePeayages());
        addPredicateFk("telePeayage","code", criteria.getTelePeayage()==null?null:criteria.getTelePeayage().getCode());
        addPredicateFk("typeEquipement","id", criteria.getTypeEquipement()==null?null:criteria.getTypeEquipement().getId());
        addPredicateFk("typeEquipement","id", criteria.getTypeEquipements());
        addPredicateFk("typeEquipement","code", criteria.getTypeEquipement()==null?null:criteria.getTypeEquipement().getCode());
        addPredicateFk("eventType","id", criteria.getEventType()==null?null:criteria.getEventType().getId());
        addPredicateFk("eventType","id", criteria.getEventTypes());
        addPredicateFk("eventType","code", criteria.getEventType()==null?null:criteria.getEventType().getCode());
        addPredicateFk("station","id", criteria.getStation()==null?null:criteria.getStation().getId());
        addPredicateFk("station","id", criteria.getStations());
        addPredicateFk("anomalie","id", criteria.getAnomalie()==null?null:criteria.getAnomalie().getId());
        addPredicateFk("anomalie","id", criteria.getAnomalies());
        addPredicateFk("anomalie","code", criteria.getAnomalie()==null?null:criteria.getAnomalie().getCode());
    }

    public EvenementSpecification(EvenementCriteria criteria) {
        super(criteria);
    }

    public EvenementSpecification(EvenementCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
