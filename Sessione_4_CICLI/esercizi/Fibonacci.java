package esercizi;

import java.util.Random;
import java.util.stream.IntStream;

public class Fibonacci {

    // Calcola il termine n-esimo di Fibonacci in modo iterativo

    //Varibile di classe
    static int contatore = 0;

    public static void main(String[] args) {
        fibonacci(6);
        fibonacci();
    }

    public static int fibonacci(int numeroSerie) {
        System.out.println("Numero serie: "+numeroSerie);
        if (numeroSerie <= 0) {
            return 0;
        }
        if (numeroSerie == 1) {
            return 1;
        }

        int prec = 0;
        int curr = 1;
        //Varibile d'istanza del metodo
        int sum = 0;
        int index = 0;
        for (int i = 0; i < numeroSerie; i++) {
            //Sommiamo precednete e corrente
            //Varibile d'istanza del ciclo for
            int variabile = 0;
            sum = prec + curr;
            prec = curr;
            curr = sum;
            variabile++;
            contatore++;
            //E' comulativa solo all'interno del metodo
            System.out.println("Somma fibionacci: "+sum);

            //Crescerà
            System.out.println("istanza metodo: " +variabile);
            //Crescerà
            System.out.println("istanza classe: "+ contatore);
        }
        //ritorniamo la somma
        return sum;
    }

    //OVERLOAD
    public static int fibonacci(){
        Random radnom = new Random();
        int i1 = radnom.nextInt(0, 99);

        double numeroSerie = Math.random();
        if (i1>numeroSerie){
            numeroSerie = i1;
        }
      return fibonacci((int) numeroSerie);
    }
}
