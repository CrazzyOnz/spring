package com.cisco.spring.demo.biz.concert;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.cisco.spring.demo.api.Performance;
import com.cisco.spring.demo.config.Electronic;

@Component
@Profile("dev")
//@Electronic
public class Film implements Performance {
	
	public Film() {
		
	} 

	public void perform() {
		System.out.println("++++ Film Started ++++"); 
	}

}
