public class PrimerHiloR implements Runnable{
	private int x;
	
	//constructor
	PrimerHiloR (int x){
		this.x=x;
	}
	//run	
	public void run(){
		for (int i=0;i<x;i++) {
				
			System.out.println("En el hilo..."+i);
			try {
				Thread.sleep(5000);
			}catch(InterruptedException e) {
				throw new IllegalStateException(e);
			}
    }
	}
    
}