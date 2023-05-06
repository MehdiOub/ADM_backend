package ma.adm.easyeve.dao.facade.core;

import ma.adm.easyeve.zynerator.repository.AbstractRepository;
import ma.adm.easyeve.bean.core.StationTypeEquipement;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface StationTypeEquipementDao extends AbstractRepository<StationTypeEquipement,Long>  {

    List<StationTypeEquipement> findByStationId(Long id);
    int deleteByStationId(Long id);
    List<StationTypeEquipement> findByTypeEquipementId(Long id);
    int deleteByTypeEquipementId(Long id);

}
