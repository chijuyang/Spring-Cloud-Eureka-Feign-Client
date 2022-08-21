package com.byang24.technology.springcloudeurekafeignclient.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "Spring-Cloud-Eureka-Client")
public interface GreetingClient {

    @RequestMapping( "/greeting")
    String greeting();
}
