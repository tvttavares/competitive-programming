package Algorithms.Implementation;

public class FlatlandSpaceStations {

    // Complete the flatlandSpaceStations function below.
    static int flatlandSpaceStations(int n, int[] c) {
        int maxDistance = 0;
        int dif;

        if (n == c.length) {
            return maxDistance;
        }

        for (int i = 0; i < n; i++) {
            int innerDif = Integer.MAX_VALUE;

            for (int cc : c) {
                dif = Math.abs(cc - i);
                if (dif < innerDif) {
                    innerDif = dif;
                }
            }

            if (innerDif > maxDistance) {
                maxDistance = innerDif;
            }
        }

        return maxDistance;
    }

    public static void main(String[] args) {
        System.out.println(flatlandSpaceStations(5, new int[]{0, 4}));
    }
}
