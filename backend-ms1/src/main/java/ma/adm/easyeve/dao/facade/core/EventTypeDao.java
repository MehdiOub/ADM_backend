package ma.adm.easyeve.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.adm.easyeve.zynerator.repository.AbstractRepository;
import ma.adm.easyeve.bean.core.EventType;
import org.springframework.stereotype.Repository;
import ma.adm.easyeve.bean.core.EventType;
import java.util.List;


@Repository
public interface EventTypeDao extends AbstractRepository<EventType,Long>  {
    EventType findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW EventType(item.id,item.libelle) FROM EventType item")
    List<EventType> findAllOptimized();
}
