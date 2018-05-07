package com.imooc.order;

import com.imooc.order.config.RestTemplateConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Author:huangjb
 * Date:2018/5/7
 * Description:
 */
@Slf4j
@RestController
public class controller {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/msg")
    public String get(){
         String template = restTemplate.getForObject("http://product/msg/get", String.class);
         log.info(template);
        return template;
     }
}
