package algorithms;
import java.util.*;

public class Selectionsort {
    
    static int[] selectionSort(int[] arr){

 
int min=0;

for(int i=0;i<arr.length;i++){
    min=i;
    for(int j=i+1;j<arr.length;j++){
        if(arr[min]>arr[j]){
            min=j;
        }
    }
    int temp=arr[min];
    arr[min]=arr[i];
    arr[i]=temp;
}

return arr;
    } 

    public static void main(String[] args) {
        
int arr[]={36,19,29,12,5};

System.out.println(Arrays.toString(selectionSort(arr)));

    }
}
