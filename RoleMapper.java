package com.honey.in.mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.honey.in.model.Roles;
import com.honey.in.vo.RolesVo;

@Component
public class RoleMapper {
	
	public  Roles toEntity(RolesVo vo) {
		Roles role=new Roles();
		BeanUtils.copyProperties(vo, role);
		return role;
		}
	
	public RolesVo toDto(Roles role) {
		RolesVo vo=new RolesVo();
		BeanUtils.copyProperties(role, vo);
		return vo;
		
	}
	}
