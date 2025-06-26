# 📄 Transcript Lezione – Sessione 5: Chiusura dei Fondamentali di Java

**Note per il docente**: Appunti, prompt e punti chiave per ogni sezione, con suggerimenti per mantenere viva l’attenzione.

---

## 1. Introduzione e Obiettivi (3 min)

> **Insegnante:**
> "Oggi completiamo i fondamentali Java con metodi, eccezioni e I/O su file, per arrivare pronti al paradigma a oggetti."

* **Concetti chiave da nominare**: modularità del codice, robustezza tramite gestione errori, persistenza dati semplice.
* **Tip coinvolgimento**: chiedere "Chi ha già usato un metodo helper?" per introdurre la modularità.

---

## 2. Metodi e Modularità (8 min)

> **Insegnante:**
> "Un metodo è un blocco di codice riutilizzabile: ci aiuta a organizzare e ridurre il duplicato."

* **Definizione**: `public static Tipo nome(Parametri) { ... }`
* **Punti da sottolineare**:

    * *Parametri vs Argomenti*
    * *Return* obbligatorio (o `void`)
    * Scope delle variabili: locale vs `static` vs istanza
    * Overloading: stessi nomi, firme diverse
* **Tip demo**: scrivere live `sum(int[] arr)` e `sum(int a,int b)` per mostrare overload.

---

## 3. Gestione delle Eccezioni (10 min)

> **Insegnante:**
> "Le eccezioni migliorano la robustezza: possiamo intercettare errori previsti e gestirli con logica personalizzata."

* **Tipologia**:

    * *Checked Exceptions* → verificate a compile-time (es. `IOException`)
    * *Unchecked Exceptions* → runtime (es. `NullPointerException`)
* **Sintassi base**:

  ```java
  try {
    // codice critico
  } catch (TipoEccezione e) {
    // gestione (log, recovery)
  } finally {
    // pulizia risorse
  }
  ```
* **Punti da puntualizzare**:

    * Evitare `catch(Exception e)` generico
    * Uso di `throws` sulla firma per delegare la gestione
    * Il `finally` viene sempre eseguito
* **Tip interattivo**: chiedere di provocare un `NumberFormatException` in diretta.

---

## 4. Introduzione a I/O su File (10 min)

> **Insegnante:**
> "Per persistere dati in modo semplice possiamo usare Reader/Writer: oggi un esempio base di lettura."

* **Concetti da spiegare**:

    * `FileReader` vs `BufferedReader`
    * **Try-with-resources**: chiusura automatica
* **Codice d’esempio**:

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
* **Tip visivo**: mostrare diagramma di apertura, lettura e chiusura file.

---

## 5. Live Coding (30 min)

> **Insegnante:** Passo passo, commentando ogni riga.

1. **Metodi**: implementare `sum(int[] arr)` e `average(int[] arr)`

    * Evidenziare firma, corpo, return.
2. **Overloading**: aggiungere `sum(int a, int b)`

    * Chiedere: "Quale versione viene scelta per `sum(2,5)`?"
3. **Eccezioni**: creare `parsePositive(String s)` che lancia `IllegalArgumentException`

    * Mostrare stack trace, poi gestire in `main` con `try/catch`.
4. **File I/O**: leggere `data.txt` e contare righe/numeri

    * Incoraggiare domande su path e gestione errori.

---

## 6. Esercitazione Guidata (40 min)

> **Insegnante:** Assistete i gruppi, verificate le soluzioni, fate emergere best practice.

### Esercizio 1 – Utility Math

* **Obiettivo**: `MathUtils.factorial(int)` e `MathUtils.isPrime(int)`
* **Error handling**: gestire `n < 0` con eccezione.

### Esercizio 2 – Parser File CSV

* **Files**: `students.csv` con record `nome,eta,media`
* **Output**: stringhe formattate, saltare righe malformate con `try/catch`.

### Esercizio 3 – Organizzazione codice

* Creare `CsvReader.readCsv(String)` con `throws IOException`
* Dimostrare `try-with-resources` in `Main`.

---

## 7. Review & Preview OOP (10 min)

* **Domande flash**:

    1. "Perché usiamo metodi statici?"
    2. "Differenza tra checked e unchecked exception?"
    3. "Cos’è il try-with-resources?"
* **Preview OOP**:

    * Classe vs istanza
    * Incapsulamento: `private` vs `public`
    * Costruttore come metodo speciale
    * Ogni funzione vista oggi diventerà un metodo di istanza

---

## 8. Chiusura & Homework (2 min)

* **Homework**:

    * `FileStats.java`: conta righe, parole e caratteri in un file.
    * `ExceptionDemo.java`: metodo che rilascia `NumberFormatException` personalizzata.
    * Lettura capitolo OOP su classi e oggetti.
* **Tip finale**: ringraziare per l’attenzione, invitare a prepararsi mentalmente al paradigma OOP.

---

**Buona lezione!**
