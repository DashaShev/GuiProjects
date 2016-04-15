package zad2;

public class ReversibleDouble implements Reversible {
	private double cyfra;
	private int count = 0;

	public ReversibleDouble(double i) {
		this.cyfra = i; 
	}

	@Override
	public double reverse() {
		if (count == 0){ 
			return (1/cyfra); 
			count++;
		}
		if (count == 1){
			return (10 + cyfra); 
		}

	}

}

