package com.rhit.java20.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.rhit.java20.biz.SystemBiz;
import com.rhit.java20.dao.CourseDao;
import com.rhit.java20.dao.TeacherDao;
import com.rhit.java20.entity.Course;
import com.rhit.java20.entity.PageVo;
import com.rhit.java20.entity.Teacher;

@Service("biz")
public class SystemBizImpl implements SystemBiz {
	@Autowired
	@Qualifier("courseDao")
	private CourseDao courseDao;
	@Autowired
	@Qualifier("teacherDao")
	private TeacherDao teacherDao;

	public TeacherDao getTeacherDao() {
		return teacherDao;
	}

	public void setTeacherDao(TeacherDao teacherDao) {
		this.teacherDao = teacherDao;
	}

	public CourseDao getCourseDao() {
		return courseDao;
	}

	public void setCourseDao(CourseDao courseDao) {
		this.courseDao = courseDao;
	}

	

	public List<Course> findCourse() {

		return courseDao.showCourse();
	}


	
	public Teacher login(String tno, String pwd) {

		List<Teacher> list = teacherDao.findTeacherByPwd(tno, pwd);
		if (list != null && list.size() > 0) {
			return list.get(0);

		}
		return null;
	}

	// @Override
	// public List<Teacher> findTeacher(Teacher t) {
	//
	// return teacherDao.findTeacher(t);
	// }

	
	
	public void findTeacher(Teacher t, PageVo pv) {

		int count = teacherDao.count(t);
		int begin = (pv.getPno() - 1) * pv.getPerPage();
		int max = pv.getPerPage();
		List list = teacherDao.findTeacherByPage(t, begin, max);
		pv.setCount(count);
		pv.setList(list);

	}

	
	
	public boolean isExist(String tno) {
		Teacher t = teacherDao.getTeacher(tno);
		if (t != null) {
			return true;

		}
		return false;
	}

}
