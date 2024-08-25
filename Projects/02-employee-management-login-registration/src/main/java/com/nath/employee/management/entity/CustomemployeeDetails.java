package com.nath.employee.management.entity;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


public class CustomemployeeDetails implements UserDetails {

	private Employee theEmployee;

	public CustomemployeeDetails(Employee theEmployee) {
		this.theEmployee = theEmployee;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	@Override
	public String getPassword() {
		return theEmployee.getPassword();
	}

	@Override
	public String getUsername() {
		return theEmployee.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
	
	public String getFullName() {
		return theEmployee.getFirstName() + " " + theEmployee.getLastName();
	}

}
