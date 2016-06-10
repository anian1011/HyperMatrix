package com.hypermatrix.service.impl;

import java.lang.reflect.Method;
import org.springframework.stereotype.Service;

import com.hypermatrix.constant.Constant;
import com.hypermatrix.dto.CaculateDto;
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
	public WebFigure caculate(CaculateDto caculateDto) {
		Class clazz;
		Method method;
		Object[] result=null;

		try {
			clazz = MyClassLoader.getClassByUrl(caculateDto);
			method = clazz.getMethod(caculateDto.getMethodName(), int.class,Object[].class);
			result=(Object[]) method.invoke(clazz.newInstance(), Constant.ResultNumber,caculateDto.getParams().toArray());
		} catch (Exception e) {
			e.printStackTrace();
		}
		MWJavaObjectRef objectRef = (MWJavaObjectRef) (result[0]);

		WebFigure wf = (WebFigure) objectRef.get();

		MWArray.disposeArray(result);
	
		return wf;
	}

}
