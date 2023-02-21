import java.util.*;
public class A_Span_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        sol(arr);
    }
    public static void sol(int [] arr){
        int min=arr[0];
        int max=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int span=max-min;
        System.out.print(span);
    }
}
/*
5 
5 4 8 9 2
max-min
7
*/
