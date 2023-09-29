package ru.netology;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();

        for (int num : source) {
            if (num < treshold) {
                logger.log("Элемент " + num + " не проходит");
            } else {
                logger.log("Элемент " + num + " проходит");
                result.add(num);
            }
        }
        logger.log("Прошло фильтр " + result.size() + " элемента из " + source.size());
        logger.log("Отфильтрованный список: " + result);
        return result;
    }
}
