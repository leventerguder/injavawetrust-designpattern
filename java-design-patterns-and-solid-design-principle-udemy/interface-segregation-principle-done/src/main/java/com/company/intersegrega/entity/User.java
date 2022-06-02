package com.company.intersegrega.entity;

import java.time.LocalDateTime;

public class User extends Entity{
	
	private String name;
	
	private LocalDateTime lastLogin;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(LocalDateTime lastLogin) {
		this.lastLogin = lastLogin;
	}
	
}
