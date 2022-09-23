package com.empdetails;

public class EmployeeDetails {
	private String logindetail;
	private String logintime;
	private String logouttime;
	private String logoutdetail;
	public EmployeeDetails(String logindetail, String logintime, String logouttime, String logoutdetail) {
		super();
		this.logindetail = logindetail;
		this.logintime = logintime;
		this.logouttime = logouttime;
		this.logoutdetail = logoutdetail;
	}
	public String getLogindetail() {
		return logindetail;
	}
	public void setLogindetail(String logindetail) {
		this.logindetail = logindetail;
	}
	public String getLogintime() {
		return logintime;
	}
	public void setLogintime(String logintime) {
		this.logintime = logintime;
	}
	public String getLogouttime() {
		return logouttime;
	}
	public void setLogouttime(String logouttime) {
		this.logouttime = logouttime;
	}
	public String getLogoutdetail() {
		return logoutdetail;
	}
	public void setLogoutdetail(String logoutdetail) {
		this.logoutdetail = logoutdetail;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [logindetail=" + logindetail + ", logintime=" + logintime + ", logouttime=" + logouttime
				+ ", logoutdetail=" + logoutdetail + "]";
	}
	

}
