package Operation;



public class Inverse {
    public static int[] ArrayReverse(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            
            start++;
            end--;
        }
        return array;
    }
    
}
