# Esercitazione 2h – Calcolatrice da CLI

## 1. Argomenti di base

1. **Struttura di un programma Java**

    * `public static void main(String[] args)`
    * `System.out.print` / `System.out.println`
2. **Tipi primitivi e variabili**

    * `int`, `double`, `boolean`, `char`
    * operatori aritmetici (`+ - * / %`), di confronto (`==, !=, <, >`) e logici (`&&, ||, !`)
3. **Input da console**

    * `Scanner` su `System.in`
    * gestione di `InputMismatchException`
4. **Controllo di flusso**

    * `if` / `else if` / `else`
    * `switch` su `int` / `String` / `enum` + `default` + `break`
5. **Cicli**

    * `for`, `for-each`
    * `while` e `do-while`
    * `break`, `continue`
6. **Metodi statici**

    * dichiarazione, parametri, `return`
    * overloading
7. **Gestione eccezioni**

    * `try` / `catch` / `finally`
    * eccezioni checked vs unchecked
    * validazione manuale e `throw new IllegalArgumentException(...)`
8. **Collezioni (opzionale)**

    * `ArrayList<String>` per storicizzare i risultati

---

## 2. Descrizione dell’esercizio

Realizzare un’applicazione a riga di comando che:

1. **Menu principale**

    * Al lancio dell’app mostra:

      ```text
      1. Somma
      2. Sottrazione
      3. Moltiplicazione
      4. Divisione
      5. Modulo
      6. Potenza
      7. Radice quadrata
      8. Visualizza cronologia
      9. Fattoriale (opzionale)
      0. Esci
      ```
2. **Loop principale**

    * Usa un `do { … } while(choice != 0);` per ripresentare il menu fino all’uscita.
3. **Lettura scelta**

    * `Scanner.nextInt()` dentro un `try/catch(InputMismatchException)`.
    * In caso di errore, ripulisci lo scanner con `nextLine()` e richiedi di nuovo.
4. **Switch sulla scelta**

    * Per ogni `case`, invocare il metodo corrispondente.
    * `default` per scelte non valide.
5. **Metodi per le operazioni**

    * `static double somma(double a, double b)`, ecc.
    * Divisione: gestire `b == 0` (lanciare o catturare eccezione).
    * Radice quadrata: `Math.sqrt(a)` solo se `a >= 0`, altrimenti errore.
    * Potenza: `Math.pow(a, b)`.
    * Modulo: `a % b`, gestendo `b == 0`.
    * Fattoriale (opzionale): calcolo con ciclo `for`.
6. **Lettura dei numeri**

    * In ogni metodo, validare `scanner.nextDouble()` con il giusto `try/catch`.
    * Ripetere la richiesta finché non è numerico.
7. **Cronologia**

    * `List<String> history = new ArrayList<>()` per salvare le operazioni:

      ```text
      "5.0 + 3.2 = 8.2"
      ```
    * Case 8: stampare tutte le voci.
8. **Validazioni extra**

    * Contatore di tentativi per input errati (es. max 3, poi termina).
    * Verifica che il menu item sia tra 0 e 9.
9. **Pulizia del codice**

    * Separare le operazioni in metodi.
    * Usare costanti `final int` per i codici di menu.
    * Commenti JavaDoc per i metodi.

---

## 3. Suddivisione delle 2 ore

| Fase            | Durata | Contenuto                                                       |
| --------------- | ------ | --------------------------------------------------------------- |
| **Teoria**      | 30 min | Ripasso veloce: menu, switch, try/catch, scanner, metodi, loop. |
| **Live Coding** | 40 min | - Setup progetto e `Calculator.java`                            |

* Implementazione del menu + loop principale
* Lettura scelta + switch
* Metodo `somma()` completo
* Gestione eccezioni di input |
  \| **Esercitazione**    | 50 min   | Completamento delle operazioni: sottrazione, moltiplicazione, divisione con gestione zero; cronologia in `List`; potenza, radice, modulo; fattoriale opzionale. |

---

*Buon lavoro!*
