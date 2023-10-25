class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int max = -1;
        int[] maxVals = maxPossible(citations.length);

        for (int i = 0; i < citations.length; i++) {
            final int tmp = Math.min(citations[i], maxVals[i]);
            max = tmp > max ? tmp : max;
        }
        // System.out.println(Arrays.toString(citations));
        // System.out.println(isValidH(citations, 2));
        return max;
    }

    // public boolean isValidH(int[] arr, int index) {
    //     final int elem = arr[index];

    //     return elem >= (arr.length - index);
    // }

    public int[] maxPossible (int size) {
        int[] ret = new int[size];

        for(int i=0; i<ret.length; i++) {
            ret[i] = ret.length - i;
        }

        return ret;
    }
 }