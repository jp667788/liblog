package com.lijp.liblog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.lijp.liblog.controller","com.lijp.liblog.service.impl","com.lijp.liblog.dao.mapper","com.lijp.liblog.filter","com.lijp.liblog.config"})
@MapperScan(value = "com.lijp.liblog.dao.mapper")
public class LiblogApplication extends WebMvcConfigurationSupport {

	@Override
	public void configurePathMatch(PathMatchConfigurer configurer){
		//setUseSuffixPatternMatch 后缀模式匹配

		configurer.setUseSuffixPatternMatch(true);
		//setUseTrailingSlashMatch 自动后缀路径模式匹配
		configurer.setUseTrailingSlashMatch(true);
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
		//registry.addResourceHandler("*.css").addResourceLocations("classpath:/static/css/");
	}
	public static void main(String[] args) {
		SpringApplication.run(LiblogApplication.class, args);
	}
}
