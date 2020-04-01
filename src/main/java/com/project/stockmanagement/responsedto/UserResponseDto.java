package com.project.stockmanagement.responsedto;

/**
 * @author Sweta DTO for users
 *
 */
public class UserResponseDto {
	
	private Long id;

	private String email;

	private String role;

	private String userName;

	private String firstName;

	private String lastName;

	private boolean active;

	
	public UserResponseDto(Long id2, String email2, String firstName2, String lastName2, String userName2, String role2, boolean b) {
		this.id=id2;
		this.email=email2;
		this.role=role2;
		this.firstName=firstName2;
		this.lastName=lastName2;
		this.userName=userName2;
		this.active=b;
		
	}

	public UserResponseDto() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
