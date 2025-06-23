## 📄 Scaletta Sessione 2 – Tipi Primitivi, Variabili e Memoria in Java

### ⏱️ Durata

2 ore totali:

* 30–40 min teoria
* 30–40 min live coding
* 30–45 min esercitazione

---

### 🎯 Obiettivi della sessione

* Comprendere i tipi primitivi in Java e le differenze tra loro (dimensione, range, valore di default).
* Distinguere fra tipi primitivi e tipi di riferimento (object/reference types).
* Dichiarare, inizializzare e usare variabili e costanti (`final`).
* Effettuare conversioni (casting implicito ed esplicito) e riconoscere overflow/underflow.
* Introdurre il concetto di memoria in Java: stack vs heap, String Pool.
* Familiarizzare con riferimenti (puntatori), Garbage Collector e lifecycle degli oggetti.

---

## 🧠 Teoria (30–40 min)

### 1. Tipi primitivi in Java

**Definizione:** un *tipo primitivo* rappresenta un valore semplice, non un oggetto. È immutabile, memorizzato direttamente nello stack, e offre alta efficienza.

Esistono 8 tipi primitivi:

* **Interi**

  * `byte` (8 bit): –128 … 127
  * `short` (16 bit): –32.768 … 32.767
  * `int` (32 bit): –2³¹ … 2³¹-1; *default* per numeri interi
  * `long` (64 bit): –2⁶³ … 2⁶³-1; richiede suffisso `L`

* **Floating-point (decimali)**

  * `float` (32 bit): precisione singola; suffisso `f`
  * `double` (64 bit): precisione doppia; *default* per decimali

* **Booleano**

  * `boolean`: può valere solo `true` o `false`; occupa in pratica 1 bit/logica

* **Carattere**

  * `char` (16 bit, Unicode): rappresenta un singolo carattere; es. `'a'`, `'€'`, `'
    '`

> **Promemoria discorsivo:** se ti perdi fra le dimensioni, ricorda che `byte` e `short` servono per risparmiare spazio (ram), mentre `int` e `double` sono le scelte standard per interi e decimali. Usare il suffisso (`L`, `f`) è obbligatorio per literal di tipo diverso da default.

---

### 2. Tipi di riferimento e gestione delle stringhe

**Definizione:** un *tipo di riferimento* contiene un puntatore che indirizza un oggetto nell’heap. Il valore della variabile è l’indirizzo di memoria, non il dato stesso.

* Riferimenti (`puntatori`): possono valere `null` quando non puntano a nessun oggetto.
* Se provi a usare un riferimento `null`, ottieni una `NullPointerException`.

#### Stringhe in Java

Le stringhe (`String`) sono oggetti immutabili memorizzati in una struttura chiamata *String Pool*:

* Ogni literal `"ciao"` viene messo nel pool: se dichiari due volte `"ciao"`, entrambi i riferimenti puntano allo stesso oggetto.
* Creare una stringa con `new String("ciao")` genera un nuovo oggetto fuori dal pool.
* Immutabilità: ogni operazione di concatenazione crea un nuovo oggetto. Per operazioni multiple, usare `StringBuilder`:

  ```java
  StringBuilder sb = new StringBuilder();
  sb.append("ciao").append(" mondo");
  String s = sb.toString();
  ```

> **Promemoria discorsivo:** ricorda di spiegare `==` vs `.equals()`: `==` confronta riferimenti; `.equals()` confronta contenuto.

---

### 3. Memoria e Garbage Collector

#### Stack vs Heap

* **Stack**: struttura LIFO; memorizza variabili primitive e riferimenti.
* **Heap**: spazio di memoria dinamica per oggetti e array; richiede gestione automatica.

#### Garbage Collector (GC)

* Responsabile di liberare oggetti non più raggiungibili (garbage).
* Opera in generazioni: Young (nuovi oggetti) e Old (oggetti di lunga vita).
* Invocare `System.gc()` è solo un suggerimento alla JVM, non una forzatura.
* Il metodo `finalize()` è deprecato: meglio usare `try-with-resources` o `Cleaner` per risorse esterne.

> **Promemoria discorsivo:** se perdi il filo, ricorda che non gestiamo manualmente la memoria: JVM e GC fanno tutto. È importante capire dove vengono allocate variabili e oggetti per ottimizzare prestazioni.

---

### 4. Dichiarazione, inizializzazione e costanti

```java
int eta = 25;
float prezzo = 19.99f;
char iniziale = 'J';
boolean isAttivo = true;
final double PI = 3.14159;
```

* `final`: rende la variabile *costante*, non modificabile dopo l'assegnazione.
* Le variabili locali (in un metodo) risiedono nello stack; i campi di classe (o di istanza) vengono inizializzati a valori di default se non impostati.

> **Promemoria discorsivo:** quando dichiari un campo a livello di classe senza inizializzarlo, Java assegna un valore di default (`0` per numeri, `false` per boolean, `null` per riferimenti).

---

