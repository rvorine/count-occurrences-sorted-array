public class CountOccurrences {

    // first index whose value is >= target
    static int lowerBound(int[] nums, int target) {
        int lo = 0, hi = nums.length;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    // first index whose value is > target
    static int upperBound(int[] nums, int target) {
        int lo = 0, hi = nums.length;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] <= target) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }

    static int countOccurrences(int[] nums, int target) {
        return upperBound(nums, target) - lowerBound(nums, target);
    }

    public static void main(String[] args) {
        System.out.println(countOccurrences(new int[]{1, 2, 2, 2, 3, 5}, 2)); // 3
        System.out.println(countOccurrences(new int[]{1, 2, 3, 5}, 4));       // 0
        System.out.println(countOccurrences(new int[]{7, 7, 7, 7}, 7));       // 4
    }
}
