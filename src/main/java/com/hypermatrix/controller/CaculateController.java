package com.hypermatrix.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hypermatrix.dto.CaculateDto;
import com.hypermatrix.entity.Function;
import com.hypermatrix.service.CaculateService;
import com.hypermatrix.service.FunctionService;
import com.mathworks.toolbox.javabuilder.web.MWHttpSessionBinder;
import com.mathworks.toolbox.javabuilder.webfigures.WebFigure;

@Controller
@RequestMapping("/")
public class CaculateController {
	public static final String RESULT="result.jsp";
	
	@Autowired
	private FunctionService functionService;
	
	@Autowired
	private CaculateService caculateService;
	
	@RequestMapping("/toParam")
	public String toParam( @RequestParam("fid") Integer fid,Model model){
		Function f = functionService.queryById(fid);
		model.addAttribute("function", f);
		return RESULT;
	}
	@RequestMapping(value="/caculate",method=RequestMethod.POST)
	public String caculate(CaculateDto caculateDto,HttpServletRequest req){
		WebFigure wf = caculateService.caculate(caculateDto);
		req.getSession().setAttribute("wf",wf);
		req.getSession().setAttribute("UserPlotBinder",new MWHttpSessionBinder(wf));
		return RESULT;
	}
}