### 5. Casting, Widening, Narrowing e Overflow

* **Widening (implicito):** conversione sicura da tipo piccolo a tipo grande (es. `int`→`long`, `float`→`double`).
* **Narrowing (esplicito):** conversione da tipo grande a tipo piccolo (es. `double`→`int`); richiede cast manuale:

  ```java
  double x = 5.7;
  int y = (int) x; // y = 5 (troncamento, non arrotondamento)
  ```
* **Overflow/Underflow:** se un'operazione supera il range del tipo, il risultato avvolge ciclicamente senza eccezione:

  ```java
  int max = Integer.MAX_VALUE;
  System.out.println(max + 1); // risultato negativo
  ```

> **Promemoria discorsivo:** sottolinea sempre che il cast esplicito *perde* informazione: parti decimali vengono scartate, non arrotondate.

---

## 💻 Live Coding (30–40 min)

Durante il live coding, guida gli studenti attraverso demo mirate e focalizzate su concetti chiave:

1. **Dichiarazione e inizializzazione di tipi primitivi**

  * Mostra come dichiarare `byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean`.
  * Spiega il valore di default e l'importanza del suffisso (`L`, `f`).
  * Concetto chiave: *efficienza della memoria*—perché scegliere un tipo piuttosto che un altro.

2. **Uso di `final` per le costanti**

  * Definisci una costante `PI` e fallo utilizzare in un calcolo semplice.
  * Concetto chiave: *immutabilità* e manutenzione del codice.

3. **Gestione delle stringhe e tipi di riferimento**

  * Crea due stringhe letterali identiche e confrontale con `==` e `.equals()`.
  * Usa `new String()` e mostra che cambia il riferimento.
  * Concetto chiave: *String Pool* e differenza tra confronto di riferimento e confronto di contenuto.

4. **Esempio di NullPointerException**

  * Assegna `null` a un riferimento `String` e prova a chiamare un metodo.
  * Gestisci la NPE con un blocco `try-catch`.
  * Concetto chiave: *controllo dei riferimenti* e best practice per evitare NPE.

5. **Diagramma di memoria: stack vs heap**

  * Scrivi un metodo semplice che dichiara variabili locali e crea un oggetto.
  * Disegna a video (o lavagna) lo stack frame e l’area heap per l’oggetto.
  * Concetto chiave: *allocazione di memoria* e scope delle variabili.

6. **Casting, overflow e underflow**

  * Mostra un widening implicito (`int`→`long`) e un narrowing esplicito (`double`→`int`).
  * Esegui un overflow con `int` (Integer.MAX\_VALUE + 1) e un underflow con `byte`.
  * Concetto chiave: *perdita di dati* e comportamento ciclico dei tipi primitivi.

7. **Dimostrazione del Garbage Collector**

  * Crea ripetutamente oggetti in un ciclo e chiama `System.gc()`.
  * Spiega che l’invocazione è solo un suggerimento e mostra log di GC se disponibile.
  * Concetto chiave: *gestione automatica della memoria* e generazioni del GC.

---

## 🧪 Esercizi (30–45 min)

### Esercizio 1 – Tipi e stampa

* Dichiarare variabili di tipo `int`, `long`, `float`, `double`, `char`, `boolean`.
* Dichiarare una `String` e concatenarla in un messaggio.
* Stampare tutto con `System.out.println()`.

### Esercizio 2 – Costanti e calcoli

* Usare `final double PI` per calcolare area e perimetro di un cerchio e di una sfera.
* Confrontare con `Math.PI`.

### Esercizio 3 – Casting e overflow

* Convertire un `double` in `int` e descrivere la perdita di precisione.
* Provare overflow su `byte` con valore > 127 e gestire con controllo `if`.

### Esercizio 4 – Riferimenti e stringhe

* Creare due stringhe identiche e confrontare con `==` vs `.equals()`.
* Usare `new String("...")` per un oggetto fuori dal pool.
* Stampare `System.identityHashCode()` per mostrare gli indirizzi.

---

## 📘 Homework

### 1. `TemperatureConverter.java`

* Metodo `celsiusToFahrenheit(double c)` e `fahrenheitToCelsius(double f)`.

### 2. `CastingTest.java`

* Provare cast da `double` a `int` e commentare i risultati.

### 3. `MemoryDemo.java`

* Creare un array di oggetti, impostarne alcuni a `null`, invocare `System.gc()`, osservare eventuali log.

### 4. `StringPoolTest.java`

* Esempi di pooling: confronto tra stringhe letterali e `new String(...)`.

---

## 📎 Materiale fornito

* Codice di esempio: `CastingDemo.java`, `OverflowTest.java`, `MemoryDemo.java`, `StringPoolTest.java`
* Slide sessione con diagrammi stack vs heap
* Documentazione ufficiale Java 17/21: [https://docs.oracle.com/en/java/javase/21/docs/api/index.html](https://docs.oracle.com/en/java/javase/21/docs/api/index.html)
