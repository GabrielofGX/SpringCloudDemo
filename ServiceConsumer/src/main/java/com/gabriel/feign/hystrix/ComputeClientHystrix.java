package com.gabriel.feign.hystrix;
/*
 * Project: com.gabriel.feign.hystrix
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

import com.gabriel.feign.ComputeClient;
import org.springframework.stereotype.Component;

/**
 * @author gabriel
 * @Type ComputeClientHystrix
 * @Desc
 * @date 2018/8/29 13:46
 */
@Component
public class ComputeClientHystrix implements ComputeClient {


	@Override
	public Integer add(Integer a, Integer b) {
		return 20;
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