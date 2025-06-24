# 📄 Scaletta Sessione 3 – Controllo di Flusso: Strutture Condizionali

## ⏱️ Durata

2 ore totali:

* 30–40 min teoria
* 30–40 min live coding
* 30–45 min esercitazione

---

## 🎯 Obiettivi della sessione

* Comprendere le strutture condizionali `if`, `else if`, `else`.
* Utilizzare espressioni booleane con operatori di confronto (`==`, `!=`, `>`, `<`, `>=`, `<=`) e logici (`&&`, `||`, `!`).
* Applicare il costrutto `switch` con tipi primitivi, `String` ed `enum`.
* Gestire branch multipli, fall-through e `default`.

---

## 🧠 Teoria (30–40 min)

### 1. Istruzione `if-else`

* Sintassi e flusso di esecuzione.
* Espressioni booleane: confronto e concatenazione di condizioni.
* Struttura a ramificazioni: `if`, `else if`, `else`.

### 2. Nested Conditions

* Annidamento di `if` per validazioni progressive.
* Evitare complessità: guard clauses e early return.

### 3. Costrutto `switch`

* Tipi supportati: `int`, `char`, `String`, `enum`.
* Sintassi: `case`, `break`, `default`.
* Fall-through e importanza del `break`.
* Uso di `enum` in `switch` per chiarezza.

---

## 💻 Live Coding (30–40 min)

1. Esempio base `if-else`: determinare se un numero è pari o dispari.
2. Classificazione di un voto (A/B/C/D/F) con `if-else if`.
3. Validazione input utente con `Scanner` e condizioni annidate.
4. Menù testuale con `switch` su `String` (`"1"`, `"2"`, `"0"`).
5. `switch` su `enum Giorno` per distinguere lavorativo/weekend.

---

## 🧪 Esercizi (30–45 min)

### Esercizio 1 – Calcolatore di voti

* Leggi un voto intero (0–100) da console.
* Usa `if-else if-else` per stampare:

    * `>= 90` → "Eccellente"
    * `>= 75` → "Buono"
    * `>= 60` → "Sufficiente"
    * `< 60` → "Insufficiente"

### Esercizio 2 – Menù interattivo

* Implementa un piccolo menù con `switch`:

    * `1` → stampa data e ora attuale
    * `2` → calcola potenza (base ed esponente da input)
    * `3` → genera un numero casuale
    * `0` → esci dal programma
* Gestisci `default` per opzione non valida.

### Esercizio 3 – Controllo su `enum`

* Definisci `enum Giorno { LUN, MAR, MER, GIO, VEN, SAB, DOM }`.
* Data una variabile `Giorno g`, usa `switch` per stampare "Giorno lavorativo" o "Weekend".

### Esercizio 4 – Validazione multipla

* Leggi nome utente (`String`) e età (`int`).
* Usa condizioni annidate per verificare:

    * `nome != null && !nome.isBlank()`
    * `età >= 18 && età <= 120`
* Stampa messaggi di errore specifici per ogni validazione.

---

## 📘 Homework

1. **LeapYearChecker.java**: implementa `isLeapYear(int year)` usando `if` e testalo con input vari.
2. **SimpleCalculator.java**: scrivi un calcolatore base (addizione, sottrazione, moltiplicazione, divisione) controllato da `switch`.
3. **PasswordValidator.java**: verifica complessità di una password (minimo 8 caratteri, almeno una cifra e un simbolo) con nested `if`.

---

## 📎 Materiale fornito

* Slide sessione (`IfElseSwitch.pdf`).
* Codice di esempio: `IfElseDemo.java`, `SwitchDemo.java`.
* Link documentazione ufficiale Java 21 sulle strutture condizionali.