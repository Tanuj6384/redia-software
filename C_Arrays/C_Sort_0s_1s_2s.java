public class C_Sort_0s_1s_2s {
    public static void main(String[] args) {
        int []arr={2,2,1,0,1,0,1,1};
        sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sort(int [] arr){
        int zero=0,one=0,two=0;
        for(int i=0;i<arr.length; i++){
            if(arr[i]==0){
                zero++;
            }
            if(arr[i]==1){
                one++;
            }
            if(arr[i]==2){
                two++;
            }
        }
        for(int i=0; i<zero; i++){
            arr[i]=0;
        }
        for(int i=zero; i<zero+one; i++){
            arr[i]=1;
        }
        for(int i=zero+one; i<zero+one+two; i++){
            arr[i]=2;
        }
    }
}
/*
0 0 1 1 1 1 2 2
*/