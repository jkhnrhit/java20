package com.rhit.java20.dao;

import java.util.List;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.rhit.java20.entity.Course;

@Repository("courseDao")
public interface CourseDao {
	
	@Select(value = "select * from course")
	@ResultMap("com.rhit.java20.dao.CourseMap1")
	public List<Course> showCourse();
}
