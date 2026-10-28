package ejercicios;

public class Rectangulo {
	
	 private int ancho; //Variables
	 private int alto;
	
	 public Rectangulo () { //Metodo Constructor por defecto
		 ancho = 0;  alto = 0; 
	 } 
	 
	 public Rectangulo (int an, int al) { //Metodo Constructor
		 ancho = an;  alto = al; 
	 } 
	 
	 public Rectangulo (Rectangulo r) { //Metodo Constructor
		 ancho = r.ancho; alto = r.alto; 
	 } 
	 
	 public int getAncho() { //Metodo get
		 return ancho;  
	 } 
	 
	 public int getAlto() {  //Metodo get
		 return alto;
	 } 
	 
	 public void incrementarAncho() { //Metodo incrementar 
		 ancho++; 
	 } 
	 
	 public void incrementarAlto ( ) { //Metodo incrementar
		 alto++; 
	 } 
	 
	 public boolean equals (Rectangulo r) {  //Metodo comparar
		 if ((ancho == r.ancho) && (alto == r.alto)) //Condicion 
			 return true;
		 else 
			 return false;
	 } 
	 
	 public static void main(String[ ] args) { 
		
		 Rectangulo r1 = new Rectangulo(5, 7); //Objetos con parametros
		 Rectangulo r2 = new Rectangulo (r1); //Objetos con parametros
		 Rectangulo r3 = new Rectangulo(); //Objetos

		 r3 = r1; //Funcion r3 es r1
		 
		 if (r1.equals(r2))  //Condicion compara objeto r1 con r2
			 System.out.println("R1 y R2 son iguales"); //Se cumple y se imprime
		 if (r1==r2) //Condicion compara objeto r1 con r2
			 System.out.println("R1 == R2"); //No se cumple 
		 if (r1.equals(r3)) //Condicion compara objeto r1 con r3
			 System.out.println("R1 y R3 son iguales"); //Se cumple y se imprime
		 if (r1==r3)  //Condicion compara objeto r1 con r3
			 System.out.println("R1 == R3"); //Se cumple y se imprime
		 
		 r2.incrementarAncho( ); //A los objetos se le aplican los siguientes metodos
		 r2.incrementarAlto( );
		 r3.incrementarAncho( ); 
		 r3.incrementarAlto( ); 
		 
		 System.out.println("R1: ancho: "+r1.getAncho()); //Al objeto uno se le incrementa 1 en ancho y alto
		 System.out.println("R1: alto: "+r1.getAlto());
		 System.out.println("R2: ancho: "+r2.getAncho()); //Al objeto se le dan los mismos parametros que r1 asi que
		 System.out.println("R2: alto: "+r2.getAlto());		//se incrementan como el anterior
		 System.out.println("R3: ancho: "+r3.getAncho()); //Como en la funcion r3 = r1 se aplica lo mismo de antes
		 System.out.println("R3: alto: "+r3.getAlto()); 
	 
	 }
	
}

/*
 	R1 y R2 son iguales
	R1 y R3 son iguales
	R1 == R3
	
	R1: ancho: 6
	R1: alto: 8
	R2: ancho: 6
	R2: alto: 8
	R3: ancho: 6
	R3: alto: 8
 */
