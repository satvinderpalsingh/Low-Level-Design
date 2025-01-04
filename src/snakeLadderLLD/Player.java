package snakeLadderLLD;

public class Player {
    private String playerName;
    private int playerPosition;
    Player(String playerName) {
        this.playerName = playerName;
        this.playerPosition = 0;
    }
    public String getPlayerName() {
        return playerName;
    }
    public int getPlayerPosition() {
        return playerPosition;
    }
    public void setPlayerPosition(int playerPosition) {
        this.playerPosition = playerPosition;
    }



}
