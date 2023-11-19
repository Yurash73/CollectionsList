package Task_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int number = 10;

        for (int i = 0; i < number; i++) {
            System.out.println(" Введите строку. Осталось ввести " +
                    (number - i) + " строк.");
            strings.add(0,scanner.nextLine());
        }
        System.out.println("Список строк:");
        for (int i = 0; i < number; i++) {
                System.out.println(strings.get(i));
        }

    }
}
