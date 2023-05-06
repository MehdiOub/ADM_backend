package ma.adm.easyeve.dao.facade.history;

import ma.adm.easyeve.zynerator.repository.AbstractHistoryRepository;
import ma.adm.easyeve.bean.history.StationHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface StationHistoryDao extends AbstractHistoryRepository<StationHistory,Long> {

}
