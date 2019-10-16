package com.lifujian.sword.AdapterPattern.MediaPlayer.Impl;

import com.lifujian.sword.AdapterPattern.AdvanceMediaPlayer.AdvancedMediaPlayer;
import com.lifujian.sword.AdapterPattern.AdvanceMediaPlayer.Impl.Mp4MediaPlayer;
import com.lifujian.sword.AdapterPattern.AdvanceMediaPlayer.Impl.VlcMediaPlayer;
import com.lifujian.sword.AdapterPattern.MediaPlayer.MediaPlayer;

//媒体适配器是把新式的文件格式转换为老旧的播放方式
public class MediaAdapter implements MediaPlayer {

	AdvancedMediaPlayer advancedMusicPlayer;

	public MediaAdapter(String audioType){
		if(audioType.equalsIgnoreCase("vlc") ){
			advancedMusicPlayer = new VlcMediaPlayer();
		} else if (audioType.equalsIgnoreCase("mp4")){
			advancedMusicPlayer = new Mp4MediaPlayer();
		}
	}

	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("vlc")){
			advancedMusicPlayer.playVlc(fileName);
		}else if(audioType.equalsIgnoreCase("mp4")){
			advancedMusicPlayer.playMp4(fileName);
		}
	}
}
