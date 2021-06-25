package com.honey.in.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="role")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Roles implements Serializable {
	
	/**
	 * @author sravanthi
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "role_name")
	private String roleName;
	@Column(name = "role_description")
	private String roleDescription;
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "roles")
	private List<User> users=new ArrayList<>();
	
	

	

}
