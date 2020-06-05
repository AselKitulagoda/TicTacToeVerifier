### Tic Tac Toe Verifier

* Tic Tac Toe Verifier for 3x3 boards making use of [Magic Square](https://en.wikipedia.org/wiki/Magic_square) using ```Java 8``` and ```Maven```.This was part of a coding challenge for R3.

## Challenge
* This is a two-player game where the players take turns marking the spaces in a 3-by-3 grid with X's and O's.
* The player who succeeds in placing three of their marks (either X's or O's) in a horizontal, vertical, or diagonal row wins the game.
1. Write me a class that whose constructor takes in a representation of a 3-by-3 grid
with the currently placed marks.
2. Add a function to this class that checks the state of the grid and returns whether:
    * The player placing &quot;crosses&quot; (X) has won
    * The player placing &quot;noughts&quot; (O) has won
    * The outcome of the game is yet to be decided
3. Document how to build run your code; ideally using a standard tool such as Maven
for this.

## To Run
* Must have JDK 8 installed on your machine refer to [here](https://docs.oracle.com/javase/8/docs/technotes/guides/install/install_overview.html) for installation.
* Must have Maven installed on your machine refer to [here](https://maven.apache.org/install.html)

1) Input a valid board with the form : ```{{State.O,State.O,State.X},{State.X,State.X,State.O},{State.X,State.O,State.X}}``` which constitutes a ***3x3*** board.
2) Run the following command from the root directory ```mvn clean compile exec:java```.
3) String output should be returned by the application in the form of : ```"crosses (X) has won"```, ```"noughts (O) has won"``` or ```"Yet to be decided"```.

### Testing
* This application comes with its J-unit tests that account for all possible winning conditions as well as edge cases for the application
To run all tests execute the following command in the root directory: ```mvn clean test```
    
