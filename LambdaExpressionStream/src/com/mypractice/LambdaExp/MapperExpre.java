package com.mypractice.LambdaExp;
import java.lang.FunctionalInterface;
@FunctionalInterface
public interface MapperExpre<T> {
	int map(T list);
	public static <U> int[] mapToInt(U[] li,MapperExpre<? super U> mapper)
	{
		int[] mapToInt = new int[li.length];
		for(int i = 0;i<li.length;i++){
			mapToInt[i] = mapper.map(li[i]);
		}
		return mapToInt;
	}
}
