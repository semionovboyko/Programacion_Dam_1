package ejercicios;
import java.util.*;

public class numero {
	
		private int num;
		
		//CONSTRUCTOR
		public numero(){
			num = 4;
		}
		
		public numero(int n){
			Scanner tec = new Scanner (System.in);
			System.out.println("introduce un valor para n");
			n= tec.nextInt();
			num = n;
		}
		
		//GETTERS AND SETTERS
		public int getNum() {
			return num;
		}

		public void setNum(int num) {
			this.num = num;
		}
		
		public int getDoble() {
			return num * 2;
		}
		
		public int getTriple() {
			return num * 3;
		}
		
		//METODOS
		public int anyade(int n){
			return num +=n;
			
		}
		
		public int quita(int n){
			return num-=n;
		}
		

		public static void main(String[] args) {
			
			Scanner tec = new Scanner (System.in);
			System.out.println("introduce un numero");
			int n= tec.nextInt();
			
			numero n1 = new numero();
			System.out.println(n1.getNum());
			System.out.println(n1.getDoble());
			System.out.println(n1.getTriple());
			n1.setNum(1);
			System.out.println(n1.anyade(n));
			
			numero n2 = new numero(n);
			System.out.println(n2.anyade(n));
		}
}
