package com.honey.in.serviceimpl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.honey.in.exceptions.DuplicateRecordException;
import com.honey.in.exceptions.UsernotFoundException;
import com.honey.in.mapper.UserMapper;
import com.honey.in.model.User;
import com.honey.in.repo.UserRepo;
import com.honey.in.service.UserService;
import com.honey.in.vo.UserVo;

@Component
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private UserMapper userMapper;

	@Override
	public UserVo userSave(UserVo vo) throws DuplicateRecordException {
		if (userRepo.existsByMobile(vo.getMobile())) {
			throw new DuplicateRecordException("User Already Exists with Mobile: " + vo.getMobile());
		}
		User user=userMapper.toEntity(vo);
		  return userMapper.toDto(userRepo.save(user));
		
			}

	@Override
	public UserVo getUserId(Long id) throws UsernotFoundException {
		Optional<UserVo> user = userRepo.findById(id);
		if (user.isPresent()) {
			return user.get();
		} else {
			throw new UsernotFoundException("user id is not present");
		}
	}

	@Override
	public List<UserVo> getuserList() {
		List<UserVo> userList = userRepo.findAll();
		return userList;
	}


	@Override
	public UserVo updateUser(UserVo vo) {
		
		return userRepo.save(vo);
	}

	@Override
	public String deleteUser(long id) {
		Optional<UserVo> user = userRepo.findById(id);
		if(user.isPresent()) {
			userRepo.delete(user.get());
			return "user deleted succesfully: "+id;
			
		}
		else {
			throw new RuntimeException("user not found with id: "+id);
		}
			
	
		
			}

	
	

}
