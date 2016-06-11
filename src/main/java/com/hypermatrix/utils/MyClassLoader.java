package com.hypermatrix.utils;

import java.io.IOException;
import java.net.MalformedURLException;
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
	private static URLClassLoader loader ;

	@SuppressWarnings("rawtypes")
	public static Class getClass(CaculateDto caculateDto) throws ClassNotFoundException, MalformedURLException{
		String url = Constant.FunctionsBaseURL+caculateDto.getPakageName()+".jar";
		getLoader(url);
		return loader.loadClass(caculateDto.getUrl());
	}
	public static void getLoader(String url) throws MalformedURLException{
			loader = new URLClassLoader(new URL[]{new URL(url)},Thread.currentThread().getContextClassLoader());
	}
	public static void closeLoader() throws IOException{
		loader.close();
	}
}
