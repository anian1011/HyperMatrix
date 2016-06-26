package com.hypermatrix.utils;

import com.hypermatrix.exception.AdminException;
import org.apache.log4j.Logger;

import java.io.File;

/**
 * Created by anian on 2016/6/25.
 */
public class FileUtils {
    static Logger logger = Logger.getLogger(FileUtils.class);
    public static void deleteFile(String sPath) {
        boolean flag = false;
        File file = new File(sPath);
        // 路径为文件且不为空则进行删除
        if (file.isFile() && file.exists()) {
            file.delete();
            flag = true;
        }
        if(!flag){
            logger.error("#########文件删除失败：sPath#######");
            throw new AdminException("文件删除失败！");
        }
    }
}
