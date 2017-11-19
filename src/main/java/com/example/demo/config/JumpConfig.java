package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class JumpConfig extends WebMvcConfigurerAdapter {
    static {
        System.out.println("JumpConfigAdapter");
    }
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/inputsDirectory").setViewName("inputsDirectory/inputsDirectory");//投入品跳转
        registry.addViewController("/seedBuyList").setViewName("inputs/seedBuyList");//种子购买记录
        registry.addViewController("/pesticidesBuyList").setViewName("inputs/pesticidesBuyList");//农药购买记录
        registry.addViewController("/manureBuyList").setViewName("inputs/manureBuyList");//化肥购买记录

    }
}