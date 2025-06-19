# Transcript – Sessione 1: Introduzione a Java e Ambiente di Sviluppo

## 📍 Introduzione (5 min)

Buongiorno a tutte e a tutti, e benvenuti alla prima giornata del nostro percorso in AutoTest Academy.

Oggi cominciamo dalle fondamenta: capiremo insieme cos'è Java, perché è uno dei linguaggi più usati al mondo e come possiamo iniziare subito a scrivere codice. Questa sessione è pensata per essere il trampolino di lancio verso l'autonomia nello sviluppo e nell'automazione dei test. L'obiettivo è arrivare, già da subito, a eseguire un primo programma, compreso in ogni sua parte.

---

## 🧠 Parte Teorica (30–40 min)

### Cos'è Java e perché lo usiamo

Java è un linguaggio di programmazione general-purpose, **orientato agli oggetti**, e progettato per essere **portabile**: questo significa che il codice scritto una volta può essere eseguito su qualsiasi sistema operativo, purché sia installata la **Java Virtual Machine (JVM)**.

Java è nato alla fine degli anni ’90, ed è stato pensato fin dall'inizio per essere sicuro, stabile e scalabile. Oggi è utilizzato in moltissimi contesti: applicazioni web, software gestionali, dispositivi embedded, e soprattutto nell'automazione di test.

### JDK, JRE e JVM: cosa installiamo e perché

* Il **JDK** (Java Development Kit) è l'ambiente completo per scrivere, compilare e testare codice Java. Include il compilatore `javac`, il launcher `java`, strumenti di debugging, documentazione, etc.
* Il **JRE** (Java Runtime Environment) è sufficiente per eseguire programmi Java, ma non consente di svilupparli.
* La **JVM** è la macchina virtuale che legge ed esegue il bytecode Java, garantendo la portabilità del codice.

Nel nostro caso, installeremo sempre il JDK, che contiene anche tutto il resto.

### Come è fatto un programma Java

Ogni programma Java parte da un metodo speciale chiamato `main`.

Vediamo un esempio:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Ciao, mondo!");
    }
}
```

Spieghiamolo:

* `public class HelloWorld` definisce il contenitore del nostro codice.
* `public static void main(String[] args)` è il metodo principale, da cui tutto parte.
* `System.out.println(...)` serve a stampare a console.

### IDE e terminale: come vogliamo lavorare

Useremo inizialmente il terminale per imparare davvero cosa succede "dietro le quinte":

* Con `javac` compiliamo il codice sorgente in bytecode.
* Con `java` eseguiamo il file `.class` risultante.

Più avanti, passeremo gradualmente all’utilizzo di un IDE come IntelliJ IDEA per accelerare la produttività.

### Variabili d’ambiente e configurazione iniziale

Due variabili sono fondamentali:

* `JAVA_HOME` → punta alla cartella dove è installato il JDK.
* `PATH` → contiene il percorso alla cartella `bin` del JDK, per poter lanciare `javac` e `java` da qualunque cartella.

Verificheremo insieme che la configurazione sia corretta eseguendo `java -version` e `javac -version` da terminale.

---

## 💻 Live Coding (30–40 min)

Scriviamo insieme il nostro primo programma. Seguite passo dopo passo.

1. Apriamo un editor (Notepad, Notepad++, o un IDE come IntelliJ).
2. Creiamo un file chiamato `HelloWorld.java`
3. Scriviamo:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Ciao, mondo!");
    }
}
```

4. Da terminale, spostiamoci nella cartella dove abbiamo salvato il file.
5. Compiliamo:

```bash
javac HelloWorld.java
```

6. Se tutto è corretto, verrà creato il file `HelloWorld.class`.
7. Eseguiamolo:

```bash
java HelloWorld
```

8. Vedremo a schermo: `Ciao, mondo!`

### Possibili errori da mostrare e spiegare

* Nome della classe e del file devono coincidere → `HelloWorld.java` contiene `public class HelloWorld`
* Mancanza del punto e virgola `;`
* Errore di digitazione (`System.ou.println` anziché `System.out.println`)

Questi errori sono ottimi spunti per familiarizzare con il compilatore e i messaggi d’errore.

---

## 🧪 Esercitazione Guidata (30–45 min)

### Esercizio 1 – Programma di benvenuto

Create un file `Saluto.java` che stampi il messaggio:
"Benvenuto nel corso AutoTest Academy!"

### Esercizio 2 – Simulazione di errore

Cambiate il nome della classe in `Saluto2` ma lasciate il file come `Saluto.java`. Provate a compilare: osservate e spiegate l’errore restituito dal compilatore.

### Esercizio 3 – Stampa su più righe

Stampate tre righe usando `System.out.print()` e `System.out.println()` per vedere la differenza tra stampa con e senza ritorno a capo.

---

## 📝 Compiti a casa

### 1. Programma "MiaIdentità.java"

Stampate:

* Il vostro nome
* Il motivo per cui seguite il corso
* Un obiettivo che volete raggiungere

### 2. Programma "Curiosità.java"

Stampate tre curiosità su Java, ad esempio:

* Anno di nascita
* Società che lo ha creato
* Significato del nome “Java”

### 3. Errore controllato

Create un file Java con un errore intenzionale (es. togliete un punto e virgola o scrivete male una keyword). Compilate e annotate il messaggio di errore.

---

## ✅ Conclusione

Abbiamo costruito insieme le basi per poter scrivere, compilare ed eseguire un programma Java. Abbiamo anche visto come interpretare gli errori più comuni. Questo è il primo passo per arrivare, tra qualche settimana, a scrivere test automatici strutturati.

Domani parleremo di **tipi di dati primitivi**, **variabili** e **costanti**. Vi consiglio di rifare oggi pomeriggio tutti gli esercizi e portare eventuali dubbi alla prossima lezione.

Grazie e buon lavoro!
