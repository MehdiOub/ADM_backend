package ma.adm.easyeve.service.impl.admin;

import ma.adm.easyeve.bean.core.TypeEquipement;
import ma.adm.easyeve.bean.history.TypeEquipementHistory;
import ma.adm.easyeve.dao.criteria.core.TypeEquipementCriteria;
import ma.adm.easyeve.dao.criteria.history.TypeEquipementHistoryCriteria;
import ma.adm.easyeve.dao.facade.core.TypeEquipementDao;
import ma.adm.easyeve.dao.facade.history.TypeEquipementHistoryDao;
import ma.adm.easyeve.dao.specification.core.TypeEquipementSpecification;
import ma.adm.easyeve.service.facade.admin.TypeEquipementAdminService;
import ma.adm.easyeve.zynerator.service.AbstractServiceImpl;
import ma.adm.easyeve.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;





import java.util.List;
@Service
public class TypeEquipementAdminServiceImpl extends AbstractServiceImpl<TypeEquipement,TypeEquipementHistory, TypeEquipementCriteria, TypeEquipementHistoryCriteria, TypeEquipementDao,
TypeEquipementHistoryDao> implements TypeEquipementAdminService {

    public Long getNextOrdre() {
    Long max = dao.findMaxOrdreByEtablissementIdOrder(getEtablissementId());
    return max != null ? max + 1 : 1;
    }

    @Cacheable(cacheNames = "typeEquipements")
    public List<TypeEquipement> findAll() {
        return super.findAll();
    }

    @CachePut(cacheNames = "typeEquipements", key = "#t.id")
    public TypeEquipement create(TypeEquipement t) {
        return super.create(t);
    }

    @CachePut(cacheNames = "typeEquipements", key = "#t.id")
    public TypeEquipement update(TypeEquipement t) {
        return super.update(t);
    }

    @Cacheable(cacheNames = "typeEquipements", key = "#id")
    public TypeEquipement findById(Long id) {
        return super.findById(id);
    }

    @CacheEvict(cacheNames = "typeEquipements", key = "#id")
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    public TypeEquipement findByReferenceEntity(TypeEquipement t){
        return  dao.findByCode(t.getCode());
    }

    public TypeEquipement findByCode(String code) {
        return dao.findByCode(code);
    }

    public void configure() {
        super.configure(TypeEquipement.class,TypeEquipementHistory.class, TypeEquipementHistoryCriteria.class, TypeEquipementSpecification.class);
    }

    public TypeEquipementAdminServiceImpl(TypeEquipementDao dao, TypeEquipementHistoryDao historyDao) {
        super(dao, historyDao);
    }

}