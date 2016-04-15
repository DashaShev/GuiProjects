package zad2;

public class ReversibleDouble implements Reversible {
	private float cyfra, orig;
	private int count = 0;

	public ReversibleDouble(double i) {
		 this.cyfra = new Float(i); 
		 this.orig = new Float(i);
	}

	@Override
	public Float reverse() {
		if (count == 0){
			count++;
			cyfra = 1/cyfra;
		    return (1/cyfra);
		}
		cyfra = 10 + orig;
		return (10 + cyfra);
	}

	public String toString(){
		return Float.toString(cyfra);
		
	}

}
