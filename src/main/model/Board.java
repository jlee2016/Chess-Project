package src.main.model;

public class Board {
    protected Piece[][] gameBoard;
    
    public Board() {
        gameBoard = new Piece[8][8];
        setupBoard();
    }

    Piece getPiece(int row, int col) {
        return gameBoard[row][col];
    }

    void setupBoard() {
        // White pieces
        for (int i = 0; i < gameBoard.length; i++) {
            gameBoard[1][i] = new Pawn(1, 1, i);
        }
        gameBoard[0][0] = new Rook(1,0,0);
        gameBoard[0][1] = new Knight(1,0, 1);
        gameBoard[0][2] = new Bishop(1, 0, 2);
        gameBoard[0][3] = new Queen(1, 0, 3);
        gameBoard[0][4] = new King(1, 0, 4);
        gameBoard[0][5] = new Bishop(1, 0, 5);
        gameBoard[0][6] = new Knight(1, 0, 6);
        gameBoard[0][7] = new Rook(1, 0, 7);

        // Black pieces
        for (int i = 0; i < gameBoard.length; i++) {
            gameBoard[6][i] = new Pawn(-1, 6, i);
        }
        gameBoard[7][0] = new Rook(-1, 7, 0);
        gameBoard[7][1] = new Knight(-1,7, 1);
        gameBoard[7][2] = new Bishop(-1, 7, 2);
        gameBoard[7][3] = new Queen(-1, 7, 3);
        gameBoard[7][4] = new King(-1, 7, 4);
        gameBoard[7][5] = new Bishop(-1, 7, 5);
        gameBoard[7][6] = new Knight(-1, 7, 6);
        gameBoard[7][7] = new Rook(-1, 7, 7);
    }
}
