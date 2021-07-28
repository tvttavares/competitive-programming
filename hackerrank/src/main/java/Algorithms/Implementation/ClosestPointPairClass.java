package Algorithms.Implementation;

public class ClosestPointPairClass {

    public static void main(String[] args) {
        int[][] s = {{0, 11}, {-7, 1}, {-5, -3}};
        System.out.println(closestPointPair(s));
    }

    public static double closestPointPair(int[][] p) {
        double sum, d, minD = Integer.MAX_VALUE;
        for (int i = 0; i < p.length; i++) {
            for (int j = i + 1; j < p.length; j++) {
                sum = Math.pow((p[i][0] - p[j][0]), 2) + Math.pow((p[i][1] - p[j][1]), 2);
                d = Math.sqrt(sum);
                if (d < minD) {
                    minD = d;
                }
            }
        }

        return minD;
    }
}