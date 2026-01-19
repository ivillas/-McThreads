package McThreadsA;

public class Cambrer {

	
	private ComandesFetes cuaServeis;
	
	
	
    public Cambrer(ComandesFetes cua) {
        this.cuaServeis = cua;
    }

	
    
 		public void run() throws InterruptedException {
 			while (true) {
                String c = cuaServeis.AgafaPErServir();
                System.out.println("Cambrer agafa la comanda: " + c);
                
                int temps=1000;
                if(c.contains("beguda")) {
                	temps=3000;
                } else if (c.contains("menu")){
                	temps=5000;
				}
                System.out.println("El cambrer esta servint la comanda: " + c);
                Thread.sleep(temps);
                System.out.println("Comanda: " + c + " servida"); 				
 			}
			
		}
	
    
}
