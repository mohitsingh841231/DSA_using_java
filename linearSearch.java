public class linearSearch {

    // Modified method to work with String arrays and return int
    public static int linearSc(String[] num, String key) {
        for (int i = 0; i < num.length; i++) {
            if (num[i].equals(key)) {
                return i;
            }
        }
        // Return -1 if the key is not found
        return -1;
    }

    public static void main(String[] args) {
        String num[] = {"mango", "banana", "orange"};
        String key = "mango";
        int index = linearSc(num, key);

        if (index == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key is at index: " + index);
        }
    }
}
