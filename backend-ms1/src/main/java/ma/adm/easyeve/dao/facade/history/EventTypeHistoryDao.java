package ma.adm.easyeve.dao.facade.history;

import ma.adm.easyeve.zynerator.repository.AbstractHistoryRepository;
import ma.adm.easyeve.bean.history.EventTypeHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EventTypeHistoryDao extends AbstractHistoryRepository<EventTypeHistory,Long> {

}
