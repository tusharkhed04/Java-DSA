/*//----------------------------------------------------------------------------------------Bubble sort
import java.util.*;
public class searching {
    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        //printing element 
        System.out.print("Sorted array :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a size of array :");
        int size = obj.nextInt();
        int array[]= new int[size];
        System.out.println("Enter a "+size+" element to array :");
        for(int i=0;i<size;i++){
            array[i]=obj.nextInt();
        }
        System.out.print("Unsorted array :");
        for(int i =0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        bubbleSort(array);
        
    }
}*/


/*
 * //----------------------------------------------------------------------------------------Selection sort
import java.util.*;
public class learn {
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int smallest =i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[smallest]){
                    smallest=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;

        }
        // Printing element
        System.out.print("Sorted array :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a size of array :");
        int size = obj.nextInt();
        int array[]= new int[size];
        System.out.println("Enter a "+size+" element in array :");
        for(int i=0;i<size;i++){
            array[i]=obj.nextInt();
        }
        System.out.print("Unsorted array :");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        selectionSort(array);
        
    }
}
 */


 
/*//----------------------------------------------------------------------------------------Insertion sort

import java.util.Scanner;

public class learn {

    public static void insertionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int current = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>current){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        // Printing element
        System.out.print("Sorted array :");
        for(int i=0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a size of array :");
        int size = obj.nextInt();
        int array[]=new int[size];
        System.out.println("Enter a "+size+" element in array :");
        for(int i=0;i<array.length;i++){
            array[i]=obj.nextInt();
        }
        System.out.print("Unsorted array :");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        insertionSort(array);
    }
}
 * 
 */
