public class QuickSort {
    

  int partition(int[] arr, int i, int j){

int pivot=arr[(i+j)/2];

   while(i<=j){
    while(arr[i]<pivot){
        i++;
    }
    while(arr[j]>pivot){
        j--;
    }
    if(i<=j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    i++;
    j--;
    }
   }
return i;
  }

void quicksort(int[] arr, int i, int j){
    int pi=partition(arr, i, j);

    if(i<pi-1){
        quicksort(arr, i, pi-1);
    }
    if(j>pi){
        quicksort(arr, i, pi);
    }
}

void printArray(int[] arr){
    for(int i:arr){
        System.out.print(i+" ");
    }
}

    public static void main(String[] args) {
 
        int arr[]={6,5,4,3,2,1};

QuickSort obj=new QuickSort();

obj.quicksort(arr,0, arr.length-1);

obj.printArray(arr);
    }
}
