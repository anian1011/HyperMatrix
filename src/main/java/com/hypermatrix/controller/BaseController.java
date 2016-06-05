package com.hypermatrix.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 基本页面控制
 * @author wanqihan 2016年6月1日
 *
 */
@Controller
@RequestMapping(value="/",produces="application/html;charset=UTF-8")
public class BaseController {
	public static final String INDEX="index.html";
	public static final String HOME="home.html";
	public static final String CACULATE="caculate.html";
	public static final String RESOURCE="resource.html";
	public static final String ABOUT="about.html";
	public static final String RESULT="result.jsp";
	@RequestMapping("/index")
	public String toIndex(){
		return INDEX;
	}
	@RequestMapping("/home")
	public String toHome(){
		return HOME;
	}
	@RequestMapping("/caculate")
	public String toCaculate(){
		return CACULATE;
	}
	@RequestMapping("/resource")
	public String toResource(){
		return RESOURCE;
	}
	@RequestMapping("/about")
	public String toAbout(){
		return ABOUT;
	}
	@RequestMapping("/result")
	public String toResult(){
		return "result.jsp";
	}
}
