class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        double[] time = new double[dist.length];
        for (int i=0; i<dist.length; i++) {
            double currDist = dist[i];
            double currSpeed = speed[i];
            time[i] = currDist/currSpeed;
        }
        Arrays.sort(time);
        System.out.println(Arrays.toString(time));
        int count = 0;
        for (int i=0; i<time.length; i++) {
            if (time[i] > i) {count++;}
            else {return count;}
        }
        return count;
    }
}