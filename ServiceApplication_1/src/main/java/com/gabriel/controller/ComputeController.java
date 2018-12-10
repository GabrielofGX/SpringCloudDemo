package com.gabriel.controller;

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