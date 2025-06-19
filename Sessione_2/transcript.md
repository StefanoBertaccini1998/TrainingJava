# Transcript – Sessione 2: Tipi Primitivi e Variabili in Java

## 📍 Introduzione (5 min)

Buongiorno a tutte e tutti! Nella seconda sessione di AutoTest Academy continuiamo a costruire le basi della programmazione in Java. Oggi ci concentreremo su una parte fondamentale: **i tipi primitivi** e **le variabili**.

Conoscere i tipi di dato significa saper usare in modo corretto la memoria, evitare errori di conversione e scrivere codice chiaro e robusto. Faremo molta pratica tra dichiarazioni, costanti e conversioni.

---

## 🧠 Teoria – Tipi Primitivi (30–40 min)

### Cos’è un tipo primitivo?

In Java, un tipo primitivo rappresenta un dato semplice, che non è un oggetto. È immutabile e altamente performante.
Ne esistono 8:

**Interi:**

* `byte` → 8 bit (da -128 a 127)
* `short` → 16 bit
* `int` → 32 bit (scelta predefinita per numeri interi)
* `long` → 64 bit (richiede il suffisso `L`)

**Floating-point (decimali):**

* `float` → 32 bit (richiede il suffisso `f`)
* `double` → 64 bit (default per i decimali)

**Booleani:**

* `boolean` → può valere solo `true` o `false`

**Carattere:**

* `char` → 16 bit, codifica Unicode, es. `'a'`, `'€'`, `'\n'`

### Dichiarazione e inizializzazione

Spieghiamo e scriviamo a voce alta:

```java
int eta = 30;
float prezzo = 19.99f;
char iniziale = 'A';
boolean isAttivo = true;
```

Parliamo anche di variabili locali (all’interno di un metodo) e della differenza con campi di istanza (che vedremo con le classi).

### Costanti con `final`

```java
final double PI = 3.14159;
```

* Una volta assegnata, non può più essere modificata.
* Usata per valori simbolici, come `PI`, `TAX_RATE`, `MAX_RETRY`...

---

## 🎯 Conversioni e Casting

Spieghiamo le due direzioni:

* **Widening (implicito)**: es. `int` → `long`, `float` → `double`
* **Narrowing (esplicito)**: es. `double` → `int`, richiede cast manuale:

```java
double x = 5.7;
int y = (int) x; // y diventa 5
```

Chiarire che i decimali vengono **troncati**, non arrotondati!

---

## ⚠️ Overflow e Limiti

Usiamo questo esempio:

```java
int max = Integer.MAX_VALUE;
System.out.println(max + 1); // risulterà in overflow
```

Risultato: numero negativo per overflow del range. È un comportamento **noto** e non genera errore in compilazione, ma può causare bug logici.

---

## 💻 Live Coding (30–40 min)

Guidare passo-passo:

1. Dichiarare variabili di tutti i tipi primitivi e stampare con `System.out.println()`.
2. Dichiarare una costante con `final`.
3. Mostrare un cast esplicito: `double → int`.
4. Dimostrare un overflow con `byte` e `int`.
5. Spiegare perché è importante conoscere i limiti del tipo (usare `Integer.MAX_VALUE`).

---

## 🧪 Esercizi (in aula)

### Esercizio 1: Profilo utente

* Variabili `nome` (String), `eta` (int), `iniziale` (char), `isStudente` (boolean)
* Stampa a console:

```java
System.out.println("Nome: " + nome);
System.out.println("Età: " + eta);
System.out.println("Iniziale: " + iniziale);
System.out.println("Studente: " + isStudente);
```

### Esercizio 2: Area del cerchio

* Usare `final double PI`
* Calcolare `area = PI * raggio * raggio`

### Esercizio 3: Esperimenti di casting e overflow

* Dichiarare un `double`, convertirlo in `int`, e stampare
* Provare un `byte` con valore oltre 127 e vedere cosa succede

---

## 📘 Homework (a casa)

### 1. `TemperatureConverter.java`

* Dato un valore in °C, convertirlo in °F: `F = C * 9/5 + 32`
* E viceversa: `C = (F - 32) * 5/9`

### 2. `CastingTest.java`

* Provare vari cast da `double` a `int` e spiegare con commenti il risultato

### 3. Limiti

* Stampare valori massimi e minimi per `int`, `byte`, `double` usando:

```java
System.out.println(Integer.MAX_VALUE);
System.out.println(Byte.MIN_VALUE);
```

---

## ✅ Conclusione

Oggi abbiamo capito che in Java ogni tipo ha regole precise. Sapere quale tipo usare ci aiuta a evitare sprechi di memoria e bug logici. Le conversioni sono potenti ma vanno maneggiate con attenzione.

Nella prossima sessione entreremo nel mondo del **controllo di flusso**: if, else, switch, cicli. Portate i vostri esercizi completati e preparatevi a costruire logiche decisionali in Java!
