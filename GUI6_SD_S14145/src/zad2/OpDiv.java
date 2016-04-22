package zad2;

public class OpDiv implements MathOp{

	@Override
	public String op(Float n1, Float n2) {
		
		 return String.format("%.7f", n1 / n2); 
	}

}
