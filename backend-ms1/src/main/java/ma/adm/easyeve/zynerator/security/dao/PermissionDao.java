package ma.adm.easyeve.zynerator.security.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ma.adm.easyeve.zynerator.security.bean.Permission;

public interface PermissionDao extends JpaRepository<Permission, Long> {
    public Permission findByName(String name);
}
