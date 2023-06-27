package com.vade.application.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long userid;
	String userName;
	String userEmail;
	String userPassword;
	String userrole;
	String usermobile;
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserrole() {
		return userrole;
	}
	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}
	public String getUsermobile() {
		return usermobile;
	}
	public void setUsermobile(String usermobile) {
		this.usermobile = usermobile;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", userName=" + userName + ", userEmail=" + userEmail + ", userPassword="
				+ userPassword + ", userrole=" + userrole + ", usermobile=" + usermobile + "]";
	}
	public Users(long userid, String userName, String userEmail, String userPassword, String userrole,
			String usermobile) {
		super();
		this.userid = userid;
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userrole = userrole;
		this.usermobile = usermobile;
	}
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
