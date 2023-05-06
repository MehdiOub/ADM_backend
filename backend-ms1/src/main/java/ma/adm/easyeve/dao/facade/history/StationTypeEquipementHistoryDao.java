package ma.adm.easyeve.dao.facade.history;

import ma.adm.easyeve.zynerator.repository.AbstractHistoryRepository;
import ma.adm.easyeve.bean.history.StationTypeEquipementHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface StationTypeEquipementHistoryDao extends AbstractHistoryRepository<StationTypeEquipementHistory,Long> {

}
