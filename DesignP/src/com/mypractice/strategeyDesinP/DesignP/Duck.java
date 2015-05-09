package com.mypractice.strategeyDesinP.DesignP;

public abstract class Duck {

	FlyableBehaviour flyBehaviour;
	QuackableBehaviour quackableBehaviour;
	
	
	public void flyBehaviour(){
		flyBehaviour.fly();
	}
	
	public void quckBehaviour(){
		quackableBehaviour.quackable();
	}
	
	
	public void setFlyBehaviour(FlyableBehaviour flyBehaviour) {
		this.flyBehaviour = flyBehaviour;
	}
	
	public void setQuackableBehaviour(QuackableBehaviour quackableBehaviour) {
		this.quackableBehaviour = quackableBehaviour;
	}
	
	public void swim(){
		System.out.println("All Duck are swiming !");
	}
	
	public abstract void display();
	
}
