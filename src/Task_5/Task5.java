package Task_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int number = 5;

        for (int i = 0; i < number; i++) {
            System.out.println(" Введите строку. Осталось ввести " +
                    (number - i) + " строк.");
            strings.add(scanner.nextLine());
        }

        int count = 13;
        String buffer;

        for (int i = 0; i < count; i++) {
            buffer = strings.get(strings.size() - 1);
            strings.add(0, buffer);
        }

        strings.stream().forEach(System.out::println);

        for (int i = 0; i < strings.size() - 1; i++)
            System.out.println(strings.get(i));
    }
}
