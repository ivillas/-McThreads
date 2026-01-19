package McThreadsA;

import java.util.ArrayList;

/*
 * CLase que fara de monitor
 */


public class Comandes {


	    private ArrayList<String> cua = new ArrayList<>();
	    int nComanda = 0; 
	    

	    public synchronized void posarComanda(String c) {
	        cua.add(c);
	        notifyAll(); // avisa al cuiner
	    }


	    public synchronized String agafarComanda() throws InterruptedException {
	        while (cua.isEmpty()) {
	            wait(); // espera si no hi ha comandes
	        }
	        return cua.remove(0);
	    }


	    public synchronized int size() {
	        return cua.size();
	    }
	}
