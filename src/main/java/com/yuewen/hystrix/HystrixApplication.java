package com.yuewen.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by peng on 2017/7/20.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrixDashboard
public class HystrixApplication {
    public static void main(String[] args){
        SpringApplication.run(HystrixApplication.class, args);
    }

}
