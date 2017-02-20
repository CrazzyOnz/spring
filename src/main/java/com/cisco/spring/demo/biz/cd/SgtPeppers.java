package com.cisco.spring.demo.biz.cd;

import org.springframework.stereotype.Component;

import com.cisco.spring.demo.api.CompactDisc;

@Component
public class SgtPeppers implements CompactDisc{
	
	private String title = "Sgt. Pepper's Lonely Hearts Club Band";
	private String artist = "The Beatles";

	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}
}
