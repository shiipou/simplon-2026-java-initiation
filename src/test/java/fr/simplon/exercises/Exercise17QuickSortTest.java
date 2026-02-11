package fr.simplon.exercises;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests pour l'exercice 16
 */
class Exercise17QuickSortTest {
    
    Exercise17QuickSort exercise = new Exercise17QuickSort();
    
    @Test
    void testQuickSort() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, exercise.quickSort(new int[]{5, 2, 4, 1, 3}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, exercise.quickSort(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, exercise.quickSort(new int[]{5, 4, 3, 2, 1}));
        assertArrayEquals(new int[]{1, 2, 3, 6, 7}, exercise.quickSort(new int[]{7, 3, 1, 6, 2}));
        assertArrayEquals(new int[]{10, 20, 30, 40}, exercise.quickSort(new int[]{40, 10, 30, 20}));
    }
}
