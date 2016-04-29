package zad2;

public class StringTask implements Runnable{
	private String letter;
	private int count;
	public enum TaskState { CREATED, RUNNING, ABORTED, READY };
	private TaskState task_state; 
	
	public StringTask(TaskState task_state) {
        this.task_state = task_state;
    }
	
	public StringTask(String letter, int count){
		
		Runnable r1 = new Runnable() {
            private String res;
			private int cnt;

			@Override
            public void run() {
				while (task_state != TaskState.ABORTED && this.cnt < count) {
					 	this.res = this.res + letter;
					    this.cnt += 1;
					    task_state = TaskState.READY;
				}
                try {
					Thread.sleep(1000);
					task_state = TaskState.ABORTED;
				} catch (InterruptedException e) {
					return;
				}
                }
            	
            	
           
		};
		
	}

	public String getResult() {
		
		return null;
	}

	public TaskState getState() {
		
		switch (task_state) {
        case CREATED:
            System.out.println("CREATED");
            break;
                
        case RUNNING:
            System.out.println("RUNNING");
            break;
                     
        case ABORTED:
            System.out.println("ABORTED");
            break;
                    
        case READY:
            System.out.println("READY");
            break;
    }
		
		return null;
	}

	public void start() {
		
		
	}
	
	public void abort() {
		
		
	}

	public boolean isDone() {
		
		return false;
	}

	@Override
	public void run() {
		
		
	}

}
