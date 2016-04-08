 /**
 *
 *  @author Shevchenko Dariia S14145
 *
 */

package zad2;


public class Employee {
	
	public String imie, nazwisko;
	public int wiek;
	public double pensja;

	public Employee(String imie, String nazwisko, int wiek, double pensja) {
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.wiek = wiek;
		this.pensja = pensja;
	}
	
	public String toString(){
		return getFirstName() + " " + getLastName() + " " + getAge() + " " + getSalary();
	}

	public String getFirstName() {
		
		return imie;
	}

	public String getLastName() {
		
		return nazwisko;
	}
	
	public int getAge() {
		
		return wiek;
	}

	public double getSalary() {
		
		return pensja;
	}

	public void chgSalary(double d) {
		
		pensja = pensja + (pensja*d)/100;
		
	}

	
	

}
