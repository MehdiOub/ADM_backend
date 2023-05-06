package ma.adm.easyeve.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.adm.easyeve.zynerator.repository.AbstractRepository;
import ma.adm.easyeve.bean.core.Anomalie;
import org.springframework.stereotype.Repository;
import ma.adm.easyeve.bean.core.Anomalie;
import java.util.List;


@Repository
public interface AnomalieDao extends AbstractRepository<Anomalie,Long>  {
    Anomalie findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW Anomalie(item.id,item.libelle) FROM Anomalie item")
    List<Anomalie> findAllOptimized();
}
