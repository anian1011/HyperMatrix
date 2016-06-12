package com.hypermatrix.entity;


import org.springframework.stereotype.Component;
/**
 * 功能实体类
 * @author wanqihan 2016年5月28日
 *
 */
@Component
public class Function {
	//功能id
	private Integer fid;
	//分类id
	private Integer cid;
	//功能名称
	private String fname;
	//功能图标
	private String image;
	//包名
	private String pakageName;
	//类名
	private String className;
	//方法名
	private String methodName;
	//参数（json）
	private String params;
	//参数(数组形式用于jsp显示)
	@SuppressWarnings("unused")
	private String[] paramArray;
	
	public String[] getParamArray() {
		return params.split(",");
	}
	public Integer getFid() {
		return fid;
	}
	public void setFid(Integer fid) {
		this.fid = fid;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
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
	public String getParams() {
		return params;
	}
	public void setParams(String params) {
		this.params = params;
	}
	
	
	
}
