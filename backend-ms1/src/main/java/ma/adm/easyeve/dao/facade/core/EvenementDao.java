package ma.adm.easyeve.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.adm.easyeve.zynerator.repository.AbstractRepository;
import ma.adm.easyeve.bean.core.Evenement;
import org.springframework.stereotype.Repository;
import ma.adm.easyeve.bean.core.Evenement;
import java.util.List;


@Repository
public interface EvenementDao extends AbstractRepository<Evenement,Long>  {
    Evenement findByCode(String code);
    int deleteByCode(String code);

    List<Evenement> findByVoieId(Long id);
    int deleteByVoieId(Long id);
    List<Evenement> findByMessageTypeId(Long id);
    int deleteByMessageTypeId(Long id);
    List<Evenement> findByTelePeayageId(Long id);
    int deleteByTelePeayageId(Long id);
    List<Evenement> findByTypeEquipementId(Long id);
    int deleteByTypeEquipementId(Long id);
    List<Evenement> findByEventTypeId(Long id);
    int deleteByEventTypeId(Long id);
    List<Evenement> findByStationId(Long id);
    int deleteByStationId(Long id);
    List<Evenement> findByAnomalieId(Long id);
    int deleteByAnomalieId(Long id);

    @Query("SELECT NEW Evenement(item.id,item.code) FROM Evenement item")
    List<Evenement> findAllOptimized();
}
