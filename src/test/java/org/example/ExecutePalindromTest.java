package org.example;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ExecutePalindromTest {

    @Test
    public void testFindSecondPalindrome() {
        List<Integer> numbers1 = Arrays.asList(12, 121, 34, 56, 78, 87, 787);
        List<Integer> numbers2 = Arrays.asList(0, 1, 30, 44);
        List<Integer> numbers3 = Arrays.asList(121,4, 234, 3433, 456442323, 52265);
        List<Integer> numbers4 = Arrays.asList(1, 11, 101, 1001, 10001);

        String expected1 = "787";
        String expected2 = "44";
        String expected3 = "121";
        String expected4 = "101";

        assertEquals(expected1, Palindrom.findSecondPalindrom(numbers1));
        assertEquals(expected2, Palindrom.findSecondPalindrom(numbers2));
        assertEquals(expected3, Palindrom.findSecondPalindrom(numbers3));
        assertEquals(expected4, Palindrom.findSecondPalindrom(numbers4));
    }
}