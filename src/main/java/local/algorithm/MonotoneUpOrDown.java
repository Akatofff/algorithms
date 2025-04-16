package local.algorithm;

public class MonotoneUpOrDown {
    public static boolean isMonotone(int[] arr) {
        boolean up = true;
        boolean down = true;
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] > arr[i-1])) down = false;
            if ((arr[i] < arr[i-1])) up = false;
        }
        return up || down;
    }
}