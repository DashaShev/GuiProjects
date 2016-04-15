package zad2;

public class ReversibleString implements Reversible {
	private String slowo;
	private int count = 0;
	
	public ReversibleString(String string) {
		this.slowo = string; 
	}

	@Override
	public String reverse() {
		if (count == 0){
			count++; 
	        String newString = new StringBuffer(slowo).reverse().toString();
	        slowo = newString; 
			return newString;
		}
		slowo =  "Tekst " + new StringBuffer(slowo).reverse().toString();
		return "Tekst " + slowo;
	
		
	}
	
	public String toString(){
		return slowo; 
	}

}
