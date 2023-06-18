import java.util.Random;
import java.util.Scanner;

public class Lesson03 {
    public static void main(String[] args) {
        do {
            doTask1();
        } while (askForContinue());
    }

    // Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число. При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше. После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
    private static void doTask1(){
        int number = new Random().nextInt(9);
        int tryNumber;
        System.out.println(number );
        System.out.println("Вам необходимо отгадать число от 0 до 9. У Вас есть три попытки");
        System.out.println("Число сгенерировано");
        for (int i = 0; i < 3; i++) {
            System.out.println("Оставшихся попыток: " + (3-i));
            tryNumber = askForNumber();
            if (number == tryNumber) {
                System.out.println("Вы угадали!");
                break;
            } else if (number < tryNumber) {
                System.out.println("Вы не угадали, загаданное число меньше введенного!");
            } else {
                System.out.println("Вы не угадали, загаданное число больше введенного!");
            }
        }
    }

    private static int askForNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 0 до 9: ");
        return scanner.nextInt();
    }

    private static boolean askForContinue(){
        System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        return i == 1;
    }
}