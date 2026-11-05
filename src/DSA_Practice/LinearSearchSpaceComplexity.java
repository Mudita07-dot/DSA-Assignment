package DSA_Practice;

public class LinearSearchSpaceComplexity {

    public static void main(String[] args) {

        int[] arr = {8, 61, 2, 3, 4, 0};
        int target = 4;

        int position = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                position = i;
                break;
            }
        }

        if (position != -1) {
            System.out.println("Element found at index: " + position);
        } else {
            System.out.println("Element not found");
        }

        System.out.println("Auxiliary Space Complexity: O(1)");
    }
}