public class MaxSearchArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,7,4,5};
        int max=Integer.MIN_VALUE;
        for(int i:arr){
            if(max<i){
                max=i;
            }
        }
        System.out.println("Maximum is :  "+max);
    }
}
