public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 13;
        int i = binary(array, target, 0, array.length - 1);
        if (i != -1) {
            System.out.println("Element found at index: " + i);
        } else {
            System.out.println("Element not found.");
        }
    }

    public static int binary(int[] array, int target, int low, int high) {
        if (low > high) {
            return -1;
        } else {
            int mid = (low + high) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                return binary(array, target, mid + 1, high);
            } else {
                return binary(array, target, low, mid - 1);
            }
        }
    }
}
