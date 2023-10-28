class Solution {
    // all symms are just x values (straight vertical lines)

    // for each point, find all points with the same y.
    // for each point with the same y, find the line of symmetry

    // return true if a specific line of symmetry exists for each point and all points have that symmetry



    // so we need to map each point to its symms.


    public boolean isReflected(int[][] points) {
        Set<Double> symms = new HashSet<>();
        Map<Double[], List<Double>> map = new HashMap<>(); // map a point to it's symms

        for (int[] coords : points) {
            List<Double> currentSymms = new ArrayList<>();
            double x_1 = coords[0];
            double y_1 = coords[1];
            for (int[] other : points) {
                double x_2 = other[0];
                double y_2 = other[1];

                if (y_1 == y_2) {
                    double xLine = ((x_1 + x_2)/2);
                    currentSymms.add(xLine);
                    symms.add(xLine);
                }
            }
            map.put(new Double[]{x_1, y_1}, currentSymms);
        }

        for (Double line : symms) {
            boolean existsForAll = true; 
            for (List<Double> lines : map.values()) {
                if (!lines.contains(line)) {
                    existsForAll = false;
                    break;
                }
            }
            if (existsForAll) {return true;}
        }

        return false;
    }
}