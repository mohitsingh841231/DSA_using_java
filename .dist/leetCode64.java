public class leetCode64 {

    public int[] plusOne(int[] digits) {
        int add = 0;

        // Combine digits into an int (assuming number is small)
        for (int i = 0; i < digits.length; i++) {
            add = add * 10 + digits[i];
        }

        add = add + 1;

        // Count number of digits in the result
        int temp = add;
        int count = 0;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        // Convert the number back to array
        int[] result = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            result[i] = add % 10;
            add /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        int digits[] = {1,9};  // Try with {1, 2, 3}, {9, 9}, etc.
        leetCode64 l = new leetCode64();
        
        int[] result = l.plusOne(digits);

        // Print result without using Arrays.toString
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i != result.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
