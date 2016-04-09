/**
 *
 *  @author Shevchenko Dariia S14145
 *
 */

package zad1;


public class Main {
  public static void main(String[] args)
  {
    Spiewak s1 = new Spiewak("Carrey"){
        String song = "oooooooooooo";
    };

    Spiewak s2 = new Spiewak("Houston"){
        String song = "a4iBBiii";
    };

    Spiewak s3 = new Spiewak("Madonna"){
        String song = "aAa";
    };

    Spiewak sp[] = {s1, s2, s3};

    for (Spiewak s : sp)
      System.out.println(s);


    System.out.println("\n" + Spiewak.najglosniej(sp));
  }
}
