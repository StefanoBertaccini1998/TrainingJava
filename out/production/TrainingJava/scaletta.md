# 📄 Scaletta Sessione 4 – Controllo di Flusso: Cicli e Collections

## ⏱️ Durata

2 ore totali:

* 30–40 min teoria
* 30–40 min live coding
* 30–45 min esercitazione

---

## 🎯 Obiettivi della sessione

* Introdurre le principali strutture dati: Array, List, Set e Map, con i loro modelli di allocazione e gestione della memoria.
* Comprendere quando scegliere una struttura piuttosto che un'altra in base a performance di accesso, inserimento e overhead di memoria.
* Conoscere i cicli `for`, `for-each`, `while` e `do-while` e applicarli anche alle collection.
* Gestire condizioni di uscita, `break`, `continue` e labeling.

---

## 🧠 Teoria (30–40 min)

### 1. Introduzione alle Collections di base

* **Array**

    * Struttura contigua in memoria, dimensione fissa.
    * Accesso per indice in O(1), senza overhead di oggetti wrapper.
    * Adatto per buffer statici e letture rapide; svantaggio: dimensione non modificabile, ridimensionamento costoso.
* **List**

    * Interfaccia per sequenze ordinate; implementazioni principali:

        * `ArrayList`: array dinamico, O(1) per accesso casuale, O(n) per inserimento/rimozione in mezzo, overhead di capacità aggiuntiva.
        * `LinkedList`: nodi doppiamente concatenati, O(n) per accesso casuale, O(1) per inserimento/rimozione a inizio/fine, maggiore overhead di memoria per puntatori.
    * Scegliere `ArrayList` per accesso frequente per indice, `LinkedList` per modifiche frequenti in testa o in modalità iterator.
* **Set**

    * Collezione senza duplicati; implementazioni:

        * `HashSet`: basato su `HashMap`, buona scalabilità, O(1) medio per operazioni, overhead di bucket e nodi.
        * `TreeSet`: basato su albero rosso-nero, O(log n) per operazioni, mantiene ordine naturale.
    * Ideale per membership test e unione/ intersezione di insiemi.
* **Map**

    * Coppie chiave/valore; implementazioni:

        * `HashMap`: O(1) medio per `get`/`put`, overhead simile a `HashSet`.
        * `TreeMap`: O(log n) per operazioni, mantiene chiavi ordinate.
    * Utilizzata per indicizzare oggetti e rapidi lookup.

### 2. Cicli di iterazione

#### 2.1 Ciclo `for`

* Sintassi: inizializzazione; condizione; aggiornamento.
* Uso classico per array e sequenze indicizzate.
* Attenzione a off-by-one e loop infinito.

#### 2.2 Enhanced `for` (`for-each`)

* Sintassi: `for (Tipo e : collezione)`.
* Funziona con array e qualsiasi `Iterable` (List, Set, Map.entrySet()).
* Comodo, ma non consente modifiche strutturali sulla collezione in corso di iterazione.

#### 2.3 Cicli `while` e `do-while`

* `while`: verifica condizione prima di ogni iterazione.
* `do-while`: esegue almeno una volta il corpo.
* Esempi di lettura fino a sentinel e menù ripetuti.

#### 2.4 `break`, `continue` e labeling

* `break` interrompe il ciclo.
* `continue` salta all’iterazione successiva.
* Label per controllare cicli annidati.

---

## 💻 Live Coding (30–40 min)

1. **Array**: somma dei primi N numeri con `for` su un `int[]`.
2. **List**: `for-each` su `ArrayList<String>` per stampare elementi.
3. **Set**: `for-each` su `HashSet<Integer>` per filtrare numeri pari.
4. **Map**: iterazione su `entrySet()` di `HashMap<String,Integer>` per stampare chiave e valore.
5. Ciclo `while` per lettura da `Scanner` fino a `"exit"`.
6. `do-while` per menù interattivo con `continue` per input non valido.
7. Uso di `break` e `label` in cicli annidati per ricerca in `int[][]`.

---

## 🧪 Esercizi (30–45 min)

### Esercizio 1 – Somma condizionale

* Data un array di interi, usa `for-each` per sommare solo i valori positivi.

### Esercizio 2 – Tabellina di moltiplicazione

* Usa due cicli `for` annidati per stampare la tabellina da 1 a 10.

### Esercizio 3 – Ricerca in array

* Implementa un `while` che cerca un elemento in un array e termina con `break` appena trovato.

### Esercizio 4 – Menù ripetuto

* Crea un `do-while` che mostra un menù e ripete finché l’utente non sceglie `0`, gestendo `continue` per opzione non valida.

### Esercizio 5 – Matrice e `label`

* Dato un `int[][]`, usa cicli annidati e `break label` per uscire appena trovi il valore target.

### Esercizio 6 – Iterazione Collections

* Data una `List<Integer>`, calcola la somma con `for-each`.
* Dato un `Set<String>`, itera e stampa ogni elemento.
* Dato un `Map<String,Integer>`, itera su `entrySet()` e stampa le coppie chiave-valore.
* Discuti brevemente quale struttura dati è più adatta ai diversi casi, in termini di accesso e overhead di memoria.

---

## 📘 Homework

1. **FibonacciGenerator.java**: genera e stampa la serie di Fibonacci fino al N-esimo termine con `for` o `while`.
2. **PrimeChecker.java**: controlla se un numero è primo usando un loop `for` con `break`.
3. **MatrixMultiplier.java**: moltiplica due matrici 3×3 usando cicli annidati.

---

## 📎 Materiale fornito

* Slide sessione (`LoopsAndLabels.pdf`).
* Codice di esempio: `ForDemo.java`, `WhileDemo.java`, `NestedLoopsDemo.java`, `CollectionsDemo.java`.
* Link documentazione ufficiale Java 21 su array e collections.
