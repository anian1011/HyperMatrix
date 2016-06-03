package com.hypermatrix.service;

import com.hypermatrix.dto.CaculateDto;
import com.mathworks.toolbox.javabuilder.webfigures.WebFigure;
/**
 * 计算service接口
 * @author wanqihan 2016年5月28日
 *
 */
public interface CaculateService {
	public WebFigure caculate(CaculateDto caculateDto);
}
