class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] temp = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(temp, new SortByBits());


        return Arrays.stream(temp).mapToInt(i -> i).toArray();
    }

    public static int countBits(int num) {
        int count = 0;
        while(num > 0) {
            int leadingBit = num & 1;
            if (leadingBit == 1){
                count++;
            }
            num = num >> 1;
        }
        return count;
    }
}

class SortByBits implements Comparator<Integer> {
 
    public int compare(Integer a, Integer b) {
        int aBits = Solution.countBits(a);
        int bBits = Solution.countBits(b);

        if (aBits == bBits) {
            return a-b;
        } else {
            return aBits - bBits;
        }

    }
}