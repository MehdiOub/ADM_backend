package ma.adm.easyeve.zynerator.service;

import ma.adm.easyeve.zynerator.audit.AuditBusinessObjectEnhanced;
import ma.adm.easyeve.zynerator.criteria.BaseCriteria;
import ma.adm.easyeve.zynerator.history.HistBusinessObject;
import ma.adm.easyeve.zynerator.history.HistCriteria;
import ma.adm.easyeve.zynerator.repository.AbstractHistoryRepository;
import ma.adm.easyeve.zynerator.repository.AbstractRepository;

public abstract class AbstractReferentielServiceImpl<T extends AuditBusinessObjectEnhanced, H extends HistBusinessObject, CRITERIA extends BaseCriteria, HC extends HistCriteria, REPO extends AbstractRepository<T, Long>, HISTREPO extends AbstractHistoryRepository<H, Long>> extends AbstractServiceImpl<T, H, CRITERIA, HC, REPO, HISTREPO> {

    public AbstractReferentielServiceImpl(REPO dao, HISTREPO historyRepository) {
    super(dao, historyRepository);
    }

}