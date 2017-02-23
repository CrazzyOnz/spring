package com.cisco.spring.demo.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.cisco.spring.demo.biz.cd.BlankDisc;
import com.cisco.spring.demo.utils.TrackCounter;

@Configuration
@EnableAspectJAutoProxy
public class TrackCounterConfig {

	@Bean
	public BlankDisc bankDisc() {

		BlankDisc blankDisc = new BlankDisc("My Golden Collection", "Abhishek");
		Map<Integer, String> trackMap = new HashMap<Integer, String>();
		trackMap.put(1, "Track One");
		trackMap.put(1, "Track Two");
		blankDisc.setTracks(trackMap);
		return blankDisc;
	}

	@Bean
	public TrackCounter trackCounter() {
		return new TrackCounter();
	}

}
