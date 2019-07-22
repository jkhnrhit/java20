package com.rhit.java20.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rhit.java20.entity.TestBean;

@Controller
@RequestMapping(value = "test.htm")
public class TestController {
	@RequestMapping(params = "op=test")
	public void test(HttpServletRequest request, HttpServletResponse response,
			TestBean test) {
		System.out.println(test.getHeight() + "\t" + test.getBirthday());

	}

}
