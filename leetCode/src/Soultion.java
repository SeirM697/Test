import java.util.Arrays;

public class Soultion {
    public static int[] plusOne(int[] digits) {
        if (digits[0] == 9 && digits.length == 1) {
            int[] arr = {1, 0};
            return arr;
        }

        if (digits[digits.length - 1] < 9) {
            digits[digits.length - 1] += 1;
            return digits;
        }
        for (int i = digits.length - 1; i > 0; i--) {
            if (digits[i] < 9) {
                return digits;
            } else {
                digits[i] = 0;
                digits[i - 1] = digits[i - 1] + 1;
                break;
            }
        }
        int[] arr = new int[digits.length + 1];
        if (digits[0] == 10) {
            arr[0] = 1;
            arr[1] = 0;
            return arr;
        }
        return digits;

    }

    public static void main(String[] args) {
        int[] nums = {1,8,9,8,8,7,8,9,8,9,8,8,9,8, 9};
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(plusOne(nums)));
    }
}
