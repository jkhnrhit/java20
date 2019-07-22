package com.rhit.java20.dao;

import java.util.Map;

import com.rhit.java20.entity.Teacher;

public class SqlProvider {
	public String findTeacher(Map map) {
		Teacher t=(Teacher)map.get("param1");
		int begin=(Integer)map.get("param2");
		int max=(Integer)map.get("param3");
		// ƴ��sql���
		// System.out.println(t.getTno()+"\t"+t.getTname()+"\t"+t.getTsex()
		// +"\t"+t.getProf()+"\t"+t.getDepart()+"\t"+t.getMinage()+"\t"+t.getMaxage());
		String sql = "select * from teacher where 1=1 ";
		if (t.getTno() != null && !t.getTno().equals(""))// ˵��tno��д
		{
			sql += " and tno='" + t.getTno() + "' ";

		}

		if (t.getTname() != null && !t.getTname().equals("")) {
			sql += " and tname like '%" + t.getTname() + "%' ";

		}
		// �Ա�һ����
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

		// �������� 0:δ��д
		if (t.getMinage() != 0)// ��д
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
		if (t.getTno() != null && !t.getTno().equals(""))// ˵��tno��д
		{
			sql += " and tno='" + t.getTno() + "' ";

		}

		if (t.getTname() != null && !t.getTname().equals("")) {
			sql += " and tname like '%" + t.getTname() + "%' ";

		}
		// �Ա�һ����
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

		// �������� 0:δ��д
		if (t.getMinage() != 0)// ��д
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
