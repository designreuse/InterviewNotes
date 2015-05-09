package com.mypractice.strategeyDesinP.DesignP;

public class MallardDuck extends Duck{

	
	
	public MallardDuck(){
		flyBehaviour = new FlyWithWings();
		quackableBehaviour = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I can Display Mallard !");
		
	}
	
	
}
