package com.hypermatrix.dao;

import java.util.List;

/**
 * 基本dao（所有实体dao接口继承此接口）
 * @author wanqihan 2016年5月28日
 *
 */
public interface BaseDao<T> {
	public List<T> query();
	public T queryById(Integer id);
	public void save(T t);
	public void delete(Integer id);
	public void update(T t);
}
