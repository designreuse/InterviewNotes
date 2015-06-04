package com.mypractice.LambdaExpOne;

public class Intersection {

	public static void main(String[] args) {
		try{
			Sensitive sen = (Sensitive & Adder) (x,y) -> x+y;
			
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
}
