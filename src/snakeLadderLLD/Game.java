package snakeLadderLLD;

import java.util.LinkedList;

public class Game {
    private Dice dice;
    private Board board;
    private LinkedList<Player> playerQueue;
    private Player winner;
    private boolean isCompleted;

    public void initializeGame(int boardSize, int totalSnakes, int totalLadders, int diceCount,int playerCount) {
        this.dice = new Dice(diceCount);
        this.board = new Board(boardSize);
        this.board.initializeBoard(totalSnakes, totalLadders);
        this.playerQueue = new LinkedList<>();
        for (int i = 1; i <= playerCount; i++) {
            this.playerQueue.add(new Player("Player" + i));
        }
        this.winner = null;
        this.isCompleted = false;
    }
    public void startGame(){
        while (!isCompleted){
            Player currentPlayer = playerQueue.poll();
            System.out.println("Player "+currentPlayer.getPlayerName()+" is playing");
            int diceCount = dice.getDiceCount();
            int diceSum=0;
            for(int i=0;i<diceCount;i++){
                diceSum+=Math.random()*6+1;
            }
            System.out.println("Dice sum is "+diceSum);
            int currentPosition = currentPlayer.getPlayerPosition();
            System.out.println("Current position is "+currentPosition);
            int dicePosition = currentPosition + diceSum;
            int newPosition =board.getNewPositonFromBoard(dicePosition);
            System.out.println("New position is "+newPosition);
            if (newPosition >= board.getBoardSize() * board.getBoardSize() - 1) {
                this.winner = currentPlayer;
                isCompleted = true;
                break;
            }
            currentPlayer.setPlayerPosition(newPosition);
            playerQueue.add(currentPlayer);
        }
    }
    public void printWinner(){
        if(winner!=null){
            System.out.println("Winner is "+winner.getPlayerName());
        }
    }


}
