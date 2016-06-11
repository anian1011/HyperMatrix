package com.hypermatrix.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hypermatrix.dto.CaculateDto;
import com.hypermatrix.entity.Function;
import com.hypermatrix.exception.CaculateException;
import com.hypermatrix.service.CaculateService;
import com.hypermatrix.service.FunctionService;
import com.mathworks.toolbox.javabuilder.web.MWHttpSessionBinder;
import com.mathworks.toolbox.javabuilder.webfigures.WebFigure;

/**
 * 核心功能控制器
 * @author wanqihan 2016年6月10日
 *
 */
@Controller
@RequestMapping("/")
public class CaculateController {
	public static final String RESULT="result.jsp";
	
	@Autowired
	private FunctionService functionService;
	
	@Autowired
	private CaculateService caculateService;
	
	@RequestMapping("/toParam")
	public String toParam( @RequestParam("fid") Integer fid,HttpServletRequest req){
		Function f = functionService.queryById(fid);
		req.setAttribute("function", f);
		req.getSession().invalidate();
		return RESULT;
	}
	@RequestMapping(value="/caculate",method=RequestMethod.POST)
	public String caculate(CaculateDto caculateDto,HttpServletRequest req){
		WebFigure wf;
		HttpSession session = req.getSession();
		try {
			wf = caculateService.caculate(caculateDto);
			session.setAttribute("wf",wf);
			session.setAttribute("UserPlotBinder",new MWHttpSessionBinder(wf));
		} catch (CaculateException e) {
			req.setAttribute("msg",e.getMessage());
		}
		req.setAttribute("function", functionService.queryById(caculateDto.getFid()));
		req.setAttribute("currentParam",caculateDto.getParams());
		return RESULT;
	}
}
