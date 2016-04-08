/**
 *
 *  @author Shevchenko Dariia S14145
 *
 */

package zad1;

import java.io.*;
import java.util.ArrayList;


public class Main {

  public static void main(String[] args) throws IOException {
	  
    String fname = System.getProperty("user.home") + "/tab.txt"; //переменная с путем файла
  
    File file = new File(fname);
    StringBuffer string = new StringBuffer() ;
    ArrayList [] list = new ArrayList[0]; 
	
	try (FileInputStream fis = new FileInputStream(file)) 
	{
		
		int read = fis.read();
		while(read != -1) {
			char c = (char) read;
			string.append(c);
			read = fis.read();
		}
		System.out.println(string);
		
	} catch (FileNotFoundException e) {
		
		System.out.println("***");
		
	} catch (IOException e) {
		
		System.out.println("***");
	}	
	
	String[] array = string.toString().split(" ");
    
    
    
    
    
    
  }

    
       
        
      

}
