package com.honey.in.vo;

import java.io.Serializable;
import java.util.List;
import com.honey.in.model.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RolesVo implements Serializable {
	
	/**
	 * @author sravanthi
	 */
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String roleName;
	private String roleDescription;
	private List<User> users;
	
}
