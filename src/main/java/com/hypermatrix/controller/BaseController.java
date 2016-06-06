package com.hypermatrix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hypermatrix.entity.Function;
import com.hypermatrix.service.FunctionService;

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
	
	@Autowired
	private FunctionService functionService;
	
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
	@RequestMapping("/toParam")
	public String toParam( @RequestParam("fid") Integer fid,Model model){
		Function f = functionService.queryById(fid);
		model.addAttribute("function", f);
		model.addAttribute("param", f.getParams().split(","));
		return RESULT;
	}
}
