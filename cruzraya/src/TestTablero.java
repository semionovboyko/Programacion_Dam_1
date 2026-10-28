/**
 * @author uo214946
 *  Main del programa*/
public class TestTablero {
	public static void main (String[] args) {
        /**creamos un objeto de la clase tablero*/
		Tablero t = new Tablero ();
		/**Declaramos matriz del tamaño del tablero*/
		char [][]m = new char [8][10];
		/** la rellenamos de huecos vacios*/
		for(int i=0; i<m.length; i++){
			for(int j=0; j<m[i].length; j++){
				m[i][j]=' ';
			}
		}
		/**contador para contar si el tablero esta lleno*/
		int contador = 0;	
		t.ImprimeMenu();
		/**bucle para ejecutar el juego*/
		do{
			t.ImprimeMatriz(m);
			t.IntroduceFicha(m);
			t.CompruebaHorizontal(m);
			t.CompruebaVertical(m);
			t.CompruebaDiagonal1(m);
			t.CompruebaDiagonal2(m);
			contador++;
		}
		while (contador!=81);
		System.out.print("La partida acaba en tablas");
	}
}
	

