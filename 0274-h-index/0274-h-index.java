class Solution {
    public int hIndex(int[] ct) {
        Arrays.sort(ct);
        int n = ct.length;

        for (int i = 0; i < n; i++) {
            int h = n - i;
            if (ct[i] >= h) {
                return h;
            }
        }
        return 0;
    }
}
