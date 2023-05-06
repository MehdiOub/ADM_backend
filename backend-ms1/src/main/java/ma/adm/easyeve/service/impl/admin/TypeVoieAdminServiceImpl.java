package ma.adm.easyeve.service.impl.admin;

import ma.adm.easyeve.bean.core.TypeVoie;
import ma.adm.easyeve.bean.history.TypeVoieHistory;
import ma.adm.easyeve.dao.criteria.core.TypeVoieCriteria;
import ma.adm.easyeve.dao.criteria.history.TypeVoieHistoryCriteria;
import ma.adm.easyeve.dao.facade.core.TypeVoieDao;
import ma.adm.easyeve.dao.facade.history.TypeVoieHistoryDao;
import ma.adm.easyeve.dao.specification.core.TypeVoieSpecification;
import ma.adm.easyeve.service.facade.admin.TypeVoieAdminService;
import ma.adm.easyeve.zynerator.service.AbstractServiceImpl;
import ma.adm.easyeve.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class TypeVoieAdminServiceImpl extends AbstractServiceImpl<TypeVoie,TypeVoieHistory, TypeVoieCriteria, TypeVoieHistoryCriteria, TypeVoieDao,
TypeVoieHistoryDao> implements TypeVoieAdminService {


    public TypeVoie findByReferenceEntity(TypeVoie t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(TypeVoie.class,TypeVoieHistory.class, TypeVoieHistoryCriteria.class, TypeVoieSpecification.class);
    }

    public TypeVoieAdminServiceImpl(TypeVoieDao dao, TypeVoieHistoryDao historyDao) {
        super(dao, historyDao);
    }

    @Override
    public TypeVoie findByLibelle(String libTypeVoie) {
        return dao.findByLibelle(libTypeVoie);
    }
}