package com.cisco.spring.demo.biz.concert;

import com.cisco.spring.demo.api.Performance;

public class Drama implements Performance {
	
	public Drama() {
	}

	public void perform() {
		System.out.println("+++++ Play Started ++++");
	}

}
