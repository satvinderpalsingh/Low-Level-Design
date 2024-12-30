package ticToeGameLLD;

import java.util.ArrayList;

public class TicToeMain {
    public static void main(String[] args) {
        Player player1 = new Player("Player1", new CrossPlayingPiece());
        Player player2 = new Player("Player2", new CirclePlayingPiece());
        PlayingBoard playingBoard = new PlayingBoard(3);
        ArrayList<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        TicToeGame ticToeGame = new TicToeGame( playingBoard,players);
        ticToeGame.startGame();
    }

}
