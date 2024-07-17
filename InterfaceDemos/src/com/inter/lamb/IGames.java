package com.inter.lamb;

public interface IGames {

	void showGames();
}
interface ICheck{
	void validateName(String username);
}

interface ICourse{
	String[] showCourses();
}

interface IPrinter{
	String showMessage();
}

interface IProduct{
	int multiply(int x, int y);
}