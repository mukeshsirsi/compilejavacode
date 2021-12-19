package com.perfview.techservice.java8.behavior.parameterization;

import com.perfview.techservice.java8.Apple;

public class AppleGreenColorPredicate implements ApplePredicate {

	@Override
	public boolean test(Apple apple) {
		return "green".equals(apple.getColor());
	}


}
