# 📄 Transcript Lezioni – Sessione 4

**Docente Note & Script** – appunti per condurre la lezione, con definizioni, esempi, concetti chiave e suggerimenti per mantenere alta l’attenzione.

---

## 1. Introduzione e Obiettivi (2 min)

> **Insegnante:**
> "Oggi esploreremo sia i cicli (`for`, `for-each`, `while`, `do-while`) sia le principali strutture dati in Java: Array, List, Set e Map. Scopriremo come iterare su di esse e quando scegliere ciascuna in base a performance e consumo di memoria."

* **Concetti chiave da pronunciare:** iterazione, struttura contigua vs strutture dinamiche, complessità di accesso e modifica.
* **Definizione breve:** *Iterazione* = ripetizione automatica di istruzioni finché una condizione è vera.
* **Tip coinvolgimento:** chiedere: "Quando avete bisogno di ripetere un’azione in un’app reale?" (es. scorrere una lista di prodotti)

---

## 2. Introduzione alle Collections (8 min)

### 2.1 Array

* **Definizione:** struttura contigua di elementi di stesso tipo, dimensione fissa.
* **Accesso:** O(1) per indice, senza overhead di oggetti wrapper.
* **Uso ideale:** buffer di dati noti, performance di lettura.
* **Limitazioni:** ridimensionamento costoso, dimensione immutabile.

> **Tip spiegazione:** mostra un disegno in lavagna di un blocco di memoria.

### 2.2 List (`ArrayList` vs `LinkedList`)

* **ArrayList:** array dinamico, capacità interna che cresce (resize O(n)). Accesso O(1), inserimento O(n) in mezzo.
* **LinkedList:** nodi doppiamente collegati. Accesso O(n), inserimento/rimozione O(1) ai bordi.
* **Quando usare:** `ArrayList` per accessi casuali frequenti, `LinkedList` per molte inserzioni/rimozioni.

> **Tip confronto:** chiedere: "Se volessi inserire sempre in testa, quale sceglieresti?"

### 2.3 Set (`HashSet` vs `TreeSet`)

* **HashSet:** basato su hash table, operazioni O(1) mediamente.
* **TreeSet:** basato su albero bilanciato, operazioni O(log n), mantiene ordine.
* **Uso:** membership test, eliminazione duplicati.

### 2.4 Map (`HashMap` vs `TreeMap`)

* **HashMap:** coppie chiave/valore, lookup O(1) medio.
* **TreeMap:** O(log n), mantiene chiavi ordinate.
* **Uso:** indicizzazione rapida di valori.

> **Tip memoria:** sottolineare overhead di bucket e nodi per HashSet/HashMap.

---

## 3. Cicli di Iterazione (15 min)

### 3.1 `for` classico

* **Sintassi:** `for(init; cond; step)`.
* **Quando usarlo:** iterazioni a conteggio noto.
* **Attenzione:** off-by-one, loop infinito.

> **Esempio lavagna:** stampa da 1 a 5.

### 3.2 Enhanced `for-each`

* **Sintassi:** `for(T e : collection)`.
* **Pro:** codice pulito, nessun indice.
* **Contro:** non permette `remove()` direttamente.

> **Esempio live:** su `String[]` e `List<String>`.

### 3.3 `while` vs `do-while`

* **`while(cond)`**: verifica prima.
* **`do { } while(cond)`**: almeno una esecuzione.

> **Demo:** confronto comportamento con condizione falsa iniziale.

### 3.4 `break`, `continue`, Label

* **`break`:** esce dal ciclo corrente.
* **`continue`:** passa all’iterazione successiva.
* **Label:** etichetta per uscire da cicli annidati.

> **Esempio:** `outer: for(...) { for(...) { if(...) break outer; } }`

**Tip attenzione:** spiegare che l’uso eccessivo di label può rendere il codice meno leggibile.

---

## 4. Live Coding & Demo (30–40 min)

1. **Array** – somma primi N numeri con `for`.
2. **List** – stampa elementi `ArrayList<String>` con `for-each`.
3. **Set** – usa `for-each` su `HashSet<Integer>` per filtrare numeri pari.
4. **Map** – itera su `HashMap<String,Integer>` con `entrySet()`.
5. **`while`** – lettura da `Scanner` fino a `"exit"`.
6. **`do-while`** – menù utente con `continue` per input errato.
7. **Label** – ricerca target in `int[][]`, `break label`.

> **Tip intervento:** se gli studenti si bloccano, suggerire di stampare variabili intermedie.

---

## 5. Esercitazione Guidata (30–45 min)

> **Insegnante:** “Provate a implementare la tabellina di moltiplicazione con cicli annidati. Confrontate poi con un `for-each` su una `List` di liste generate in precedenza.”

### Esercizi proposti:

* Somma condizionale su `int[]` con `for-each`.
* Tabellina di moltiplicazione (cicli `for`).
* Ricerca in array con `while` + `break`.
* Menù interattivo con `do-while` + `continue`.
* Iterazione su `List<Integer>`, `Set<String>`, `Map<String,Integer>` e confronto strutture.

> **Tip gestione classe:** alternare coppie di studenti per pairing e spiegare a vicenda.

---

## 6. Conclusione & Homework (3 min)

> **Insegnante:**
> "Per casa: FibonacciGenerator, PrimeChecker e MatrixMultiplier. Riflettete su quale struttura dati usereste per ciascun compito e perché."

* **Punto di ripresa lezione futura:** approfondire geniali, streams e lambda con collection.
* **Tip di chiusura:** chiedere: "Qual è la differenza principale tra `ArrayList` e `LinkedList`?" per consolidare.

---
