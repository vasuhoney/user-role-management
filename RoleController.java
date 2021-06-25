package com.honey.in.controller;

import java.util.List;
import javax.management.relation.RoleNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.honey.in.model.Roles;
import com.honey.in.service.RoleService;
import com.honey.in.vo.RolesVo;


@RestController
@RequestMapping("/role")
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	@PostMapping("/saveRole")
	public RolesVo saveRole(@RequestBody RolesVo vo) {
		return roleService.roleSave(vo);
		
	}
	
	@GetMapping("/getRoleId")
	public RolesVo getRole(@RequestParam("id") Long id) throws RoleNotFoundException{
		return roleService.getRoleId(id);
	}

	@GetMapping("/getAllRoles")
	public List<RolesVo> getAllRoles() {
		return roleService.getRoleList();

	}
	@PutMapping("/updateRole")
	public RolesVo updateRole(@RequestBody RolesVo vo) {
		return roleService.roleSave(vo);
	}
		
	@DeleteMapping("/deleteRole")
	public String deleteRole(@RequestParam Long id) {
		return roleService.deleteRole(id);
		
		
	}
	
	

}
