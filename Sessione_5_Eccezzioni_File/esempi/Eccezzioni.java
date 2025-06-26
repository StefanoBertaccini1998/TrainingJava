package esempi;

import java.io.*;

public class Eccezzioni {

    static int[] array = {1, 2, 3, 4, 5, 6};

    public static void main(String[] args) throws Exception {

        String stringa = null;

        //System.out.println(merge("ff", "     Mondo"));
        //System.out.print("Fine merge");
        String path = "C:\\Users\\elber\\Desktop\\StefanoBertaccini\\TrainingJava\\Sessione_5_Eccezzioni_File\\file\\students.csv";
        System.out.println(readFileCsv(path));
    }

    public static String taglia(String stringa) throws IOException {
        if (stringa == null || stringa.isEmpty()) {
            throw new IOException("Stringa nulla o vuota");
        }
        return stringa.trim();
    }

    public static String merge(String stringa1, String stringa2) throws Exception {
        if ((stringa1 == null || stringa1.isEmpty()) || (stringa2 == null || stringa2.isEmpty())) {
            //throw new RuntimeException("Stringa nulla o vuota");
        }

        try {
            stringa1 = taglia(stringa1);
            stringa2 = taglia(stringa2);
        } catch (Exception io) {
            System.out.println("Stringa vuota");
            stringa1 = "";
            stringa2 = "";
            throw new Exception("Stringa vuota");
        }

        return stringa1 + stringa2;
    }

    public static String readFile(String path) {
        String fileInLine = "";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                fileInLine += line;
                System.out.println(line);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error during parse file");
        }
        return fileInLine;
    }

    public static String readFileCsv(String path) {
        String fileInLine = "";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            String[] header = line.split(",");
            line = br.readLine();
            int counter = 0;
            while (line != null) {
                System.out.println("Riga [" + counter + "]");
                if (!line.contains(",")) {
                    System.out.println("Errore in riga:" + counter);
                   throw new Exception();
                } else {
                    String[] split = line.split(",");
                    for (int i = 0; i <= split.length; i++) {
                        System.out.println("\t" + header[i] + ": " + split[i]);
                    }
                }
                line = br.readLine();
                counter++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error during parse file");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return fileInLine;
    }

}
