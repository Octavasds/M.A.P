import java.util.Arrays;

public class ex3 {
    public static int[] sumArrays(int[] num1, int[] num2) {
        num1 = reverseArray(num1);
        num2 = reverseArray(num2);
        int maxLength = Math.max(num1.length, num2.length);
        int[] sum = new int[maxLength + 1];
        int digit1,digit2,total;
        int carry = 0;
        for (int i = 0; i < maxLength; i++) {
            if(i<num1.length)
                digit1=num1[i];
            else
                digit1=0;

            if(i<num2.length)
                digit2=num2[i];
            else
                digit2=0;

            total = digit1 + digit2 + carry;
            sum[i] = total % 10;
            carry = total / 10;
        }

        if (carry > 0) {
            sum[maxLength] = carry;
        }

        return reverseArray(sum);
    }

    public static int[] subtractArrays(int[] num1, int[] num2) {
        num1 = reverseArray(num1);
        num2 = reverseArray(num2);
        int[] difference = new int[num1.length];
        int digit1,digit2,total;
        int borrow = 0;
        for (int i = 0; i < num1.length; i++) {
            digit1=num1[i];
            if(i<num2.length)
                digit2=num2[i];
            else
                digit2=0;

            total = digit1 - digit2 - borrow;
            if (total < 0) {
                total += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }

            difference[i] = total;
        }

        return removeLeadingZeros(reverseArray(difference));
    }

    private static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    private static int[] removeLeadingZeros(int[] arr) {
        int nonZeroIndex = 0;
        while (nonZeroIndex < arr.length && arr[nonZeroIndex] == 0) {
            nonZeroIndex++;
        }

        if (nonZeroIndex == arr.length) {
            return new int[] {0};
        }

        return Arrays.copyOfRange(arr, nonZeroIndex, arr.length);
    }
}
