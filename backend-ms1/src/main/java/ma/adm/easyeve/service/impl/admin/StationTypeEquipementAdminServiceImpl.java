package ma.adm.easyeve.service.impl.admin;

import ma.adm.easyeve.bean.core.StationTypeEquipement;
import ma.adm.easyeve.bean.history.StationTypeEquipementHistory;
import ma.adm.easyeve.dao.criteria.core.StationTypeEquipementCriteria;
import ma.adm.easyeve.dao.criteria.history.StationTypeEquipementHistoryCriteria;
import ma.adm.easyeve.dao.facade.core.StationTypeEquipementDao;
import ma.adm.easyeve.dao.facade.history.StationTypeEquipementHistoryDao;
import ma.adm.easyeve.dao.specification.core.StationTypeEquipementSpecification;
import ma.adm.easyeve.service.facade.admin.StationTypeEquipementAdminService;
import ma.adm.easyeve.zynerator.service.AbstractServiceImpl;
import ma.adm.easyeve.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.adm.easyeve.service.facade.admin.StationAdminService ;
import ma.adm.easyeve.service.facade.admin.TypeEquipementAdminService ;


import java.util.List;
@Service
public class StationTypeEquipementAdminServiceImpl extends AbstractServiceImpl<StationTypeEquipement,StationTypeEquipementHistory, StationTypeEquipementCriteria, StationTypeEquipementHistoryCriteria, StationTypeEquipementDao,
StationTypeEquipementHistoryDao> implements StationTypeEquipementAdminService {



    public List<StationTypeEquipement> findByStationId(Long id){
        return dao.findByStationId(id);
    }
    public int deleteByStationId(Long id){
        return dao.deleteByStationId(id);
    }
    public List<StationTypeEquipement> findByTypeEquipementId(Long id){
        return dao.findByTypeEquipementId(id);
    }
    public int deleteByTypeEquipementId(Long id){
        return dao.deleteByTypeEquipementId(id);
    }

    public void configure() {
        super.configure(StationTypeEquipement.class,StationTypeEquipementHistory.class, StationTypeEquipementHistoryCriteria.class, StationTypeEquipementSpecification.class);
    }

    @Autowired
    private StationAdminService stationService ;
    @Autowired
    private TypeEquipementAdminService typeEquipementService ;
    public StationTypeEquipementAdminServiceImpl(StationTypeEquipementDao dao, StationTypeEquipementHistoryDao historyDao) {
        super(dao, historyDao);
    }

}