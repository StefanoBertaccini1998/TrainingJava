# 📄 Scaletta Sessione 5 – Chiusura dei Fondamentali di Java

## ⏱️ Durata

2 ore totali:

* 30 min teoria avanzata
* 30 min live coding
* 40 min esercitazione guidata
* 20 min review & preview OOP

---

## 🎯 Obiettivi della sessione

1. Consolidare i concetti di **metodi**, **scope** e **modularità** del codice.
2. Introdurre la **gestione delle eccezioni** (`try`/`catch`), cenni al **throws** e ai tipi di eccezione.
3. Mostrare un esempio base di **I/O su file** con `FileReader`/`FileWriter`.
4. Preparare il terreno al passaggio a **Programmazione a Oggetti**: incapsulamento, classi, oggetti.

---

## 🧠 Teoria Avanzata (30 min)

### 1. Metodi e Modularità

* **Dichiarazione**: `public static Tipo nome(Parametri) { … }`
* **Parametri** vs **argomenti**, **return** obbligatorio (o `void`).
* **Overloading**: stessi nomi, firme diverse.
* **Scope**: variabili locali vs variabili di classe (`static` e instance).

### 2. Gestione delle Eccezioni

* **Checked** vs **Unchecked** exceptions.
* Sintassi base:

  ```java
  try {
    // codice potenzialmente pericoloso
  } catch (TipoEccezione e) {
    // gestione
  } finally {
    // opzionale: pulizia risorse
  }
  ```
* Quando usare `throws` sulla firma del metodo.
* Best practice: non catturare `Exception` generico, loggare o rilanciare.

### 3. Introduzione a I/O su File

* **Reader/Writer** vs **Stream** (cenno).
* Esempio di lettura riga-per-riga:

  ```java
  try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
      String line;
      while ((line = br.readLine()) != null) {
          System.out.println(line);
      }
  } catch (IOException e) {
      e.printStackTrace();
  }
  ```
* **Try-with-resources** per chiudere automaticamente.

---

## 💻 Live Coding (30 min)

1. **Metodi**:

    * Definire `static int sum(int[] arr)` e `static double average(int[] arr)`.
    * Chiamarle da `main` e stampare risultati.

2. **Overloading**:

    * Aggiungere `static int sum(int a, int b)` e dimostrare l’uso.

3. **Eccezioni**:

    * Scrivere `static int parsePositive(String s)` che lancia `IllegalArgumentException` se `n < 0` o non è un numero.
    * Chiamarla dentro un `try/catch` in `main`.

4. **File I/O**:

    * Creare un piccolo file `data.txt` con numeri (o righe di testo).
    * Leggerlo con `BufferedReader` e contare quante righe/eseguire la somma dei numeri.

---

## 🧪 Esercitazione Guidata (40 min)

### Esercizio 1 – Utility Math

* Implementa una classe `MathUtils` con metodi statici:

    1. `factorial(int n)` (iterativo).
    2. `isPrime(int n)` (semplice test fino a √n).
* Testa entrambi in un `main`, catturando eventuali input invalidi.

### Esercizio 2 – Parser File CSV

* Dato un file `students.csv` con righe `nome,eta,media`, leggi ogni riga e crea stringhe:

  ```
  “Alice (18) → media 7.5”
  ```
* Gestisci eventuali righe malformate con `try/catch` e salta quelle errate.

### Esercizio 3 – Organizzazione del Codice

* Suddividi il progetto in due classi:

    * `CsvReader` con metodo `List<String[]> readCsv(String path) throws IOException`
    * `Main` con `public static void main(...)` che chiama `readCsv`
* Dimostra l’uso di `throws` e `try-with-resources`.

---

## 💬 Review & Preview OOP (20 min)

1. **Review**

    * Chiedere agli studenti di riassumere:

        * Cosa fa un metodo `static`?
        * Differenza tra `checked` e `unchecked` exception.
        * Vantaggi del try-with-resources.

2. **Preview OOP**

    * Introduzione ai concetti di:

        * **Classe** e **istanza**
        * **Incapsulamento** e **modifier** (`private`/`public`)
        * **Costruttori**
    * Illustrare come i metodi definiti oggi diventeranno **metodi di istanza** delle classi.

---

## 📘 Homework

1. **FileStats.java**

    * Leggi un file di testo e conta: righe, parole e caratteri.
    * Stampa i risultati in console.

2. **ExceptionDemo.java**

    * Scrivi un metodo che legge un intero da `Scanner` e rilancia `NumberFormatException` con messaggio personalizzato.
    * Gestisci l’eccezione in `main`.

3. **Preparazione OOP**

    * Leggi il capitolo introduttivo su classi, oggetti e costruttori nelle slide OOP.

---

## 📎 Materiale fornito

* Codice di esempio: `MathUtils.java`, `CsvReader.java`, `DoFileIO.java`
* Slide sessione: “Metodi, Eccezioni & I/O”
* Esempio di `students.csv` per esercitazione
