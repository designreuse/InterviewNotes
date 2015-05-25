package com.mypractice.LambdaExp;

public class MapperMain {

	public static void main(String[] args) {
		String[] str = {"Hello","Hello World","dont quit"};
		int[] len = MapperExpre.mapToInt(str,(String s) -> s.length());
		printMapper(str,len);
		
	}

	
	private static void printMapper(Object[] from,int[] to){
		try{
			for(int i = 0 ;i<from.length ; i++){
				System.out.println(from[i]+" > "+to[i]);
			}
		}catch(Exception ex){
			
		}
	}
	
}
