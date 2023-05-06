package ma.adm.easyeve.dao.facade.history;

import ma.adm.easyeve.zynerator.repository.AbstractHistoryRepository;
import ma.adm.easyeve.bean.history.EvenementHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface EvenementHistoryDao extends AbstractHistoryRepository<EvenementHistory,Long> {

}
