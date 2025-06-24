package esempi;

import java.util.Random;

public class ControlloDelFlusso {

    String drugClass = "C2";
    String drugClass3 = "C3";
    String drugClassNA = "NA";

    public static void main(String[] args) {
        Random random = new Random();
        int numero = 7;
        System.out.println("Numero generato " + numero);

        boolean isZero = numero == 0;
        System.out.println("E' zero? " + isZero);

        if (isZero) {
            //Allora
            System.out.println("Il Numero generato è zero");
        } else if (numero % 2 == 0) {
            //Allora
            System.out.println("Il Numero generato è pari");
        } else if (numero % 3 == 0) {
            System.out.println("Il resto è " + numero % 3);
            System.out.println("Il Numero generato è divisibile per 3");
        } else {
            //Altrimenti
            System.out.println("Il resto è " + numero % 2);
            System.out.println("Il Numero generato è dispari");
        }
    }
}
