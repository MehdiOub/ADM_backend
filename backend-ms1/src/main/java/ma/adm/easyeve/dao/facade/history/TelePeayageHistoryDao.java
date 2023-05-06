package ma.adm.easyeve.dao.facade.history;

import ma.adm.easyeve.zynerator.repository.AbstractHistoryRepository;
import ma.adm.easyeve.bean.history.TelePeayageHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TelePeayageHistoryDao extends AbstractHistoryRepository<TelePeayageHistory,Long> {

}
