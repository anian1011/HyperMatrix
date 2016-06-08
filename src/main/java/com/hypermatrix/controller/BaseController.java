package com.hypermatrix.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


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

	
	@RequestMapping("/toIndex")
	public String toIndex(){
		return INDEX;
	}
	@RequestMapping("/toHome")
	public String toHome(){
		return HOME;
	}
	@RequestMapping("/toCaculate")
	public String toCaculate(){
		return CACULATE;
	}
	@RequestMapping("/resource")
	public String toResource(){
		return RESOURCE;
	}
	@RequestMapping("/toAbout")
	public String toAbout(){
		return ABOUT;
	}

}
