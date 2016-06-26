package com.hypermatrix.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hypermatrix.dao.NewsDao;
import com.hypermatrix.entity.News;
import com.hypermatrix.service.NewsService;
import org.springframework.transaction.annotation.Transactional;

/**
 * 新闻Service实现类
 * @author wanqihan 2016年6月1日
 *
 */
@Service
public class NewsServiceImpl implements NewsService {

	private static Logger logger = Logger.getLogger ( NewsServiceImpl.class);
	@Autowired
	private NewsDao newsDao;

	@Override
	@Transactional
	public List<News> query() {
		return newsDao.query();
	}

	@Override
	@Transactional
	public News queryById(Integer id) {
		return newsDao.queryById(id);
	}

	@Override
	@Transactional
	public void save(News t) {
		t.setCreateTime(new Date());
		newsDao.save(t);
		logger.info("-----"+t.getAuthor()+"-- 发布新闻:"+t.getTitle()+"---");
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		News news = queryById(id);
		newsDao.delete(id);
		logger.info("-----"+news.getAuthor()+"-- 删除新闻:"+news.getTitle()+"---");
	}

	@Override
	@Transactional
	public void update(News t) {
		newsDao.update(t);
		logger.info("-----"+t.getAuthor()+"-- 更改新闻:"+t.getTitle()+"---");
	}

}
