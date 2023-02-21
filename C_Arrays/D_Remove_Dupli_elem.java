import java.util.*;
public class D_Remove_Dupli_elem {
    public static void main(String[] args) {
        int [] arr={1,2,1,2,3,1,3,4,5};
        HashSet <Integer>set=new HashSet<>();
        for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }
        System.out.print(set);
   
    }
}
