package snakeLadderLLD;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int boardSize;
    private Cell[][] board;
    Board(int boardSize) {
        // Add validation for board size
        if (boardSize <= 0) {
            throw new IllegalArgumentException("Board size must be positive");
        }
        this.boardSize = boardSize;
        this.board = new Cell[boardSize][boardSize];
    }
    public int getBoardSize() {
        return boardSize;
    }
    public void initializeBoard(int totalSnakes, int totalLadders){
        for(int i=0;i<boardSize;i++){
            for(int j=0;j<boardSize;j++){
                board[i][j] = new Cell();
            }
        }
        addSnakesToBoard(totalSnakes);
        addLaddersToBoard(totalLadders);
    }
    private void addSnakesToBoard(int totalSnakes){
        while (totalSnakes>0){
            int start = (int)(Math.random()*(boardSize*boardSize-1));
            int end = (int)(Math.random()*(boardSize*boardSize-1));
            if(start>end){
                this.board[start/boardSize][start%boardSize]=new Cell(new Jump(start, end));
            }
            totalSnakes--;
        }

    }
    private void addLaddersToBoard(int totalLadders){
        while (totalLadders>0){
            int start = (int)(Math.random()*(boardSize*boardSize-1));
            int end = (int)(Math.random()*(boardSize*boardSize-1));
            if(start<end){
                this.board[start/boardSize][start%boardSize]=new Cell(new Jump(start, end));
            }
            totalLadders--;
        }
    }
    public List<Integer> getRowColFromBoardPosition(int position){
        if (position < 0 || position >= boardSize * boardSize) {
            throw new IllegalArgumentException("Invalid position");
        }
        List<Integer> rowCol = new ArrayList<>();
        rowCol.add(position/boardSize);
        rowCol.add(position%boardSize);
        return rowCol;
    }
    public int getNewPositonFromBoard(int position){
        if(position>=this.boardSize*this.boardSize-1){
            return position;
        }
        List<Integer> rowCol = getRowColFromBoardPosition(position);
        Cell cell = board[rowCol.get(0)][rowCol.get(1)];
        if(cell.getJump()==null){
            return position;
        }
        return cell.getJump().getEnd();
    }



}

