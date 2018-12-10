package com.gabriel.feign.hystrix;

import com.gabriel.exception.HystrixException;
import com.gabriel.feign.ComputeClient;
import org.springframework.stereotype.Component;

/**
 * @author gabriel
 * @Type ComputeClientHystrix
 * @Desc
 * @date 2018/8/29 13:46
 */
@Component
public class ComputeClientFallback implements ComputeClient {


	@Override
	public Integer add(Integer a, Integer b) {
		throw new HystrixException("feign 调用add出现错误");
	}
}