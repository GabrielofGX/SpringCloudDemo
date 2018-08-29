package com.gabriel.exception;
/*
 * Project: com.gabriel.exception
 *
 * File Created at 2018/8/29
 *
 * Copyright 2016 CMCC Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * ZYHY Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license.
 */

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
/**
 * Revision history
 * -------------------------------------------------------------------------
 * <p>
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2018/8/29 gabriel create
 */