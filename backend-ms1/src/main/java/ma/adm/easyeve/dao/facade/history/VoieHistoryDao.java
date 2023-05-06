package ma.adm.easyeve.dao.facade.history;

import ma.adm.easyeve.zynerator.repository.AbstractHistoryRepository;
import ma.adm.easyeve.bean.history.VoieHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface VoieHistoryDao extends AbstractHistoryRepository<VoieHistory,Long> {

}
