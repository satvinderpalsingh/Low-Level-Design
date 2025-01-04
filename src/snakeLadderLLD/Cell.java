package snakeLadderLLD;

public class Cell {
    private Jump jump;
    public Cell(Jump jump) {
        this.jump = jump;
    }
    public Cell() {
        this.jump = null;
    }
    public Jump getJump() {
        return jump;
    }

}
