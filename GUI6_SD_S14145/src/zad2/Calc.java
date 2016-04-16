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
	
	public String doCalc(String cmd) {
		
		String[]tab;
		
		try {
			tab = cmd.trim().split("\\s++");
		} catch (ArrayIndexOutOfBoundsException  e){ return "Invalid command to calc" ;
		}
		
	  return  op_code[op_sym.indexOf(tab[1])].op(1f, 3f).toString(); 
	}
	
}
