package com.rhit.java20.dao;

import java.util.Map;

import com.rhit.java20.entity.Teacher;

public class SqlProvider {
	public String findTeacher(Map map) {
		Teacher t=(Teacher)map.get("param1");
		int begin=(Integer)map.get("param2");
		int max=(Integer)map.get("param3");
		// 拼凑sql语句
		// System.out.println(t.getTno()+"\t"+t.getTname()+"\t"+t.getTsex()
		// +"\t"+t.getProf()+"\t"+t.getDepart()+"\t"+t.getMinage()+"\t"+t.getMaxage());
		String sql = "select * from teacher where 1=1 ";
		if (t.getTno() != null && !t.getTno().equals(""))// 说明tno填写
		{
			sql += " and tno='" + t.getTno() + "' ";

		}

		if (t.getTname() != null && !t.getTname().equals("")) {
			sql += " and tname like '%" + t.getTname() + "%' ";

		}
		// 性别一定有
		if(t.getTsex()!=null)
		{
			sql += " and tsex ='" + t.getTsex() + "' ";
			
		}
		
		if (t.getProf() != null && !t.getProf().equals("")) {
			sql += " and prof ='" + t.getProf() + "' ";

		}
		if (t.getDepart() != null && !t.getDepart().equals("")) {
			sql += " and depart ='" + t.getDepart() + "' ";

		}

		// 处理年龄 0:未填写
		if (t.getMinage() != 0)// 填写
		{
			sql += " and timestampdiff(year,tbirthday,now()) >="
					+ t.getMinage();

		}
		if (t.getMaxage() != 0) {
			sql += " and timestampdiff(year,tbirthday,now()) <="
					+ t.getMaxage();

		}

		sql+=" limit "+begin+","+max;
		return sql;
	}
	
	public String findCount(Teacher t)
	{
		String sql = "select count(*) from teacher where 1=1 ";
		if (t.getTno() != null && !t.getTno().equals(""))// 说明tno填写
		{
			sql += " and tno='" + t.getTno() + "' ";

		}

		if (t.getTname() != null && !t.getTname().equals("")) {
			sql += " and tname like '%" + t.getTname() + "%' ";

		}
		// 性别一定有
		if(t.getTsex()!=null)
		{
			sql += " and tsex ='" + t.getTsex() + "' ";
			
		}
		
		
		
		
		if (t.getProf() != null && !t.getProf().equals("")) {
			sql += " and prof ='" + t.getProf() + "' ";

		}
		if (t.getDepart() != null && !t.getDepart().equals("")) {
			sql += " and depart ='" + t.getDepart() + "' ";

		}

		// 处理年龄 0:未填写
		if (t.getMinage() != 0)// 填写
		{
			sql += " and timestampdiff(year,tbirthday,now()) >="
					+ t.getMinage();

		}
		if (t.getMaxage() != 0) {
			sql += " and timestampdiff(year,tbirthday,now()) <="
					+ t.getMaxage();

		}

		return sql;
	}
	
}
