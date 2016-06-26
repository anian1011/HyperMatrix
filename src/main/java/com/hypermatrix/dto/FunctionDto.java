package com.hypermatrix.dto;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;

/**
 * Created by anian on 2016/6/24.
 */
@Component
public class FunctionDto {
    //功能id
    private Integer fid;
    //分类id
    private Integer cid;
    //功能名称
    private String fname;
    //功能图标
    private String image;
    //包名
    private String packageName;
    //类名
    private String className;
    //方法名
    private String methodName;
    //参数（json）
    private String params;
    //参数(数组形式用于jsp显示)
    private String[] paramArray;

    MultipartFile jarFile;

    MultipartFile imageFile;

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
    public String getParams() {
        return params;
    }
    public void setParams(String params) {
        this.params = params;
    }

    public MultipartFile getJarFile() {
        return jarFile;
    }

    public void setJarFile(MultipartFile jarFile) {
        this.jarFile = jarFile;
    }

    public MultipartFile getImageFile() {
        return imageFile;
    }

    public void setImageFile(MultipartFile imageFile) {
        this.imageFile = imageFile;
    }

}
