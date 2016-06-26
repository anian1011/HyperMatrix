package com.hypermatrix.controller;

import com.hypermatrix.constant.Constant;
import com.hypermatrix.constant.EnumConstants;
import com.hypermatrix.dto.FunctionDto;
import com.hypermatrix.dto.MessageDto;
import com.hypermatrix.entity.Function;
import com.hypermatrix.entity.News;
import com.hypermatrix.service.FileService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import com.hypermatrix.service.FunctionService;
import com.hypermatrix.service.NewsService;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
@RequestMapping("/admin")
public class AdminController extends ExceptionHandlerController{
	public static final String HOME="home.html";
	public static final String MSG="message.jsp";
	public static final String NEWS_LIST="news_list.jsp";
	public static final String NEWS_ADD="news_add.jsp";
	public static final String NEWS_EDIT="news_edit.jsp";
	public static final String FUNCTION_LIST="function_list.jsp";
	public static final String FUNCTION_ADD="function_add.jsp";
	public static final String FUNCTION_EDIT="function_edit.jsp";
	public static final String PIC_LIST="pic_list.jsp";
	public static final String RESOURCE_LIST="resource_list.jsp";
	public static final String RESOURCE_ADD="resource_add.jsp";
	public static final String MEMBER_LIST="member_list.jsp";
	public static final String MEMBER_ADD="member_add.jsp";
	public static final String MEMBER_EDIT="member_edit.jsp";

	Logger logger = Logger.getLogger(AdminController.class);

	@Autowired
	private FileService fileService;

	@Autowired
	private NewsService newsService;
	
	@Autowired
	private FunctionService functionService;

	@RequestMapping("/toHome")
	public String toHome(){
		return HOME;
	}
	@RequestMapping("/login")
	public String login(String username,String password,HttpServletRequest req){
		if(username.equals("hypermatrix") && password.equals("316")){
			req.getSession().setAttribute("isLogin",true);
			req.setAttribute("msg",new MessageDto("#","成功"));
		}else{
			req.setAttribute("msg",new MessageDto(EnumConstants.ReturnState.HOME.getUrl(),"用户名密码错误"));
		}
		return MSG;
	}
	@RequestMapping("/toNewsList")
	public String toNewsList(Model model){
		model.addAttribute("newsList",newsService.query());
		return NEWS_LIST;
	}
	@RequestMapping("/toNewsAdd")
	public String toNewsAdd(){ return NEWS_ADD; }
	@RequestMapping("/toNewsEdit")
	public String toNewsEdit(News news, Model model){
		model.addAttribute("news",newsService.queryById(news.getNid()));
		return NEWS_EDIT;
	}
	@RequestMapping("/addNews")
	public String addNews(News news,Model model){
		newsService.save(news);
		model.addAttribute("msg",new MessageDto(EnumConstants.ReturnState.NEWS.getUrl(),"成功!"));
		return MSG;
	}
	@RequestMapping("/editNews")
	public String editNews(News news,Model model){
		newsService.update(news);
		model.addAttribute("msg",new MessageDto(EnumConstants.ReturnState.NEWS.getUrl(),"成功!"));
		return MSG;
	}
	@RequestMapping("/deleteNews")
	public String deleteNews(News news,Model model){
		newsService.delete(news.getNid());
		model.addAttribute("msg",new MessageDto(EnumConstants.ReturnState.NEWS.getUrl(),"成功!"));
		return MSG;
	}

	@RequestMapping("/toFunctionList")
	public String toFunctionList(Model model){
		model.addAttribute("functionList",functionService.query());
		return FUNCTION_LIST;
	}
	@RequestMapping("/toFunctionEdit")
	public String toFunctionEdit(Model model,Function function){
		model.addAttribute("function",functionService.queryById(function.getFid()));
		return FUNCTION_EDIT;
	}
	@RequestMapping("/toFunctionAdd")
	public String toFunctionAdd(){
		return FUNCTION_ADD;
	}

	@RequestMapping("/deleteFunction")
	public String deleteFunction(Function fun,Model model){
		functionService.delete(fun.getFid());
		model.addAttribute("msg",new MessageDto(EnumConstants.ReturnState.FUNCTION.getUrl(),"成功!"));
		return MSG;
	}
	@RequestMapping("/editFunction")
	public String editFunction(Function fun,Model model){
		functionService.update(fun);
		model.addAttribute("msg",new MessageDto(EnumConstants.ReturnState.FUNCTION.getUrl(),"成功!"));
		return MSG;
	}
	@RequestMapping("/addFunction")
	public String addFunction(FunctionDto functionDto,HttpServletRequest request,Model model){
		String path = request.getSession().getServletContext().getRealPath(Constant.FUNCTION_IMG_URL);
		functionDto.setImage(path);
		functionService.addFunction(functionDto);
		model.addAttribute("msg",new MessageDto(EnumConstants.ReturnState.FUNCTION.getUrl(),"成功!"));
		return MSG;
	}

	@RequestMapping("/toPicList")
	public String toPicList(){
		return PIC_LIST;
	}
	@RequestMapping("/editPic")
	public String editPic(@RequestParam(value = "imgFile", required = true) MultipartFile imgFile,String fileName, HttpServletRequest request,Model model){
		String path = request.getSession().getServletContext().getRealPath(Constant.PIC_URL);
		fileService.savaFile(imgFile,fileName,path);
		model.addAttribute("msg",new MessageDto(EnumConstants.ReturnState.PIC.getUrl(),"成功!"));
		return MSG;
	}
	@RequestMapping("/toMemberList")
	public String toMemberList(){
		//TODO
		return MEMBER_LIST;
	}
	@RequestMapping("/toResourceList")
	public String toResourceList(Model model){
		List<String> list = fileService.listFile(Constant.RESOURCE_URL);
		model.addAttribute("fileList",list);
		return RESOURCE_LIST;
	}
	@RequestMapping("/toResourceAdd")
	public String toResourceAdd(){
		return RESOURCE_ADD;
	}
	@RequestMapping("/deleteResource")
	public String deleteResource(@RequestParam("fileName")String fileName,Model model){
		String path = Constant.RESOURCE_URL+"/"+fileName;
		fileService.removeFile(path);
		model.addAttribute("msg",new MessageDto(EnumConstants.ReturnState.RESOURCE.getUrl(),"成功!"));
		return MSG;
	}
	@RequestMapping("/addResource")
	public String addResource(@RequestParam("resourceFile")MultipartFile resourceFile,Model model){
		fileService.savaFile(resourceFile,resourceFile.getOriginalFilename(),Constant.RESOURCE_URL);
		model.addAttribute("msg",new MessageDto(EnumConstants.ReturnState.RESOURCE.getUrl(),"成功!"));
		return MSG;
	}

}
