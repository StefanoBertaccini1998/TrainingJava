# 📄 Transcript Lezioni – Sessione 4

Questo documento contiene il copione dettagliato per l'insegnante, con definizioni, esempi, concetti chiave e suggerimenti (tip) per gestire eventuali pause o cali di attenzione degli studenti.

### 1. Introduzione e Obiettivi (2 min)

**Insegnante:** "Oggi vedremo i cicli: `for`, `for-each`, `while` e `do-while`. Al termine, saprete ripetere istruzioni fino al raggiungimento di condizioni o conteggi prefissati."

**Tip:** All'inizio, chiedete: "Quali situazioni nel mondo reale richiedono ripetizione?"

---

### 2. Ciclo `for` (10 min)

**Insegnante:**

> * Sintassi: `for (inizio; condizione; passo) { ... }`
> * Usa per conteggi precisi.

**Esempio:**

```java
for (int i = 1; i <= 10; i++) {
    System.out.println("i = " + i);
}
```

**Tip matematica:** Se gli studenti sbagliano off-by-one, fate disegnare la sequenza su un foglio.

---

### 3. Enhanced `for` (for-each) (5 min)

**Insegnante:**

> * Sintassi: `for (Tipo elem : collezione) { ... }`
> * Ideale per iterare array e collezioni.

**Esempio:**

```java
String[] nomi = {"Anna", "Luca", "Maria"};
for (String n : nomi) {
    System.out.println(n);
}
```

**Tip:** Spiegare che non si può modificare la collezione mentre si itera.

---

### 4. `while` vs `do-while` (10 min)

**Insegnante:**

> * `while(condizione)`: controlla prima di entrare.
> * `do { ... } while(condizione)`: esegue almeno una volta.

**Esempio `while`:**

```java
int n = 0;
while (n < 5) {
    System.out.println(n);
    n++;
}
```

**Esempio `do-while`:**

```java
do {
    comando = scanner.nextLine();
} while (!comando.equals("exit"));
```

**Tip blocco:** Se dimenticano la differenza, fate un demo live aggiungendo una stampa prima del check.

---

### 5. `break`, `continue`, e Label (10 min)

**Insegnante:**

> * `break`: esce dal ciclo.
> * `continue`: salta all'iterazione successiva.
> * Label per uscire da cicli annidati.

**Esempio label:**

```java
outer:
for (int i=0; i<5; i++) {
    for (int j=0; j<5; j++) {
        if (i*j > 6) {
            break outer;
        }
    }
}
```

**Tip:** Gli label possono confondere: usateli solo se strettamente necessari.

---

### 6. Esercitazione Guidata (30–45 min)

> **Insegnante:** "Implementate la tabellina di moltiplicazione con cicli annidati. Se vi bloccate, ricontrollate indici di `for`."

**Tip:** Offrite esempi di stampa parziale: "Prova a stampare solo quando `i` è 2 per vedere il pattern."

---

## Conclusione e Homework (3 min)

> **Insegnante:** "Per casa, lavorate su FibonacciGenerator, PrimeChecker e MatrixMultiplier. Nella prossima lezione vedremo le collezioni."

**Tip finale:** Riassumete i punti chiave a voce alta. Chiedete: "Qual è la differenza tra `for` e `while`?" per confermare la comprensione.
