package ma.adm.easyeve.dao.facade.history;

import ma.adm.easyeve.zynerator.repository.AbstractHistoryRepository;
import ma.adm.easyeve.bean.history.TypeEquipementHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeEquipementHistoryDao extends AbstractHistoryRepository<TypeEquipementHistory,Long> {

}
