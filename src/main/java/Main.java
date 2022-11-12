import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        Random random = new Random();
        Logger logger = Logger.getInstance();
        ArrayList arrayList = new ArrayList<>();
        logger.log("Добрый день! Введите два числа:  1 - размер списка и 2 - верхнюю границу значений элементов в списке: ");
        String answer = scanner.nextLine();

        List<String> number = List.of(answer.split(" "));
        int listSize = Integer.parseInt(number.get(0));
        int maxValue = Integer.parseInt(number.get(1));
        for (int i = 0; i < listSize ; i++) {
            arrayList.add(random.nextInt(maxValue));
        }

        logger.log(" Введите число для фильтрации списка: ");
        Filter filter = new Filter(Integer.parseInt(scanner.next()));
        logger.log(filter.filterOut(arrayList).toString());
        scanner.close();


    }
}
