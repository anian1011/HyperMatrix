package com.hypermatrix.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


/**
 * 基本页面控制
 * @author wanqihan 2016年6月1日
 *
 */
@Controller
@RequestMapping(value="/",produces="application/html;charset=UTF-8")
public class BaseController {
	public static final String INDEX="WEB-INF/index.html";
	public static final String HOME="WEB-INF/home.html";
	public static final String CACULATE="WEB-INF/caculate.html";
	public static final String RESOURCE="WEB-INF/resource.html";
	public static final String ABOUT="WEB-INF/about.html";
	public static final String ADMIN="admin/index.html";

	
	@RequestMapping("/toIndex")
	public String toIndex(HttpServletRequest req){
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
	@RequestMapping("/toResource")
	public String toResource(){
		return RESOURCE;
	}
	@RequestMapping("/toAbout")
	public String toAbout(){
		return ABOUT;
	}
	@RequestMapping("/toAdmin")
	public String toAdmin(){
		return ADMIN;
	}

}
