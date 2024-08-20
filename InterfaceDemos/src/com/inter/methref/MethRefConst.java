package com.inter.methref;

import java.util.Arrays;
import java.util.List;

interface IDetails{
	Student getStudent();
}
class Student{
	List<String> showCourses(){
		return Arrays.asList("Java","Angular");
	}
}
public class MethRefConst {

	public static void main(String[] args) {
		// impl using Lambda
		IDetails details = ()->new Student(); //calling constructor
		Student obj = details.getStudent();
		obj.showCourses().forEach(System.out::println);
		
		
		// impl using Method References
		details = Student::new;
		Student student  = details.getStudent();
		student.showCourses().forEach(str->System.out.println(str.toUpperCase()));
		
		
	}
}






