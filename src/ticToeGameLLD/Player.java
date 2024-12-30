package ticToeGameLLD;

public class Player {
    private String name;
    private PlayingPiece playingPiece;
    Player(String name, PlayingPiece playingPiece) {
        this.name=name;
        this.playingPiece=playingPiece;
    }
    public String getName() {
        return name;
    }
    public PlayingPiece getPlayingPiece() {
        return playingPiece;
    }

}
