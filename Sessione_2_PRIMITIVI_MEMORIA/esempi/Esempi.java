package esempi;

public class Esempi {

    public static void main(String[] args) {

        String prova = "Ciao";
        String prova2 = "Ciao";
        String prova3 = new String("Ciao");

        boolean isEqualsisEquals = prova == prova2;
        boolean isEquals2 = prova != prova2;
        boolean isMajor = 1 > 6;
        boolean isMajor2 = 1 < 6;

        System.out.println(prova == prova2);
        System.out.println(isEqualsisEquals);
        //TRUE
        System.out.println(prova == prova3);
        //FALSE
        System.out.println(prova.equals(prova2));
        //TRUE
        System.out.println(prova.equals(prova3));
        //TRUE
    }

    private static String format(String stringa) {
        String preview = stringa;
        System.out.println(preview);
        return stringa + " ";
    }

    public boolean isEquals(String stringa1, String stringa2){
        return stringa1.equals(stringa2);
    }
}
