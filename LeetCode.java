import java.util.*;
public class LeetCode {

    public static int[] pluseOne(int[] digits){
        for(int i= digits.length-1; i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
            
        }
        digits = new int[digits.length +1];
        digits[0] = 1;
        return digits;
        
    }
    
    public static void main(String[] args) {
        int[] array = {9,9};
        int[] newarr = pluseOne(array);
        for(int j=0;j<newarr.length;j++){
            System.out.print(newarr[j]+" ");
        }
    }
}
