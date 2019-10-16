package com.lifujian.sword.AdapterPattern.AdvanceMediaPlayer.Impl;

import com.lifujian.sword.AdapterPattern.AdvanceMediaPlayer.AdvancedMediaPlayer;

public class VlcMediaPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file. Name: "+ fileName);
	}

	@Override
	public void playMp4(String fileName) {

	}
}
