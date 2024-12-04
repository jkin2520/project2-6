
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Test suite for ListUtils class.
 */
public class ListUtilsTest {

    @Test
    void testRandomListGeneration() {
        List<Integer> list = ListUtils.generateRandomList(10);
        assertEquals(10, list.size(), "List size should match the input size");
    }

    @Test
    void testCreateFrequencyMap() {
        List<Integer> list = List.of(1, 2, 2, 3, 3, 3);
        Map<Integer, Integer> frequencyMap = ListUtils.createFrequencyMap(list);

        assertEquals(1, frequencyMap.get(1), "Frequency of 1 should be 1");
        assertEquals(2, frequencyMap.get(2), "Frequency of 2 should be 2");
        assertEquals(3, frequencyMap.get(3), "Frequency of 3 should be 3");
    }

    @Test
    void testSortList() {
        List<Integer> list = List.of(5, 3, 8, 1, 2);
        List<Integer> mutableList = new ArrayList<>(list); // Make it mutable
        ListUtils.sortList(mutableList);

        assertEquals(List.of(1, 2, 3, 5, 8), mutableList, "List should be sorted in ascending order");
    }
}
