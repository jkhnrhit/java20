package com.rhit.java20.biz;

import java.util.List;

import com.rhit.java20.entity.Course;
import com.rhit.java20.entity.PageVo;
import com.rhit.java20.entity.Teacher;

public interface SystemBiz {
public List<Course> findCourse();
public Teacher login(String tno,String pwd);
//public List<Teacher> findTeacher(Teacher t);
public void findTeacher(Teacher t,PageVo pv);
//ºÏ≤‚π§∫≈ «∑Ò¥Ê‘⁄
public boolean isExist(String tno);

}
