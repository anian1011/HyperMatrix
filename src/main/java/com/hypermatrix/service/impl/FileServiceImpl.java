package com.hypermatrix.service.impl;

import com.hypermatrix.constant.Constant;
import com.hypermatrix.exception.AdminException;
import com.hypermatrix.exception.CaculateException;
import com.hypermatrix.service.FileService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by anian on 2016/6/21.
 */
@Service
public class FileServiceImpl implements FileService {

    private static Logger logger = Logger.getLogger ( FileServiceImpl.class);

    @Transactional
    public void savaFile(MultipartFile imgFile, String fileName, String path){
        File targetFile = new File(path,fileName);
        try {
            imgFile.transferTo(targetFile);
            logger.info("------更改文件:"+path+"---"+fileName+"----");
        } catch (Exception e) {
            logger.error("#####文件上传错误:"+path+"###"+fileName+"####");
            throw new AdminException("文件上传错误！");
        }
    }
    @Transactional
    public void downloadFile(HttpServletRequest request,
                             HttpServletResponse response, String storeName)  {


        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        String ctxPath = Constant.RESOURCE_URL;
        String downLoadPath = ctxPath + "/" + storeName;
        long fileLength = new File(downLoadPath).length();
        response.setContentType("text/html;charset=UTF-8");
        response.setHeader("Content-disposition", "attachment; filename=" + storeName);
        response.setHeader("Content-Length", String.valueOf(fileLength));
        try{

            request.setCharacterEncoding("UTF-8");
            bis = new BufferedInputStream(new FileInputStream(downLoadPath));
            bos = new BufferedOutputStream(response.getOutputStream());
            byte[] buff = new byte[2048];
            int bytesRead;
            while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
                bos.write(buff, 0, bytesRead);
            }
            logger.info("--------下载文件："+storeName+"---------");
        }catch(Exception e){
            logger.error("###文件下载出错："+storeName+"########");
            throw new CaculateException("文件下载出错！");
        }finally{
            try{
                bis.close();
                bos.close();
            }catch (Exception e2){
                logger.error("###文件下载出错："+storeName+"########");
                throw new CaculateException("文件下载出错！");
            }
        }
    }
    @Transactional
    public List<String> listFile(String path){
        List<String> result = new ArrayList<String>();
        File dir = new File(path);
        File[] files = dir.listFiles();
        for(File file : files){
            result.add(file.getName());
        }
        return result;
    }
    @Transactional
    public void removeFile(String path){
            File file = new File(path);
            // 路径为文件且不为空则进行删除
            if (file.isFile() && file.exists()) {
                file.delete();
                logger.info("---------删除文件："+path+"---------");
            }
    }

}