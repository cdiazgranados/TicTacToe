package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] board;

    public Board(Character[][] matrix) {
        board = matrix;
    }

    //Create helper function?

    public Boolean isInFavorOfX() {
        //column
        for (int i = 0; i <= 0; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j].equals('X') && board[i][j].equals(board[i + 1][j]) && board[i][j].equals(board[i + 2][j])) {
                    return true;
                }
            }
        }

            //Row
            for (int i = 0; i < 3; i++) {
                if (board[i][0].equals('X') && board[i][0].equals(board[i][1]) && board[i][0].equals(board[i][2])) {
                    return true;
                }
            }

            //Diagonal
            if (board[0][0].equals('X') && board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2])) {
                return true;
            } else if (board[0][2].equals('X') && board[0][2].equals(board[1][1]) && board[0][2].equals(board[2][0])) {
                return true;
            }
        return false;
    }

    public Boolean isInFavorOfO() {
            //column
            for (int i = 0; i <= 0; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j].equals('O') && board[i][j].equals(board[i + 1][j]) && board[i][j].equals(board[i + 2][j])) {
                        return true;
                    }
                }
            }

            //Row
            for (int i = 0; i < 3; i++) {
                if (board[i][0].equals('O') && board[i][0].equals(board[i][1]) && board[i][0].equals(board[i][2])) {
                    return true;
                }
            }

            //Diagonal
            if (board[0][0].equals('O') && board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2])) {
                return true;
            } else if (board[0][2].equals('O') && board[0][2].equals(board[1][1]) && board[0][2].equals(board[2][0])) {
                return true;
            }

        return false;
    }

    public Boolean isTie() {
        if (!isInFavorOfX() && !isInFavorOfO()) {
            return true;
        }
        return false;
    }

    public String getWinner() {
        if (isInFavorOfX()) {
            return "X";
        } else if (isInFavorOfO()) {
            return "O";
        }
        return "";
    }


}
