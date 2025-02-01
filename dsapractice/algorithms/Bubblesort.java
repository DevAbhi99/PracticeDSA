package algorithms;

import java.util.*;

public class Bubblesort {

    static int[] bubblesort(int[] arr){


int n=arr.length;

for(int i=1;i<n;i++){
for(int j=0;j<n-1;j++){
    if(arr[j]>arr[j+1]){
        int temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
    }

   
}

}

return arr;

    }

    public static void main(String[] args) {
        
int arr[]={36,19,29,12,5};

System.out.println(Arrays.toString(bubblesort(arr)));

    }

}
