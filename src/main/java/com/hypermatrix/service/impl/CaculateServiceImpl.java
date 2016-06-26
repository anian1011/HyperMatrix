package com.hypermatrix.service.impl;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.hypermatrix.utils.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.hypermatrix.constant.Constant;
import com.hypermatrix.dto.CaculateDto;
import com.hypermatrix.exception.CaculateException;
import com.hypermatrix.service.CaculateService;
import com.hypermatrix.utils.MyClassLoader;
import com.mathworks.toolbox.javabuilder.MWArray;
import com.mathworks.toolbox.javabuilder.MWJavaObjectRef;
import com.mathworks.toolbox.javabuilder.webfigures.WebFigure;
import org.springframework.transaction.annotation.Transactional;

/**
 * 核心计算功能
 * @author wanqihan 2016年5月28日
 * 
 */
@SuppressWarnings("unchecked")
@Service
public class CaculateServiceImpl implements CaculateService {

	private static Logger logger = Logger.getLogger ( CaculateServiceImpl.class);

	@SuppressWarnings("rawtypes")
	@Transactional
	@Override
	public WebFigure caculate(CaculateDto caculateDto) {
		Class clazz;
		Method method;
		Object[] result=null;
		try {
			logger.info("---开始计算："+caculateDto.getMethodName()+"--param:"+caculateDto.getParams()+"---");
				clazz = MyClassLoader.getClass(caculateDto);
				method = clazz.getMethod(caculateDto.getMethodName(), int.class,Object[].class);
				result=(Object[]) method.invoke(clazz.newInstance(), Constant.ResultNumber,caculateDto.getParams().toArray());

		} catch (IllegalArgumentException e) {
			logger.error("####非法参数###"+caculateDto.getMethodName()+"："+caculateDto.getParams());
			throw new CaculateException("非法参数！");
		} catch (NoSuchMethodException|InvocationTargetException|ClassNotFoundException | IOException e) {
			logger.error("####参数无效###"+caculateDto.getMethodName()+"："+caculateDto.getParams());
			throw new CaculateException("参数无效！");
		} catch (SecurityException|IllegalAccessException|InstantiationException e) {
			logger.error("####计算错误###"+caculateDto.getMethodName()+"："+caculateDto.getParams());
			throw new CaculateException("计算错误！");
		}finally{
			try {
				MyClassLoader.closeLoader();
			} catch (IOException e) {
				logger.error("####系统出错###"+caculateDto.getMethodName()+"："+caculateDto.getParams());
				throw new CaculateException("系统出错！");
			}
		}
		MWJavaObjectRef objectRef = (MWJavaObjectRef) (result[0]);

		WebFigure wf = (WebFigure) objectRef.get();

		MWArray.disposeArray(result);

		logger.info("---计算结束："+caculateDto.getMethodName()+"--param:"+caculateDto.getParams()+"---");

		return wf;
	}

}
