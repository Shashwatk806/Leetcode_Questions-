class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<>();
        char[] ch = s.toCharArray();
        int prev = 0;
        int count = 1;
        for (int curr = 1; curr < ch.length; curr++) {
            if (ch[curr] == ch[prev]) {
                count++;
            } else {
                if (count > 2) {
                    res.add(Arrays.asList(prev, curr - 1));
                }
                prev = curr;
                count = 1;
            }
        }
        if (count > 2) {
            res.add(Arrays.asList(prev, ch.length - 1));
        }
        return res;
    }
}