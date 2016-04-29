package zad2;



public class StringTask implements Runnable{
	private String letter;
	private int count;
	 private String res;
	private TaskState task_state; 
	
	public StringTask(TaskState task_state) {
        this.task_state = task_state;
    }
	
	public StringTask(String letter, int count){
		
		Runnable r1 = new Runnable() {
           
			private int cnt;

			@Override
            public void run() {
				while (task_state != TaskState.ABORTED && this.cnt < count) {
					 	res = res + letter;
					    this.cnt += 1;
					    task_state = TaskState.READY;
				}
				
            }
            	
            	
           
		};
		
	}

	public String getResult() {
		
		return res;
	}

	public TaskState getState() {
		
		switch (task_state) {
        case CREATED:
            return task_state;
                
        case RUNNING:
        	 return task_state;
                     
        case ABORTED:
        	 return task_state;
                    
        case READY:
        	 return task_state;
    }
		return null;
		
	}

	public void start() {
		
		
	}
	
	public void abort() {
		
		task_state = TaskState.ABORTED;
		
	}

	public boolean isDone() {
		
		return  task_state == TaskState.READY;
	}

	@Override
	public void run() {
		
		
	}

}
