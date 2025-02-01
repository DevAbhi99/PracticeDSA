package Day2;
import java.util.*;

public class MergeSortedArray {


    public static void main(String[] args) {

        int nums1[]={1,2,3,0,0,0};
    
        int m=3;
    
        int nums2[]={2,5,6};
    
        int n=3;
    
        int num=(m+n)-n;
           
           
        for(int i=0;i<nums2.length;i++){
           nums1[i+num]=nums2[i];    
        }
    
        Arrays.sort(nums1);


        for(Integer i:nums1){
            System.out.println(i);
        }

    }

}
