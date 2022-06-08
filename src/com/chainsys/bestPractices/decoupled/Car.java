package com.chainsys.bestPractices.decoupled;

public class Car {
	private Iengine engine;
	private Iwheel[] wheels;

	public Car(Iengine engine, Iwheel[] wheel) {
		this.engine = engine;
		this.wheels = wheel;
		
	}
	public void StartCar() {
		engine.start();
		wheels[0].rotate();
		wheels[1].rotate();
		wheels[2].rotate();
		wheels[3].rotate();
	}
	public Iwheel[] getWheels() {
		return this.wheels;
	}
}
