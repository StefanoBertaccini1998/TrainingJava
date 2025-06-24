package esempi;

public class ColorsRandom {

    public static void main(String[] args) {
        Colors colore1 = Colors.GIALLO;
        Colors colore2 = Colors.ROSSO;

        switch (colore1) {
            case ROSSO:
                System.out.println("E' ROSSO");
                break;
            case GIALLO:
                System.out.println("E' GIALLO");
            case CALDO:
                System.out.println("E' caldo");
                break;
            case BLU:
                System.out.println("E' BLU");
            case VERDE:
                System.out.println("E' VERDE");
            case FREDDO:
                System.out.println("E' FREDDO");
                break;
            default:
                System.out.println("Nessun colore");

        }
    }
}
