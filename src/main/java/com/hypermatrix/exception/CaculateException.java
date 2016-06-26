package com.hypermatrix.exception;
/**
 * 计算功能的自定义异常
 * @author wanqihan 2016年6月11日
 *
 */
public class CaculateException extends RuntimeException {

	private static final long serialVersionUID = 1059018696315344944L;

	public CaculateException() {
		super();
	}

	public CaculateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public CaculateException(String message, Throwable cause) {
		super(message, cause);
	}

	public CaculateException(String message) {
		super(message);
	}

	public CaculateException(Throwable cause) {
		super(cause);
	}
	
}
