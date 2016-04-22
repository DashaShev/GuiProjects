package zad1;

public class Letters implements Runnable {

	private String letters;
	private char tab[];
	private Thread thr_list [];
	
	public Letters (String letters) {
		this.letters = letters; 
		this.thr_list = new Thread [letters.length()];
		this.tab = new char [letters.length()];
		for (int i = 0; i < letters.length(); i++){
  		  tab[i] = letters.charAt(i);
  		  
  		Runnable r1 = new Runnable() {
            @Override
            public void run() {
                while(true) {
                	String threadName =
                            Thread.currentThread().getName().substring(7);
                  System.out.print(threadName);
                  System.out.flush();
                  try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// e.printStackTrace();
                    // Thread.currentThread().interrupt();
                    return;
				}
                }
              }
            };
            thr_list[i] = new Thread(r1);
  		  
  		  thr_list[i].setName("Thread " + tab[i]);
  	}
		
	}

		public Thread[] getThreads() {
			
			return thr_list;
		}

		@Override
		 public void run() {
			
			
		}

}
