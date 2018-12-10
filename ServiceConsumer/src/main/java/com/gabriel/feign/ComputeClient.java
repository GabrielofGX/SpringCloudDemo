package com.gabriel.feign;

import com.gabriel.feign.hystrix.ComputeClientFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author gabriel
 * @Type ComputeClient
 * @Desc
 * @date 2018/8/29 11:24
 */
@FeignClient(value = "ServiceApplication-1", fallback = ComputeClientFallback.class)
public interface ComputeClient {

	@GetMapping("/add")
	Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}