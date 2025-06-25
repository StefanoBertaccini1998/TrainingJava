package esercizi;

public class Fibonacci {

    // Calcola il termine n-esimo di Fibonacci in modo iterativo

    int numero = 1;

    public static void main(String[] args) {
       fibonacci(6);
    }

    public static int fibonacci(int numeroSerie) {
        if (numeroSerie <= 0) {
            return 0;
        }
        if (numeroSerie == 1) {
            return 1;
        }

        int prec = 0;
        int curr = 1;
        int sum = 0;
        for (int i = 0; i < numeroSerie; i++) {
            //Sommiamo precednete e corrente
            sum = prec + curr;
            prec = curr;
            curr = sum;
            System.out.println(sum);
        }
        //ritorniamo la somma
        return sum;
    }
}
