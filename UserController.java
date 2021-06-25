package com.honey.in.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.honey.in.exceptions.DuplicateRecordException;
import com.honey.in.exceptions.UsernotFoundException;
import com.honey.in.model.User;
import com.honey.in.service.UserService;
import com.honey.in.vo.UserVo;


@RestController
@RequestMapping("/user")
public class UserController {
	
	private Logger log=LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;

	@PostMapping("/saveUser")
	public ResponseEntity<UserVo> saveUser(@RequestBody UserVo vo) throws DuplicateRecordException {
		log.info("Received Request to add new user: " + vo);
	    return ResponseEntity.ok(userService.userSave(vo));

	}

	@GetMapping("/getUser")
	public ResponseEntity<UserVo> getUser(@RequestParam("id") Long id) throws UsernotFoundException {
		log.info("Received Request to get user: " + id);
		return ResponseEntity.ok(userService.getUserId(id));

	}

	@GetMapping("/getAllUsers")
	public List<UserVo> getAllUsers() {
		return userService.getuserList();

	}
	@PutMapping("/updateUser")
	public UserVo updateUser(@RequestBody UserVo vo) throws DuplicateRecordException {
		return userService.userSave(vo);
	}
		
	@DeleteMapping("/deleteUser")
	public String deleteUser(@RequestParam long id) {
		return userService.deleteUser(id);
		
		
	}
		
		
		
	

}
