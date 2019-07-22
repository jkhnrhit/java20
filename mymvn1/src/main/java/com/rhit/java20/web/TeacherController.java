package com.rhit.java20.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.rhit.java20.biz.SystemBiz;
import com.rhit.java20.entity.Course;
import com.rhit.java20.entity.PageVo;
import com.rhit.java20.entity.Teacher;

@Controller
@RequestMapping("teacher.htm")
public class TeacherController {
	@Autowired
	private SystemBiz biz;

	public SystemBiz getBiz() {
		return biz;
	}

	public void setBiz(SystemBiz biz) {
		this.biz = biz;
	}

	@RequestMapping(params = "op=login")
	public ModelAndView login(HttpServletRequest request,
			HttpServletResponse response) {

		Teacher t = biz.login("111", "111");
		System.out.println(t);
		return null;
	}

	@RequestMapping(params = "op=find")
	public String find(HttpServletRequest request,
			HttpServletResponse response, Teacher t) {

		String pno = request.getParameter("pno");

		PageVo pv = new PageVo();
		pv.setPno(Integer.parseInt(pno));
		biz.findTeacher(t, pv);
		request.setAttribute("pv", pv);

		// List<Teacher> list = biz.findTeacher(t);
		request.setAttribute("t", t);
		// request.setAttribute("list", list);
		return "index.jsp";
	}

	@RequestMapping(params = "op=checkTeacher")
	public String checkTeacher(HttpServletRequest request,
			HttpServletResponse response) {
		String tno = request.getParameter("tno");
		boolean r = biz.isExist(tno);
		try {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();

			out.print(r);
			out.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@RequestMapping(params = "op=jl")
	public String jl(HttpServletRequest request, HttpServletResponse response) {
		// List<Course> list= biz.findCourse();
		// 数据查询
		try {
			response.setContentType("text/html; charset=UTF-8");
			PrintWriter out = response.getWriter();
	List<Course> list=	biz.findCourse();
			//转json字符串
		   String r=	JSON.toJSONString(list);
		out.print(r);
		System.out.println(r);
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
}
