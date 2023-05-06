package  ma.adm.easyeve.dao.specification.core;

import ma.adm.easyeve.zynerator.specification.AbstractSpecification;
import ma.adm.easyeve.dao.criteria.core.MessageTypeCriteria;
import ma.adm.easyeve.bean.core.MessageType;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class MessageTypeSpecification extends  AbstractSpecification<MessageTypeCriteria, MessageType>  {

    @Override
    public void constructPredicates() {
        addPredicateId("id", criteria);
        addPredicate("code", criteria.getCode(),criteria.getCodeLike());
        addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
    }

    public MessageTypeSpecification(MessageTypeCriteria criteria) {
        super(criteria);
    }

    public MessageTypeSpecification(MessageTypeCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
