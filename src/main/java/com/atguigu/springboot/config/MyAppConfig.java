package com.atguigu.springboot.config;

import com.atguigu.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration 指明当前类为配置类，替代以前的配置文件，配置类==配置文件
 *
 * 在配置文件中<bean></bean>标签添加组件
 */
@Configuration
public class MyAppConfig {

    //将方法的返回值添加到容器中；容器中的这个组件默认的id就是这个方法名
    @Bean
    public  HelloService helloService(){
        System.out.println("配置类@Bean给容器中添加组件了");
        return new HelloService();
    }
}
