/**
 *
 *  @author Shevchenko Dariia S14145
 *
 */

package zad2;

import javax.swing.JOptionPane;

public class EmpManager {
	
	public static void showInfo(Employee e) {
		JOptionPane.showMessageDialog(null, e);
		
	}

	public static void changeSalary(Employee e) {
		String procent1 = JOptionPane.showInputDialog("Podaj procent");
		double procent = Double.parseDouble(procent1);
		e.pensja = e.pensja + (e.pensja*procent)/100;
	}

	public static Employee defEmp(String string) {
		
		String dane = JOptionPane.showInputDialog("Podaj dane pracownika");
		String[] array = dane.split(" ");
		//if (array != null){
		String imie = array[0];
		String nazwisko = array[1];
		String wiek1 = array[2];
		int wiek = Integer.parseInt(wiek1);
		String pensja1 = array[3];
		double pensja = Double.parseDouble(pensja1);
		
		Employee e = new Employee (imie, nazwisko, wiek, pensja); 
		return e;
		//}
		//else
			//return null;
	}

}    
