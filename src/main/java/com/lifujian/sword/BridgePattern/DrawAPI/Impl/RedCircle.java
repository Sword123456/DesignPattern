package com.lifujian.sword.BridgePattern.DrawAPI.Impl;

import com.lifujian.sword.BridgePattern.DrawAPI.DrawAPI;

public class RedCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Circle[ color: red, radius: "
				+ radius +", x: " +x+", "+ y +"]");
	}
}
