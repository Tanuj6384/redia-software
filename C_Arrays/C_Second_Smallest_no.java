public class C_Second_Smallest_no {
    public static void main(String[] args) {
        int [] arr={3,5,6,7,8,2,1};
        int smallest=arr[1];
        int secSmallest=arr[0];
        if(arr[0]<arr[1]){
            smallest=arr[0];
            secSmallest=arr[1];
        }
        for(int i=2; i<arr.length; i++){
            if(arr[i]<smallest){
                secSmallest=smallest;
                smallest=arr[i];
            }
            else if(arr[i]<secSmallest){
                secSmallest=arr[i];
            }
        }
        System.out.println("Smallest"+smallest+" "+"SecSmallest"+secSmallest);
    }
}
