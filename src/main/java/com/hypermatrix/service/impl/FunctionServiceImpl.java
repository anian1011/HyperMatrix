package com.hypermatrix.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hypermatrix.dao.FunctionDao;
import com.hypermatrix.entity.Function;
import com.hypermatrix.service.FunctionService;
/**
 * 功能Service实现类
 * @author wanqihan 2016年6月1日
 *
 */
@Service
public class FunctionServiceImpl implements FunctionService {
	@Autowired
	private FunctionDao functionDao;

	@Override
	public List<Function> query() {
		return functionDao.query();
	}

	@Override
	public Function queryById(Integer id) {
		return functionDao.queryById(id);
	}

	@Override
	public void save(Function t) {
		functionDao.save(t);
	}

	@Override
	public void delete(Integer id) {
		functionDao.delete(id);
	}

	@Override
	public void update(Function t) {
		functionDao.update(t);
	}
	
	
}
