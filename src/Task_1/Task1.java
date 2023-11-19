package Task_1;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {


        List<String> stringsList = new ArrayList<>();

        stringsList.add("Волка ноги кормят.");
        stringsList.add("У семя нянек дитя без глаза.");
        stringsList.add("О работы кони дохнут.");
        stringsList.add("Рыбак рыбака видит издалека.");
        stringsList.add("Без труда не вынешь рыбку из пруда.");

        System.out.println("Размера списка строк: " + stringsList.size());

        for (int i = 0; i < stringsList.size(); i++) {
            System.out.println(stringsList.get(i));
        }
    }
}
