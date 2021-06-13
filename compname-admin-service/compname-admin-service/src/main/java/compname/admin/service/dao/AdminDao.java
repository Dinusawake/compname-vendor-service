package compname.admin.service.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import compname.admin.service.entity.AdminEntity;

public interface AdminDao extends JpaRepository<AdminEntity, Integer> {


}
