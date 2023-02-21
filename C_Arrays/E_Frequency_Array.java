import java.util.*;
public class E_Frequency_Array {
    public static void main(String[] args) {
        int [] arr={1,2,3,1,2,3,1,2,4};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])==true){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for(int i=0; i<arr.length; i++){
            if(map.get(arr[i])>0){
                System.out.print(map.get(arr[i])+" ");
                map.put(arr[i],0);
            }
        }
        }
    }

