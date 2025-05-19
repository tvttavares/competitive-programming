package Problems;

public class p3024_TypeOfTriangle {

    public static String triangleType(int[] nums) {
        int a = nums[0];
        int b = nums[1];
        int c = nums[2];

        if (a == b && b == c) {
            return "equilateral";
        }

        if (a + b > c && a + c > b && b + c > a) {
            if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) {
                return "isosceles";
            }
            return "scalene";
        }

        return "none";
    }

    public static void main(String[] args) {
//        System.out.println(triangleType(new int []{3,4,5}));
//        System.out.println(triangleType(new int []{3,3,3}));
        System.out.println(triangleType(new int[]{8, 4, 4}));
    }
}
