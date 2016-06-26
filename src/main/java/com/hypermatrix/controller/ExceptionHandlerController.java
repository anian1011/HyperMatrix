package com.hypermatrix.controller;

import com.hypermatrix.dto.MessageDto;
import com.hypermatrix.exception.AdminException;
import com.hypermatrix.exception.CaculateException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by anian on 2016/6/25.
 */
@Controller
public class ExceptionHandlerController {
    public static final String CACULATE_ERROR = "error.jsp";
    public static final String ADMIN_ERROR = "message.jsp";

    @ExceptionHandler(AdminException.class)
    public String operateExp(AdminException ex,HttpServletRequest request){
        request.setAttribute("msg", new MessageDto("javascript:history.go(-1)",ex.getMessage()));
        return ADMIN_ERROR;
    }

    @ExceptionHandler(CaculateException.class)
    public String operateExp(CaculateException ex,HttpServletRequest request){
        request.setAttribute("msg", new MessageDto("javascript:history.go(-1)",ex.getMessage()));
        return CACULATE_ERROR;
    }
}