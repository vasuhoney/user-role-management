package com.honey.in.mapper;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import com.honey.in.model.User;
import com.honey.in.vo.UserVo;

@Component
public class UserMapper {
	
	public  User toEntity(UserVo vo) {
		User user=new User();
		BeanUtils.copyProperties(vo, user);
		return user;
		}
	
	
	public  UserVo toDto(User user) {
		UserVo vo=new UserVo();
		BeanUtils.copyProperties(user, vo);
        return vo;
	}
	
	
}
