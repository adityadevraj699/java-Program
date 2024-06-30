public class StringToArray {
    public static void main(String[] args) {
        String[] arr=new String[]{"hello","I","am","Aditya","kumar"};
        StringBuilder sc=new StringBuilder();
        for (String str : arr){
            sc.append(str).append(" ");
        }
        System.out.println(sc);
    }
}
