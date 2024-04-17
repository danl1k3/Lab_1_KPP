package org.example;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ExecuteStringPalTest {

    @Test
    public void testFindMaxPalindrom() {
        List<String> result1 = Palindrom.findMaxPalindrom("cheese", 1, 4);
        assertEquals(List.of("ee","ehe", "ese"), result1);

        List<String> result2 = Palindrom.findMaxPalindrom("weekend", 3, 6);
        assertEquals(List.of(), result2);
    }
    @Test
    public void testFindMaxPalindrom_EmptyInput() {
        List<String> result = Palindrom.findMaxPalindrom("", 0, 0);
        assertEquals(Collections.emptyList(), result);
    }

    @Test
    public void testFindMaxPalindrom_SingleCharacterInput() {
        List<String> result = Palindrom.findMaxPalindrom("a", 0, 0);
        assertEquals(Collections.emptyList(), result);
    }

    @Test
    public void testFindMaxPalindrom_SameCharacters() {
        List<String> result = Palindrom.findMaxPalindrom("aaa", 0, 2);
        assertEquals(List.of("aaa", "aa"), result);
    }


}