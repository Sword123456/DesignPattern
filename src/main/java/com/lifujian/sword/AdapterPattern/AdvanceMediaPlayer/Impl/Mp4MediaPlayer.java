package com.lifujian.sword.AdapterPattern.AdvanceMediaPlayer.Impl;

import com.lifujian.sword.AdapterPattern.AdvanceMediaPlayer.AdvancedMediaPlayer;

public class Mp4MediaPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {

	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing mp4 file. Name: "+ fileName);
	}
}
