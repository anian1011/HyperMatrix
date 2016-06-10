package com.hypermatrix.utils;

import java.net.URL;
import java.net.URLClassLoader;

import com.hypermatrix.constant.Constant;
import com.hypermatrix.dto.CaculateDto;
/**
 * 动态加载类工具
 * @author wanqihan 2016年6月1日
 *
 */
public class MyClassLoader {
	@SuppressWarnings("rawtypes")
	public static Class getClassByUrl(CaculateDto caculateDto){
		URLClassLoader loader ;
		Class clazz = null ;
		try {
			loader = new URLClassLoader(new URL[]{new URL(Constant.FunctionsBaseURL+caculateDto.getPakageName()+".jar")},Thread.currentThread().getContextClassLoader());
			clazz = loader.loadClass(caculateDto.getUrl());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return clazz;
	}
}
