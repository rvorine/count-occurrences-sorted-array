using System;

class CountOccurrences
{
    // first index whose value is >= target
    static int LowerBound(int[] nums, int target)
    {
        int lo = 0, hi = nums.Length;
        while (lo < hi)
        {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] < target) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }

    // first index whose value is > target
    static int UpperBound(int[] nums, int target)
    {
        int lo = 0, hi = nums.Length;
        while (lo < hi)
        {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] <= target) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }

    static int Count(int[] nums, int target)
    {
        return UpperBound(nums, target) - LowerBound(nums, target);
    }

    static void Main()
    {
        Console.WriteLine(Count(new int[] { 1, 2, 2, 2, 3, 5 }, 2)); // 3
        Console.WriteLine(Count(new int[] { 1, 2, 3, 5 }, 4));       // 0
        Console.WriteLine(Count(new int[] { 7, 7, 7, 7 }, 7));       // 4
    }
}
