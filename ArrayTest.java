public class ArrayTest {

    public static void main(String[] args) {
        int tablica [][] = new int [3][3]; 
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j <tablica[i].length; j++){
                if (i == j) {
                    tablica[i][j] = 1;
                } else {
                    tablica[i][j] = 0;
                }
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println(isDiagonal(tablica));
    }
    
    
    public static boolean isDiagonal(int tab[][]){
		 
		 for (int i = 0; i < tab.length; i++){
			 for (int j = 0; j <tab[i].length; j++){
				 if (tab.length == tab[i].length) {
					 if ((i == j && tab[i][j] != 0) && (i != j && tab[i][j] == 0)){
						 return true;
					 
					 }
				 }
			 }
		 }
		 
		return false;
    
}
