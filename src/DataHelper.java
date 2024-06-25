import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class DataHelper {

    public static List<Integer> getRandomInteger(int size) {
        return getRandomInteger(size, 0, 10);
    }


    public static List<Integer> getRandomInteger(int size, int max) {
        return getRandomInteger(size, 0, max);
    }


    public static List<Integer> getRandomInteger(int size, int min, int max) {
        Random random = new Random();
        List<Integer> randomIntegers = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            randomIntegers.add(random.nextInt((max - min) + 1) + min);
        }
        return randomIntegers;
    }

    public static List<Integer> getRandomUniqueInteger(int size) {
        return getRandomUniqueInteger(size, 0, 10);
    }


    public static List<Integer> getRandomUniqueInteger(int size, int max) {
        return getRandomUniqueInteger(size, 0, max);
    }

    public static List<Integer> getRandomUniqueInteger(int size, int min, int max) {
        if (size > (max - min + 1)) {
            throw new IllegalArgumentException("La dimensione è maggiore dell'intervallo di numeri unici disponibili.");
        }
        Random random = new Random();
        Set<Integer> uniqueIntegers = new HashSet<>();
        while (uniqueIntegers.size() < size) {
            uniqueIntegers.add(random.nextInt((max - min) + 1) + min);
        }
        return new ArrayList<>(uniqueIntegers);
    }

    // restituisce una mappa di frequenza di numeri interi
    public static Map<Integer, Integer> getFrequencyMap(List<Integer> list) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (Integer number : list) {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }
        return frequencyMap;
    }
}
