package esempi;

public class Esempi2 {
    static int intero;
    static double doubles;
    static float floats;
    static final boolean booleans = true;
    static long longs;
    static byte bytes;


    public static void main(String[] args) {
        System.out.println(intero);
        doubles = 1.5D;
        longs = 1L;
        floats = 1F;
        intero = Integer.MAX_VALUE;
        System.out.println(intero);

        long castWide = intero;
        System.out.println(castWide);

        float castNarrow = (float) doubles;
        System.out.println(castNarrow);

        System.out.println(booleans);

        doubles = 1.911D;
        floats = 1.511F;
        System.out.println(doubles);
        System.out.println(floats);

        long quantita = (long) doubles;
        System.out.println(quantita);

        int numero = Integer.parseInt("1");
        double numero2 = Double.parseDouble("1");
        float numero3 = Float.parseFloat("1");
        Boolean.parseBoolean("S");
    }
}
