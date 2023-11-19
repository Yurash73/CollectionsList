package Task_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int number = 20;
        List<Integer> divByTwo = new ArrayList<>();
        List<Integer> divByThree = new ArrayList<>();
        List<Integer> another = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            System.out.println(" Введите целое число. Осталось ввести " +
                    (number - i) + " строк.");
            numbers.add(scanner.nextInt());
        }

        for (int i = 0; i < number; i++) {
            Integer buffer = numbers.get(i);
            if ((buffer % 3) == 0) {
                divByThree.add(buffer);
            }
            if ((buffer % 2) == 0) {
                divByTwo.add(buffer);
            }
            if ((buffer % 3) != 0 && (buffer % 2) != 0) {
                another.add(buffer);
            }
        }

        System.out.println("Числа, делящиеся на 3 без остатка:  ");
        divByThree.stream().forEach(System.out::println);

        System.out.println("Числа, делящиеся на 2 без остатка:  ");
        divByTwo.stream().forEach(System.out::println);

        System.out.println("Все остальные числа:  ");
        another.stream().forEach(System.out::println);

    }
}
