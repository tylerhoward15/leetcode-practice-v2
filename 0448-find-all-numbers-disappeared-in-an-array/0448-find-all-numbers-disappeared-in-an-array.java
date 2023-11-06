class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Map<Integer, Boolean> disp = new HashMap<>();
        
        for (int i=1; i <= nums.length; i++) {
            disp.put(i, false);
        }

        for (int x : nums) {
            disp.put(x, true);
        }

        List<Integer> ret = new ArrayList<>();
        for (Map.Entry<Integer, Boolean> pair : disp.entrySet()) {
            if (!pair.getValue()) {ret.add(pair.getKey());}
        }

        return ret; 
    }
}