package zad1;

public class Letters implements Runnable {

	private String letters;
	private char tab[];
	
	public Letters (String letters){
		this.letters = letters; 
		for (int i = 0; i < letters.length(); i++){
  		  tab[i] = letters.charAt(i);
  	}
		
	}

	      @Override
	      public void run() {
	   
	    	  
	      }

		public Thread[] getThreads() {
			
			Thread  thr_list [] = new Thread [tab.length];
			
			
			for (int i = 0; i < tab.length; i++){
				thr_list[i] = new Thread().setName("Thread " + tab[i]);
	    		 
	    	  }
			
			return thr_list;
		}

}
