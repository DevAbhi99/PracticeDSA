import java.util.Arrays;

public class BubbleSort {


static int[] bubblesort(int arr[]){

for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr.length-1;j++){
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
        
int[] arr={6,5,4,3,2,1};

System.out.println(Arrays.toString(bubblesort(arr)));

    }
}
