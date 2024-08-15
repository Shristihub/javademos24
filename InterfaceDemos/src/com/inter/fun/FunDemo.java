package com.inter.fun;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunDemo {

	public static void main(String[] args) {
		// implementation
		Consumer<String> con = str->System.out.println(str.toUpperCase());
		//calling  the method
		con.accept("Priya");
		con = str->System.out.println(str.length());
		con.accept("Great Day");
		
		Consumer<Integer> conin = num->System.out.println(num.longValue()+num);
		conin.accept(22);

		
		Supplier<Integer> sup = ()-> 100;
		System.out.println(sup.get());
		
		Predicate<String> pred = str->{
			if(str.endsWith("a")) return true;
			else return false;
		};
		System.out.println(pred.test("Java"));
		
		Function<String, String> fun1  = str->str.toUpperCase();
		System.out.println(fun1.apply("priya"));
		
		Function<String, Integer> fun2  = str->str.indexOf('o',4);
		System.out.println(fun2.apply("Hello!How are you?"));
		
		
		BiConsumer<Integer, Integer> bicon = (num1,num2)->System.out.println(num1+num2);
		bicon.accept(10, 20);
		
		BiFunction<String, String, String> bifun = (str1,str2)->{
			if(str1.equals(str2)) return "They are equal";
			else return "not equal";
		};
		System.out.println(bifun.apply("Priya","priya"));
		
	}
}
