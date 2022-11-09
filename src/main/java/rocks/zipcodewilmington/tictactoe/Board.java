package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    Character[][] board;

    public Board(Character[][] matrix) {
        board = matrix;
    }

    //Create helper function
    public Boolean column(char s) {
        for (int j = 0; j < 3; j++) {
            if (board[0][j].equals(s) && board[0][j].equals(board[1][j]) && board[0][j].equals(board[2][j])) {
                return true;
            }
        }
        return false;
    }

    public Boolean row(char s) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0].equals(s) && board[i][0].equals(board[i][1]) && board[i][0].equals(board[i][2])) {
                return true;
            }
        }
        return false;
    }

    public Boolean diagonal(char s) {
        if (board[0][0].equals(s) && board[0][0].equals(board[1][1]) && board[0][0].equals(board[2][2])) {
            return true;
        }
        return board[0][2].equals(s) && board[0][2].equals(board[1][1]) && board[0][2].equals(board[2][0]);
    }


    public Boolean isInFavorOfX() {
        char s = 'X';

        return row(s) || column(s) || diagonal(s);
    }

    public Boolean isInFavorOfO() {
        char s = 'O';

        return row(s) || column(s) || diagonal(s);
    }

    public Boolean isTie() {
        return !isInFavorOfX() && !isInFavorOfO();
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
