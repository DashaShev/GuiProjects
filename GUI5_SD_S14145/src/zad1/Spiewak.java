/**
 *
 *  @author Shevchenko Dariia S14145
 *
 */

package zad1;


public abstract class Spiewak {
    static Integer sp_index = 0;
    private String name;
    public int numer = 0;

    public Spiewak(String name) {
        this.name = name;
        this.numer = ++sp_index;
    }
    
    abstract String spiewaj();

    static public String najglosniej(Spiewak[] sp) {
    	int tab [] = new int [sp.length];
    	int k = 0;
    	for (Spiewak s : sp) {int count = 0; 
    		String spiew = s.spiewaj(); 
    		
    		for (int i = 0; i < spiew.length(); i++){
    			if(spiew.charAt(i) >= 'A' && spiew.charAt(i) <= 'Z'){
    				count++;
    			}
    		
    		 tab[k] = count; 
    		 k++; 
    		} 
    		int max = tab[0];
    		for (int l = 0; l < tab.length; l++){
    			if (max < tab[l])
                {
                    max = tab[l];
                } 
    		}
    		//System.out.println(max);
    		//System.out.println(count);	
    		
    	}
		return null;
    }
    
    public String toString(){
		return "(" + numer + ") " + name + ": " + spiewaj();
    }
}
