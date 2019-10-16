package com.lifujian.sword.AdapterPattern.main;

import com.lifujian.sword.AdapterPattern.MediaPlayer.Impl.AudioPlayer;

public class AdapterTest {

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("Mp4","狂妄.mp4");
		audioPlayer.play("mp3","魔鬼中的天使.mp3");
		audioPlayer.play("vlc","通话.vlc");
		audioPlayer.play("mp","未知格式.mp");
	}


}
