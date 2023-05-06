package ma.adm.easyeve.service.impl.admin;

import ma.adm.easyeve.bean.core.Station;
import ma.adm.easyeve.bean.history.StationHistory;
import ma.adm.easyeve.dao.criteria.core.StationCriteria;
import ma.adm.easyeve.dao.criteria.history.StationHistoryCriteria;
import ma.adm.easyeve.dao.facade.core.StationDao;
import ma.adm.easyeve.dao.facade.history.StationHistoryDao;
import ma.adm.easyeve.dao.specification.core.StationSpecification;
import ma.adm.easyeve.service.facade.admin.StationAdminService;
import ma.adm.easyeve.zynerator.service.AbstractServiceImpl;
import ma.adm.easyeve.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ma.adm.easyeve.bean.core.Voie;
import ma.adm.easyeve.bean.core.StationTypeEquipement;

import ma.adm.easyeve.service.facade.admin.VoieAdminService ;
import ma.adm.easyeve.service.facade.admin.StationTypeEquipementAdminService ;


import java.util.List;
@Service
public class StationAdminServiceImpl extends AbstractServiceImpl<Station,StationHistory, StationCriteria, StationHistoryCriteria, StationDao,
StationHistoryDao> implements StationAdminService {

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public Station create(Station t) {
        super.create(t);
        if (t.getVoies() != null) {
                t.getVoies().forEach(element-> {
                    element.setStation(t);
                    voieService.create(element);
            });
        }
        if (t.getStationTypeEquipements() != null) {
                t.getStationTypeEquipements().forEach(element-> {
                    element.setStation(t);
                    stationTypeEquipementService.create(element);
            });
        }
        return t;
    }

    @Override
    public Station findByLibelle(String libelle) {
        return dao.findByLibelle(libelle);
    }

    public Station findWithAssociatedLists(Long id){
        Station result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setVoies(voieService.findByStationId(id));
            result.setStationTypeEquipements(stationTypeEquipementService.findByStationId(id));
        }
        return result;
    }
    @Transactional
    public void deleteAssociatedLists(Long id) {
        voieService.deleteByStationId(id);
        stationTypeEquipementService.deleteByStationId(id);
    }


    public void updateWithAssociatedLists(Station station){
    if(station !=null && station.getId() != null){
            List<List<Voie>> resultVoies= voieService.getToBeSavedAndToBeDeleted(voieService.findByStationId(station.getId()),station.getVoies());
            voieService.delete(resultVoies.get(1));
            ListUtil.emptyIfNull(resultVoies.get(0)).forEach(e -> e.setStation(station));
            voieService.update(resultVoies.get(0),true);
            List<List<StationTypeEquipement>> resultStationTypeEquipements= stationTypeEquipementService.getToBeSavedAndToBeDeleted(stationTypeEquipementService.findByStationId(station.getId()),station.getStationTypeEquipements());
            stationTypeEquipementService.delete(resultStationTypeEquipements.get(1));
            ListUtil.emptyIfNull(resultStationTypeEquipements.get(0)).forEach(e -> e.setStation(station));
            stationTypeEquipementService.update(resultStationTypeEquipements.get(0),true);
    }
    }



    public void configure() {
        super.configure(Station.class,StationHistory.class, StationHistoryCriteria.class, StationSpecification.class);
    }

    @Autowired
    private VoieAdminService voieService ;
    @Autowired
    private StationTypeEquipementAdminService stationTypeEquipementService ;
    public StationAdminServiceImpl(StationDao dao, StationHistoryDao historyDao) {
        super(dao, historyDao);
    }

}