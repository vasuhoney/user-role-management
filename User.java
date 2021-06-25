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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
	
	/**
	 * @author sravanthi
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;
	@Column(name = "user_name")
	private String userName;
	@Column(name = "mobile")
	private String mobile;
	@Column(name = "email")
	private String email;
	@Column(name = "allowed_ips")
	private String allowedIps;
	@Column(name = "status")
	private boolean status;
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinTable(
	  name = "user_roles", 
	  joinColumns = @JoinColumn(name = "user_id"),
	   inverseJoinColumns = @JoinColumn(name = "role_id"))	
	  private List<Roles> roles=new ArrayList<>();;

	
}
