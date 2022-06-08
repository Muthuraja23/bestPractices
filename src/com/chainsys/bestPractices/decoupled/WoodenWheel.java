package com.chainsys.bestPractices.decoupled;

public class WoodenWheel implements Iwheel {
	public String location;

	@Override
	public void rotate() {
		System.out.println("Wooden wheel rotating");
	}

	@Override
	public void stopRotate() {
		// TODO Auto-generated method stub
		
	}
}
