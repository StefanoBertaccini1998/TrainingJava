
# 📄 Scaletta Sessione 4 – Controllo di Flusso: Cicli

## ⏱️ Durata

2 ore totali:

* 30–40 min teoria
* 30–40 min live coding
* 30–45 min esercitazione

---

## 🎯 Obiettivi della sessione

* Conoscere i cicli `for`, `for-each`, `while` e `do-while`.
* Gestire condizioni di uscita, `break` e `continue`.
* Utilizzare cicli annidati e etichette (`label`).
* Comprendere differenze tra loop controllati a conteggio e a condizione.

---

## 🧠 Teoria (30–40 min)

### 1. Ciclo `for`

* Sintassi: inizializzazione, condizione, aggiornamento.
* Esempi di uso: iterazione numerica.
* Possibili errori: loop infinito, off-by-one.

### 2. Enhanced `for` (`for-each`)

* Sintassi: `for (Tipo elem : collezione)`.
* Uso con array e collezioni (`List`, `Set`).
* Limitazioni: impossibilità di rimuovere elementi durante l’iterazione.

### 3. Cicli `while` e `do-while`

* Differenza principale: verifica condizione prima (`while`) o dopo (`do-while`).
* Esempi di loop sentinel-controlled e user-driven.

### 4. `break`, `continue` e labeling

* Terminare un ciclo (`break`).
* Saltare alla prossima iterazione (`continue`).
* Etichette per controllare cicli annidati.

---

## 💻 Live Coding (30–40 min)

1. Somma dei primi N numeri con `for`.
2. Iterazione `for-each` su array di `String`.
3. Ciclo `while` per lettura da `Scanner` fino a input sentinel (`"exit"`).
4. `do-while` per menù ripetuto finché l’utente non esce.
5. Uso di `break` e `continue` in cicli: stampa solo numeri pari.
6. Ciclo annidato con `label` per ricerca in matrice.

---

## 🧪 Esercizi (30–45 min)

### Esercizio 1 – Somma condizionale

* Data un array di interi, usa `for-each` per sommare solo i valori positivi.

### Esercizio 2 – Tabellina di moltiplicazione

* Usa due cicli `for` annidati per stampare la tabellina da 1 a 10.

### Esercizio 3 – Ricerca in array

* Implementa un `while` che cerca un elemento in un array e termina con `break` appena trovato.

### Esercizio 4 – Menù ripetuto

* Crea un `do-while` che mostra un menù e ripete finché l’utente non sceglie `0`, gestendo `continue` per opzione non valida.

### Esercizio 5 – Matrice e `label`

* Dato un array bidimensionale `int[][]`, usa cicli annidati e `break label` per uscire appena trovi un valore target.

---

## 📘 Homework

1. **FibonacciGenerator.java**: genera e stampa la serie di Fibonacci fino al N-esimo termine con `for` o `while`.
2. **PrimeChecker.java**: controlla se un numero è primo usando un loop `for` con `break`.
3. **MatrixMultiplier.java**: moltiplica due matrici 3×3 usando cicli annidati.

---

## 📎 Materiale fornito

* Slide sessione (`LoopsAndLabels.pdf`).
* Codice di esempio: `ForDemo.java`, `WhileDemo.java`, `NestedLoopsDemo.java`.
* Link documentazione ufficiale Java 21 sui cicli.
