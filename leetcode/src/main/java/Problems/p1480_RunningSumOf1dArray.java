package Problems;

public class p1480_RunningSumOf1dArray {

    public static int[] runningSum(int[] nums) {

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }

        return nums;
    }

    public static void main(String[] args) {
        System.out.println(runningSum(new int[]{1, 2, 3, 4}));
    }
}
