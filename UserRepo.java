package com.honey.in.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.honey.in.model.User;
import com.honey.in.vo.UserVo;

@Repository
public interface UserRepo extends JpaRepository<UserVo,Long> {

	boolean existsByMobile(String mobile);

	User save(User user);


}
