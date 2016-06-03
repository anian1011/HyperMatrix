package com.hypermatrix.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hypermatrix.dao.NewsDao;
import com.hypermatrix.entity.News;
import com.hypermatrix.service.NewsService;
/**
 * 新闻Service实现类
 * @author wanqihan 2016年6月1日
 *
 */
@Service
public class NewsServiceImpl implements NewsService {
	@Autowired
	private NewsDao newsDao;
	@Override
	public List<News> query() {
		return newsDao.query();
	}

	@Override
	public News queryById(Integer id) {
		return newsDao.queryById(id);
	}

	@Override
	public void save(News t) {
		newsDao.save(t);
	}

	@Override
	public void delete(Integer id) {
		newsDao.delete(id);
	}

	@Override
	public void update(News t) {
		newsDao.update(t);
	}

}
