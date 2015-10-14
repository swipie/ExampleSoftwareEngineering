package be.pxl.pieterswitten.classes;

public abstract class Worker {
	public final void dailyRoutine() {
		getUp();
		eatBreakfast();
		goToWork();
		work();
		returnToHome();
		relax();
		sleep();
	}
	
	void getUp() {
		System.out.println("Getting out of bed");
	}
	
	void eatBreakfast() {
		System.out.println("Eating breakfast");
	}
	
	void goToWork() {
		System.out.println("Driving to work");
	}
	
	abstract void work();
	
	void returnToHome() {
		System.out.println("Driving back to home");
	}
	
	void relax() {
		System.out.println("Relaxing");
	}
	
	void sleep() {
		System.out.println("Sleeping");
	}
}
