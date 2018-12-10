package com.gabriel.service.impl;

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