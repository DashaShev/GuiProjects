package zad2;



public class StringTask implements Runnable {
	private String letter;
	private int cnt;
	private int iter_num;
	private String res;
	private TaskState task_state; 
	private Thread my_thr;
	
	public StringTask(String letter, int iter_num){
		this.letter = letter;
		this.iter_num = iter_num;
		this.task_state = TaskState.CREATED;
		this.res = new String();
	}

	public void debug(String msg)
	{
	   System.out.format("%d: %s\n", System.currentTimeMillis(), msg);
	}
	
	@Override
    public void run() {
		debug("ENTER run()");
        this.task_state = TaskState.RUNNING;
		while (task_state != TaskState.ABORTED && this.cnt < this.iter_num) {
		 	res = res + letter;
		    this.cnt += 1;
		}
	    task_state = TaskState.READY;
		debug("LEAVE run()");
    }


	public String getResult() {
		return res;
	}

	public TaskState getState() {
		return task_state;
	}

	public void start() {
        my_thr = new Thread(this);
        my_thr.start();
	}
	
	public void abort() {
		my_thr.interrupt();
		try {
			my_thr.join();
			task_state = TaskState.ABORTED;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean isDone() {
		return  task_state == TaskState.READY;
	}

}
