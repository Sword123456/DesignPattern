package com.lifujian.sword.BridgePattern.Shape;

import com.lifujian.sword.BridgePattern.DrawAPI.DrawAPI;

public abstract class Shape {

	protected DrawAPI drawAPI;

	protected Shape(DrawAPI drawAPI){
		this.drawAPI = drawAPI;
	}

	public abstract void draw();
}
