package com.hypermatrix.service;


import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by anian on 2016/6/21.
 */
public interface FileService {
    void savaFile(MultipartFile imgFile,String fileName,String path);
    void downloadFile(HttpServletRequest request, HttpServletResponse response, String storeName);
    List<String> listFile(String path);
    void removeFile (String path);
}
