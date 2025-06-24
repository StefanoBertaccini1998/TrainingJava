package esercizi;

public class StringEqualityTrick {
    public static void main(String[] args) {
        //equal();
        //equalIgnore();
        //processor();
        swicther();
    }

    public static void equal() {
        String s1 = "Java";
        String s2 = "Ja" + "va";
        String s3 = new String("Java");
        String s4 = s3.intern();

        System.out.println("s1 == s2: " + (s1 == s2));
        //true
        System.out.println("s1 == s3: " + (s1 == s3));
        //false
        System.out.println("s1.equals(s3): " + s1.equals(s3));
        //true
        System.out.println("s1 == s4: " + (s1 == s4));
        //true
    }

    public static void equalIgnore() {
        String a = "Test";
        String b = new String("Test");
        String c = "test";

        System.out.println("a == b: " + (a == b));
        //false
        System.out.println("a.equals(b): " + a.equals(b));
        //True
        System.out.println("a == c: " + (a == c));
        //false
        System.out.println("a.equals(c): " + a.equals(c));
        //false
        System.out.println("a.equalsIgnoreCase(c): " + a.equalsIgnoreCase(c));
        //true
    }

    public static void processor() {
        String[] commands = {"start", "process", "STOP", "stop", "restart"};
        boolean active = false;

        for (String cmd : commands) {
            System.out.println("Comando: " + cmd);

            if (cmd.contains("start")) {
                if(active){
                    System.out.println(" → Riattivato");
                }else{
                    active = true;
                    System.out.println(" → Attivato");
                }
            } else if (active && "process".equals(cmd)) {
                System.out.println(" → Elaborazione in corso");
            } else if ("STOP".equalsIgnoreCase(cmd)) {
                if (active) {
                    active = false;
                    System.out.println(" → Disattivato");
                } else {
                    System.out.println(" → Stop ignorato perché già inattivo");
                }
            } else if ("stop".equals(cmd)) {
                System.out.println(" → stop in minuscolo: non fermo nulla");
            }else {
                System.out.println(" → Comando sconosciuto");
            }
            System.out.println("---");
        }
    }

    public static void swicther() {
        String[] levels = {"LOW", "MEDIUM", "HIGH", "ULTRA"};

        for (String lvl : levels) {
            System.out.println("Livello: " + lvl);
            switch (lvl) {
                case "LOW":
                    System.out.println(" → Low level");
                    break;
                case "MEDIUM":
                    System.out.println(" → Medium level");
                    break;
                default:
                    System.out.println(" → Unknown level: " + lvl);
                    // caduta intenzionale nel case "HIGH"
                case "HIGH":
                    System.out.println(" → High level or default→high");
                    break;
            }
            System.out.println("==========");
        }
    }
}
