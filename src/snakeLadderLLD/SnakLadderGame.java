package snakeLadderLLD;

public class SnakLadderGame {
    public static void main(String[] args) {
        Game game = new Game();
        game.initializeGame(10, 3, 3, 1, 2);
        game.startGame();
        game.printWinner();
    }

}
