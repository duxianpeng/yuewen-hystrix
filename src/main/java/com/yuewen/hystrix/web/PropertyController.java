package com.yuewen.hystrix.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class PropertyController {

	Logger log = LoggerFactory.getLogger(PropertyController.class);
	@Value("${from}")
	private String from;

	@Value("${eureka.instance.instanceId}")
	private String instanceId;

	@RequestMapping("/from")
	public String from() {
		return from;
	}

	@RequestMapping("/test")
	public String test() {
		return "test";
	}

	@RequestMapping("/instanceId")
	public String instanceId() {
		log.debug("Instance Id:" + this.instanceId);
		return instanceId;
	}
}
