package esempi;

public class ColorsRandom {

    public static void main(String[] args) {
        Colors colore1 = Colors.GIALLO;
        Colors colore2 = Colors.ROSSO;
        DrugClass drugClass = DrugClass.C10;

        switch (drugClass) {
            case NA:
                System.out.println("E' NA");
                break;
            case C5, C3, C4:
                System.out.println("E' C3/4/5");
                break;
            case C2:
                System.out.println("E' C2");
                break;
            default:
                System.out.println("La catgeoria non viene gestista dallo switch dei colori");
        }
    }
}
