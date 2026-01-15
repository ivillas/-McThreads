package McThreadsA;

import java.util.Random;

//tipus en enums
			enum Tipus {
		        Hamburguesa,
		        Beguda,
		        Menu
		    }

	public class MaquinaComandes extends Thread {

		private Comandes cola;
		int contador =0;

		   public MaquinaComandes(Comandes cola) {
		       this.cola = cola;
		   }


		   @Override
		   public void run() {
		       Tipus[] valores = Tipus.values();
		       Random random = new Random();
		       

		       try {
		           while (true) {
		        	   contador ++;
		               int indexAleatori = random.nextInt(valores.length);
		               Tipus seleccionat = valores[indexAleatori];
		               String pedido = seleccionat.toString() + "-Numero-" + contador;
			                // mandar solo el tipo al monitor
	                cola.ponerComanda(pedido);
			                System.out.println("Máquina genera comanda: " + seleccionat);
			                // pausa aleatoria entre 1 y 5 segundos
			                
	                long espera = random.nextInt(5000 - 1000 + 1) + 1000;
	                Thread.sleep(espera);
	            }
	        } catch (InterruptedException e) {
	            Thread.currentThread().interrupt();
	        	}
	    }
	}
