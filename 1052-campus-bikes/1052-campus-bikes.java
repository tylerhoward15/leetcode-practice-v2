class Solution {
    public int[] assignBikes(int[][] workers, int[][] bikes) {
        List<CustomPair> ret = new ArrayList<>();
        Set<Integer> usedBike = new HashSet<>();
        Set<Integer> usedWorker = new HashSet<>();

        List<CustomPair> all = new ArrayList<>();

        for(int workerIndex=0; workerIndex<workers.length; workerIndex++) {
            for (int bikeIndex=0; bikeIndex<bikes.length; bikeIndex++) {
                CustomPair currentPair = new CustomPair(workers[workerIndex], bikes[bikeIndex], workerIndex, bikeIndex);
                all.add(currentPair);
            }
        }

        Collections.sort(all, new CustomSort());
        int index = 0;
        while(ret.size() < workers.length && index < all.size()) {
            CustomPair curr = all.get(index);

            if (!usedBike.contains(curr.bikeId) && !usedWorker.contains(curr.workerId)) {
                ret.add(curr);
                usedBike.add(curr.bikeId);
                usedWorker.add(curr.workerId);
            }
            index++;
        }

        return convert(ret);
    }

    public int[] convert(List<CustomPair> list) {
        int[] ret = new int[list.size()];
        for (int i=0; i<list.size(); i++) {
            CustomPair curr = list.get(i);
            ret[curr.workerId] = curr.bikeId;
        }

        return ret;
    }

    class CustomSort implements Comparator<CustomPair> {
        @Override
        public int compare(CustomPair a, CustomPair b) {
            int dist = a.distance - b.distance;
            int workerId = a.workerId - b.workerId;
            int bikeId = a.bikeId - b.bikeId;

            if (dist != 0) {
                return dist;
            } else if (workerId != 0) {
                return workerId;
            } else {
                return bikeId;
            }
        }
    }

    class CustomPair {
        final int workerId;
        final int bikeId;
        int[] worker = new int[2];
        int[] bike = new int[2];
        final int distance;

        public CustomPair(int[] worker, int[] bike, int workerId, int bikeId) {
            this.workerId = workerId;
            this.bikeId = bikeId;
            this.worker = worker;
            this.bike = bike;
            this.distance = manhattan(worker, bike);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("workerId: %d\nbikeId: %d\ndistance: %d\nworker: %s\nbike: %s", workerId, bikeId, distance, Arrays.toString(worker), Arrays.toString(bike)));
            sb.append("\n");
            return sb.toString();
        }

        // Pair k: x and v: y
        // int just in case of crazy distances
        private int manhattan(int[] p0, int[] p1) {
            int xDiff = Math.abs(p0[0] - p1[0]);
            int yDiff = Math.abs(p0[1] - p1[1]);
            return xDiff + yDiff;
        }
    }
        
    public List<Integer> getList(int[] arr) {
        List<Integer> ret = new ArrayList<>();
        for(int x : arr) {
            ret.add(x);
        }

        return ret;
    }
}