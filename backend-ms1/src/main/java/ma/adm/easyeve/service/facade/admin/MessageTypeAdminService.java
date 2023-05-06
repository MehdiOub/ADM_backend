package ma.adm.easyeve.service.facade.admin;

import java.util.List;
import ma.adm.easyeve.bean.core.MessageType;
import ma.adm.easyeve.dao.criteria.core.MessageTypeCriteria;
import ma.adm.easyeve.dao.criteria.history.MessageTypeHistoryCriteria;
import ma.adm.easyeve.zynerator.service.IService;

public interface MessageTypeAdminService extends  IService<MessageType,MessageTypeCriteria, MessageTypeHistoryCriteria>  {


    MessageType findByLibelle(String libMessageType);
}
