package com.southwind;
//没有在服务中心注册，不是消费者
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication//服务消费者，依赖springBoot要注册必须通过client
public class RestTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestTemplateApplication.class,args);
    }
    @Bean  //添加到IO服务器里面
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
//在restTemplate