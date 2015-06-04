package com.mypractice.LambdaExpOne;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class EmpMain {
	public static void main(String[] args) {
		try{
			Scanner sc = new Scanner(new File("emp.txt"));
			ArrayList<Employee> list = new ArrayList<>();
			while(sc.hasNext()){
				String[] e = sc.next().split(",");
				Employee emp = new Employee(e[0],e[1],e[2]);
				list.add(emp);
			}
			System.out.println("Original list :: ");
			FunctionalUtil.forEach(list,p -> System.out.println(p));
			FunctionalUtil.forEach(list,System.out::println);
			ToIntFunction<String> in = String :: length;
//			String str = "Danish Parveen";
//			System.out.println(in.applyAsInt(str));
			
			
//			String s1 = "Hello world";
//			String s2 = "Wellocome in to hell !";
//			BiFunction<String,String,String> fun = (s11,s12) -> s11.concat(" "+s12);
//			System.out.println(fun.apply(s1,s2));
			
//			BiFunction<String,String,String> fun = String :: concat;
//			System.out.println(fun.apply(s1,s2));
			
			
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}