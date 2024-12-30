package src.main.model;

public abstract class Piece {
    private int color;
    private int row;
    private int col;

    public Piece(int color, int row, int col) {
        this.color = color;
        this.row = row;
        this.col = col;
    }
    int getColor() {
        return color;
    }
}
