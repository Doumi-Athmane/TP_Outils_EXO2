package com.telly.dao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name="users")
public class User implements Serializable {
	

	private static final long serialVersionUID = 5362437768854142524L;


	@Id
	@Column(name="username")
	private String username;
	
	@NotBlank()
	@Size(min=8, max=15, groups={FormValidationGroup.class})
	private String password;

	private String email;
	
	private boolean enabled = false;
	private String authority;
	
	
	public User() {
		
	}
	

	public User(String username, String password, String email, boolean enabled, String authority) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.enabled = enabled;
		this.authority = authority;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}


	public void setAuthority(String authority) {
		this.authority = authority;
	}
}
