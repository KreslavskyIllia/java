import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        playTicTacToe();
    }

    static void playTicTacToe() {
        char[][] field = getField();
        drawField(field);

        char playerSign = 'X';
        char computerSign = 'O';
        boolean isWin;
        boolean isDraw;

        do {
            movePlayerSign(field, playerSign);
            isWin = checkWin(field, playerSign);
            isDraw = checkDraw(field);
            if (isWin) {
                System.out.println("Player is winner!");
                break;
            }
            if (isDraw) {
                System.out.println("Sorry, draw!");

            }
            moveComputer(field, computerSign);
            drawField(field);

        } while(!isWin || !isDraw);

        System.out.println("Game over");
        drawField(field);
    }

    static boolean checkDraw(char[][] field) {
        for (int i = 0; i < field.length; i++){
            for (int j = 0; j < field.length; j++){
                if (field[i][j] != '-');
                return true;
            }
        }return false;
    }

    static boolean isCellEmpty(char[][] field, int x, int y) {
        return field[x][y] == '-';
    }

    static void move(char[][] field, char currentPlayerSign) {
        if (currentPlayerSign == 'X') {
            movePlayerSign(field, currentPlayerSign);
        } else {
            moveComputer(field, currentPlayerSign);
        }
    }

    static boolean checkWin(char[][] field, char currentPlayerSign) {
        if (checkHorizontalWin(field, currentPlayerSign)) {
            return true;
        }
        if (checkVerticalWin(field, currentPlayerSign)) {
            return true;
        }
        if (checkDiagonalWin(field, currentPlayerSign)) {
            return true;
        }
        return false;
    }

    static boolean checkHorizontalWin(char[][] field, char currentPlayerSign) {
        for (int i = 0; i < field.length; i++) {
            if (field[i][0] == currentPlayerSign && field[i][1] == currentPlayerSign && field[i][2] == currentPlayerSign) {
                return true;
            }
        }
        return false;
    }

    static boolean checkVerticalWin(char[][] field, char currentPlayerSign) {
        for (int j = 0; j < field.length; j++){
            if (field[0][j] == currentPlayerSign && field[1][j] == currentPlayerSign && field[2][j] == currentPlayerSign){
                return true;
            }
        }
       return false;
    }

    static boolean checkDiagonalWin(char[][] field, char currentPlayerSign) {
        if ((field[0][0] == currentPlayerSign && field[1][1] == currentPlayerSign && field[2][2] == currentPlayerSign) || (field[2][0] == currentPlayerSign && field[1][1] == currentPlayerSign && field[0][2] == currentPlayerSign)){
            return true;
        }
        return false;
    }

    static void moveComputer(char[][] field, char computerSign) {
        int x;
        int y;
        Random random = new Random();

        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellEmpty(field, x, y));

        System.out.println("Computer's move ...");
        System.out.println(String.format("Computer decided choose coordinates [%s, %s]", x + 1, y + 1));
        field[x][y] = computerSign;
    }

    static void movePlayerSign(char[][] field, char playerSign) {
        int x;
        int y;
        boolean isEmptyCell;

        do {
            boolean isCorrectCoordinates;
            do {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Input X-coordinates [1, 2, 3]");
                x = scanner.nextInt() - 1;
                System.out.println("Input Y-coordinates [1, 2, 3]");
                y = scanner.nextInt() - 1;

                isCorrectCoordinates = checkCoordinates(x, y);
                notifyIncorrectCoordinates(isCorrectCoordinates);
            } while (!isCorrectCoordinates);

            isEmptyCell = isCellEmpty(field, x, y);
            notifyOccupiedCell(isEmptyCell, x, y);
        } while (!isCellEmpty(field, x, y));

        field[x][y] = playerSign;
    }

  /*  static boolean isCellEmpty(char[][] field, int x, int y) {
        return field[x][y] == '-';
    }*/

    static void notifyOccupiedCell(boolean isOccupied, int x, int y) {
        if (!isOccupied) {
            System.out.println(String.format("Input coordinates are incorrect. Cell of coordinates [%s, %s] is already occupied", x, y));
        }
    }

    static void notifyIncorrectCoordinates(boolean isCorrect) {
        if (!isCorrect) {
            System.out.println("Input coordinates are incorrect. Available coordinates in range [1, 2, 3]");
        }
    }

    static boolean checkCoordinates(int x, int y) {
        return (x >= 0 && x <= 2) && (y >= 0 && y <= 2);
    }

    static void drawField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }

    static char[][] getField() {
        return new char[][]{
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };
    }

}
