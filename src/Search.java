public class Search {

    public static int recursiveBinarySearch(int[] array, int target, int start, int end) {
        int middle = (start + end)/2;
        // base case: check middle element
        if (target == array[middle]) {
            return middle;
        }
        // base case: check if we've run out of elements
        if(end < start){
            return -1; // not found
        }
        // recursive call: search start to middle
        if (target < array[middle]){
            return recursiveBinarySearch(array, target, start, middle - 1);
        }
        // recursive call: search middle to end
        if (target > array[middle]){
            return recursiveBinarySearch(array, target, middle + 1, end);
        }
        return -1;
    }

}
