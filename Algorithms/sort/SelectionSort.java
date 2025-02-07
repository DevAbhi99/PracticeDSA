import java.util.Arrays;

public class SelectionSort {

 static int[] selectionsort(int arr[]){

int min;

    for(int i=0;i<arr.length;i++){
   min=i;
   for(int j=0;j<arr.length;j++){
    if(arr[min]<arr[j]){
        int temp=arr[min];
        arr[min]=arr[j];
        arr[j]=temp;
    }
   }
    }

    return arr;
 }

public static void main(String[] args) {
    
    int arr[]={6,5,4,3,2,1};

    System.out.println(Arrays.toString(selectionsort(arr)));
}

}
