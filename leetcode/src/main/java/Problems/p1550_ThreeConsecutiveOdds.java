package Problems;

public class p1550_ThreeConsecutiveOdds {

    public static boolean threeConsecutiveOdds(int[] arr) {
        int size = arr.length;
        for (int i = 1; i < size - 1; i++) {
            if (arr[i] % 2 == 1 && arr[i - 1] % 2 == 1 && arr[i + 1] % 2 == 1) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
//        System.out.println(threeConsecutiveOdds(new int[]{2, 6, 4, 1}));
        System.out.println(threeConsecutiveOdds(new int[]{1, 2, 34, 3, 4, 5, 7, 23, 12}));
    }
}
