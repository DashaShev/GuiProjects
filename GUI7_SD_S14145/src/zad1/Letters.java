package zad1;

public class Letters implements Runnable {

	private String letters;
	
	public Letters (String letters){
		this.letters = letters; 
	}

	      @Override
	      public void run() {
	       
	    	  for (int i = 0; i < letters.length(); i++){
	    		  System.out.println("Thread" + letters.charAt(i));
	    		  try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
	    	  }
	    	  
	      }
	    
	  
	    
	    
	
	
}
