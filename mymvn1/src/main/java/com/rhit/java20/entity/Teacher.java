package com.rhit.java20.entity;

import java.util.Date;
import java.util.List;

public class Teacher {

	
	private int minage;
	private int maxage;
	
	public int getMinage() {
		return minage;
	}
	public void setMinage(int minage) {
		this.minage = minage;
	}
	public int getMaxage() {
		return maxage;
	}
	public void setMaxage(int maxage) {
		this.maxage = maxage;
	}
	private String tno;
	private String tname;
	private String tsex;
	private Date tbirthday;
	private String prof;
	private String depart;
	private String tpwd;
	public String getTpwd() {
		return tpwd;
	}
	public void setTpwd(String tpwd) {
		this.tpwd = tpwd;
	}
	//一对多  课程集合
	private List<Course> clist;
	
	
	
	public List<Course> getClist() {
		return clist;
	}
	public void setClist(List<Course> clist) {
		this.clist = clist;
	}
	public String getTno() {
		return tno;
	}
	public void setTno(String tno) {
		this.tno = tno;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTsex() {
		return tsex;
	}
	public void setTsex(String tsex) {
		this.tsex = tsex;
	}
	public Date getTbirthday() {
		return tbirthday;
	}
	public void setTbirthday(Date tbirthday) {
		this.tbirthday = tbirthday;
	}
	public String getProf() {
		return prof;
	}
	public void setProf(String prof) {
		this.prof = prof;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
}
