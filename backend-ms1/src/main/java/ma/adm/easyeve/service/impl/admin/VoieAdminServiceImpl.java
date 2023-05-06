package ma.adm.easyeve.service.impl.admin;

import ma.adm.easyeve.bean.core.Voie;
import ma.adm.easyeve.bean.history.VoieHistory;
import ma.adm.easyeve.dao.criteria.core.VoieCriteria;
import ma.adm.easyeve.dao.criteria.history.VoieHistoryCriteria;
import ma.adm.easyeve.dao.facade.core.VoieDao;
import ma.adm.easyeve.dao.facade.history.VoieHistoryDao;
import ma.adm.easyeve.dao.specification.core.VoieSpecification;
import ma.adm.easyeve.service.facade.admin.VoieAdminService;
import ma.adm.easyeve.zynerator.service.AbstractServiceImpl;
import ma.adm.easyeve.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.adm.easyeve.service.facade.admin.StationAdminService ;
import ma.adm.easyeve.service.facade.admin.TelePeayageAdminService ;
import ma.adm.easyeve.service.facade.admin.TypeVoieAdminService ;


import java.util.List;
@Service
public class VoieAdminServiceImpl extends AbstractServiceImpl<Voie,VoieHistory, VoieCriteria, VoieHistoryCriteria, VoieDao,
VoieHistoryDao> implements VoieAdminService {


    public Voie findByReferenceEntity(Voie t){
        return  dao.findByCode(t.getCode());
    }

    public List<Voie> findByTypeVoieId(Long id){
        return dao.findByTypeVoieId(id);
    }
    public int deleteByTypeVoieId(Long id){
        return dao.deleteByTypeVoieId(id);
    }
    public List<Voie> findByTelePeayageId(Long id){
        return dao.findByTelePeayageId(id);
    }
    public int deleteByTelePeayageId(Long id){
        return dao.deleteByTelePeayageId(id);
    }
    public List<Voie> findByStationId(Long id){
        return dao.findByStationId(id);
    }
    public int deleteByStationId(Long id){
        return dao.deleteByStationId(id);
    }

    public void configure() {
        super.configure(Voie.class,VoieHistory.class, VoieHistoryCriteria.class, VoieSpecification.class);

    }

    @Override
    public Voie findByLibelleAndStationLibelle(String codeVoie, String libelle) {
        return dao.findByLibelleAndStationLibelle(codeVoie , libelle );
    }

    @Autowired
    private StationAdminService stationService ;
    @Autowired
    private TelePeayageAdminService telePeayageService ;
    @Autowired
    private TypeVoieAdminService typeVoieService ;
    public VoieAdminServiceImpl(VoieDao dao, VoieHistoryDao historyDao) {
        super(dao, historyDao);
    }

}