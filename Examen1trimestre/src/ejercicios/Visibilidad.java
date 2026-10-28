package ejercicios;
import java.util.Scanner; 

public class Visibilidad {
	
	 int var; 
	 static int est; 
	 
	 public void UnMetodo() { 
		int m1; 
	 	var = var + m1; //Variable no inicializada
	 
	 } 
	 
	 public int OtroMetodo() {
		 int m2; 
		 m2 = var + m1; //Esta variable no esta inicializada en el metodo o en la clase
		 return m2; 
	 } 
	 
	 public int yOtroMetodo(int m) {
		 static int m3 = 1; //No puede ser nodificada es estatica
		 return m + m3; 
	 } 
	 
	 public static void main (String[] args) {
		 Visibilidad vis = new Visibilidad();
		 Visibilidad visi = new Visibilidad(); 
		 
		 UnMetodo(); // No puede hacer una referencia estatica al metodo no estatico
		 est = vis.yOtroMetodo(2);
		 var = vis.OtroMetodo(); 
		 vis.var = vis.yOtroMetodo(3.8); //El argumento tiene que ser de tipo int
		 vis.var = OtroMetodo(); //Tienes que introducir un objeto porque no es estatico
		 vis.UnMetodo(); 
		 visi.var = vis.var; 
		 visi.UnMetodo(4); // Este metodo no tiene argumentos
		 est = this.est; // El this se escribe en la otra variable
		 est = visi.m3; // No se puede resolver porque no esta el objeto creado
	 }

}
