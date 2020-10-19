class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int f = nums1.length;        
int s = nums2.length;   
int[] result = new int[f + s];   
System.arraycopy(nums1, 0, result, 0, f);  
System.arraycopy(nums2, 0, result, f, s);  
       Arrays.sort(result);
        int m=(f+s)/2;
        if(result.length%2 !=0)
            return result[m];
        else
            return (result[m]+result[m-1])/2.0f;
  
        
    }
}