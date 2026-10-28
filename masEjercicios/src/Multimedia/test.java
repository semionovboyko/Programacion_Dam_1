package Multimedia;

public class test {
	
	public static void main (String []args) {
		
	Pelicula Terminator = new Pelicula("Terminator","Jonh", Formato.mp3, 45, "Schwaseneger", null);
	Pelicula Terminator2 = new Pelicula("Terminator","Jonh", Formato.mp3, 45, "Schwaseneger", null);
	Pelicula Batman = new Pelicula("Batman","Toni", Formato.mp3, 45, "", "");
	
	System.out.println(Terminator);
	System.out.println(Terminator2);
	System.out.println(Batman);
	
	System.out.println(Terminator.equals(Terminator2));
	
	Terminator2.setTitulo("Terminator2");
	System.out.println(Terminator2);
	
	System.out.println("________________________________________________________________________________________________");
	
	Disco MagoOz = new Disco("MagoOZ", "Vendi", Formato.mp3, 60, Genero.rock);
	Disco MagoOzReturn = new Disco("MagoOZ", "Vendi", Formato.mp3, 60, Genero.rock);
	Disco LadyGaga = new Disco("LadyGaga", "Gaga", Formato.mp3, 60, Genero.pop);
	
	System.out.println(MagoOz);
	System.out.println(MagoOzReturn);
	System.out.println(LadyGaga);
	
	System.out.println(MagoOz.equals(MagoOzReturn));
	
	MagoOzReturn.setTitulo("MagoOzReturn");
	System.out.println(MagoOzReturn);
	}
}
