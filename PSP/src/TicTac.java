
public class TicTac {
	  public static void main(String[]args){  
			Tic i = null;
			Tac a = null;
			boolean infinito = true;
	while(infinito ==true) {	  
		for(int j =0; j<2; j++) {
		 //creo hilo
		 i = new Tic();
		 //Inicio el hilo y se imprime
		 i.start();
		 //Interumpe el hilo
		 i.interrupt();
		 
		 a = new Tac();
		 
		 a.start();
		 try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				throw new IllegalStateException(e);
			}
		 i.interrupt();
		
		}
		  
	}        
	    
	    }
}
