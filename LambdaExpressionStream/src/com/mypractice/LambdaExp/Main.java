package com.mypractice.LambdaExp;

import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		
		try{
			/*Operation op = (x,y) -> x+y;
			double sum = op.addVal(23, 45);
			System.out.println(sum);
			
			Function<Integer, Integer> f = x -> x+1;
			int s = f.apply(12);
			System.out.println(s);*/
			
			StringJoiner st = (x,y) -> x+" : "+y;
			String sj = st.stringJoiner("Hello","World");
			System.out.println(sj);
			
		}catch(Exception ex){
			ex.printStackTrace(); 
		}

	}

}
