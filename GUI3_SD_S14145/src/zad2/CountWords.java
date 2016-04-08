/**
 *
 *  @author Shevchenko Dariia S14145
 *
 */

package zad2;

// import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
// import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
// import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CountWords {
	
	public StringBuffer sbuf = new StringBuffer() ;
    public String fname;

	public CountWords(String fname) {
        this.fname = fname;
    }

    private String readFile() throws IOException
    {
        Path path = Paths.get(this.fname);
        byte[] encoded = Files.readAllBytes(path);
        return new String(encoded, StandardCharsets.UTF_8);
    }

	public List<String> getResult() {
        List<String> result = new ArrayList<String>();
        try {
            String body = readFile();
		    String delim = "[,<;{}:. \\()>+\\s\\r\\n\\t]+";
		    String[] array = body.split(delim);

            for(int i=0; i < array.length - 1; i++) {
                int count = 1;
                String a = array[i];
                if (a == null) {
                    // nullified word?
                    // did we see this word already?
                    continue;
                }
                for (int j = i+1; j < array.length; j++) {
                    String b = array[j];
                    if (a.equals(b)) {
                        count ++;
                        array[j] = null;
                    }
                }
                result.add(String.format("%s: %d", array[i], count));
            }
		} catch (FileNotFoundException e) {
			System.out.println("ERROR: file not found: " + this.fname);
            return result;
		} catch (IOException e) {
			System.out.println("ERROR: can't read file: " + this.fname);
            return result;
		}
		return result;
	}
}  
