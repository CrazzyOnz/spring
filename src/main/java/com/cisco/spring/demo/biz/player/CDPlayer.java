package com.cisco.spring.demo.biz.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cisco.spring.demo.api.CompactDisc;
import com.cisco.spring.demo.api.MediaPlayer;
import com.cisco.spring.demo.config.Blank;
import com.cisco.spring.demo.config.Color;

@Component("cdPlayer")  
public class CDPlayer implements MediaPlayer {

	@Autowired
	@Blank
	@Color
	private CompactDisc cd;

	public void play() {
		System.out.println("Switched on the Media Player");
		cd.play();
	}

}
