package DSA_Practice;

public class BinarySearchComplexity {

    public static void main(String[] args) {

        int[] arr = {0, 2, 3, 4, 8, 61};
        int target = 4;

        int low = 0;
        int high = arr.length - 1;
        int step = 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            System.out.println("Step: " + step);
            System.out.println("Low: " + low);
            System.out.println("High: " + high);
            System.out.println("Mid: " + mid);
            System.out.println("Element: " + arr[mid]);

            if (arr[mid] == target) {
                System.out.println("Target found at index: " + mid);
                break;
            }
            else if (arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }

            step++;
            System.out.println();
        }

        System.out.println("Total Comparisons: " + step);
        System.out.println("Time Complexity: O(log N)");
    }
}