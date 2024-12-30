package ticToeGameLLD;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicToeGame {
    private PlayingBoard playingBoard;
    private List<Player> players;
    private LinkedList<Player> playerQueue;
    TicToeGame(PlayingBoard playingBoard, List<Player> players) {
        this.playingBoard=playingBoard;
        this.players=players;
        initializePlayerQueue();
    }
    private void initializePlayerQueue() {
        playerQueue=new LinkedList<>(players);
    }
    public PlayingBoard getPlayingBoard() {
        return playingBoard;
    }
    public List<Player> getPlayers() {
        return players;
    }
    public void startGame(){
        boolean isGameOver=false;
        while(!isGameOver){
            Player currPlayer=playerQueue.pollFirst();
            playingBoard.printPlayingBoard();
            if (!this.playingBoard.isThereFreeSpace()) {
                System.out.println("Game Over! No free space left");
                isGameOver=true;
                break;
            }
            System.out.print(currPlayer.getName()+"'s turn"+" input row column: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            System.out.println("Input: " + s);
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);
            if (!playingBoard.addPieceToBoard(inputRow, inputColumn, currPlayer.getPlayingPiece())) {
                System.out.println("Invalid move! Try again");
                playerQueue.addFirst(currPlayer);
                continue;
            }
            System.out.println("Move successful");
            if (isThereWinner(inputRow, inputColumn, currPlayer.getPlayingPiece())) {
                System.out.println(currPlayer.getName() + " wins!");
                playingBoard.printPlayingBoard();
                isGameOver = true;
                break;
            }
            playerQueue.addLast(currPlayer);
        }
    }
    private  boolean isThereWinner(int row, int column, PlayingPiece playingPiece){
        boolean rowWin=true;
        boolean columnWin=true;
        boolean diagonalWin=true;
        boolean reverseDiagonalWin=true;
        for(int i=0;i<playingBoard.getBoardSize();i++){
            if(playingBoard.getBoard()[row][i]==null || playingBoard.getBoard()[row][i].getPlayingPiece()!=playingPiece.getPlayingPiece()){
                rowWin=false;
            }
            if(playingBoard.getBoard()[i][column]==null || playingBoard.getBoard()[i][column].getPlayingPiece()!=playingPiece.getPlayingPiece()){
                columnWin=false;
            }
            if(playingBoard.getBoard()[i][i]==null || playingBoard.getBoard()[i][i].getPlayingPiece()!=playingPiece.getPlayingPiece()){
                diagonalWin=false;
            }
            if(playingBoard.getBoard()[i][playingBoard.getBoardSize()-1-i]==null || playingBoard.getBoard()[i][playingBoard.getBoardSize()-1-i].getPlayingPiece()!=playingPiece.getPlayingPiece()){
                reverseDiagonalWin=false;
            }
        }
        return rowWin || columnWin || diagonalWin || reverseDiagonalWin;
    
    }
}
