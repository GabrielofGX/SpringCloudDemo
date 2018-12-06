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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gabriel
 * @Type ComputeController
 * @Desc
 * @date 2018/8/29 11:12
 */
@RestController
public class ComputeController {
    private static final Logger log = LoggerFactory.getLogger(ComputeController.class);

	@GetMapping("/add")
	public Integer add(@RequestParam Integer a, @RequestParam Integer b){
		log.info("/add, a: " + a + " , b: " + a);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return  a + b;
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