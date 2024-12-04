import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Utility class for performing operations on lists.
 */
public class ListUtils {

    /**
     * Generates a random list of integers.
     *
     * @param size the number of integers in the list
     * @return a list of random integers
     */
    public static List<Integer> generateRandomList(int size) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(100)); // Random integers from 0-99
        }
        return list;
    }

    /**
     * Creates a frequency map from a list of integers.
     *
     * @param list the list of integers
     * @return a map where keys are integers and values are their frequencies
     */
    public static Map<Integer, Integer> createFrequencyMap(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : list) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return map;
    }

    /**
     * Sorts a list of integers in ascending order.
     *
     * @param list the list of integers to be sorted
     */
    public static void sortList(List<Integer> list) {
        Collections.sort(list);
    }
}
