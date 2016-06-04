package com.hypermatrix.dao;

import java.util.List;

import com.hypermatrix.entity.Function;
/**
 * 功能Dao接口
 * @author wanqihan 2016年5月28日
 *
 */
public interface FunctionDao extends BaseDao<Function>{

	List<Function> listByCategory(String category);
	
}
