package ma.adm.easyeve.dao.facade.core;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ma.adm.easyeve.zynerator.repository.AbstractRepository;
import ma.adm.easyeve.bean.core.MessageType;
import org.springframework.stereotype.Repository;
import ma.adm.easyeve.bean.core.MessageType;
import java.util.List;


@Repository
public interface MessageTypeDao extends AbstractRepository<MessageType,Long>, JpaRepository<MessageType,Long> {
    MessageType findByCode(String code);
    int deleteByCode(String code);


    @Query("SELECT NEW MessageType(item.id,item.libelle) FROM MessageType item")
    List<MessageType> findAllOptimized();

    MessageType findByLibelle(String libMessageType) ;
}
