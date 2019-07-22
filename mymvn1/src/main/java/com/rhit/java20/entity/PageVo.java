package com.rhit.java20.entity;

import java.util.List;

public class PageVo {
	private int pno;
	private int maxPage;
	private int perPage=2;
	private int count;
	private List list;

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public int getMaxPage() {
		return count % perPage == 0 ? count / perPage : count / perPage + 1;
	}

	
	public int getPerPage() {
		return perPage;
	}

	public void setPerPage(int perPage) {
		this.perPage = perPage;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}
}
