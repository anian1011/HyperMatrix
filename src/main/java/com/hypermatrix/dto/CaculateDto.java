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
	//功能ID
	private Integer fid;
	//包名
	private String packageName;
	//类名
	private String className;
	//方法名
	private String methodName;
	//提交参数
	private List<String> params;
	//路径
	@SuppressWarnings("unused")
	private String url;
	
	
	public Integer getFid() {
		return fid;
	}
	public void setFid(Integer fid) {
		this.fid = fid;
	}
	public String getPackageName() {
		return packageName;
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
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
		return packageName+"."+className;
	}

	
}
