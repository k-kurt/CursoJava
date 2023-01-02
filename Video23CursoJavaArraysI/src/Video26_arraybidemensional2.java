
public class Video26_arraybidemensional2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int[][] arrBidemensional= {
				{19,37,16,2,7},
				{2,1,2,4,5},
				{3,3,2,1,4},
				{2,6,5,8,7}
				};
		
	
		
//			for(int i = 0;i<arrBidemensional.length;i++) {
//				System.out.println();
//				
//				for(int j=0;j<arrBidemensional.length;j++) {
//					System.out.println(arrBidemensional[i][j]);
//				}
//				
//			}
	
		
		
		for(int[] arr1:arrBidemensional) {
			System.out.println();
			
			for(int z:arr1) {
				System.out.print(z+" ");
			}

		}
		
		
	
		}		
	}

