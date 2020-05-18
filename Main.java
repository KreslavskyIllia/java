import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int userNumber;
        int userDecisionToContinue;

        do {
            int number = random.nextInt(9+1);
            for (int tryCount = 0; tryCount < 3; tryCount++) {
                System.out.println("Угадайте число от 0 до 9.");
                userNumber = scanner.nextInt();
                if(userNumber == number){
                    System.out.println("Вы угадали!");
                    break;
                } else if (userNumber > number) {
                    System.out.println("Загаданное число меньше.");
                } else {
                    System.out.println("Загаданное число больше.");
                }
            }

            System.out.println("Загаданное число: " + number + ". Повторить игру еще раз? 1 – да / 0 – нет");
            userDecisionToContinue = scanner.nextInt();

        } while (userDecisionToContinue == 1);
        scanner.close();
    }
}
