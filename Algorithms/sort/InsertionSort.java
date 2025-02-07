import java.util.Arrays;

public class InsertionSort {

 static int[] insertionsort(int[] arr){

    int temp, j;
    
    for(int i=1;i<arr.length;i++){
        temp=arr[i];
        j=i;
        while(j>0&&arr[j-1]>temp){
            arr[j]=arr[j-1];
            j=j-1;
        }
        arr[j]=temp;
    }

    return arr;
 }

    public static void main(String[] args) {
        

        int[] arr={6,5,4,3,2,1};

        System.out.println(Arrays.toString(insertionsort(arr)));
    }
}
