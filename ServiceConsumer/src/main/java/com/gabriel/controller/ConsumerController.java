package com.gabriel.controller;
/*
 * Project: com.gabriel.controller
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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.service.ComputeService;

/**
 * @author gabriel
 * @Type ConsumerController
 * @Desc
 * @date 2018/8/29 11:26
 */
@RestController
public class ConsumerController {
	private static final Logger log = LoggerFactory.getLogger(ConsumerController.class);
	@Autowired
	private ComputeService computeService;

	@GetMapping("/add")
	public Integer add(){
		log.info("add");
		return  computeService.add(10, 20);
	}

	@GetMapping("/test")
	public String test(){
		return  "hello";
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