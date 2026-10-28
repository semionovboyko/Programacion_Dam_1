
public class CancionPirata implements Runnable{
	
   
	public void run() {
   
    		 	System.out.println("Con diez cañones por banda,\r\n" + 
    		 			"viento en popa a toda vela,\r\n" + 
    		 			"no corta el mar, sino vuela\r\n" + 
    		 			"un velero bergantín;\r\n");
    		 	try {
    				Thread.sleep(2000);
    			}catch(InterruptedException e) {
    				throw new IllegalStateException(e);
    			}

    		 	System.out.println("bajel pirata que llaman,\r\n" + 
    					"por su bravura, el Temido,\r\n" + 
    					"en todo mar conocido\r\n" + 
    					"del uno al otro confín.\r\n");
    			try {
    				Thread.sleep(2000);
    			}catch(InterruptedException e) {
    				throw new IllegalStateException(e);
    			}

    		 	System.out.println("La luna en el mar riela,\r\n" + 
    					"en la lona gime el viento\r\n" + 
    					"y alza en blando movimiento\r\n" + 
    					"olas de plata y azul;\r\n");	
    			try {
    				Thread.sleep(2000);
    			}catch(InterruptedException e) {
    				throw new IllegalStateException(e);
    			}

    		 	System.out.println(	"y va el capitán pirata,\r\n" + 
    					"cantando alegre en la popa,\r\n" + 
    					"Asia a un lado, al otro Europa,\r\n" + 
    					"y allá a su frente Estambul; \r\n ");
    		 
    		 	
    }
    	 
}