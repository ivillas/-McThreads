package McThreadsA;

import java.util.ArrayList;

/*
 * CLase que fara de monitor
 */	
	
public class ComandesFetes {
	
	private ArrayList<String>  cuinades = new ArrayList<>();
	int comandesServides = 0;
		

	public synchronized void perServir(String c) {
		cuinades.add(c);
		notifyAll();		
	}

	public synchronized String AgafaPErServir()throws InterruptedException {
        while (cuinades.isEmpty()) {
            wait(); // espera si no hi ha comandes
        }
        return cuinades.remove(0);
		
	}

	public synchronized int size() {
		return cuinades.size();
		
	}


}
