package com.hypermatrix.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hypermatrix.dao.NewsDao;
import com.hypermatrix.entity.News;
/**
 * 新闻dao实现类
 * @author wanqihan 2016年5月28日
 *
 */
@Repository
public class NewsDaoImpl extends MyDaoSupport implements NewsDao {

	@Override
	public List<News> query() {
		return getSqlSession().selectList("newsDao.query");
	}

	@Override
	public News queryById(Integer id) {
		return getSqlSession().selectOne("newsDao.queryById",id);
	}

	@Override
	public void save(News t) {
		getSqlSession().insert("newsDao.save",t);
	}

	@Override
	public void delete(Integer id) {
		getSqlSession().delete("newsDao.delete",id);
	}

	@Override
	public void update(News t) {
		getSqlSession().update("newsDao.update",t);
	}

}
