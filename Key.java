

import java.util.Arrays;
import java.util.Scanner; 

class Key { 

	
	public static int[] removeElements(int[] arr, int key,int n) 
	{ 
		
		int index = 0; 
		for (int i=0; i<n; i++) 
			if (arr[i] != key) 
				arr[index++] = arr[i]; 

		
		return Arrays.copyOf(arr, index); 
	} 

	
	public static void main(String[] args) 
	{ 
        Scanner a=new Scanner(System.in);
		int array[] =new int[100]; 
		System.out.print("Enter a size of array :-  ");
        int n=a.nextInt();
        System.out.println("Enter array element :- ");
        for(int i=0;i<n;i++){
            array[i]=a.nextInt();
        }
        System.out.print("Enter key :-  ");
        int key =a.nextInt();
		array = removeElements(array, key,n); 
		System.out.println(Arrays.toString(array)); 
        a.close();
	} 
} 
