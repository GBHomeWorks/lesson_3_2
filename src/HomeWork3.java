import java.util.Random;
import java.util.Scanner;


public class HomeWork3 {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
/*        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.printf("%d + %d = %d\n", x, y, x + y);

        String name = sc.nextLine();
       // name = sc.nextLine();
        System.out.println(name + " hello!");*/
        int play = 1;

        do {
            int number = rand.nextInt(10);
            System.out.println(number);
            System.out.println("Загадано число от 0 до 9");

            for (int i = 0; i < 3; i++) {
                System.out.println("Введите чисило\n");
                int userNumber = sc.nextInt();
                if (userNumber > number) {
                    System.out.println("Ваше число больше загаданного");
                } else if (userNumber < number) {
                    System.out.println("Ваше число меньше загаданного");
                } else {
                    System.out.println("Вы угадали!\n");
                    break;
                }
            }
            System.out.println("Чтобы повторить игру - введите 1");
            System.out.println("Чтобы закончить - введите 0\n");
            play = sc.nextInt();
        } while (play == 1);
        System.out.println("Игра закончена");
    }
}


