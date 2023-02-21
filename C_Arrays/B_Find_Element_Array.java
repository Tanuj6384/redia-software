import java.util.*;
public class B_Find_Element_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        int data=sc.nextInt();
        sol(arr,data);
    }
    public static void sol(int [] arr, int data){
        int idx=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==data){
                idx=i;
                break;
            }
        }
        System.out.println(idx);
    }
}
/*
5
1 5 4 5 6
1 find
0 idx
*/