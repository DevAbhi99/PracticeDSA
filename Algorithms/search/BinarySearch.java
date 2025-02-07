package search;
import java.util.*;
import java.io.*;

public class BinarySearch {

public static void main(String[] args) {

    int arr[]={6,5,4,3,2,1};

int target=4;

int i=0;
int j=arr.length-1;

while(i<=j){
    int middle=(i+j)/2;

    if(arr[middle]==target){
        System.out.println("found at "+middle);
        break;
    }
    else if(arr[middle]<target){
        i=middle+1;
    }
    else{
        j=middle-1;
    }
}

    }
}
