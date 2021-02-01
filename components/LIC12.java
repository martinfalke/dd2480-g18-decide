public class LIC12 {
    private static boolean condition1;
    private static boolean condition2;

    private static double getDist(double[] pt1, double[] pt2) {
        return Math.sqrt(Math.pow(pt1[0] - pt2[0], 2) + Math.pow(pt1[1] - pt2[1], 2));
    }

    /**
     *
     *
     * @param xs: double array holding the x-coordinates
     * @param ys: double array holding the y-coordinates
     * @param NUM_POINTS: integer holding the number of points in total
     * @param K_PTS: integer holding the number of points separating two points in a set
     * @param LENGTH1: double holding the minimum distance for two points to be separated to satisfy condition 1
     * @param LENGTH2: double holding the minimum distance for two points to be separated to satisfy condition 2
     * @return true if both conditions are met, false otherwise
     */
    public static boolean getCondition(double[] xs, double[] ys, int NUM_POINTS, int K_PTS, double LENGTH1, double LENGTH2) {
        if (NUM_POINTS < 3 || LENGTH2 <= 0 || K_PTS > NUM_POINTS) return false;
        double[] pt_1;
        double[] pt_2;
        double dist;
        for (int i = 0; i < NUM_POINTS - K_PTS; i++) {
            pt_1 = new double[] {xs[i], ys[i]};
            pt_2 = new double[] {xs[i+K_PTS], ys[i]};
            dist = getDist(pt_1, pt_2);
            if (dist > LENGTH1 && dist < LENGTH2) return true;
            else if (dist > LENGTH1) condition1 = true;
            else if (dist < LENGTH2) condition2 = true;
        }
        return condition1 && condition2;
    }
}
