package com.hypermatrix.service.impl;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.apache.commons.logging.impl.Log4JLogger;
import org.springframework.stereotype.Service;

import com.hypermatrix.constant.Constant;
import com.hypermatrix.dto.CaculateDto;
import com.hypermatrix.exception.CaculateException;
import com.hypermatrix.service.CaculateService;
import com.hypermatrix.utils.MyClassLoader;
import com.mathworks.toolbox.javabuilder.MWArray;
import com.mathworks.toolbox.javabuilder.MWJavaObjectRef;
import com.mathworks.toolbox.javabuilder.webfigures.WebFigure;
/**
 * 核心计算功能
 * @author wanqihan 2016年5月28日
 * 
 */
@SuppressWarnings("unchecked")
@Service
public class CaculateServiceImpl implements CaculateService {

	@SuppressWarnings("rawtypes")
	@Override
	public WebFigure caculate(CaculateDto caculateDto) throws CaculateException {
		Class clazz;
		Method method;
		Object[] result=null;

		try {
				clazz = MyClassLoader.getClass(caculateDto);
				method = clazz.getMethod(caculateDto.getMethodName(), int.class,Object[].class);
				result=(Object[]) method.invoke(clazz.newInstance(), Constant.ResultNumber,caculateDto.getParams().toArray());

		} catch (IllegalArgumentException e) {
			throw new CaculateException("参数无效！");
		} catch (NoSuchMethodException|InvocationTargetException|ClassNotFoundException | IOException e) {
			throw new CaculateException("此功能失效！");
		} catch (SecurityException|IllegalAccessException|InstantiationException e) {
			throw new CaculateException("计算错误！");
		}finally{
			try {
				MyClassLoader.closeLoader();
			} catch (IOException e) {
				throw new CaculateException("系统出错！");
			}
		}
		MWJavaObjectRef objectRef = (MWJavaObjectRef) (result[0]);

		WebFigure wf = (WebFigure) objectRef.get();

		MWArray.disposeArray(result);
	
		return wf;
	}

}
