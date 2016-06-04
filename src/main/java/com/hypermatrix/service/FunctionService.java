package com.hypermatrix.service;

import java.util.List;

import com.hypermatrix.entity.Function;
/**
 * 功能Service
 * @author wanqihan 2016年6月1日
 *
 */
public interface FunctionService extends BaseService<Function>{

	List<Function> listByCategory(String category);

}
