/**
 *
 *  @author Shevchenko Dariia S14145
 *
 */

package zad1;


public abstract class Spiewak {
    static Integer sp_index = 0;
    private String name;
    private String song;
    public int numer = 0;

    public Spiewak(String name) {
        this.name = name;
        this.numer = ++sp_index;
    }

    static public String najglosniej(Spiewak[] sp) {
        return "Not Implemented";
    }
    
    public String toString(){
		return "(" + numer + ") " + name + ": " + song;
    }
}
