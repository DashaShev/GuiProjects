/**
 *
 *  @author Shevchenko Dariia S14145
 *
 */

package zad1;


public class Przedzial {

  private int pocz, koniec;

  public Przedzial(int a, int b)
  {
	  if(a < b) {
	    	pocz = a;
	    	koniec = b; /*<-  kod konstruktora */
	    }
	    else {
	    	pocz = b;
	    	koniec = a;
	    }
	  /*<-  kod konstruktora */
  }

  Przedzial przeciecie(Przedzial p)
  {
    /*<-  kod metody przeciecie(...) */
 
    	
    	int b3;
        int a3;	
    			
				if(p.koniec() > koniec) b3 = koniec;
    			else b3 = p.koniec();
				
    			if(p.poczatek() <= koniec && p.poczatek() >= pocz) a3 = p.poczatek(); 
    			else 
    				if (p.poczatek() < pocz) a3 = pocz;
    				else return null;
    			
    				
    			Przedzial p3 = new Przedzial(a3,b3);
    			
    			return p3;
    		   	
    
    
  }
    

  public int poczatek() {
		
		return pocz;
	  }

	  public int koniec() {
		
		return koniec;
	  }
	  
	  public String toString(){
		return "[" + pocz + ", " + koniec + "]";
		  
	  }
}








