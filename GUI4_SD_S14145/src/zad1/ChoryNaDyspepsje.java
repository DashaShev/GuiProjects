package zad1;

public class ChoryNaDyspepsje extends Pacjent {

	public ChoryNaDyspepsje(String name){
		PacjentName = name; 
	}

	
	String choroba() {
		
		return "dyspepsja";
	}

	
	String leczenie() {
		
		return "węgiel";
	}
	
}
