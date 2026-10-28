
public class IniciarCancion {
	
	 public static void main(String[] args) {
		 CancionPirata p = new CancionPirata();
		 new Thread(p).start();
	 }

}
