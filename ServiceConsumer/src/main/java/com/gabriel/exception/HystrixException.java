package com.gabriel.exception;
/**
 * @author gabriel
 * @Type HystrixException
 * @Desc
 * @date 2018/8/29 13:49
 */
public class HystrixException extends RuntimeException {
	private String message;

	public HystrixException(String message){
		this.message = message;
	}
}