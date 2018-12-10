package com.gabriel.controller;

import com.gabriel.Reponse;
import com.gabriel.User;
import com.gabriel.service.ComputeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
	public Integer add() {
		log.info("add");
		return computeService.add(10, 20);
	}

	@PostMapping("/test")
	public Reponse test(@RequestBody User user) {
		log.info(user.toString());
		return new Reponse(1000, "success");
	}

}