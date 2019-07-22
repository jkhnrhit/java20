package com.rhit.java20.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.rhit.java20.biz.SystemBiz;
import com.rhit.java20.entity.Course;

@Controller
@RequestMapping("course.htm")
public class CourseController {
	@Autowired
	@Qualifier("biz")
	private SystemBiz biz;

	public SystemBiz getBiz() {
		return biz;
	}

	public void setBiz(SystemBiz biz) {
		this.biz = biz;
	}

	@RequestMapping(params = "op=list")
	public ModelAndView list(HttpServletRequest request,
			HttpServletResponse response) {
		List<Course> list = biz.findCourse();
		System.out.println(list);
		return null;
	}
}
