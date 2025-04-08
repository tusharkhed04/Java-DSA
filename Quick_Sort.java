import java.util.Scanner;

public class Quick_Sort {
    public static int partition(int arr[] , int low, int high){
        int pivot = arr[high];
        int i = low -1;
        for(int j=low; j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            

        }
        //Swap with pivot
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high]=temp;

        return i;
    }
    public static void quickSort(int arr[],int low,int high){
        if(low<high){
            int pidx = partition(arr,low,high);
            quickSort(arr, low, pidx-1);
            quickSort(arr, pidx+1, high);
        }
    }
    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter size of array :");
        int size = obj.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter "+size+" element in array :");
        for(int i=0; i<arr.length;i++){
            arr[i]=obj.nextInt();
        }
        System.out.print("Unsorted array :");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        quickSort(arr, 0, arr.length-1);
        System.out.print("Sorted array :");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
