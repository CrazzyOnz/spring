package com.cisco.spring.demo.biz.cd;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.cisco.spring.demo.api.CompactDisc;
import com.cisco.spring.demo.config.Blank;

@Component
@Blank
public class BlankDisc implements CompactDisc {

	private String title;
	private String artist;

	public BlankDisc(
			@Value("${disc.title}")String title,  
			@Value("${disc.artist}")String artist) { 
		
		this.artist = artist;
		this.title = title;
	}

	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	} 

}
