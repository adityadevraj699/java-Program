package Operation;

public class MinAndSecondMin {
    public static int[] findMinAndSecondMin(int[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : array) {
            if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num != min) {
                secondMin = num;
            }
        }

        if (secondMin == Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Array must contain at least two distinct elements.");
        }

        return new int[]{min, secondMin};
    }
}
