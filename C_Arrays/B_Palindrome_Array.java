import java.util.*;
public class B_Palindrome_Array {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int [] arr=new int [n];
      for(int i=0; i<arr.length; i++){
        arr[i]=sc.nextInt();
      }  
      sol(arr);
    }
    public static void sol(int [] arr){
        int start=0, end=arr.length-1, count=0;
        while(start<end){
            if(arr[start]==arr[end]){
                start++;
                end--;
            }
            else{
            count++;
            break;
            }
        }
        if(count==0){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindorme");
        }
    }
}
/*
 5
1 2 3 2 1
palindrome
 */
