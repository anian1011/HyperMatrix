package com.hypermatrix.controller;

import com.google.gson.Gson;
import com.hypermatrix.constant.Constant;
import com.hypermatrix.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by anian on 2016/6/25.
 */
@Controller
@RequestMapping(value="/file",method = RequestMethod.POST)
public class FileController extends ExceptionHandlerController {
    @Autowired
    private FileService fileService;

    @RequestMapping("/downloadFile")
    public ModelAndView downloadFile(@RequestParam("fileName") String fileName, HttpServletRequest req, HttpServletResponse resp){
        fileService.downloadFile(req,resp,fileName);
        return null;
    }
    @RequestMapping("/listFile")
    public @ResponseBody String listFile(){
        Gson gson = new Gson();
        List<String> result = fileService.listFile(Constant.RESOURCE_URL);
        return gson.toJson(result.toArray());
    }
}
