package zad1;

public class Letters implements Runnable {

	private String letters;
	
	public Letters (String letters){
		this.letters = letters; 
	}

	      @Override
	      public void run() {
	   
	    	  
	      }

		public Object getThreads() {
			
			Thread tab [] = new Thread [letters.length()];
			
			for (int i = 0; i < letters.length(); i++){
	    		  tab[i].setName("Thread" + letters.charAt(i));
	    		 
	    	  }
			
			return tab;
		}

}
