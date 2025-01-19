import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/*class Dog{}
class Cat{}
class Horse{}


public class learn {
    static String count(ArrayList myList){
        int a=0,b=0,c=0;
        for(int i=0;i<myList.size();i++){
            Object element = myList.get(i);
            if(element instanceof Dog)
            a++;
            if(element instanceof Cat)
            b++;
            if(element instanceof Horse)
            c++;
        }
        String ret = Integer.toString(a)+" "+Integer.toString(b)+" "+Integer.toString(c);
        return ret;
    }
    public static void main(String[] args) {
        ArrayList myList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of element in list :");
        int n= sc.nextInt();
        System.out.println("Enter a name count of animal (Cat/Dog/Horse) :");
        for(int i=0;i<n;i++){
            String name = sc.next();
            if(name.equals("Dog")){
                myList.add(new Dog());
            }
            if(name.equals("Cat")){
                myList.add(new Cat());
            }
            if(name.equals("Horse")){
                myList.add(new Horse());
            }
        }

        System.out.println(count(myList));

    }
}*/

import javax.naming.spi.DirStateFactory.Result;


/*public class learn{
    public static void main(String[] args){
        Scanner obj =new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = obj.nextInt();
        if(num%2!=0){
            System.out.println("Weird");
        }else if(num%2==0&&(num>=2&&num<=5)){
            System.out.println("Not Weird");
            
        }else if(num%2==0 && (num>=6 && num<=20)){
            System.out.println("Weird");
        }else if(num%2==0 && num>20){
            System.out.println("Not Weird");
        }
    }
}*/

/*import java.util.Scanner;

public class learn {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = scan.nextLine();
        
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        scan.nextLine();// to indicate the end of buffer...
        System.out.println("Int: " + i);
    }
}*/

//Output Formating-----------------------------------
/* 
import java.util.Scanner;

public class learn{

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s",s1);
                System.out.printf("%d\n", x);
                //Complete this line
            }
            System.out.println("================================");

    }
}

*/

//------------------------------------------------------END OF FILE IN JAVA------------------------------------------------------

/*
 * public class Solution {

    public static void main(String[] args) {
        
        Scanner line = new Scanner(System.in);
        int counter = 1;
        while(line.hasNextLine()){
            String str = line.nextLine();
            System.out.println(counter+" "+str);
            counter++;
        }
    }
}
*/


/* 
 * public class HackerRank {

    public static String findDay(int month, int day, int year){
        Calendar obj = Calendar.getInstance();
        obj.set(year,month-1,day);
        int dayOfWeek = obj.get(Calendar.DAY_OF_WEEK);
        String[] days = {"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
        return days[dayOfWeek-1];
    }

    public static void main(String[] args)throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getProperty("OUTPUT_PATH")));
        String[] firstInput = bufferedReader.readLine().replaceAll("\\s+$","").split(" ");
        int month = Integer.parseInt(firstInput[0]);
        int day = Integer.parseInt(firstInput[1]);
        int year = Integer.parseInt(firstInput[2]);
        String res = findDay(month,day,year);

        bufferedWriter.write(res);
        bufferedReader.readLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
 */


 /*--------------------------------------------------Anagram String--------------------------------------------------
  * import java.util.Scanner;

public class Solution {
    
    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
        b = b.toLowerCase();
        if(a.length() != b.length()){
            return false;
        }
        
        for(int i=0;i<a.length();i++){
            
            int count1 =0,count2=0;
            char c1 = a.charAt(i);
            char c2 = b.charAt(i);
            for(int j=0;j<b.length();j++){
                if(c1 != c2){
                    c2 = b.charAt(j);
                }
            }
            if(c1 != c2){
                return false;
            }
            for(int j=0;j<a.length();j++){
                if(c1 == a.charAt(j)){
                    count1++;
                }
                if(c2 == b.charAt(j)){
                    count2++;
                }
            }
            if(count1 != count2){
                return false;
            }
        }
        
        return true;
        
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

  */