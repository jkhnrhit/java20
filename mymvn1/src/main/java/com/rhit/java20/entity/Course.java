package com.rhit.java20.entity;

public class Course {

	
	private String cno;
	private String cname;
	//private String tno;//外键的处理
	private Teacher teacher;
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public String getCno() {
		return cno;
	}
	public void setCno(String cno) {
		this.cno = cno;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
//	public String getTno() {
//		return tno;
//	}
//	public void setTno(String tno) {
//		this.tno = tno;
//	}
}
