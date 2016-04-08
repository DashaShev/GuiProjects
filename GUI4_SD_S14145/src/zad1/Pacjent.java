package zad1;

public abstract class Pacjent {
 
	String PacjentName; 
	
	public Pacjent (){
		
	}

	public String nazwisko()
	{
	    return this.PacjentName; 
	}
	
	abstract String choroba();
	abstract String leczenie();
}
