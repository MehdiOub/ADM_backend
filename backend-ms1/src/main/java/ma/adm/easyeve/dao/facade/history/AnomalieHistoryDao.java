package ma.adm.easyeve.dao.facade.history;

import ma.adm.easyeve.zynerator.repository.AbstractHistoryRepository;
import ma.adm.easyeve.bean.history.AnomalieHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface AnomalieHistoryDao extends AbstractHistoryRepository<AnomalieHistory,Long> {

}
