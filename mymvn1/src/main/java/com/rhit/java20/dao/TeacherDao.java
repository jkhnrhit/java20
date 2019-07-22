package com.rhit.java20.dao;

import java.util.List;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import com.rhit.java20.entity.Teacher;

@Repository("teacherDao")
public interface TeacherDao {
	@Select("select * from teacher where tno=#{tno}")
	public Teacher getTeacher(String tno);

	@Select("select * from teacher where tno=#{0} and tpwd=#{1}")
	public List<Teacher> findTeacherByPwd(String tno, String pwd);

	

	// 记录条数
	@SelectProvider(type = SqlProvider.class, method = "findCount")
	public int count(Teacher t);

	// 分页查询
	@SelectProvider(type = SqlProvider.class, method = "findTeacher")
	@ResultMap("com.rhit.java20.dao.TeacherMap")
	public List<Teacher> findTeacherByPage(Teacher t,int begin, int max);



}
