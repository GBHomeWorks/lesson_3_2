import java.util.Random;
import java.util.Scanner;


public class HomeWork3 {
    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {

        int play = 1;

        do {
            int number = rand.nextInt(10);
            System.out.println("Загадано число от 0 до 9");

            for (int i = 0; i < 3; i++) {
                System.out.println("Введите число\n");
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

// --------------------------------------------------------------------------------------------------------------

    /*

   // Попытка решения второй задачи ))

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
//        int a = words.length;
        for (int i = 0; i < words.length;) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%15s",words[i]);
                i++;
            }
            System.out.println();
        }
        int wordID = rand.nextInt(words.length);
//        System.out.println(wordNumber);
        String word = words[wordID];
//        System.out.println(word);

        System.out.println("Введите загаданное слово");
        String userWord = sc.nextLine();
//        System.out.println(userWord);

        boolean quest = true;

        while (quest) {
            if (word.equals(userWord)) {
                quest = false;
                System.out.println("Вы угадали!");
            }

            else if (word.length() < userWord.length()) {
                for (int i = 0; i < 15; i++) {
                    char a = word.charAt(i);
                    char b = userWord.charAt(i);
                    if (a == b) {
                        System.out.print(a);
                    } else {
                        System.out.print("#");
                    }
                }
            } else {
                for (int i = 0; i < 15; i++) {
                    char a = word.charAt(i);   // Здесь и выше (в for) вызывается несуществующий элемент [i]. Выдается ошибка.
                                                // Таким образом видно, что подход не правильный, т.е. нужно изменять логику
                                                // программы или использовать какой-либо ограничитель счетчика. Задача не решена.
                    char b = userWord.charAt(i);
                    if (a == b) {
                        System.out.print(b);
                    } else {
                        System.out.print("#");
                    }
                }
            }
            quest = false;
        }

        */

    }
}



