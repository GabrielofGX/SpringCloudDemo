package com.gabriel.feign;
/*
 * Project: com.gabriel.feign
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

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gabriel.feign.hystrix.ComputeClientHystrix;

/**
 * @author gabriel
 * @Type ComputeClient
 * @Desc
 * @date 2018/8/29 11:24
 */
@FeignClient(name = "ServiceApplication-1", fallback = ComputeClientHystrix.class)
public interface ComputeClient {

	@GetMapping("/add")
	Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}
/**
 * Revision history
 * -------------------------------------------------------------------------
 * <p>
 * Date Author Note
 * -------------------------------------------------------------------------
 * 2018/8/29 gabriel create
 */