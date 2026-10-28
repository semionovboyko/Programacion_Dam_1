package CuatroenRayaConsola;
import java.util.Scanner;

public class Tablero {

	/**variables del programa*/
	private int contador=0;

	/**get y set*/
	public int getcontador(){
		return contador;
	}
	public void setcontador(int c){
		contador=c;
	}

	/**metodos para la matriz
	 * el metodo imprime menu muestra un mensaje de bienvenida al ejecutar el 4 en raya.
	 */
	public void ImprimeMenu(){
		System.out.print("Bienvenido al Cuatro en raya.");
	}

	/** el metodo introduce ficha lleva la cuenta del jugador y te permite introducir
	 * ficha.
	 */
	public void IntroduceFicha (char [][]m){
		Scanner teclado = new Scanner(System.in);
		int columna=0;
		do{
			if(contador%2==0){
				System.out.print("\nJugador 1, Columna?");
				columna = teclado.nextInt();
			}
			if(contador%2!=0){
				System.out.print("\nJugador 2, Columna?");
				columna = teclado.nextInt();
			}
			int i=m.length-1;
			while(m[i][columna]!=' ') i--;							
			if(m[i][columna]==' '){
				if(contador%2==0) m[i][columna]='X';
				if(contador%2!=0) m[i][columna]='O';
			}
			contador++;
		}
		while((columna>10)||(columna<1));
	}
	/**el metodo imprimeMatriz imprime la matriz para ver la situación del tablero*/
	public void ImprimeMatriz (char [][]m){
		for (int i=0; i<m.length; i++){
			System.out.print("\n");
			for (int j=0; j<m[i].length; j++){
				System.out.printf("%c ",m[i][j]);
			}
		}
		System.out.print("\n0 1 2 3 4 5 6 7 8 9");
	}

	/** el metodo CompruebaHorizontal comprueba si hay cuatro en raya en horizontal. */
	public void CompruebaHorizontal (char [][]m){
		int contador1=0, contador2=0;
		for (int i=0; i<m.length; i++){
			contador1=0;
			contador2=0;
			for (int j=0; j<m[i].length; j++){
				if (m[i][j]==' '){
					contador1=0;
					contador2=0;
				}
				if (m[i][j]=='X'){
					contador1++;
					contador2=0;
				}
				if (m[i][j]=='O'){
					contador2++;
					contador1=0;
				}
				if (contador1==4) System.out.print("\nJugador 1 gana el juego");
				else {
					if (contador2==4) System.out.print("\nJugador 2 gana el juego");
				}
			} 
		}
	}

	/** el metodo CompruebaHorizontal comprueba si hay cuatro en raya en vertical. */
	public void CompruebaVertical (char [][]m){
		int contador1 = 0,contador2 = 0;
		for (int i=0; i<m.length-3; i++){
			for (int j=0; j<m[i].length; j++){
				contador1=0;
				contador2=0;

				if(m[i][j]=='X') contador1++;
				if(m[i][j]=='O') contador2++;

				if(m[i+1][j]=='X') contador1++;
				if(m[i+1][j]=='O') contador2++;

				if(m[i+2][j]=='X') contador1++;
				if(m[i+2][j]=='O') contador2++;

				if(m[i+3][j]=='X') contador1++;	
				if(m[i+3][j]=='O') contador2++;	
				if (contador1==4) System.out.print("\nJugador 1 gana el juego");
				else {
					if (contador2==4) System.out.print("\nJugador 2 gana el juego");
				}			
			}
		}		
	}

	/** el metodo CompruebaDiagonal comprueba si hay cuatro en raya en Digonal en un sentido. */
	public void CompruebaDiagonal1 (char [][]m){
		int contador1 = 0,contador2 = 0;
		for(int i=0;i<m.length-3;i++){
			for(int j=0;j<m[i].length-3;j++){
				contador1=0;
				contador2=0;	

				if(m[i][j]=='X') contador1++;
				if(m[i][j]=='O') contador2++;


				if(m[i+1][j+1]=='X') contador1++;
				if(m[i+1][j+1]=='O') contador2++;


				if(m[i+2][j+2]=='X') contador1++;
				if(m[i+2][j+2]=='O') contador2++;


				if(m[i+3][j+3]=='X') contador1++;	
				if(m[i+3][j+3]=='O') contador2++;

				if (contador1==4) System.out.print("\nJugador 1 gana el juego");
				else {
					if (contador2==4) System.out.print("\nJugador 2 gana el juego");
				}
			}
		}
	}

	/** el metodo CompruebaDiagonal comprueba si hay cuatro en raya en Diagonal en el otro sentido. */
	public void CompruebaDiagonal2 (char [][]m){
		int contador1 = 0,contador2 = 0;
		for(int i=4;i<m.length;i++){
			for(int j=0;j<m[i].length-3;j++){
				contador1=0;
				contador2=0;	

				if(m[i][j]=='X') contador1++;
				if(m[i][j]=='O') contador2++;


				if(m[i-1][j+1]=='X') contador1++;
				if(m[i-1][j+1]=='O') contador2++;


				if(m[i-2][j+2]=='X') contador1++;
				if(m[i-2][j+2]=='O') contador2++;


				if(m[i-3][j+3]=='X') contador1++;	
				if(m[i-3][j+3]=='O') contador2++;

				if (contador1==4) System.out.print("\nJugador 1 gana el juego");
				else {
					if (contador2==4) System.out.print("\nJugador 2 gana el juego");
				}
			}
		}
	}
}

