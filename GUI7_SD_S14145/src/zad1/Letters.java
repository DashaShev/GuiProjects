package zad1;

public class Letters {

	private String letters;
	
	public Letters (String letters){
		this.letters = letters; 
	}

	 Runnable r1 = new Runnable() {
	      @Override
	      public void run() {
	       
	    	  for (int i = 0; i < letters.length(); i++){
	    		  System.out.println("Thread" + letters.charAt(i));
	    	  }
	    	  
	    };
	    
	    
	 };
	
}
