package com.cisco.spring.demo.utils;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TrackCounter {

	private Map<Integer, Integer> trackMap = new HashMap<Integer, Integer>();

	public TrackCounter() {
	}

	@Pointcut("execution(** com.cisco.spring.demo.api.CompactDisc.playTrack(int)) " + "&& args(trackNumber)")
	public void trackPlayed(int trackNumber) {
	}

	@Before("trackPlayed(trackNumber)")
	public void countTrack(int trackNumber) {
		if (trackMap.containsKey(trackNumber)) {
			trackMap.put(trackNumber, trackMap.get(trackNumber) + 1);
		} else {
			trackMap.put(trackNumber, 1);
		}
		System.out.println("We have played track number{"+trackNumber +"}-> "+trackMap.get(trackNumber)+" Times");  
	}

}
