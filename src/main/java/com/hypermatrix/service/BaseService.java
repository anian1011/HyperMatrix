package com.hypermatrix.service;

import java.util.List;
/**
 * 基本service
 * @author wanqihan 2016年5月28日
 *
 */
public interface BaseService<T> {
	public List<T> query();
	public T queryById(Integer id);
	public void save(T t);
	public void delete(Integer id);
	public void update(T t);
}
