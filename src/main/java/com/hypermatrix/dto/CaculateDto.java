package com.hypermatrix.dto;

import java.util.List;

import org.springframework.stereotype.Component;
/**
 * 计算功能的传输对象
 * @author wanqihan 2016年5月28日
 * 
 */
@Component
public class CaculateDto {
	
	//包名
	private String pakageName;
	//类名
	private String className;
	//方法名
	private String methodName;
	//提交参数
	private List<String> params;
	//路径
	private String url;
	
	
	public String getPakageName() {
		return pakageName;
	}
	public void setPakageName(String pakageName) {
		this.pakageName = pakageName;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getMethodName() {
		return methodName;
	}
	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	public List<String> getParams() {
		return params;
	}
	public void setParams(List<String> params) {
		this.params = params;
	}
	public String getUrl(){
		return pakageName+"."+className;
	}

	
}
