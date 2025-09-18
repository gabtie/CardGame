





# Struttura dei Package

Il progetto è organizzato in tre macro-aree: **data**, **logic**, **ui**, più le risorse.

---

## 📦 `game.data`
Contiene tutte le classi che rappresentano i **dati del gioco**:
- Giocatori
- Carte
- Mazzi
- Stato della partita  

➡️ È il “cuore” dei dati, senza logica né grafica.

---

## 📦 `game.logic`
Gestisce la **logica di gioco**:
- Regole e validazione delle mosse
- Turni e progressione della partita
- Aggiornamento dello stato in `data`  
- Interpretazione degli eventi provenienti da `ui`

➡️ Decide **come** cambia il gioco in base alle azioni dei giocatori.

---

## 📦 `game.ui`
Gestisce la parte di **interfaccia utente**:
- Visualizzazione dello stato (`graphics`)
- Raccolta input da tastiera/mouse (`input`)  

➡️ Mostra a schermo lo stato del gioco e cattura le azioni del giocatore.

### 🔹 `game.ui.graphics`
- Rendering grafico (carte, tavolo, HUD)
- Animazioni e layout

### 🔹 `game.ui.input`
- Gestione degli eventi di input (mouse, tastiera)
- Invio degli eventi a `logic`

---

## 📂 `resources`
Contiene i **file multimediali e di configurazione**:
- Immagini (carte, sfondi, icone)
- Suoni ed effetti
- File di configurazione (es. JSON, properties)

---

## 📂 `test`
Contiene i **test unitari e di integrazione** per verificare il corretto funzionamento di:
- Dati (`data`)
- Logica (`logic`)
- Interfaccia (`ui`)
