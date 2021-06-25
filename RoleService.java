package com.honey.in.service;

import java.util.List;

import javax.management.relation.RoleNotFoundException;

import org.springframework.stereotype.Service;
import com.honey.in.model.Roles;
import com.honey.in.vo.RolesVo;

@Service
public interface RoleService {


	RolesVo roleSave(RolesVo vo);

	RolesVo getRoleId(Long id)throws RoleNotFoundException;
	
	List<RolesVo> getRoleList();
	
    String deleteRole(Long id);

	

	

	

	

}
