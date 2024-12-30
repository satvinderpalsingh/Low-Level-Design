package ticToeGameLLD;

public class PlayingBoard {
    private int boardSize;
    private PlayingPiece[][] board;
    PlayingBoard(int boardSize) {
        this.boardSize=boardSize;
        this.board=new PlayingPiece[boardSize][boardSize];
        System.out.println("Playing Board created with size "+this.board.length+"x"+this.board[0].length);
    }
    public int getBoardSize() {
        return boardSize;
    }
    public PlayingPiece[][] getBoard() {
        return board;
    }
    public void printPlayingBoard(){
        for(int i=0;i<boardSize;i++){
            for(int j=0;j<boardSize;j++){
                if(board[i][j]==null){
                    System.out.print(" ");
                }else{
                    System.out.print(board[i][j].getPlayingPiece());
                }
                if(j<boardSize-1){
                    System.out.print("|");
                }
            }
            System.out.println();
            if(i<boardSize-1){
                for(int j=0;j<boardSize;j++){
                    System.out.print("-");
                    if(j<boardSize-1){
                        System.out.print("+");
                    }
                }
                System.out.println();
            }
        }
    }
    public boolean addPieceToBoard(int x, int y, PlayingPiece playingPiece){
        System.out.println("Adding piece to board at "+x+","+y);
        if(x<0 || x>=boardSize || y<0 || y>=boardSize){
            return false;
        }
        if(this.board[x][y]!=null){
            return false;
        }
        this.board[x][y]=playingPiece;
        return true;
    }
    public boolean isThereFreeSpace(){
        for(int i=0;i<boardSize;i++){
            for(int j=0;j<boardSize;j++){
                if(board[i][j]==null){
                    return true;
                }
            }
        }
        return false;
    }

}
