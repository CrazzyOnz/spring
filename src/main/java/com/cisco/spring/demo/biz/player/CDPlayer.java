package com.cisco.spring.demo.biz.player;

import org.springframework.stereotype.Component;

import com.cisco.spring.demo.api.CompactDisc;
import com.cisco.spring.demo.api.MediaPlayer;
import com.cisco.spring.demo.config.Blank;
import com.cisco.spring.demo.config.Color;

public class CDPlayer implements MediaPlayer {

	@Color
	@Blank
	private CompactDisc cd;
	
	public void setCd(CompactDisc cd) {
		this.cd = cd;
	} 

	public void play() {
		System.out.println("Switched on the Media Player");
		cd.play();
	}

}
