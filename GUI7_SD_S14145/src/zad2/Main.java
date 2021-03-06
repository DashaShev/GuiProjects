/**
 *
 *  @author Shevchenko Dariia S14145
 *
 */

package zad2;


public class Main {
  public static void main(String[] args) throws InterruptedException {
    StringTask task = new StringTask("A", 70000);
    System.out.println("Task " + task.getState());
    task.start();
    if (args.length > 0 && args[0].equals("abort")) { 
    	Runnable r1 = () -> {
//      	  try {
//      		  while( !task.isDone() ) {
//				Thread.sleep(995);
//    	        task.abort();
//				Thread.sleep(5);
//    	        task.start();
//      		  }
//			} catch (InterruptedException e) {			
//				e.printStackTrace();
//			}
//      	  	task.abort();
    		
    		try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		task.abort(); 
    	};
    	Thread thr = new Thread(r1);
    	thr.start(); 
    }
    while (!task.isDone()) {
      Thread.sleep(500);
      switch(task.getState()) {
        case RUNNING: System.out.print("R."); break;
        case ABORTED: System.out.println(" ... aborted."); break;
        case READY: System.out.println(" ... ready."); break;
        default: System.out.println("unknown state");
      }
    }
    System.out.println("Task " + task.getState());
    System.out.println(task.getResult().length());
  }
}
