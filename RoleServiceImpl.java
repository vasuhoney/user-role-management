package com.honey.in.serviceimpl;

import java.util.List;
import java.util.Optional;
import javax.management.relation.RoleNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.honey.in.model.Roles;
import com.honey.in.repo.RolesRepo;
import com.honey.in.service.RoleService;
import com.honey.in.vo.RolesVo;


@Component
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	private RolesRepo roleRepo;

	@Override
	public RolesVo roleSave(RolesVo vo) {
		return roleRepo.save(vo);
	}

	@Override
	public RolesVo getRoleId(Long id) throws RoleNotFoundException {
		
		Optional<RolesVo> role = roleRepo.findById(id);
		if (role.isPresent()) {
			return role.get();
		} else {
			throw new RoleNotFoundException("role id is not found");
		}
	}

	@Override
	public List<RolesVo> getRoleList() {
		List<RolesVo> roleList = roleRepo.findAll();
		return roleList;
	}

	
	
	@Override
	public String deleteRole(Long id) {
		Optional<RolesVo> role = roleRepo.findById(id);
		if(role.isPresent()) {
			roleRepo.delete(role.get());
			return "user deleted succesfully: "+id;
			
		}
		else {
			throw new RuntimeException("role not found with id: "+id);
		}
	}
}
