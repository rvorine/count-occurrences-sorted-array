// first index whose value is >= target
fun lowerBound(nums: IntArray, target: Int): Int {
    var lo = 0
    var hi = nums.size
    while (lo < hi) {
        val mid = lo + (hi - lo) / 2
        if (nums[mid] < target) lo = mid + 1 else hi = mid
    }
    return lo
}

// first index whose value is > target
fun upperBound(nums: IntArray, target: Int): Int {
    var lo = 0
    var hi = nums.size
    while (lo < hi) {
        val mid = lo + (hi - lo) / 2
        if (nums[mid] <= target) lo = mid + 1 else hi = mid
    }
    return lo
}

fun countOccurrences(nums: IntArray, target: Int): Int =
    upperBound(nums, target) - lowerBound(nums, target)

fun main() {
    println(countOccurrences(intArrayOf(1, 2, 2, 2, 3, 5), 2)) // 3
    println(countOccurrences(intArrayOf(1, 2, 3, 5), 4))       // 0
    println(countOccurrences(intArrayOf(7, 7, 7, 7), 7))       // 4
}
