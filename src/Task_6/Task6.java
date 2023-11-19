package Task_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int number = 10;

        for (int i = 0; i < number; i++) {
            System.out.println(" Введите строку. Осталось ввести " +
                    (number - i) + " строк.");
            strings.add(scanner.nextLine());
        }

        int maxLength = 0;
        int maxLengthPosition = 0;
        int minLength = Integer.MAX_VALUE;
        int minLengthPosition = 0;

        for (int i = 0; i < number; i++) {
            if (strings.get(i).length() > maxLength) {
                maxLength = strings.get(i).length();
                maxLengthPosition = i;
            }
            if (strings.get(i).length() < minLength) {
                minLength = strings.get(i).length();
                maxLengthPosition = i;
            }
        }

        if (maxLengthPosition < minLengthPosition) {
            System.out.println(" Первой была самая длинная строка: ");
            System.out.println(strings.get(maxLengthPosition));
        } else {
            System.out.println(" Первой была самая короткая строка: ");
            System.out.println(strings.get(minLengthPosition));
        }
    }
}
