# 📄 Scaletta Sessione 2 – Tipi Primitivi e Variabili in Java

## ⏱️ Durata

2 ore totali:

* 30–40 min teoria
* 30–40 min live coding
* 30–45 min esercitazione

---

## 🎯 Obiettivi della sessione

* Comprendere i tipi primitivi in Java e le differenze tra loro.
* Dichiarare e inizializzare variabili.
* Usare le costanti (`final`).
* Effettuare conversioni (casting implicito ed esplicito).
* Identificare errori comuni legati ai tipi e overflow.

---

## 🧠 Teoria (30–40 min)

### Tipi primitivi in Java

Java dispone di 8 tipi primitivi:

#### Interi:

* `byte` (8 bit) – da -128 a 127
* `short` (16 bit)
* `int` (32 bit) – **valore predefinito** per interi
* `long` (64 bit) – suffisso `L`

#### Floating-point:

* `float` (32 bit) – suffisso `f`
* `double` (64 bit) – **valore predefinito** per decimali

#### Boolean:

* `boolean` → `true` / `false`

#### Carattere:

* `char` (16 bit, Unicode): es. `'a'`, `'€'`, `'\n'`

### Dichiarazione e inizializzazione

```java
int eta = 25;
float prezzo = 19.99f;
char iniziale = 'J';
boolean isAttivo = true;
```

### Costanti (`final`)

```java
final double PI = 3.14159;
```

* Non modificabili dopo l’assegnazione.

### Casting

* **Implicito** (widening): `int` → `long`, `float` → `double`
* **Esplicito** (narrowing): `double` → `int`

```java
double x = 5.8;
int y = (int) x; // y = 5
```

### Overflow

```java
int max = Integer.MAX_VALUE;
System.out.println(max + 1); // overflow
```

---

## 💻 Live Coding (30–40 min)

1. Dichiarazione di variabili di ogni tipo
2. Uso di `final` per dichiarare una costante
3. Casting implicito ed esplicito con stampa dei risultati
4. Simulazione di overflow con `int` e `byte`

---

## 🧪 Esercizi (30–45 min)

### Esercizio 1 – Tipo e stampa

* Dichiarare variabili per:

    * Età (`int`), nome (`String`), iniziale (`char`), attivo (`boolean`)
    * Stampa a console con `System.out.println()`

### Esercizio 2 – Costanti e calcolo area

* Usare `final double PI`
* Calcolare area cerchio dato un raggio

```java
final double PI = 3.14159;
double raggio = 4.5;
double area = PI * raggio * raggio;
```

### Esercizio 3 – Casting e overflow

* Convertire `double` → `int`
* Provare overflow con `byte` e `int`

---

## 📘 Homework

1. Scrivere un programma `TemperatureConverter.java` che converte:

    * da Celsius a Fahrenheit
    * da Fahrenheit a Celsius

2. `CastingTest.java`: dichiarare variabili `double`, castarle in `int` e stampare risultato

3. Trovare il valore massimo e minimo per `int` e `byte` usando:

```java
System.out.println(Integer.MAX_VALUE);
System.out.println(Byte.MIN_VALUE);
```

---

## 📎 Materiale fornito

* Codice di esempio `CastingDemo.java`, `OverflowTest.java`
* Slide sessione
* Documentazione Java (link JDK 21): [https://docs.oracle.com/en/java/javase/21/docs/api/index.html](https://docs.oracle.com/en/java/javase/21/docs/api/index.html)
