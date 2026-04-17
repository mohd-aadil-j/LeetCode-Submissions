class Solution {
    public List<Integer> getRow(int r) {
        if(r == 0) return new ArrayList<>(Arrays.asList(1));
        List<Integer> prev = new ArrayList<>(Arrays.asList(1));
        if(r == 1) return new ArrayList<>(Arrays.asList(1,1));
        prev = new ArrayList<>(Arrays.asList(1,1));
        for(int i=2;i<=r;i++)
        {
            List<Integer> ans = new ArrayList<>();
            ans.add(1);
            for(int j=0;j<i-1;j++){
                ans.add(prev.get(j)+prev.get(j+1));
            }
            ans.add(1);
            prev = ans;
        }

        return prev;

    }
}