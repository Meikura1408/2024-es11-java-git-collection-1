import java.util.List;
import java.util.Map;

public class App {

    /**
     * TODO:
     * 
     * completare la classe DataHelper
     * 
     * aggiungere i seguenti metodi per testare la classe DataHelper:
     * - testRandomInteger : void
     * testare le 3 implementazioni del metodo getRandomInteger
     * 
     * - testRandomUniqueInteger : void
     * testare le 3 implementazioni del metodo getRandomUniqueInteger
     * 
     * - testFrequencyMap : void
     * testare il metodo getFrequencyMap;
     * sfruttare i metodi precedentemente svolti e utilizzarli come
     * dati in ingresso per il metodo getFrequencyMap
     * 
     */

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        testRandomInteger();
        testRandomUniqueInteger();
        testFrequencyMap();
        
    }

    public static void testFrequencyMap() {
        List<Integer> randomList = DataHelper.getRandomInteger(20, 1, 5);
        System.out.println("Random Integer List for Frequency Map: " + randomList);

        Map<Integer, Integer> frequencyMap = DataHelper.getFrequencyMap(randomList);
        System.out.println("Frequency Map: " + frequencyMap);
    }

    public static void testRandomInteger() {
        List<Integer> randomList1 = DataHelper.getRandomInteger(10);
        System.out.println("Random Integer List (0-10): " + randomList1);

        List<Integer> randomList2 = DataHelper.getRandomInteger(10, 20);
        System.out.println("Random Integer List (0-20): " + randomList2);

        List<Integer> randomList3 = DataHelper.getRandomInteger(10, 5, 15);
        System.out.println("Random Integer List (5-15): " + randomList3);
    }

    public static void testRandomUniqueInteger() {
        List<Integer> uniqueList1 = DataHelper.getRandomUniqueInteger(5);
        System.out.println("Random Unique Integer List (0-10): " + uniqueList1);

        List<Integer> uniqueList2 = DataHelper.getRandomUniqueInteger(5, 20);
        System.out.println("Random Unique Integer List (0-20): " + uniqueList2);

        List<Integer> uniqueList3 = DataHelper.getRandomUniqueInteger(5, 5, 15);
        System.out.println("Random Unique Integer List (5-15): " + uniqueList3);
    }
}
