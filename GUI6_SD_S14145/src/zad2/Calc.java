/**
 *
 *  @author Shevchenko Dariia S14145
 *
 */

package zad2;


public class Calc {

	 private String op_sym;
	 private MathOp[] op_code;
	 
	 public Calc() {
	   this.op_sym = "+-*/";
	   this.op_code = new MathOp[] {
	      new OpAdd(),
	      new OpSub(),
	      new OpMul(),
	      new OpDiv() 
	   };
	 }
	
	public String doCalc(String stroka) {
		
		String[] tab = stroka.split(" ");
		for (int i = 0; i < 3; i++){
			System.out.println(tab[i]);
		}
		return null;
	}
	
} 
