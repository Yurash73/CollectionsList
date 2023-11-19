package Task_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int number = 5;

        for (int i = 0; i < number; i++) {
            System.out.println(" Введите строку. Осталось ввести " +
                    (number - i) + " строк.");
            strings.add(scanner.nextLine());
        }

        int maxLength = 0;

        for (int i = 0; i < number; i++) {
            if (strings.get(i).length() > maxLength)
                maxLength = strings.get(i).length();
        }

        System.out.println("Самая длинная строка:");
        for (int i = 0; i < number; i++) {
            if (strings.get(i).length() == maxLength)
                System.out.println(strings.get(i));
        }

    }
}
