package com.streams.basic;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStreams {

	public static void main(String[] args) {
	    int[] arr = new int[] {60,20,30,90,80};
		IntStream inStream = Arrays.stream(new int[] {60,20,30,90,80});
		int total = inStream.sum();
		System.out.println(total);
		
	   int val =  Arrays.stream(new int[] {10,20,30,90,80}).sum();
	   System.out.println(val);	
	   
	   OptionalDouble optval = Arrays.stream(arr).filter(x->x>30).average();
	   optval.ifPresent(num->System.out.println(num));
	   
	   long t = Arrays.stream(arr).filter(x->x>30).asDoubleStream().count();
	   System.out.println(t);
	   
	   int sum = IntStream.range(10,21).sum();
	   System.out.println(sum);
	   
	   LongStream.generate(()->900).limit(5).forEach(num->System.out.println(num));
	   
	   //mapToInt
	   String[] arrnums = new String[] {"60","20","30","90","80"};
	   int tsum = Arrays.stream(arrnums)
	         .mapToInt(str->Integer.parseInt(str))
	         .sum();
	   System.out.println(tsum);
	   
	   int ssum = Arrays.stream(new String[] {"Priya","Raju","Ronnie"})
	   		 .mapToInt(str->str.length())
	   		 .sum();
       System.out.println(ssum);
       
       
       
       
       
       
	   
	}
}
