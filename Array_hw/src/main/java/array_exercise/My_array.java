package array_exercise;
import java.util.Scanner;


public class My_array {
	public static void sort_array(int[] arr,int size) {
		
		if(size ==1) {
			return ;
		}
		for(int i=0;i<size-1;i++) {
			if(arr[i]<arr[i+1]) {
				int temp = arr[i+1];
				arr[i+1]=arr[i];
				arr[i]=temp;
			}
		}
		
		sort_array(arr,size-1);
	}
	public static void print_array(int[] arr) {
		for(int i = 0; i< arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static int[] read_array() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int num = sc.nextInt();	
		int arr[] = new int[num];
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i< num; i++) {
			arr[i]=sc.nextInt();
		}
		
		return arr;
	}
	public static int findMin(int[] arr) {
		int min = arr[0];
		for(int i =1; i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		return min;
	}
	public static int findMax(int[] arr) {
		int max = arr[0];
		for(int i = 1; i < arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
	public static void reverse_arr(int[] arr) {
		int start = 0;
		int end = arr.length -1 ;
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end]=temp;
			start+=1;
			end-=1;	
		}
	}
	public static void main(String arg[]) {
		//int [] arr = {1,6,9,3,19,20,22,11,72};
		//My_array.sort_array(arr, arr.length);
		//My_array.print_array(arr);
		int [] test_arr = My_array.read_array();
		My_array.print_array(test_arr);
		//System.out.println("\n"+ My_array.findMin(test_arr));
		My_array.reverse_arr(test_arr);
		System.out.println("\n");
		My_array.print_array(test_arr);
		
	}
	
	
}
