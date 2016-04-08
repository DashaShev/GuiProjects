package zad1;

public class ChoryNaGlowe extends Pacjent {

	public ChoryNaGlowe(String name){
		
		PacjentName = name; 
	}

	
	String choroba() {
		
		return "głowa";
	}

	
	String leczenie() {
		
		return "aspiryna";
	}
}
