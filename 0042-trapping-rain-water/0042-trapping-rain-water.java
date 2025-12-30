class Solution {
    public int trap(int[] arr) {
        int l = 0, r = arr.length - 1;
        int lmax = 0, rmax = 0, ans = 0;

        for(int i=0;l<r;i++){
            lmax = lmax>arr[l]?lmax:arr[l];
            rmax = rmax>arr[r]?rmax:arr[r];

            if (lmax < rmax) {
                ans += lmax - arr[l];
                l++;
            } else {
                ans += rmax - arr[r];
                r--;
            }
        }
        return ans; 
    }
}