/*
 * TODO class documentation
 */

package src.main.model;

public class Rook extends Piece implements Moveable {
    private int color;
    private int row;
    private int col;

    public Rook(int color, int row, int col) {
        super(color, row, col);
    }

    @Override
    public void move() {
        // TODO Auto-generated method stub
        
    }

    // REQUIRES: 0 < endRow < 7, 0 < endCol < 7, col == endCol || row == endRow
    // EFFECTS: returns true if the move is valid, false otherwise
    @Override
    public boolean isValidMove(int endRow, int endCol, Piece[][] gameBoard) { //TODO: check if moving rook puts own King in check

        if (row == endRow) { //Note: if: (row == endRow) then: col != endCol
            int fromCol = col;
            if (fromCol < endCol) {
                for (int i = fromCol++; i < endCol; i++) { //no need to check i = fromCol;
                    if (gameBoard[row][i] != null) { //piece blocking path
                        return false;
                    }
                }
                //checks if last square is empty, if not, check color and if Piece is a King
                if (gameBoard[row][col] == null || gameBoard[row][col].getColor() != color && !(gameBoard[row][col] instanceof King)) {
                    return true;
                }
                return false;
            } else { // fromCol > endCol
                for (int i = fromCol-- ; i > endCol; i--) { //no need to check i = fromCol aka (current square);
                    if (gameBoard[row][i] != null) { //piece blocking path
                        return false;
                    }
                }
                //checks if last square is empty, if not, check color and if Piece is a King
                if (gameBoard[row][col] == null || gameBoard[row][col].getColor() != color && !(gameBoard[row][col] instanceof King)) {
                    return true;
                }
                return false;
            }
        } else if (col == endCol) {
            int fromRow = row;
            if (fromRow < endRow) {
                for (int i = fromRow++; i < endRow; i++) { //no need to check i = fromRow aka (current square);
                    if (gameBoard[i][col] != null) { //piece blocking path
                        return false;
                    }
                }
                //checks if last square is empty, if not, check color and if Piece is a King
                if (gameBoard[row][col] == null || gameBoard[row][col].getColor() != color && !(gameBoard[row][col] instanceof King)) {
                    return true;
                }
                return true;
            } else { // fromRow > endRow
                for (int i = fromRow--; i > endRow; i--) { //no need to check i = fromRow aka (current square);
                    if (gameBoard[i][col] != null) { //piece blocking path
                        return false;
                    }
                }
                //checks if last square is empty, if not, check color and if Piece is a King
                if (gameBoard[row][col] == null || gameBoard[row][col].getColor() != color && !(gameBoard[row][col] instanceof King)) {
                    return true;
                }
                return false;
            }
        }
        return false; //end coordinates are not reachable by Rook
    }
}
