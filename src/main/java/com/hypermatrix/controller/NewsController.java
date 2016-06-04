package com.hypermatrix.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hypermatrix.service.FunctionService;
import com.hypermatrix.service.NewsService;
/**
 *  新闻控制层
 * @author wanqihan 2016年5月28日
 *
 */
@Controller
@RequestMapping("/news")
public class NewsController {

	@Autowired
	private NewsService newsService;
	
	public String list(Model model){
		model.addAttribute("newsList",newsService.query());
		
		return "shouye";
	}
}
