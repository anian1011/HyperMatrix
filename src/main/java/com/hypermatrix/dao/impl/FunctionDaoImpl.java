package com.hypermatrix.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hypermatrix.dao.FunctionDao;
import com.hypermatrix.entity.Function;
/**
 * 功能dao实现类
 * @author wanqihan 2016年5月28日
 *
 */
@Repository
public class FunctionDaoImpl extends MyDaoSupport implements FunctionDao {

	@Override
	public List<Function> query() {
		return getSqlSession().selectList("functionDao.query");
	}

	@Override
	public Function queryById(Integer id) {
		return getSqlSession().selectOne("functionDao.queryById",id);
	}

	@Override
	public void save(Function t) {
		getSqlSession().insert("functionDao.save",t);
	}

	@Override
	public void delete(Integer id) {
		getSqlSession().delete("functionDao.delete", id);
	}

	@Override
	public void update(Function t) {
		getSqlSession().update("functionDao.update",t);
	}

	@Override
	public List<Function> listByCategory(String category) {
		return getSqlSession().selectList("functionDao.listByCategory",category);
	}

}
