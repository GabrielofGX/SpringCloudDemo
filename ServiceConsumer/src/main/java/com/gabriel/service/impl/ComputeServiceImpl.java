package com.gabriel.service.impl;
/*
 * Project: com.gabriel.service.impl
 *
 * File Created at 2018/12/5
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
import org.springframework.stereotype.Service;

import com.gabriel.feign.ComputeClient;
import com.gabriel.service.ComputeService;

/**
 * @author gabriel
 * @Type ComputeServiceImpl
 * @Desc
 * @date 2018/12/5 10:19
 */
@Service
public class ComputeServiceImpl implements ComputeService {
	private static final Logger log = LoggerFactory.getLogger(ComputeServiceImpl.class);
	@Autowired
	private ComputeClient computeClient;

	@Override
	public Integer add(Integer a, Integer b) {
		log.info("aaa");
		return computeClient.add(a, b);
	}
}
/**
 * Revision history
 * -------------------------------------------------------------------------
 * <p>
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2018/12/5 gabriel create
 */