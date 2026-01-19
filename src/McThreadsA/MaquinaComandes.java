package McThreadsA;

import java.util.Random;

//tipus en enums
			enum Tipus {
		        Hamburguesa,
		        Beguda,
		        Menu
		    }

	public class MaquinaComandes extends Thread {

		private Comandes cua;
		int contador =0;

		   public MaquinaComandes(Comandes cua) {
		       this.cua = cua;
		   }


		   @Override
		   public void run() {
		       Tipus[] valors = Tipus.values();
		       Random random = new Random();    
		       try {
		           while (true) {
		        	   contador ++;
		               int indexAleatori = random.nextInt(valors.length);
		               Tipus seleccionat = valors[indexAleatori];
		               String comanda = seleccionat.toString() + "-Numero-" + contador;
			                cua.posarComanda(comanda);
			                System.out.println("Máquina genera comanda: " + seleccionat);
			                // pausa			                
	                long espera = random.nextInt(5000 - 1000 + 1) + 1000;
	                Thread.sleep(espera);
	            }
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	        	}
	    }
	}
