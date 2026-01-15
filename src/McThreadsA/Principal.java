package McThreadsA;



public class Principal {

    public static void main(String[] args) {

        Comandes cola = new Comandes();

        MaquinaComandes maquina = new MaquinaComandes(cola);
        cuiner cuiner = new cuiner(cola);

        maquina.start();
        cuiner.start();
    }
}

