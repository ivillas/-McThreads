package McThreadsA;

public class cuiner extends Thread{


	    private Comandes cua;

	    public cuiner(Comandes cola) {
	        this.cua = cola;
	    }

	    @Override
	    public void run() {
	        try {
	            while (true) {
	               String c = cua.cogerComanda(); // espera si no hay
	                System.out.println("Cuiner agafa la comanda: " + c);

	                // simular cocinado (6s)
	                Thread.sleep(6000);

	                System.out.println("Cuiner esta cuinan la comanda: " + c);
	            }
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	        }
	    }
	}



