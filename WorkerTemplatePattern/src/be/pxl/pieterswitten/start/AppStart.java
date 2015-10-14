package be.pxl.pieterswitten.start;

import be.pxl.pieterswitten.classes.Manager;
import be.pxl.pieterswitten.classes.Postman;
import be.pxl.pieterswitten.classes.Worker;

public class AppStart {

	public static void main(String[] args) {
		Worker manager = new Manager();
		Worker postman = new Postman();
		
		System.out.println("\nManager his day");
		System.out.println("---------------");
		manager.dailyRoutine();
		System.out.println("\nPostman his day");
		System.out.println("---------------");
		postman.dailyRoutine();
	}

}
