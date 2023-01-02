
public class Video25_arrayBidemensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//llenar matriz bidemencional 
		//si es dos dimenciones se ponen 2 par de corchetes([][]) y si es de tres dimenciones se ponen 3 pares 
		//de corchetes([][][])
		
		
		int[][] matrix=new int[3][5];
		
		matrix[0][0]=3;
		matrix[0][1]=5;
		matrix[0][2]=3;
		matrix[0][3]=4;
		matrix[0][4]=56;
		
		matrix[1][0]=4;
		matrix[1][1]=42;
		matrix[1][2]=311;
		matrix[1][3]=1131;
		matrix[1][4]=12312;
		
		matrix[2][0]=212;
		matrix[2][1]=38763;
		matrix[2][2]=3141;
		matrix[2][3]=12;
		matrix[2][4]=14;
		
		//System.out.println(matrix[2][0]);
		
		//vamos a hacer 2 bucles for para recorrer el array, una para un dimension y el otro para la otra dimension
		
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				System.out.println("el numero de la columna "+i+ " fila "+j+ " es "+matrix[i][j]);
			}
		}
		
		
		
		
	}

}
