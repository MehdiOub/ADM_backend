package ma.adm.easyeve.service.impl.admin;

import ma.adm.easyeve.bean.core.MessageType;
import ma.adm.easyeve.bean.history.MessageTypeHistory;
import ma.adm.easyeve.dao.criteria.core.MessageTypeCriteria;
import ma.adm.easyeve.dao.criteria.history.MessageTypeHistoryCriteria;
import ma.adm.easyeve.dao.facade.core.MessageTypeDao;
import ma.adm.easyeve.dao.facade.history.MessageTypeHistoryDao;
import ma.adm.easyeve.dao.specification.core.MessageTypeSpecification;
import ma.adm.easyeve.service.facade.admin.MessageTypeAdminService;
import ma.adm.easyeve.zynerator.service.AbstractServiceImpl;
import ma.adm.easyeve.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class MessageTypeAdminServiceImpl extends AbstractServiceImpl<MessageType,MessageTypeHistory, MessageTypeCriteria, MessageTypeHistoryCriteria, MessageTypeDao,
MessageTypeHistoryDao> implements MessageTypeAdminService {


    public MessageType findByReferenceEntity(MessageType t){
        return  dao.findByCode(t.getCode());
    }


    public void configure() {
        super.configure(MessageType.class,MessageTypeHistory.class, MessageTypeHistoryCriteria.class, MessageTypeSpecification.class);
    }

    @Override
    public MessageType findByLibelle(String libMessageType) {
        return dao.findByLibelle(libMessageType);
    }

    public MessageTypeAdminServiceImpl(MessageTypeDao dao, MessageTypeHistoryDao historyDao) {
        super(dao, historyDao);
    }

}