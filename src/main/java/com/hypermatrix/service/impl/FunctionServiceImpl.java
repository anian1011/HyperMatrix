package com.hypermatrix.service.impl;

import java.util.List;

import com.hypermatrix.constant.Constant;
import com.hypermatrix.dto.FunctionDto;
import com.hypermatrix.exception.AdminException;
import com.hypermatrix.service.FileService;
import com.hypermatrix.utils.FileUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hypermatrix.dao.FunctionDao;
import com.hypermatrix.entity.Function;
import com.hypermatrix.service.FunctionService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

/**
 * 功能Service实现类
 * @author wanqihan 2016年6月1日
 *
 */
@Service
public class FunctionServiceImpl implements FunctionService {

	private static Logger logger = Logger.getLogger ( FunctionServiceImpl.class);

	@Autowired
	private FileService fileService;

	@Autowired
	private FunctionDao functionDao;

	@Override
	@Transactional
	public List<Function> query() {
		return functionDao.query();
	}

	@Override
	@Transactional
	public Function queryById(Integer id) {
		return functionDao.queryById(id);
	}

	@Override
	@Transactional
	public void save(Function t) {
		functionDao.save(t);
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		Function function = queryById(id);
		String path = Constant.FUNCTION_SAVE_URL+"/"+function.getPackageName()+".jar";
		functionDao.delete(id);
		FileUtils.deleteFile(path);
		logger.info("------ 删除功能:"+function.getFname()+"---");
	}

	@Override
	@Transactional
	public void update(Function t) {
		functionDao.update(t);
		logger.info("------ 更改功能:"+t.getFname()+"---");
	}

	@Override
	@Transactional
	public List<Function> listByCategory(String category) {
		return functionDao.listByCategory(category);
	}

	@Override
	@Transactional
	public void addFunction(FunctionDto functionDto) {

		//imgfile参数
		MultipartFile imgFile = functionDto.getImageFile();
		String imgPath = functionDto.getImage();
		String jarPath = Constant.FunctionsBaseURL;
		//jarfile参数
		MultipartFile jarFile = functionDto.getJarFile();
		String jarFileName = functionDto.getPackageName()+".jar";
		String imgFileName = imgFile.getOriginalFilename();
		//dto2model
		Function function = new Function();
		function.setCid(functionDto.getCid());
		function.setClassName(functionDto.getClassName());
		function.setFname(functionDto.getFname());
		function.setImage(Constant.FUNCTION_IMG_URL+"/"+imgFileName);
		function.setParams(functionDto.getParams());
		function.setPackageName(functionDto.getPackageName());
		function.setMethodName(functionDto.getMethodName());

		logger.info("-----开始添加功能:"+functionDto.getFname()+"---");
		save(function);
		fileService.savaFile(imgFile,imgFileName,imgPath);
		fileService.savaFile(jarFile,jarFileName,jarPath);
		logger.info("-----结束添加功能:"+functionDto.getFname()+"---");

	}


}
