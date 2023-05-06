package ma.adm.easyeve.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.adm.easyeve.zynerator.repository.AbstractRepository;
import ma.adm.easyeve.bean.core.TypeEquipement;
import org.springframework.stereotype.Repository;
import ma.adm.easyeve.bean.core.TypeEquipement;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;


@Repository
public interface TypeEquipementDao extends AbstractRepository<TypeEquipement,Long>  {
    TypeEquipement findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW TypeEquipement(item.id,item.libelle) FROM TypeEquipement item")
    List<TypeEquipement> findAllOptimized();
    @Query(value = "SELECT MAX(item.ordre) FROM TypeEquipement item where item.etablissementId = :etablissementId")
    Long findMaxOrdreByEtablissementIdOrder(@Param("etablissementId") Long etablissementId);
}
