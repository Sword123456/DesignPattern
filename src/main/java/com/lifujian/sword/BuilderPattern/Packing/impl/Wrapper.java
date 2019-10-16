package com.lifujian.sword.BuilderPattern.Packing.impl;

import com.lifujian.sword.BuilderPattern.Packing.Packing;

public class Wrapper implements Packing {

	@Override
	public String pack() {
		return "Wrapper";
	}
}
