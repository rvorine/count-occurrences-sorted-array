// first index whose value is >= target
function lowerBound(nums, target) {
  let lo = 0, hi = nums.length;
  while (lo < hi) {
    const mid = lo + Math.floor((hi - lo) / 2);
    if (nums[mid] < target) lo = mid + 1;
    else hi = mid;
  }
  return lo;
}

// first index whose value is > target
function upperBound(nums, target) {
  let lo = 0, hi = nums.length;
  while (lo < hi) {
    const mid = lo + Math.floor((hi - lo) / 2);
    if (nums[mid] <= target) lo = mid + 1;
    else hi = mid;
  }
  return lo;
}

function countOccurrences(nums, target) {
  return upperBound(nums, target) - lowerBound(nums, target);
}

console.log(countOccurrences([1, 2, 2, 2, 3, 5], 2)); // 3
console.log(countOccurrences([1, 2, 3, 5], 4));       // 0
console.log(countOccurrences([7, 7, 7, 7], 7));       // 4

module.exports = { lowerBound, upperBound, countOccurrences };
