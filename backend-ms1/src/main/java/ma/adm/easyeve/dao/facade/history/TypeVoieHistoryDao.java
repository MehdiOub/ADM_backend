package ma.adm.easyeve.dao.facade.history;

import ma.adm.easyeve.zynerator.repository.AbstractHistoryRepository;
import ma.adm.easyeve.bean.history.TypeVoieHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeVoieHistoryDao extends AbstractHistoryRepository<TypeVoieHistory,Long> {

}
