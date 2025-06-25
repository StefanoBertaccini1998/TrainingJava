package esempi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Iterazioni {
    public static void main(String[] args) {

        int[] numeri = {3/*0*/, 5/*1*/, 6/*2*/, 3/*3*/, 1/*4*/, 654, 3, 5/*7*/};

        ArrayList<Integer> lista = new ArrayList();
        //Spostare tutti i dati dell'array all'interno della lista
        System.out.println(numeri.length);
        System.out.println(lista.size());

        System.out.println(numeri[numeri.length - 1]);
        System.out.println(numeri[0]);

        boolean isFoundNumber = true;
        int index = 0;

   /*     while (isFoundNumber) {
            System.out.println("index: " + index);
            if (numeri[index] == 1) {
                isFoundNumber = false;
                System.out.println("Found 1 at index: " + index);
            }
            index++;
        }*/
    /*    for(int i = 0; i<numeri.length;i++){
            System.out.println("for i: " + i);
            if (numeri[i] == 1) {
                System.out.println("Found 1 at index: " + i);
                break;
            }
            // Aggiungere alla lista solo i numeri pari
            if(numeri[i]%2!=0){
                System.out.println("Continue....");
                continue;
            }
            System.out.println("Add "+numeri[i]);
            lista.add(numeri[i]);
        }*/
        int index_each = 0;

        for(Integer i : numeri){
            System.out.println("Lista number "+i);
            if (i == 1) {
                System.out.println("Found 1 at index: " + index_each);
                break;
            }
            index_each++;
        }
        System.out.println("index_each: "+index_each);

        int valore = numeri[index_each];
        lista.get(index_each);
/*
        do {
            System.out.println("do index: " + index);
            if (numeri[index] == 1) {
                isFoundNumber = false;
                System.out.println("Found 1 at index: " + index);
            }
            index++;
        } while (isFoundNumber);*/

    }
}
