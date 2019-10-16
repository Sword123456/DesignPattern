package com.lifujian.sword.AdapterPattern.MediaPlayer.Impl;


import com.lifujian.sword.AdapterPattern.AdvanceMediaPlayer.AdvancedMediaPlayer;
import com.lifujian.sword.AdapterPattern.MediaPlayer.MediaPlayer;

//一款老旧的音响播放器只实现了老旧的媒体播放功能，即只识别MP3类型文件
//后来进行了二次开发，把适配器融进去了新的媒体播放器，还要识别MP4和vlc类型文件

public class AudioPlayer implements MediaPlayer {

	@Override
	public void play(String audioType, String fileName) {

		/*
		//在最初的最初只有古老的MP3格式的文件，也只有古老的音响播放器（只播放MP3文件）完全够用
		System.out.println("Playing mp3 file. Name: "+ fileName);
		*/

		//老式的音响播放器不够用了，就有了新式的音响播放器（要完美支持以前的格式），但其还是音响播放器（即类名没有变）
		//在一些实际应用中是可以自己定义一种适配器接口，允许其他厂商去制造自己的适配器，并继承该接口。
		MediaAdapter mediaAdapter;
		if(audioType.equalsIgnoreCase("mp3")){
			System.out.println("Playing mp3 file. Name: "+ fileName);
		}
		//mediaAdapter 提供了播放其他文件格式的支持
		else if(audioType.equalsIgnoreCase("vlc")
				|| audioType.equalsIgnoreCase("mp4")){
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		}
		else{
			System.out.println("Invalid(无效的) media. "+
					audioType + " format not supported");
		}
	}
}
