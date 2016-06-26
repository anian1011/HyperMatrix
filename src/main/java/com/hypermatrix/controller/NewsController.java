package com.hypermatrix.controller;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.hypermatrix.entity.News;
import com.hypermatrix.service.NewsService;
/**
 *  新闻控制层
 * @author wanqihan 2016年5月28日
 *
 */
@Controller
@RequestMapping(value="news",produces="application/html;charset=UTF-8")
public class NewsController {

	@Autowired
	private NewsService newsService;
	@RequestMapping(method=RequestMethod.POST,value="/queryNews")
	public @ResponseBody String list(){
		Gson gson = new Gson();
		List<News> result = newsService.query();
		return gson.toJson(result.toArray());
	}

}
