package com.honey.in.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.honey.in.exceptions.DuplicateRecordException;
import com.honey.in.exceptions.UsernotFoundException;
import com.honey.in.model.User;
import com.honey.in.vo.UserVo;

@Service
public interface UserService {

	UserVo userSave(UserVo vo) throws DuplicateRecordException;

	UserVo getUserId(Long id) throws UsernotFoundException;

	List<UserVo> getuserList();

	String deleteUser(long id);

	UserVo updateUser(UserVo vo);

	

	

}
