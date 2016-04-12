int tablica [][] = new int [3][3]; 

		 for (int i = 0; i < tablica.length; i++){
			 for (int j = 0; j <tablica[i].length; j++){
			 
				 if (i == j) {
					 tab[i][j] = 1;
				 } else {
					 tab[i][j] = 0;
				 }
				 
				 System.out.print(tablica[i][j] + " ");
			 } System.out.println();
		 }
		
		 
