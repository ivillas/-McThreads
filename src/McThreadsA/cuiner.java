package McThreadsA;

public class cuiner extends Thread{


	    private Comandes cua;
	    private ComandesFetes cuaFetes;
	    
	    

	    public cuiner(Comandes cua) {
	        this.cua = cua;
	    }

	    @Override
	    public void run() {
	        try {
	            while (true) {
	               String c = cua.agafarComanda(); 
	                System.out.println("Cuiner agafa la comanda: " + c);

	                // cuina la comanda
	                System.out.println("Cuiner esta cuinan la comanda: " + c);
	                Thread.sleep(6000);
	                System.out.println("Comanda: " + c + " llesta per servir");
	                cuaFetes.perServir(c);
	                	                
	            }
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	        }
	    }
	}



