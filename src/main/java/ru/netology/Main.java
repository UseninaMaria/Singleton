package ru.netology;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static int N;
    static int M;
    static int f;

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            logger.log("Запуск программы");

            logger.log("Введите размер списка: ");
            N = scanner.nextInt();

            System.out.println("Введите верхнюю границу для значений: ");
            M = scanner.nextInt();

            logger.log("Создаём и наполняем список");
            ArrayList<Integer> list = new ArrayList<>(N);
            Random random = new Random();

            for (int i = 0; i < N; i++) {
                int randomNumber = random.nextInt(M);
                list.add(randomNumber);
            }

            logger.log("Вот случайный список: " + list);

            logger.log("Введите порог для фильтра: ");
            f = scanner.nextInt();
            Filter filter = new Filter(f);
            logger.log("Запускаем фильтрацию");
            filter.filterOut(list);
            logger.log("Программа завершена");
            break;
        }
    }
}