package com.hypermatrix.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.hypermatrix.entity.Function;
import com.hypermatrix.service.FunctionService;
@Controller
@RequestMapping("/function")
public class FunctionController {
	@Autowired
	FunctionService functionService;
	@RequestMapping(method=RequestMethod.POST,value="/list")
	public @ResponseBody String listByCategory( @RequestParam("category") String category){
		List<Function> result = functionService.listByCategory(category);
		Gson gson = new Gson();
		return gson.toJson(result.toArray());
	}
}
