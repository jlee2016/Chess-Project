package src.main.model;

public interface Moveable {
    boolean isValidMove(int endRow, int endCol, Piece[][] gameBoard);
    void move();
}
