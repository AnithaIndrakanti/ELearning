package com.training.bean;

public class LoginBean {
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String userName1;
	private String password1;

	public LoginBean() {
	}

	public LoginBean(String userName, String password, String firstName, String lastName, String email,
			String phone, String userName1, String password1) {
		super();
		this.userName = userName;
		this.password = password;
		this.firstName= firstName;
		this.lastName=lastName;
		this.email = email;
		this.phone = phone;
		this.userName1 = userName1;
		this.password1 = password1;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getfirstName() {
		return firstName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getlastName() {
		return lastName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getUserName1() {
		return userName1;
	}

	public void setUserName1(String userName1) {
		this.userName1 = userName1;
	}
	
	public String getPassword1() {
		return password1;
	}

	public void setPassword1(String password1) {
		this.password1 = password1;
	}
	@Override
	public String toString() {
		return "LoginBean [userName=" + userName + ", password=" + password + ",firstName=" + firstName + ", lastName = "
				+ ""+ lastName +", email= "+ email +", phone = "+ phone +",userName1 = "+ userName1 +", password1 = "+ password1 +"]";
	}

}
