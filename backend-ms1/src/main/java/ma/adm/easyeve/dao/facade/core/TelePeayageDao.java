package ma.adm.easyeve.dao.facade.core;

import org.springframework.data.jpa.repository.Query;
import ma.adm.easyeve.zynerator.repository.AbstractRepository;
import ma.adm.easyeve.bean.core.TelePeayage;
import org.springframework.stereotype.Repository;
import ma.adm.easyeve.bean.core.TelePeayage;
import java.util.List;


@Repository
public interface TelePeayageDao extends AbstractRepository<TelePeayage,Long>  {
    TelePeayage findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW TelePeayage(item.id,item.libelle) FROM TelePeayage item")
    List<TelePeayage> findAllOptimized();
}
