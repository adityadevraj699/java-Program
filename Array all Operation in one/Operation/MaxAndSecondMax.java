package Operation;

public class MaxAndSecondMax {
    public static int[] findMaxAndSecondMax(int[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("Array must contain at least two elements.");
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        return new int[]{max, secondMax};
    }
}
