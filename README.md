# Multiplayer Number Guessing Game (Java)

A robust, console-based multiplayer Number Guessing Game built in Java. The application challenges players to guess a randomly generated number between 1 and 100 in the fewest attempts possible. It features comprehensive crash protection against invalid inputs and ranks players on a final scorecard.

## 🚀 Features

- **Multiplayer Support:** Play solo or dynamically create an array of multiple players to compete against each other.
- **Crash Proofing (Input Validation):** Implements robust exception handling (`try-catch` with `InputMismatchException`) to gracefully process accidental text inputs without crashing.
- **Dynamic Scorecard:** Once all players complete their turns, the system calculates the lowest score (fewest attempts) and announces the winner(s).
- **Tie-Breaking Architecture:** Built to identify and display multiple winners in the event of a tie score.

---

## 🛠️ How It Works

1. **Initialization:** The game prompts for the total number of players.
2. **Setup:** Each player registers their name sequentially.
3. **The Guessing Loop:** - A secret number between 1 and 100 is generated uniquely for each player.
   - The game provides real-time hint feedback (`Higher number please` or `Lower number please`).
   - Counts total attempts dynamically, starting at `1`.
4. **The Scorecard:** Prints a summary of all players' scores and proclaims the winner(s) if playing in multiplayer mode.

---

## 💻 Code Structure

The project follows a clean object-oriented design split into modular components:

- **`players`**: Data model representing individual player instances (Name and Attempt Score).
- **`GameEngine`**: Coordinates the core guessing logic, hint generations, and system turn counts.
- **`ScoreCard`**: Handles the logic to determine minimum attempts, displays player performance summaries, and evaluates winner states.
- **`MainGame`**: The entry point managing the program lifecycle, global scanners, and custom static method `safeInput()` for parsing console integers.

---

## 📋 Prerequisites & Installation

To run this project locally, make sure you have the **Java Development Kit (JDK 8 or higher)** installed.

1. **Clone the repository:**
   ```bash
   git clone [https://github.com/your-username/number-guessing-game.git](https://github.com/your-username/number-guessing-game.git)
   cd number-guessing-game
