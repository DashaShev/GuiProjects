package zad2;

public class ReversibleString implements Reversible {
	private String slowo;
	private int count = 0;
	
	public ReversibleString(String string) {
		this.slowo = string; 
	}

	@Override
	public String reverse() {
		if (count == 0) {
	        String newString = new StringBuffer(slowo).reverse().toString();
			return newString;
			count++; 
		}
		if (count == 1){
			return "Tekst " + slowo; 
		}
	
		
	}

}
