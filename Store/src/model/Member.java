package model;

import java.io.Serializable;

public class Member implements Serializable{
	private Integer id;
	private String memberName;
	private String username;
	private String password;
	private String phone;
	private String address;
	private String email;
	
	public Member() {
		super();
	}
	
    public Member(String memberName, String username, String password, String phone, String address, String email) {
		super();
		this.memberName = memberName;
		this.username = username;
		this.password = password;
		this.phone = phone;
		this.address = address;
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
    
    
	
	
	
	
}
