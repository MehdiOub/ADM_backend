package ma.adm.easyeve.service.facade.admin;

import java.util.List;
import ma.adm.easyeve.bean.core.TypeVoie;
import ma.adm.easyeve.dao.criteria.core.TypeVoieCriteria;
import ma.adm.easyeve.dao.criteria.history.TypeVoieHistoryCriteria;
import ma.adm.easyeve.zynerator.service.IService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeVoieAdminService extends  IService<TypeVoie,TypeVoieCriteria, TypeVoieHistoryCriteria> {
  TypeVoie findByLibelle(String libTypeVoie) ;


}
