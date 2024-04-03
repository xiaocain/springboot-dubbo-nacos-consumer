package com.li.dubbo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author lijinzhou
 * @Date 2023/2/28 11:22
 * @PackageName:service
 * @ClassName: DubboNacosConsumerApplication
 * @Description: TODO
 * @Version 1.0
 */
@SpringBootApplication
@EnableDubbo
public class DubboNacosConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboNacosConsumerApplication.class);
    }
}
