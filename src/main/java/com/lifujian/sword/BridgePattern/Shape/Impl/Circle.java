package com.lifujian.sword.BridgePattern.Shape.Impl;

import com.lifujian.sword.BridgePattern.DrawAPI.DrawAPI;
import com.lifujian.sword.BridgePattern.Shape.Shape;

public class Circle extends Shape {

	int radius,x,y;

	public Circle(int radius,int x,int y,DrawAPI drawAPI){
		super(drawAPI);
		this.radius=radius;
		this.x=x;
		this.y=y;
	}

	@Override
	public void draw() {
		drawAPI.drawCircle(radius,x,y);
	}
}
