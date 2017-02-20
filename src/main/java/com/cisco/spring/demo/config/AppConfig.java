package com.cisco.spring.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.cisco.spring.demo.biz.cd.BlankDisc;
import com.cisco.spring.demo.biz.player.CDPlayer;

@Configuration
@ComponentScan(basePackageClasses = { BlankDisc.class, CDPlayer.class })
@PropertySource("classpath:/com/cisco/spring/demo/biz/cd/cd.properties")     
public class AppConfig {

	@Bean
	public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

}
