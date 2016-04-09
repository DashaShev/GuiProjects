/**
 *
 *  @author Shevchenko Dariia S14145
 *
 */

package zad1;


public abstract class Spiewak {
    private String name;
    private String song;
    public int numer = 0;

    public Spiewak(String name) {
        this.name = name;
        numer++;
         
        
    }

    static public String najglosniej(Spiewak[] sp) {
        return "Not Implemented";
    }
    
    public String toString(){
		return "(" + numer + ") " + name + ": " + song;
    	
    }
}
