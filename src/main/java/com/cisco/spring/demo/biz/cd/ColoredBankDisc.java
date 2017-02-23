package com.cisco.spring.demo.biz.cd;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.cisco.spring.demo.api.CompactDisc;
import com.cisco.spring.demo.config.Blank;
import com.cisco.spring.demo.config.Color;

//@Component
//@Blank
//@Color
public class ColoredBankDisc implements CompactDisc {

	private String title;
	private String artist;
	private String color;

	public ColoredBankDisc(@Value("${disc.title}") String title, @Value("${disc.artist}") String artist,
			@Value("${disc.color}") String color) {

		this.artist = artist;
		this.title = title;
		this.color = color;
	}

	public void play() {
		System.out.println("Playing " + title + " by " + artist + " in " + color + " Pack");
	}
	
	public void playTrack(int trackNumber) {
		// TODO Auto-generated method stub
		
	}  

}
