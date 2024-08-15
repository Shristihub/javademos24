package com.inter.lamb;

public class LambdaDemo {

	public static void main(String[] args) {

		IGames games = ()->{
			System.out.println("Games for kids");
			System.out.println("games for adults");
		};
		games.showGames(); // calling 
		
		games= ()->System.out.println("all games");
		games.showGames();
		
		ICheck checker = (uname)->System.out.println("Great day "+uname);
		checker.validateName("Sri");
		
		checker = (uname)->{
			if(uname.length()>=5) 
				System.out.println("Welcome "+uname);
			else
				System.out.println("Wrong username");
		};
		checker.validateName("Priya");
		
		
		ICourse iCourse = ()->{
			String[] courses = {"Java","Angular","Spring"};
			return courses;
		};
		// simple way
		iCourse = ()->{
			return new String[]{"Java","Angular","Spring"};
		};
		iCourse = ()->new String[]{"Java","Angular","Spring"};
		
		String[] courses = iCourse.showCourses();
		for (String course : courses) {
			System.out.println(course);
		}
		
		IPrinter printer = ()->"Have a good day";
		System.out.println(printer.showMessage());
		
		IProduct prod = (x,y)->{
			return x*y;
		};
		IProduct prod1 = (x,y)->x*y;
		
		System.out.println(prod.multiply(1, 2));
	}

}
