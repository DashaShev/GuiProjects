/**
 *
 *  @author Shevchenko Dariia S14145
 *
 */

package zad1;


public class Main {

  public static void main(String[] args) throws InterruptedException {
    Letters letters = new Letters("ABCD");
    for (Thread t : letters.getThreads()) System.out.println(t.getName());
    
    for (Thread t : letters.getThreads()) t.start();

    Thread.sleep(5000);

    /*<- tu trzeba zapisaД‡
       fragment, ktГіry koЕ„czy dziaЕ‚anie kodГіw, wypisujД…cych litery 
    */
    System.out.println("\nProgram skoЕ„czyЕ‚ dziaЕ‚anie");
  }

}
