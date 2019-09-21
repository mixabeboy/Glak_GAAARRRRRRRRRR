package Player;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int z = 0;
        while (z < 100) {
            Scanner gm = new Scanner(System.in);
            System.out.print("Привет, друг! Я загадал число от 1 до 100, найдется ли силёнок угадать?: ");
            String word = gm.nextLine();
            switch (word) {
                case "нет":
                    System.out.print("Ну, что же, тогда заходи в другой раз!");
                    break;

                case "да":
                    System.out.println("Да начнется игра, сынок! Какое число я загадал?: ");
                    int count;
                    int a = 1;
                    int b = 100;
                    int random_number = a + (int) (Math.random() * b);
                    for (int i = 1; i < 100; i++) {
                        count = gm.nextInt();

                        if (random_number > count) {
                            System.out.println("Не верно:)! Мое число больше > твоего ");
                            System.out.println("Это твоя поптка номер:" + i);
                            System.out.print("Какое число я загадал?: " + "\n");
                        } else if (random_number < count) {
                            System.out.println("Не верно:)! Мое число меньше < твоего ");
                            System.out.println("Это твоя попыытка номер:" + i);
                            System.out.print("Какое число я загадал?: " + "\n");
                        }
                        if (random_number == count) {
                            String[] res = {"Ты угадал-мои поздравления", "Старания были не напрасны!", "Твоёё число совпадает с тем,что я загадал", "ты справился,хорошая была гра!"};
                            System.out.println("Это твоя поптка номер:" + i);
                            Random rrandom = new Random();
                            int Index = rrandom.nextInt(res.length);
                            System.out.println(res[Index]);
                        }
                    }
            }
        }
        z++;
        System.out.println("\n");
    }
}
