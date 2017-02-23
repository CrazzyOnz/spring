package com.cisco.spring.demo.biz.cd;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;

import com.cisco.spring.demo.api.CompactDisc;

//@Component
//@Blank
public class BlankDisc implements CompactDisc {

	private String title;
	private String artist;
	private Map<Integer, String> trackMap = new HashMap<Integer, String>();

	public BlankDisc(@Value("${disc.title}") String title, @Value("${disc.artist}") String artist) {

		this.artist = artist;
		this.title = title;
	}

	public void setTracks(Map<Integer, String> trackMap) {
		this.trackMap = trackMap;
	}

	public void play() {
		System.out.println("Playing " + title + " by " + artist);
	}

	public void playTrack(int trackNumber) {
		System.out.println("Playing.... " + trackMap.get(trackNumber));
	}
}
