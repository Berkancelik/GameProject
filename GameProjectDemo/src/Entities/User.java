package Entities;

import java.sql.Date;

import Abstract.EntitiyService;

public class User implements EntitiyService {
	
	private int userId;
	private String userName;
	private String userLastName;
	private int userBirthday;
	private long nationalityId;
	
	public User(int i, String userName, String userLastName, int date, long nationalityId) {
		super();
		this.userId = i;
		this.userName = userName;
		this.userLastName = userLastName;
		this.userBirthday = date;
		this.nationalityId = nationalityId;
	}
	
	public User() {
		
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public int getUserBirthday() {
		return userBirthday;
	}

	public void setUserBirthday(int userBirthday) {
		this.userBirthday = userBirthday;
	}

	public long getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(long nationalityId) {
		this.nationalityId = nationalityId;
	}
	
	


}
