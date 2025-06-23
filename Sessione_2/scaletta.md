## 📄 Scaletta Sessione 2 – Tipi Primitivi, Variabili e Memoria in Java

### ⏱️ Durata

2 ore totali:

* 30–40 min teoria
* 30–40 min live coding
* 30–45 min esercitazione

---

### 🎯 Obiettivi della sessione

* Comprendere i tipi primitivi in Java e le differenze tra loro (dimensione, range, default).
* Distinguere tipi primitivi e tipi di riferimento (object/reference types).
* Dichiarare, inizializzare e usare variabili e costanti (`final`).
* Effettuare conversioni (casting implicito ed esplicito) e riconoscere overflow/underflow.
* Introdurre il concetto di memoria in Java: stack vs heap, gestione delle stringhe nel String Pool.
* Familiarizzare con i riferimenti (puntatori), il garbage collector e il lifecycle degli oggetti.

---

## 🧠 Teoria (30–40 min)

### 1. Tipi primitivi in Java

* **Interi**

    * `byte` (8 bit): –128 … 127
    * `short` (16 bit)
    * `int` (32 bit) – *default* per interi
    * `long` (64 bit) – suffisso `L`
* **Floating-point**

    * `float` (32 bit) – suffisso `f`
    * `double` (64 bit) – *default*
* **Boolean**

    * `boolean` → `true` / `false`
* **Carattere**

    * `char` (16 bit, Unicode): es. `'a'`, `'€'`, ` '\n'`

### 2. Tipi di riferimento e stringhe

* **Riferimenti (puntatori) in Java**

    * Ogni oggetto in heap è accessibile tramite riferimento in stack
    * Concetto di `null`
* **Stringhe**

    * Immutabilità e String Pool
    * concatenazione (`+` vs `StringBuilder`)
    * metodi base: `.length()`, `.charAt()`, `.substring()`

### 3. Memoria e Garbage Collector

* **Stack vs Heap**

    * Variabili primitive e riferimenti nello stack
    * Oggetti e array nell’heap
* **Garbage Collector**

    * Quando e perché scatta
    * Concetti base di generazioni (Young/Old)
    * `finalize()` deprecato; buone pratiche

### 4. Dichiarazione, inizializzazione e costanti

```java
int eta = 25;
float prezzo = 19.99f;
char iniziale = 'J';
boolean isAttivo = true;
final double PI = 3.14159;
```

### 5. Casting e overflow

* **Implicito (widening)**: es. `int` → `long`
* **Esplicito (narrowing)**: es. `double` → `int`
* **Overflow/Underflow**:

  ```java
  int max = Integer.MAX_VALUE;
  System.out.println(max + 1); // overflow
  ```

---

## 💻 Live Coding (30–40 min)

1. **Variabili primitive**: dichiarazione e stampa di tutti i tipi.
2. **Tipi di riferimento**: creare e modificare una `String`; mostrare differenza tra `+` e `StringBuilder`.
3. **Riferimenti e null**: assegnazione di `null`, NullPointerException.
4. **Memoria**: illustrare con diagramma a schermo stack vs heap.
5. **Casting**: esempi di widening e narrowing, overflow.
6. **Demo GC**: creare molti oggetti in un loop e forzare `System.gc()`.

---

## 🧪 Esercizi (30–45 min)

### Esercizio 1 – Tipi e stampa

* Dichiarare variabili di tipo `int`, `long`, `float`, `double`, `char`, `boolean`
* Dichiarare una `String` e concatenarla a un messaggio
* Stampare tutto con `System.out.println()`

### Esercizio 2 – Costanti e calcoli

* Usare `final double PI` per calcolare area e perimetro di cerchio e di una sfera
* Confrontare con i valori di `Math.PI`

### Esercizio 3 – Casting e overflow

* Convertire un `double` in `int`; spiegare la perdita di precisione
* Provare overflow su `byte` e gestire con controllo condizionale

### Esercizio 4 – Stringhe e memoria

* Creare due stringhe identiche e confrontare con `==` e `equals()`
* Usare `new String("…")` per forzare nuovi oggetti in heap
* Stampare identità dell’oggetto con `System.identityHashCode()`

---

## 📘 Homework

1. **TemperatureConverter.java**

    * Metodo `celsiusToFahrenheit(double c)` e `fahrenheitToCelsius(double f)`
2. **CastingTest.java**

    * Dichiarare variabili `double` e `long`, castarle in `int` e `short`, stampare risultati
3. **MemoryDemo.java**

    * Creare un array di oggetti, settarne alcuni a `null`, invocare `System.gc()`, osservare eventuali log
4. **StringPoolTest.java**

    * Esempi di pooling: confronto tra stringhe letterali e istanze `new String(...)`

---

## 📎 Materiale fornito

* Codice di esempio: `CastingDemo.java`, `OverflowTest.java`, `MemoryDemo.java`, `StringPoolTest.java`
* Slide sessione con diagrammi stack vs heap
* Documentazione ufficiale Java 17/21: [https://docs.oracle.com/en/java/javase/21/docs/api/index.html](https://docs.oracle.com/en/java/javase/21/docs/api/index.html)
