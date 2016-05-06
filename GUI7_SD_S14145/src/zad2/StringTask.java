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
	
	@Override
    public void run() {
        this.task_state = TaskState.RUNNING;
		while (task_state != TaskState.ABORTED && this.cnt < this.iter_num) {
		 	res = res + letter;
		    this.cnt += 1;
		}
		if (this.cnt == this.iter_num) {
			task_state = TaskState.READY;
		}
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
		task_state = TaskState.ABORTED;
		my_thr.interrupt();
		try {
			my_thr.join();	
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public boolean isDone() {
		return task_state == TaskState.READY || task_state == TaskState.ABORTED;
		// return task_state == TaskState.READY;
	}

}
