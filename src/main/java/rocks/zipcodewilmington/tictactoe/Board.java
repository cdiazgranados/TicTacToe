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
        for (int i = 0; i <= 0; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j].equals(s) && board[i][j].equals(board[i + 1][j]) && board[i][j].equals(board[i + 2][j])) {
                    return true;
                }
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
        } else if (board[0][2].equals(s) && board[0][2].equals(board[1][1]) && board[0][2].equals(board[2][0])) {
            return true;
        }
        return false;
    }


    public Boolean isInFavorOfX() {
        char s = 'X';

        if (row(s) || column(s) ||diagonal(s)) {
            return true;
        }

        return false;
    }

    public Boolean isInFavorOfO() {
        char s = 'O';

        if (row(s) || column(s) ||diagonal(s)) {
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
