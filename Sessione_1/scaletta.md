# 📄 Scaletta Sessione 1 – Introduzione a Java e Ambiente di Sviluppo

## ⏱️ Durata

2 ore totali:

* 30–40 min teoria
* 30–40 min live coding
* 30–45 min esercitazione

---

## 🎯 Obiettivi della sessione

* Comprendere cos'è Java, la sua storia e le sue caratteristiche principali.
* Configurare l'ambiente di sviluppo: JDK, IDE e variabili d'ambiente.
* Scrivere e compilare il primo programma Java.
* Imparare a utilizzare il terminale per compilare ed eseguire codice.

---

## 🧠 Teoria (30–40 min)

### Cos'è Java

* Linguaggio general-purpose e **orientato agli oggetti**.
* Nato alla fine degli anni '90 presso **Sun Microsystems**.
* Filosofia: **"Write Once, Run Anywhere"** grazie alla **JVM** (Java Virtual Machine).

### Architettura di un programma Java

* Un file `.java` contiene una classe pubblica.
* Ogni programma ha un metodo `main` che rappresenta il punto d'ingresso:

```java
public static void main(String[] args) {
    // codice eseguibile
}
```

### JDK, JRE, JVM

* **JDK** (Java Development Kit): include `javac`, il compilatore, e strumenti di sviluppo.
* **JRE** (Java Runtime Environment): per eseguire applicazioni Java.
* **JVM** (Java Virtual Machine): interpreta ed esegue il bytecode.
* 📥 Scarica JDK: [https://www.oracle.com/it/java/technologies/downloads/#jdk21-windows](https://www.oracle.com/it/java/technologies/downloads/#jdk21-windows)

### IDE consigliati

* IntelliJ IDEA (Community): [https://www.jetbrains.com/idea/download/?section=windows](https://www.jetbrains.com/idea/download/?section=windows)
* Eclipse
* VS Code (con estensioni Java)

### Compilazione manuale

```bash
javac HelloWorld.java
java HelloWorld
```

### Variabili d'ambiente

* `JAVA_HOME`: puntare alla cartella del JDK
* `PATH`: includere `$JAVA_HOME/bin` o `%JAVA_HOME%\bin` su Windows

---

## 💻 Live Coding (30–40 min)

### Scriviamo HelloWorld.java

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Ciao, mondo!");
    }
}
```

### Compilazione da terminale

```bash
javac HelloWorld.java
java HelloWorld
```

### Spiegazioni dettagliate

* `public class HelloWorld` → definizione della classe, che deve avere lo stesso nome del file.
* `public static void main(...)` → metodo principale, eseguito dalla JVM.
* `System.out.println()` → stampa su console con a capo.

---

## 🧪 Esercizi (30–45 min)

### Esercizio 1 – Compila ed esegui

* Crea il file `Saluto.java`.
* Scrivi un programma che stampi:

```java
System.out.println("Benvenuto nel corso AutoTest Academy!");
```

* Compila ed esegui.

### Esercizio 2 – Errori comuni

* Cambia il nome della classe (es. `Saluto2`) ma lascia il file `Saluto.java`.
* Compila e analizza l’errore restituito: "class Saluto2 is public, should be declared in a file named Saluto2.java".

### Esercizio 3 – Print multipli

* Usa `System.out.print()` e `System.out.println()` per confrontare:

```java
System.out.print("Linea senza a capo");
System.out.println(" → con a capo");
```

---

## 📘 Homework

### Ripasso

* Rivedere differenze tra JDK, JRE, JVM.
* Riconoscere errori di compilazione.
* Capire la differenza tra `print()` e `println()`.

### Esercizi offline

1. `MiaIdentità.java`: stampa nome, cognome, motivazione per il corso.
2. `Curiosità.java`: stampa tre curiosità su Java (es. data di nascita, motto, diffusione).
3. Crea un errore di sintassi (es. dimentica un punto e virgola), compila e copia l’errore.

---

## 📎 Materiale fornito

* File di esempio `HelloWorld.java`
* Slide sessione (questo documento)
* Checklist ambiente: installazione JDK, configurazione variabili, test da terminale
