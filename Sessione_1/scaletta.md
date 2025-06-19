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

* File `.java` con una classe pubblica.
* Necessità di un **metodo `main`**:

```java
public static void main(String[] args) {
    // codice eseguibile
}
```

### JDK, JRE, JVM
https://www.oracle.com/it/java/technologies/downloads/#jdk21-windows
* **JDK**: kit di sviluppo (include compilatore `javac`).
* **JRE**: ambiente di esecuzione per Java.
* **JVM**: macchina virtuale che esegue il bytecode.

### IDE consigliati

* IntelliJ IDEA (Community) https://www.jetbrains.com/idea/download/?section=windows
* Eclipse
* VS Code (con estensioni Java)

### Compilazione manuale

```bash
javac HelloWorld.java
java HelloWorld
```

### Variabili d'ambiente

* `JAVA_HOME` = cartella JDK
* `PATH` = includere `$JAVA_HOME/bin`

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

### Spiegazioni

* `public class HelloWorld` → definizione della classe.
* `main` → punto d'ingresso.
* `System.out.println()` → stampa su console.

---

## 🧪 Esercizi (30–45 min)

### Esercizio 1 – Compila ed esegui

* File: `Saluto.java`
* Output: `"Benvenuto nel corso AutoTest Academy!"`

### Esercizio 2 – Errori comuni

* Cambia nome classe (es. `Saluto2`) senza cambiare nome file → errore da analizzare.

### Esercizio 3 – Print multipli

* Differenze tra `print()` e `println()`.

---

## 📘 Homework

### Ripasso

* Architettura JVM, compilazione, differenze tra `print` e `println`.

### Esercizi offline

1. `MiaIdentità.java`: stampa nome, cognome, obiettivo del corso.
2. `Curiosità.java`: stampa 3 curiosità su Java.
3. Crea un errore di sintassi e osserva il messaggio del compilatore.

---

## 📎 Materiale fornito

* File `HelloWorld.java`
* Slide sessione (questo documento)
* Checklist ambiente: JDK, variabili, IDE
