import java.util.*;
public class merge_sort {
   public static void divide(int arr[],int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = si + (ei-si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr,si,mid,ei);
   }
   public static void conquer(int arr[],int si, int mid, int ei){
        int merged[] = new int[ei-si+1];
        int idx1 = si;
        int idx2 = mid+1;
        int x=0;
        while(idx1<=mid && idx2<=ei){
            if(arr[idx1]<=arr[idx2]){
                merged[x++] = arr[idx1++];
            }else{
                merged[x++] = arr[idx2++];
            }
        }

        // if first array is not over then this condition works
        while(idx1<=mid){
            merged[x++] = arr[idx1++];
        }

        // if secound array is not over then this conditon works 
        while(idx2<=ei){
            merged[x++] = arr[idx2++];
        }
        for(int i=0,j=si; i<merged.length; i++,j++){
            arr[j] = merged[i];
        }
   }
   public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a size of array :");
        int size= obj.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter a element in array :");
        for(int i=0; i<arr.length; i++){
            arr[i] = obj.nextInt();
        }
        divide(arr, 0, arr.length-1);
        //printing array
        System.out.print("Sorted array :");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        
   }
}
