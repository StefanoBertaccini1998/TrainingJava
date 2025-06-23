package esempi;

public class Esempi {

    public static void main(String[] args) {
        String prova1 = "prova";
        String prova2 = prova1;
        String prova3 = null;

        prova1 = format(prova1);

        System.out.println(prova1);
        //prova
        System.out.println(prova2);
        //prova1
        System.out.println(prova3);
        //error

        prova1 = "prova2";
        prova2 = prova1;
        prova3 = "prova";
        String prova = "prova4";


        System.out.println(prova1);
        //prova2
        System.out.println(prova2);
        //prova2
        System.out.println(prova3);
        //prova
        System.out.println(prova);
        //prova4
        System.out.println(prova1 == prova2);
        //false
        System.out.println(prova1.equals(prova2));
        //false
        System.out.println(prova1 != prova2);
        //true
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
