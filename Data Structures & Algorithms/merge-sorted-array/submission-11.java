class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int [] temp=new int[m+n];
        int l=0;int r=0;
        for(int i=0;i<m+n;i++){
            if(r<n && l<m){
            if(nums1[l]<nums2[r]){
                temp[i]=nums1[l];
                l++;
            }
            else{
                temp[i]=nums2[r];
                r++;
            }
            }
            else if(l<m) {
                temp[i]=nums1[l];
                l++;
            }
            else{
                temp[i]=nums2[r];
                r++;
            }
        }
        for(int i=0;i<m+n;i++){
            
            nums1[i]=temp[i];
        }
    }
}