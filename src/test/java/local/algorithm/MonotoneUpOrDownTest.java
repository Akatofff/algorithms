package local.algorithm;

import org.junit.Test;

import static local.algorithm.MonotoneUpOrDown.isMonotone;
import static org.junit.jupiter.api.Assertions.*;

public class MonotoneUpOrDownTest {

    int[] arr1 = {1, 2, 4, 6};
    int[] arr2 = {10, 5, 4, 2, 1};
    int[] arr3 = {1, 2, 4, 3, 6};

    @Test
    public void isArrMonotone() {
        assertTrue(isMonotone(arr1));
        assertTrue(isMonotone(arr2));
        assertFalse(isMonotone(arr3));
    }
  
}