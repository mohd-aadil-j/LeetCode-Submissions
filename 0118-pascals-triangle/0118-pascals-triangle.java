class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> memo = new ArrayList<>();

        if(n == 0) return memo;

        memo.add(Arrays.asList(1));

        if(n == 1) return memo;

        memo.add(Arrays.asList(1,1));

        for(int i = 2; i < n; i++) {
            List<Integer> prev = memo.get(i - 1);
            List<Integer> temp = new ArrayList<>();

            temp.add(1);

            for(int j = 0; j < prev.size() - 1; j++) {
                temp.add(prev.get(j) + prev.get(j + 1));
            }

            temp.add(1);

            memo.add(temp);
        }

        return memo;
    }
}