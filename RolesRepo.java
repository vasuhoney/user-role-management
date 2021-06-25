package com.honey.in.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.honey.in.vo.RolesVo;

@Repository
public interface RolesRepo extends JpaRepository<RolesVo, Long> {
	
	
}
