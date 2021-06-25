package com.honey.in.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.honey.in.model.Roles;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserVo implements Serializable {
	
	/**
	 * @author sravanthi
	 */
	private static final long serialVersionUID = 1L;
	
	private Long userId;
	private String userName;
	private String mobile;
	private String email;
	private String allowedIps;
	private boolean status;	
	private List<Roles> roles=new ArrayList<>();;

	

}
