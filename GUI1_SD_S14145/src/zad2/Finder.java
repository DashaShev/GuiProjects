/**
 *
 *  @author Shevchenko Dariia S14145
 *
 */

package zad2;

import java.io.*;

public class Finder {
	
public StringBuffer sb = new StringBuffer();
	
	public Finder (String file_name) throws IOException
	{
        boolean is_comment = false;
		FileReader fr = new FileReader(file_name); 
		int in;
        char prev_c = '\0';
		while((in = fr.read()) != -1){
            int sz = sb.length();
			char c = (char) in;
            if (c == '*' && prev_c == '/' && !is_comment) {
                sb.setLength(sz-1);
                is_comment = true;
                continue;
            }
            if (is_comment && prev_c == '*' && c == '/') {
                is_comment = false;
                prev_c = '\0';
                continue;
            }
            if (!is_comment) {
                sb.append(c);
            }
            prev_c = c;
		}
        //System.out.println(sb);
	}

	public int getIfCount() {
		return getStringCount("if");
	}

	public int getStringCount(String string) {
		
		int count = 0;
		String delim = "[,<;{}:. \\()>+\\s\\r\\n\\t]+";
		String [] words = sb.toString().split(delim);
		for (String word : words) {
            //System.out.println(">"+ word+"<");
            if (word.equalsIgnoreCase(string)) {
            	count++;
            }
        }

		return count;
	} 
	
	
}    
