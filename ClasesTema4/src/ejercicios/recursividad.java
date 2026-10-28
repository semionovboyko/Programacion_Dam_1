package ejercicios;

public class recursividad {
	
	public static int e(int i, int j) {
		int res;
		
		if( i == 1 || j == 1) {
			return 1;
		}else {
			  res = e(i, j-1) + e(i-1,j);
		}
		return res;
		
	}
	
	public static void main(String []args) {
		int numf = 5;
		for(int i =1; i <= numf; i++) {
			System.out.println("*");
			for(int j=1;j<= numf; j++) {
				System.out.println("**");
				
			}
			System.out.println(" ");
		}
	}
	
	
}
