package ma.adm.easyeve.dao.facade.core;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ma.adm.easyeve.zynerator.repository.AbstractRepository;
import ma.adm.easyeve.bean.core.Voie;
import org.springframework.stereotype.Repository;
import ma.adm.easyeve.bean.core.Voie;
import java.util.List;


@Repository
public interface VoieDao extends AbstractRepository<Voie,Long> , JpaRepository<Voie,Long> {
    Voie findByLibelleAndStationLibelle(String codeVoie, String libelle);
    Voie findByCode(String code);
    int deleteByCode(String code);

    List<Voie> findByTypeVoieId(Long id);
    int deleteByTypeVoieId(Long id);
    List<Voie> findByTelePeayageId(Long id);
    int deleteByTelePeayageId(Long id);
    List<Voie> findByStationId(Long id);
    int deleteByStationId(Long id);

    @Query("SELECT NEW Voie(item.id,item.libelle) FROM Voie item")
    List<Voie> findAllOptimized();
}
